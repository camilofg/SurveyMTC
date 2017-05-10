/**
 */
package multiplatform;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link multiplatform.Content#getTitle <em>Title</em>}</li>
 *   <li>{@link multiplatform.Content#getMainContent <em>Main Content</em>}</li>
 *   <li>{@link multiplatform.Content#getMainContentIsHTML <em>Main Content Is HTML</em>}</li>
 * </ul>
 * </p>
 *
 * @see multiplatform.MultiplatformPackage#getContent()
 * @model
 * @generated
 */
public interface Content extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see multiplatform.MultiplatformPackage#getContent_Title()
	 * @model required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link multiplatform.Content#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Main Content</b></em>' attribute.
	 * The default value is <code>"\"\""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Content</em>' attribute.
	 * @see #setMainContent(String)
	 * @see multiplatform.MultiplatformPackage#getContent_MainContent()
	 * @model default="\"\"" required="true"
	 * @generated
	 */
	String getMainContent();

	/**
	 * Sets the value of the '{@link multiplatform.Content#getMainContent <em>Main Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Content</em>' attribute.
	 * @see #getMainContent()
	 * @generated
	 */
	void setMainContent(String value);

	/**
	 * Returns the value of the '<em><b>Main Content Is HTML</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Content Is HTML</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Content Is HTML</em>' attribute.
	 * @see #setMainContentIsHTML(Boolean)
	 * @see multiplatform.MultiplatformPackage#getContent_MainContentIsHTML()
	 * @model default="false" required="true"
	 * @generated
	 */
	Boolean getMainContentIsHTML();

	/**
	 * Sets the value of the '{@link multiplatform.Content#getMainContentIsHTML <em>Main Content Is HTML</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Content Is HTML</em>' attribute.
	 * @see #getMainContentIsHTML()
	 * @generated
	 */
	void setMainContentIsHTML(Boolean value);

} // Content
