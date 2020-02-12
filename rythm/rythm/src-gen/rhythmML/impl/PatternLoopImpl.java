/**
 */
package rhythmML.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rhythmML.Pattern;
import rhythmML.PatternLoop;
import rhythmML.RhythmMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rhythmML.impl.PatternLoopImpl#getLoopNumber <em>Loop Number</em>}</li>
 *   <li>{@link rhythmML.impl.PatternLoopImpl#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatternLoopImpl extends MinimalEObjectImpl.Container implements PatternLoop {
	/**
	 * The default value of the '{@link #getLoopNumber() <em>Loop Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int LOOP_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLoopNumber() <em>Loop Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopNumber()
	 * @generated
	 * @ordered
	 */
	protected int loopNumber = LOOP_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected Pattern pattern;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternLoopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RhythmMLPackage.Literals.PATTERN_LOOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLoopNumber() {
		return loopNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopNumber(int newLoopNumber) {
		int oldLoopNumber = loopNumber;
		loopNumber = newLoopNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RhythmMLPackage.PATTERN_LOOP__LOOP_NUMBER,
					oldLoopNumber, loopNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern getPattern() {
		if (pattern != null && pattern.eIsProxy()) {
			InternalEObject oldPattern = (InternalEObject) pattern;
			pattern = (Pattern) eResolveProxy(oldPattern);
			if (pattern != oldPattern) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RhythmMLPackage.PATTERN_LOOP__PATTERN,
							oldPattern, pattern));
			}
		}
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern basicGetPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(Pattern newPattern) {
		Pattern oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RhythmMLPackage.PATTERN_LOOP__PATTERN, oldPattern,
					pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RhythmMLPackage.PATTERN_LOOP__LOOP_NUMBER:
			return getLoopNumber();
		case RhythmMLPackage.PATTERN_LOOP__PATTERN:
			if (resolve)
				return getPattern();
			return basicGetPattern();
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
		case RhythmMLPackage.PATTERN_LOOP__LOOP_NUMBER:
			setLoopNumber((Integer) newValue);
			return;
		case RhythmMLPackage.PATTERN_LOOP__PATTERN:
			setPattern((Pattern) newValue);
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
		case RhythmMLPackage.PATTERN_LOOP__LOOP_NUMBER:
			setLoopNumber(LOOP_NUMBER_EDEFAULT);
			return;
		case RhythmMLPackage.PATTERN_LOOP__PATTERN:
			setPattern((Pattern) null);
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
		case RhythmMLPackage.PATTERN_LOOP__LOOP_NUMBER:
			return loopNumber != LOOP_NUMBER_EDEFAULT;
		case RhythmMLPackage.PATTERN_LOOP__PATTERN:
			return pattern != null;
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
		result.append(" (loopNumber: ");
		result.append(loopNumber);
		result.append(')');
		return result.toString();
	}

} //PatternLoopImpl
