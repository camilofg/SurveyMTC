/**
 */
package multiplatform.impl;

import multiplatform.Content;
import multiplatform.MultiplatformPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link multiplatform.impl.ContentImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link multiplatform.impl.ContentImpl#getMainContent <em>Main Content</em>}</li>
 *   <li>{@link multiplatform.impl.ContentImpl#getMainContentIsHTML <em>Main Content Is HTML</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContentImpl extends MinimalEObjectImpl.Container implements Content {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMainContent() <em>Main Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainContent()
	 * @generated
	 * @ordered
	 */
	protected static final String MAIN_CONTENT_EDEFAULT = "\"\"";

	/**
	 * The cached value of the '{@link #getMainContent() <em>Main Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainContent()
	 * @generated
	 * @ordered
	 */
	protected String mainContent = MAIN_CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMainContentIsHTML() <em>Main Content Is HTML</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainContentIsHTML()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean MAIN_CONTENT_IS_HTML_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getMainContentIsHTML() <em>Main Content Is HTML</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainContentIsHTML()
	 * @generated
	 * @ordered
	 */
	protected Boolean mainContentIsHTML = MAIN_CONTENT_IS_HTML_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MultiplatformPackage.Literals.CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultiplatformPackage.CONTENT__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMainContent() {
		return mainContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainContent(String newMainContent) {
		String oldMainContent = mainContent;
		mainContent = newMainContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultiplatformPackage.CONTENT__MAIN_CONTENT, oldMainContent, mainContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getMainContentIsHTML() {
		return mainContentIsHTML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainContentIsHTML(Boolean newMainContentIsHTML) {
		Boolean oldMainContentIsHTML = mainContentIsHTML;
		mainContentIsHTML = newMainContentIsHTML;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultiplatformPackage.CONTENT__MAIN_CONTENT_IS_HTML, oldMainContentIsHTML, mainContentIsHTML));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MultiplatformPackage.CONTENT__TITLE:
				return getTitle();
			case MultiplatformPackage.CONTENT__MAIN_CONTENT:
				return getMainContent();
			case MultiplatformPackage.CONTENT__MAIN_CONTENT_IS_HTML:
				return getMainContentIsHTML();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MultiplatformPackage.CONTENT__TITLE:
				setTitle((String)newValue);
				return;
			case MultiplatformPackage.CONTENT__MAIN_CONTENT:
				setMainContent((String)newValue);
				return;
			case MultiplatformPackage.CONTENT__MAIN_CONTENT_IS_HTML:
				setMainContentIsHTML((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MultiplatformPackage.CONTENT__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case MultiplatformPackage.CONTENT__MAIN_CONTENT:
				setMainContent(MAIN_CONTENT_EDEFAULT);
				return;
			case MultiplatformPackage.CONTENT__MAIN_CONTENT_IS_HTML:
				setMainContentIsHTML(MAIN_CONTENT_IS_HTML_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MultiplatformPackage.CONTENT__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case MultiplatformPackage.CONTENT__MAIN_CONTENT:
				return MAIN_CONTENT_EDEFAULT == null ? mainContent != null : !MAIN_CONTENT_EDEFAULT.equals(mainContent);
			case MultiplatformPackage.CONTENT__MAIN_CONTENT_IS_HTML:
				return MAIN_CONTENT_IS_HTML_EDEFAULT == null ? mainContentIsHTML != null : !MAIN_CONTENT_IS_HTML_EDEFAULT.equals(mainContentIsHTML);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (title: ");
		result.append(title);
		result.append(", mainContent: ");
		result.append(mainContent);
		result.append(", mainContentIsHTML: ");
		result.append(mainContentIsHTML);
		result.append(')');
		return result.toString();
	}

} //ContentImpl
