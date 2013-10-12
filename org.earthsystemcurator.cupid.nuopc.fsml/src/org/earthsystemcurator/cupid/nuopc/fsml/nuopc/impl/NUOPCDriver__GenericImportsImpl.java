/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__GenericImports;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Driver Generic Imports</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__GenericImportsImpl#getImportsGenericSS <em>Imports Generic SS</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__GenericImportsImpl#getImportsTypeDriverIS <em>Imports Type Driver IS</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__GenericImportsImpl#getImportsLabelSetModelCount <em>Imports Label Set Model Count</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__GenericImportsImpl#getImportsLabelSetModelServices <em>Imports Label Set Model Services</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NUOPCDriver__GenericImportsImpl extends EObjectImpl implements NUOPCDriver__GenericImports {
	/**
	 * The default value of the '{@link #getImportsGenericSS() <em>Imports Generic SS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportsGenericSS()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORTS_GENERIC_SS_EDEFAULT = "nuopcmodel_ss";

	/**
	 * The cached value of the '{@link #getImportsGenericSS() <em>Imports Generic SS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportsGenericSS()
	 * @generated
	 * @ordered
	 */
	protected String importsGenericSS = IMPORTS_GENERIC_SS_EDEFAULT;

	/**
	 * The default value of the '{@link #getImportsTypeDriverIS() <em>Imports Type Driver IS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportsTypeDriverIS()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORTS_TYPE_DRIVER_IS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImportsTypeDriverIS() <em>Imports Type Driver IS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportsTypeDriverIS()
	 * @generated
	 * @ordered
	 */
	protected String importsTypeDriverIS = IMPORTS_TYPE_DRIVER_IS_EDEFAULT;

	/**
	 * The default value of the '{@link #getImportsLabelSetModelCount() <em>Imports Label Set Model Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportsLabelSetModelCount()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORTS_LABEL_SET_MODEL_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImportsLabelSetModelCount() <em>Imports Label Set Model Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportsLabelSetModelCount()
	 * @generated
	 * @ordered
	 */
	protected String importsLabelSetModelCount = IMPORTS_LABEL_SET_MODEL_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getImportsLabelSetModelServices() <em>Imports Label Set Model Services</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportsLabelSetModelServices()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORTS_LABEL_SET_MODEL_SERVICES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImportsLabelSetModelServices() <em>Imports Label Set Model Services</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportsLabelSetModelServices()
	 * @generated
	 * @ordered
	 */
	protected String importsLabelSetModelServices = IMPORTS_LABEL_SET_MODEL_SERVICES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NUOPCDriver__GenericImportsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NUOPCPackage.Literals.NUOPC_DRIVER_GENERIC_IMPORTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImportsGenericSS() {
		return importsGenericSS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportsGenericSS(String newImportsGenericSS) {
		String oldImportsGenericSS = importsGenericSS;
		importsGenericSS = newImportsGenericSS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER_GENERIC_IMPORTS__IMPORTS_GENERIC_SS, oldImportsGenericSS, importsGenericSS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImportsTypeDriverIS() {
		return importsTypeDriverIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportsTypeDriverIS(String newImportsTypeDriverIS) {
		String oldImportsTypeDriverIS = importsTypeDriverIS;
		importsTypeDriverIS = newImportsTypeDriverIS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER_GENERIC_IMPORTS__IMPORTS_TYPE_DRIVER_IS, oldImportsTypeDriverIS, importsTypeDriverIS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImportsLabelSetModelCount() {
		return importsLabelSetModelCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportsLabelSetModelCount(String newImportsLabelSetModelCount) {
		String oldImportsLabelSetModelCount = importsLabelSetModelCount;
		importsLabelSetModelCount = newImportsLabelSetModelCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER_GENERIC_IMPORTS__IMPORTS_LABEL_SET_MODEL_COUNT, oldImportsLabelSetModelCount, importsLabelSetModelCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImportsLabelSetModelServices() {
		return importsLabelSetModelServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportsLabelSetModelServices(String newImportsLabelSetModelServices) {
		String oldImportsLabelSetModelServices = importsLabelSetModelServices;
		importsLabelSetModelServices = newImportsLabelSetModelServices;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER_GENERIC_IMPORTS__IMPORTS_LABEL_SET_MODEL_SERVICES, oldImportsLabelSetModelServices, importsLabelSetModelServices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NUOPCPackage.NUOPC_DRIVER_GENERIC_IMPORTS__IMPORTS_GENERIC_SS:
				return getImportsGenericSS();
			case NUOPCPackage.NUOPC_DRIVER_GENERIC_IMPORTS__IMPORTS_TYPE_DRIVER_IS:
				return getImportsTypeDriverIS();
			case NUOPCPackage.NUOPC_DRIVER_GENERIC_IMPORTS__IMPORTS_LABEL_SET_MODEL_COUNT:
				return getImportsLabelSetModelCount();
			case NUOPCPackage.NUOPC_DRIVER_GENERIC_IMPORTS__IMPORTS_LABEL_SET_MODEL_SERVICES:
				return getImportsLabelSetModelServices();
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
			case NUOPCPackage.NUOPC_DRIVER_GENERIC_IMPORTS__IMPORTS_GENERIC_SS:
				setImportsGenericSS((String)newValue);
				return;
			case NUOPCPackage.NUOPC_DRIVER_GENERIC_IMPORTS__IMPORTS_TYPE_DRIVER_IS:
				setImportsTypeDriverIS((String)newValue);
				return;
			case NUOPCPackage.NUOPC_DRIVER_GENERIC_IMPORTS__IMPORTS_LABEL_SET_MODEL_COUNT:
				setImportsLabelSetModelCount((String)newValue);
				return;
			case NUOPCPackage.NUOPC_DRIVER_GENERIC_IMPORTS__IMPORTS_LABEL_SET_MODEL_SERVICES:
				setImportsLabelSetModelServices((String)newValue);
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
			case NUOPCPackage.NUOPC_DRIVER_GENERIC_IMPORTS__IMPORTS_GENERIC_SS:
				setImportsGenericSS(IMPORTS_GENERIC_SS_EDEFAULT);
				return;
			case NUOPCPackage.NUOPC_DRIVER_GENERIC_IMPORTS__IMPORTS_TYPE_DRIVER_IS:
				setImportsTypeDriverIS(IMPORTS_TYPE_DRIVER_IS_EDEFAULT);
				return;
			case NUOPCPackage.NUOPC_DRIVER_GENERIC_IMPORTS__IMPORTS_LABEL_SET_MODEL_COUNT:
				setImportsLabelSetModelCount(IMPORTS_LABEL_SET_MODEL_COUNT_EDEFAULT);
				return;
			case NUOPCPackage.NUOPC_DRIVER_GENERIC_IMPORTS__IMPORTS_LABEL_SET_MODEL_SERVICES:
				setImportsLabelSetModelServices(IMPORTS_LABEL_SET_MODEL_SERVICES_EDEFAULT);
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
			case NUOPCPackage.NUOPC_DRIVER_GENERIC_IMPORTS__IMPORTS_GENERIC_SS:
				return IMPORTS_GENERIC_SS_EDEFAULT == null ? importsGenericSS != null : !IMPORTS_GENERIC_SS_EDEFAULT.equals(importsGenericSS);
			case NUOPCPackage.NUOPC_DRIVER_GENERIC_IMPORTS__IMPORTS_TYPE_DRIVER_IS:
				return IMPORTS_TYPE_DRIVER_IS_EDEFAULT == null ? importsTypeDriverIS != null : !IMPORTS_TYPE_DRIVER_IS_EDEFAULT.equals(importsTypeDriverIS);
			case NUOPCPackage.NUOPC_DRIVER_GENERIC_IMPORTS__IMPORTS_LABEL_SET_MODEL_COUNT:
				return IMPORTS_LABEL_SET_MODEL_COUNT_EDEFAULT == null ? importsLabelSetModelCount != null : !IMPORTS_LABEL_SET_MODEL_COUNT_EDEFAULT.equals(importsLabelSetModelCount);
			case NUOPCPackage.NUOPC_DRIVER_GENERIC_IMPORTS__IMPORTS_LABEL_SET_MODEL_SERVICES:
				return IMPORTS_LABEL_SET_MODEL_SERVICES_EDEFAULT == null ? importsLabelSetModelServices != null : !IMPORTS_LABEL_SET_MODEL_SERVICES_EDEFAULT.equals(importsLabelSetModelServices);
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
		result.append(" (importsGenericSS: ");
		result.append(importsGenericSS);
		result.append(", importsTypeDriverIS: ");
		result.append(importsTypeDriverIS);
		result.append(", importsLabelSetModelCount: ");
		result.append(importsLabelSetModelCount);
		result.append(", importsLabelSetModelServices: ");
		result.append(importsLabelSetModelServices);
		result.append(')');
		return result.toString();
	}

} //NUOPCDriver__GenericImportsImpl
