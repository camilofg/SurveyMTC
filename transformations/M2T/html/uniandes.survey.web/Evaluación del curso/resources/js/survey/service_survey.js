

$(document).ready(function() {

  disableItems();
  addRequired();
  addWordCount();

  $( "#formEncuesta" ).submit(function( event ) { //Submit encuesta.
      submitSurvey(event);
  });

  $( ".other-check" ).change(function( event ) { //Cambio selecciòn check other.
      var disabled = !$(this).is(':checked');
      var otherAnswer = $(this).parent().siblings(".other-control");
      otherAnswer.prop('disabled', disabled);
      otherAnswer.prop('required', "required");
  });

  $("textarea").keyup(function(){
    //$(".count").text($(this).val().length);
    $(this).siblings(".conteo").find(".count").text($(this).val().length);
  });

});

//Se encarga de deshabilitar los campos.
function disableItems() {
  $( "textarea.other-control" ).prop('disabled', true);
}

//Agrega a los elementos con el atributo required indicador de requerido.
function addRequired() {
  $(':input[required=""],:input[required]').parent().parent().children(".control-label").each( function( i, val ) {
    $(this).append(' <span class="required">*</span>');
  });
}

//Agregar conteo de palabras.
function addWordCount() {
  $("textarea").parent().append( "<div class='conteo'><label class='text-primary'>Caracteres:</label>&nbsp<span class='count'>0</span><span>/100</span>" );
}

//Resetear conteo de palabras.
function resetCount(){
  $(".count" ).text("0");
}


//Método encargado de enviar la encuesta.
function submitSurvey(event) {
  var JSONObject= getSubmitSurveyJSON();
  var jsonData = JSON.parse( JSONObject );    
  console.log(jsonData);

  //TODO Temporal mientras se tiene el servicio.
  $('#confirmation').modal('show');
  $('#formEncuesta')[0].reset();
  event.preventDefault();
  $("html, body").animate({ scrollTop: 0 }, "slow");
  disableItems();
  resetCount();

  /*Método a usar en el guardado.
  var request = $.ajax({
    url: 'confirmation.html',
    type: "POST",
    data: jsonData,
    dataType: "json",
    success: function(){
      $('#confirmation').modal('show');
      $('#formEncuesta')[0].reset(); //Limpieza de encuesta.
      event.preventDefault();
      $("html, body").animate({ scrollTop: 0 }, "slow");
    },
    error: function(){
      $('#error').modal('show'); 
      event.preventDefault();
    }
  });*/
}

//Arma el JSON para enviar los datos recolectados en la encuesta.
function getSubmitSurveyJSON() {

  var answersArray = new Array();
  $.each($("input:text"), function( i, val ) {
      var idQuestion = val.name;
      var answer = new Object();
      answer.idQuestion = idQuestion;
      answer.answerOpenValue = val.value;
      answersArray.push(answer);
  });
  $.each($('input[type=range]'), function( i, val ) {
      var idQuestion = val.name;
      var answer = new Object();
      answer.idQuestion = idQuestion;
      answer.idSingleAnswer = val.value;
      answersArray.push(answer);
  });
  $.each($("select"), function( i, val ) {
      var idQuestion = val.name;
      var answer = new Object();
      answer.idQuestion = idQuestion;
      answer.idSingleAnswer = val.value;
      answersArray.push(answer);
  });
  //Lògica preguntas selecciòn única - Input Radio.
  var radioNamesArray = new Array();
  $(".single-question").find("input:radio").each( function( i, val ) { //Input radio - single question.
      if($.inArray(val.name, radioNamesArray)==-1) {
        var idQuestion = val.name;
        var answer = new Object();
        answer.idQuestion = idQuestion;
        answer.idSingleAnswer = val.value;
        answersArray.push(answer);
        radioNamesArray.push(val.name);
      }
  });
  
  //Lògica preguntas selecciòn mùltiple.
  var checkboxNamesArray = new Array();
  $("input:checkbox").each( function( i, val ) { //Iteración inicial para mirar los nombres de todas las preguntas tipo multiple.
      if($.inArray(val.name, checkboxNamesArray)==-1) { //Si ya el arreglo contiene la pregunta ignorelo.
        checkboxNamesArray.push(val.name);
      }
  });
  if (!$.isEmptyObject(checkboxNamesArray)) {
    $.each(checkboxNamesArray, function( i, val ) { //Buscando opciones de respuesta chequeadas por el encuestado.
      var idQuestion = val.name;
      var answer = new Object();
      answer.idQuestion = idQuestion;
      var options = new Array();
      $("input[name='"+val+"']:checked").each( function (i, val) {
        options.push(val.value);
        
      });
      answer.idsMultipleAnswer = options;
      var otherElement = $( "textarea[name*='"+idQuestion+"']" ).siblings().children("input:checked")[0];
      if (otherElement != undefined) {
        answer.answerOpenValue = otherElement.value;
      }
      answersArray.push(answer);
    });
  }
  //Lògica preguntas abiertas mùltilineas
  $.each($("textarea:not(.other-control)"), function( i, val ) { //Ignorar los de la clase .other-control (Hacen parte de las idsMultipleAnswer)
      var idQuestion = val.name;
      var answer = new Object();
      answer.idQuestion = idQuestion;
      answer.idSingleAnswer = val.value;
      answersArray.push(answer);
  });
  //Lògica preguntas grid.
  var gridOptionNamesArray = new Array();
  $(".grid_option").each( function( i, val ) { //Input radio - single question.
      if($.inArray(val.name, gridOptionNamesArray)==-1) {
        var idQuestion = val.name;
        var answer = new Object();
        answer.idQuestion = idQuestion;
        answer.idSingleAnswer = val.value;
        answersArray.push(answer);
        gridOptionNamesArray.push(val.name);
      }
  });

  //Armado general del objeto a enviar.
  var surveyResponse = new Object();
  surveyResponse.id = $('#survey_id')[0].value;
  var respondent = new Object();
  respondent.answers = answersArray;
  surveyResponse.respondent = respondent;


  return JSON.stringify(surveyResponse);  
}