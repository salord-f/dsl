/**
 */
package rhythmML.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import rhythmML.Beat;
import rhythmML.DRUM_NOTES;
import rhythmML.RhythmMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Beat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rhythmML.impl.BeatImpl#getTicks <em>Ticks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BeatImpl extends MinimalEObjectImpl.Container implements Beat {
	/**
	 * The cached value of the '{@link #getTicks() <em>Ticks</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTicks()
	 * @generated
	 * @ordered
	 */
	protected EList<DRUM_NOTES> ticks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BeatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RhythmMLPackage.Literals.BEAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DRUM_NOTES> getTicks() {
		if (ticks == null) {
			ticks = new EDataTypeUniqueEList<DRUM_NOTES>(DRUM_NOTES.class, this, RhythmMLPackage.BEAT__TICKS);
		}
		return ticks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RhythmMLPackage.BEAT__TICKS:
			return getTicks();
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
		case RhythmMLPackage.BEAT__TICKS:
			getTicks().clear();
			getTicks().addAll((Collection<? extends DRUM_NOTES>) newValue);
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
		case RhythmMLPackage.BEAT__TICKS:
			getTicks().clear();
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
		case RhythmMLPackage.BEAT__TICKS:
			return ticks != null && !ticks.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (ticks: ");
		result.append(ticks);
		result.append(')');
		return result.toString();
	}

} //BeatImpl
