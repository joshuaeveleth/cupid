/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesMethod;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attaches Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.AttachesMethodImpl#getMethodLabel <em>Method Label</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.AttachesMethodImpl#getUserRoutine <em>User Routine</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttachesMethodImpl extends EObjectImpl implements AttachesMethod {
	/**
	 * The default value of the '{@link #getMethodLabel() <em>Method Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethodLabel() <em>Method Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodLabel()
	 * @generated
	 * @ordered
	 */
	protected String methodLabel = METHOD_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserRoutine() <em>User Routine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserRoutine()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_ROUTINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserRoutine() <em>User Routine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserRoutine()
	 * @generated
	 * @ordered
	 */
	protected String userRoutine = USER_ROUTINE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttachesMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NUOPCPackage.Literals.ATTACHES_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMethodLabel() {
		return methodLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodLabel(String newMethodLabel) {
		String oldMethodLabel = methodLabel;
		methodLabel = newMethodLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.ATTACHES_METHOD__METHOD_LABEL, oldMethodLabel, methodLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserRoutine() {
		return userRoutine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserRoutine(String newUserRoutine) {
		String oldUserRoutine = userRoutine;
		userRoutine = newUserRoutine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.ATTACHES_METHOD__USER_ROUTINE, oldUserRoutine, userRoutine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NUOPCPackage.ATTACHES_METHOD__METHOD_LABEL:
				return getMethodLabel();
			case NUOPCPackage.ATTACHES_METHOD__USER_ROUTINE:
				return getUserRoutine();
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
			case NUOPCPackage.ATTACHES_METHOD__METHOD_LABEL:
				setMethodLabel((String)newValue);
				return;
			case NUOPCPackage.ATTACHES_METHOD__USER_ROUTINE:
				setUserRoutine((String)newValue);
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
			case NUOPCPackage.ATTACHES_METHOD__METHOD_LABEL:
				setMethodLabel(METHOD_LABEL_EDEFAULT);
				return;
			case NUOPCPackage.ATTACHES_METHOD__USER_ROUTINE:
				setUserRoutine(USER_ROUTINE_EDEFAULT);
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
			case NUOPCPackage.ATTACHES_METHOD__METHOD_LABEL:
				return METHOD_LABEL_EDEFAULT == null ? methodLabel != null : !METHOD_LABEL_EDEFAULT.equals(methodLabel);
			case NUOPCPackage.ATTACHES_METHOD__USER_ROUTINE:
				return USER_ROUTINE_EDEFAULT == null ? userRoutine != null : !USER_ROUTINE_EDEFAULT.equals(userRoutine);
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
		result.append(" (methodLabel: ");
		result.append(methodLabel);
		result.append(", userRoutine: ");
		result.append(userRoutine);
		result.append(')');
		return result.toString();
	}

} //AttachesMethodImpl