/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl;

import java.util.Collection;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.GetsInternalState;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Driver Implements Set Model Count</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__ImplementsSetModelCountImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__ImplementsSetModelCountImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__ImplementsSetModelCountImpl#getDriverInternalState <em>Driver Internal State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__ImplementsSetModelCountImpl#getGetsInternalState <em>Gets Internal State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NUOPCDriver__ImplementsSetModelCountImpl extends EObjectImpl implements NUOPCDriver__ImplementsSetModelCount {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "SetServicesDefault";
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
	/**
	 * The cached value of the '{@link #getDriverInternalState() <em>Driver Internal State</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriverInternalState()
	 * @generated
	 * @ordered
	 */
	protected EList<String> driverInternalState;

	/**
	 * The cached value of the '{@link #getGetsInternalState() <em>Gets Internal State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetsInternalState()
	 * @generated
	 * @ordered
	 */
	protected GetsInternalState getsInternalState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NUOPCDriver__ImplementsSetModelCountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NUOPCPackage.Literals.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCDriver getParent() {
		if (eContainerFeatureID() != NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__PARENT) return null;
		return (NUOPCDriver)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(NUOPCDriver newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(NUOPCDriver newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, NUOPCPackage.NUOPC_DRIVER__IMPLEMENTS_SET_MODEL_COUNT, NUOPCDriver.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDriverInternalState() {
		if (driverInternalState == null) {
			driverInternalState = new EDataTypeUniqueEList<String>(String.class, this, NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__DRIVER_INTERNAL_STATE);
		}
		return driverInternalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetsInternalState getGetsInternalState() {
		return getsInternalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetsInternalState(GetsInternalState newGetsInternalState, NotificationChain msgs) {
		GetsInternalState oldGetsInternalState = getsInternalState;
		getsInternalState = newGetsInternalState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__GETS_INTERNAL_STATE, oldGetsInternalState, newGetsInternalState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetsInternalState(GetsInternalState newGetsInternalState) {
		if (newGetsInternalState != getsInternalState) {
			NotificationChain msgs = null;
			if (getsInternalState != null)
				msgs = ((InternalEObject)getsInternalState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__GETS_INTERNAL_STATE, null, msgs);
			if (newGetsInternalState != null)
				msgs = ((InternalEObject)newGetsInternalState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__GETS_INTERNAL_STATE, null, msgs);
			msgs = basicSetGetsInternalState(newGetsInternalState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__GETS_INTERNAL_STATE, newGetsInternalState, newGetsInternalState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((NUOPCDriver)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__PARENT:
				return basicSetParent(null, msgs);
			case NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__GETS_INTERNAL_STATE:
				return basicSetGetsInternalState(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__PARENT:
				return eInternalContainer().eInverseRemove(this, NUOPCPackage.NUOPC_DRIVER__IMPLEMENTS_SET_MODEL_COUNT, NUOPCDriver.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__PARENT:
				return getParent();
			case NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__NAME:
				return getName();
			case NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__DRIVER_INTERNAL_STATE:
				return getDriverInternalState();
			case NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__GETS_INTERNAL_STATE:
				return getGetsInternalState();
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
			case NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__PARENT:
				setParent((NUOPCDriver)newValue);
				return;
			case NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__NAME:
				setName((String)newValue);
				return;
			case NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__DRIVER_INTERNAL_STATE:
				getDriverInternalState().clear();
				getDriverInternalState().addAll((Collection<? extends String>)newValue);
				return;
			case NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__GETS_INTERNAL_STATE:
				setGetsInternalState((GetsInternalState)newValue);
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
			case NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__PARENT:
				setParent((NUOPCDriver)null);
				return;
			case NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__DRIVER_INTERNAL_STATE:
				getDriverInternalState().clear();
				return;
			case NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__GETS_INTERNAL_STATE:
				setGetsInternalState((GetsInternalState)null);
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
			case NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__PARENT:
				return getParent() != null;
			case NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__DRIVER_INTERNAL_STATE:
				return driverInternalState != null && !driverInternalState.isEmpty();
			case NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__GETS_INTERNAL_STATE:
				return getsInternalState != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", driverInternalState: ");
		result.append(driverInternalState);
		result.append(')');
		return result.toString();
	}

} //NUOPCDriver__ImplementsSetModelCountImpl
