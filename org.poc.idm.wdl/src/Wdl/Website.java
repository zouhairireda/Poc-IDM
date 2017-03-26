/**
 */
package Wdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Website</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Wdl.Website#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link Wdl.Website#isIsMobileFriendly <em>Is Mobile Friendly</em>}</li>
 *   <li>{@link Wdl.Website#getPages <em>Pages</em>}</li>
 * </ul>
 *
 * @see Wdl.WdlPackage#getWebsite()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SingletonPage'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot SingletonPage='self.pages->forAll(p1, p2 | p1 <> p2 implies p1.name<>p2.name)'"
 * @generated
 */
public interface Website extends EObject {
	/**
	 * Returns the value of the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copyright</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copyright</em>' attribute.
	 * @see #setCopyright(String)
	 * @see Wdl.WdlPackage#getWebsite_Copyright()
	 * @model
	 * @generated
	 */
	String getCopyright();

	/**
	 * Sets the value of the '{@link Wdl.Website#getCopyright <em>Copyright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright</em>' attribute.
	 * @see #getCopyright()
	 * @generated
	 */
	void setCopyright(String value);

	/**
	 * Returns the value of the '<em><b>Is Mobile Friendly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Mobile Friendly</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Mobile Friendly</em>' attribute.
	 * @see #setIsMobileFriendly(boolean)
	 * @see Wdl.WdlPackage#getWebsite_IsMobileFriendly()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsMobileFriendly();

	/**
	 * Sets the value of the '{@link Wdl.Website#isIsMobileFriendly <em>Is Mobile Friendly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Mobile Friendly</em>' attribute.
	 * @see #isIsMobileFriendly()
	 * @generated
	 */
	void setIsMobileFriendly(boolean value);

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link Wdl.Page}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see Wdl.WdlPackage#getWebsite_Pages()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Page> getPages();

} // Website
