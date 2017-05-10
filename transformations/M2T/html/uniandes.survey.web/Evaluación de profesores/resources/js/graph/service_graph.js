$(document).ready(function() {


Highcharts.chart('graph_1', {
    chart: {
        type: 'column'
    },
    title: {
        text: 'G�nero'
    },
    yAxis: {
        title: {
            text: 'Porcentaje de encuestados'
        }

    },
    xAxis: {
        type: 'category'
    },
    legend: {
        enabled: false
    },
    credits: { enabled: false },
    tooltip: {
        headerFormat: '<span style="font-size:11px">{series.name}</span><br>',
        pointFormat: '<span style="color:{point.color}">{point.name}</span>: <b>{point.y:.2f}%</b> del total<br/>'
    },

    series: [{
        name: 'G�nero',
        colorByPoint: true,
        data: [{
            name: 'Masculino',
            y: 15,
            drilldown: 'Microsoft Internet Explorer'
        }, {
            name: 'Femenino',
            y: 10
        }]
    }]
});

Highcharts.chart('graph_2', {
    chart: {
        plotBackgroundColor: null,
        plotBorderWidth: null,
        plotShadow: false,
        type: 'pie'
    },
    title: {
        text: '�A qu� curso acudes?'
    },
    tooltip: {
        pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
    },
    credits: { enabled: false },
    plotOptions: {
        pie: {
            allowPointSelect: true,
            cursor: 'pointer',
            dataLabels: {
                enabled: true,
                format: '<b>{point.name}</b>: {point.percentage:.1f} %',
                style: {
                    color: (Highcharts.theme && Highcharts.theme.contrastTextColor) || 'black'
                }
            }
        }
    },
    series: [{
        name: 'Cursos',
        colorByPoint: true,
        data: [{
            name: 'Automatizaci�n',
            y: 56.33
        }, {
            name: '�giles',
            y: 24.03
        }, {
            name: 'F�bricas de Sw.',
            y: 10.38
        }]
    }]
});

$('#graph_3').highcharts({
        chart: { type: 'solidgauge' },
        title: { text: 'Indique su nivel de satisfacci�n general frente al curso' },
        pane: {
            center: ['50%', '85%'],
            size: '100%',
            startAngle: -90,
            endAngle: 90,
            background: {
                backgroundColor: (Highcharts.theme && Highcharts.theme.background2) || '#EEE',
                innerRadius: '60%',
                outerRadius: '100%',
                shape: 'arc'
            }
        },
        yAxis: {
            min: 0,
            max: 100
        },
        credits: { enabled: false },
        series: [{
            name: 'Satisfacci�n del curso',
            data: [80],
            tooltip: {
                valueSuffix: ''
            }
        }]
    });


}); // end document ready