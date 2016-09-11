/**
 */
package Wdl.util;

import Wdl.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see Wdl.WdlPackage
 * @generated
 */
public class WdlValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final WdlValidator INSTANCE = new WdlValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "Wdl";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WdlValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return WdlPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case WdlPackage.WEBSITE:
				return validateWebsite((Website)value, diagnostics, context);
			case WdlPackage.PAGE:
				return validatePage((Page)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebsite(Website website, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(website, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(website, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(website, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(website, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(website, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(website, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(website, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(website, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(website, diagnostics, context);
		if (result || diagnostics != null) result &= validateWebsite_SingletonPage(website, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SingletonPage constraint of '<em>Website</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WEBSITE__SINGLETON_PAGE__EEXPRESSION = "self.pages->forAll(p1, p2 | p1 <> p2 implies p1.name<>p2.name)";

	/**
	 * Validates the SingletonPage constraint of '<em>Website</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebsite_SingletonPage(Website website, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WdlPackage.Literals.WEBSITE,
				 website,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SingletonPage",
				 WEBSITE__SINGLETON_PAGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(page, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(page, diagnostics, context);
		if (result || diagnostics != null) result &= validatePage_AvoidSelfReference(page, diagnostics, context);
		if (result || diagnostics != null) result &= validatePage_AvoidDuplicates(page, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the AvoidSelfReference constraint of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PAGE__AVOID_SELF_REFERENCE__EEXPRESSION = "not self.targets->includes(self)";

	/**
	 * Validates the AvoidSelfReference constraint of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage_AvoidSelfReference(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WdlPackage.Literals.PAGE,
				 page,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AvoidSelfReference",
				 PAGE__AVOID_SELF_REFERENCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the AvoidDuplicates constraint of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PAGE__AVOID_DUPLICATES__EEXPRESSION = "self.targets->forAll ( t1 | self.targets -> one ( t2 | t2 = t1))";

	/**
	 * Validates the AvoidDuplicates constraint of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage_AvoidDuplicates(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WdlPackage.Literals.PAGE,
				 page,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AvoidDuplicates",
				 PAGE__AVOID_DUPLICATES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //WdlValidator
