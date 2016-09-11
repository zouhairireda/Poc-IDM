/**
 */
package Wdl.impl;

import Wdl.Page;
import Wdl.WdlPackage;
import Wdl.Website;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Website</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Wdl.impl.WebsiteImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link Wdl.impl.WebsiteImpl#isIsMobileFriendly <em>Is Mobile Friendly</em>}</li>
 *   <li>{@link Wdl.impl.WebsiteImpl#getPages <em>Pages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebsiteImpl extends MinimalEObjectImpl.Container implements Website {
	/**
	 * The default value of the '{@link #getCopyright() <em>Copyright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected static final String COPYRIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCopyright() <em>Copyright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected String copyright = COPYRIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsMobileFriendly() <em>Is Mobile Friendly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMobileFriendly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MOBILE_FRIENDLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMobileFriendly() <em>Is Mobile Friendly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMobileFriendly()
	 * @generated
	 * @ordered
	 */
	protected boolean isMobileFriendly = IS_MOBILE_FRIENDLY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPages() <em>Pages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected EList<Page> pages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebsiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WdlPackage.Literals.WEBSITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCopyright() {
		return copyright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyright(String newCopyright) {
		String oldCopyright = copyright;
		copyright = newCopyright;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdlPackage.WEBSITE__COPYRIGHT, oldCopyright, copyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMobileFriendly() {
		return isMobileFriendly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMobileFriendly(boolean newIsMobileFriendly) {
		boolean oldIsMobileFriendly = isMobileFriendly;
		isMobileFriendly = newIsMobileFriendly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WdlPackage.WEBSITE__IS_MOBILE_FRIENDLY, oldIsMobileFriendly, isMobileFriendly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Page> getPages() {
		if (pages == null) {
			pages = new EObjectContainmentEList<Page>(Page.class, this, WdlPackage.WEBSITE__PAGES);
		}
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WdlPackage.WEBSITE__PAGES:
				return ((InternalEList<?>)getPages()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WdlPackage.WEBSITE__COPYRIGHT:
				return getCopyright();
			case WdlPackage.WEBSITE__IS_MOBILE_FRIENDLY:
				return isIsMobileFriendly();
			case WdlPackage.WEBSITE__PAGES:
				return getPages();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WdlPackage.WEBSITE__COPYRIGHT:
				setCopyright((String)newValue);
				return;
			case WdlPackage.WEBSITE__IS_MOBILE_FRIENDLY:
				setIsMobileFriendly((Boolean)newValue);
				return;
			case WdlPackage.WEBSITE__PAGES:
				getPages().clear();
				getPages().addAll((Collection<? extends Page>)newValue);
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
			case WdlPackage.WEBSITE__COPYRIGHT:
				setCopyright(COPYRIGHT_EDEFAULT);
				return;
			case WdlPackage.WEBSITE__IS_MOBILE_FRIENDLY:
				setIsMobileFriendly(IS_MOBILE_FRIENDLY_EDEFAULT);
				return;
			case WdlPackage.WEBSITE__PAGES:
				getPages().clear();
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
			case WdlPackage.WEBSITE__COPYRIGHT:
				return COPYRIGHT_EDEFAULT == null ? copyright != null : !COPYRIGHT_EDEFAULT.equals(copyright);
			case WdlPackage.WEBSITE__IS_MOBILE_FRIENDLY:
				return isMobileFriendly != IS_MOBILE_FRIENDLY_EDEFAULT;
			case WdlPackage.WEBSITE__PAGES:
				return pages != null && !pages.isEmpty();
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
		result.append(" (copyright: ");
		result.append(copyright);
		result.append(", isMobileFriendly: ");
		result.append(isMobileFriendly);
		result.append(')');
		return result.toString();
	}

} //WebsiteImpl
