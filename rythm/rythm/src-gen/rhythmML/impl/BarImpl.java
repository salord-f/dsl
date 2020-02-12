/**
 */
package rhythmML.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rhythmML.Bar;
import rhythmML.Beat;
import rhythmML.RhythmMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rhythmML.impl.BarImpl#getBeats <em>Beats</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BarImpl extends MinimalEObjectImpl.Container implements Bar {
	/**
	 * The cached value of the '{@link #getBeats() <em>Beats</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeats()
	 * @generated
	 * @ordered
	 */
	protected EList<Beat> beats;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RhythmMLPackage.Literals.BAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Beat> getBeats() {
		if (beats == null) {
			beats = new EObjectContainmentEList<Beat>(Beat.class, this, RhythmMLPackage.BAR__BEATS);
		}
		return beats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RhythmMLPackage.BAR__BEATS:
			return ((InternalEList<?>) getBeats()).basicRemove(otherEnd, msgs);
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
		case RhythmMLPackage.BAR__BEATS:
			return getBeats();
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
		case RhythmMLPackage.BAR__BEATS:
			getBeats().clear();
			getBeats().addAll((Collection<? extends Beat>) newValue);
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
		case RhythmMLPackage.BAR__BEATS:
			getBeats().clear();
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
		case RhythmMLPackage.BAR__BEATS:
			return beats != null && !beats.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BarImpl
