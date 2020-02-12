/**
 */
package rhythmML.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rhythmML.Beat;
import rhythmML.Pattern;
import rhythmML.PatternModification;
import rhythmML.RhythmMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Modification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rhythmML.impl.PatternModificationImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link rhythmML.impl.PatternModificationImpl#getIteration <em>Iteration</em>}</li>
 *   <li>{@link rhythmML.impl.PatternModificationImpl#getBeatNumber <em>Beat Number</em>}</li>
 *   <li>{@link rhythmML.impl.PatternModificationImpl#getBeat <em>Beat</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatternModificationImpl extends MinimalEObjectImpl.Container implements PatternModification {
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
	 * The default value of the '{@link #getIteration() <em>Iteration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIteration()
	 * @generated
	 * @ordered
	 */
	protected static final int ITERATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIteration() <em>Iteration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIteration()
	 * @generated
	 * @ordered
	 */
	protected int iteration = ITERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBeatNumber() <em>Beat Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeatNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int BEAT_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBeatNumber() <em>Beat Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeatNumber()
	 * @generated
	 * @ordered
	 */
	protected int beatNumber = BEAT_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBeat() <em>Beat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeat()
	 * @generated
	 * @ordered
	 */
	protected Beat beat;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternModificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RhythmMLPackage.Literals.PATTERN_MODIFICATION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RhythmMLPackage.PATTERN_MODIFICATION__PATTERN, oldPattern, pattern));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RhythmMLPackage.PATTERN_MODIFICATION__PATTERN,
					oldPattern, pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIteration() {
		return iteration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIteration(int newIteration) {
		int oldIteration = iteration;
		iteration = newIteration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RhythmMLPackage.PATTERN_MODIFICATION__ITERATION,
					oldIteration, iteration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBeatNumber() {
		return beatNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeatNumber(int newBeatNumber) {
		int oldBeatNumber = beatNumber;
		beatNumber = newBeatNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RhythmMLPackage.PATTERN_MODIFICATION__BEAT_NUMBER,
					oldBeatNumber, beatNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Beat getBeat() {
		return beat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeat(Beat newBeat, NotificationChain msgs) {
		Beat oldBeat = beat;
		beat = newBeat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RhythmMLPackage.PATTERN_MODIFICATION__BEAT, oldBeat, newBeat);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeat(Beat newBeat) {
		if (newBeat != beat) {
			NotificationChain msgs = null;
			if (beat != null)
				msgs = ((InternalEObject) beat).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RhythmMLPackage.PATTERN_MODIFICATION__BEAT, null, msgs);
			if (newBeat != null)
				msgs = ((InternalEObject) newBeat).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RhythmMLPackage.PATTERN_MODIFICATION__BEAT, null, msgs);
			msgs = basicSetBeat(newBeat, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RhythmMLPackage.PATTERN_MODIFICATION__BEAT, newBeat,
					newBeat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RhythmMLPackage.PATTERN_MODIFICATION__BEAT:
			return basicSetBeat(null, msgs);
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
		case RhythmMLPackage.PATTERN_MODIFICATION__PATTERN:
			if (resolve)
				return getPattern();
			return basicGetPattern();
		case RhythmMLPackage.PATTERN_MODIFICATION__ITERATION:
			return getIteration();
		case RhythmMLPackage.PATTERN_MODIFICATION__BEAT_NUMBER:
			return getBeatNumber();
		case RhythmMLPackage.PATTERN_MODIFICATION__BEAT:
			return getBeat();
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
		case RhythmMLPackage.PATTERN_MODIFICATION__PATTERN:
			setPattern((Pattern) newValue);
			return;
		case RhythmMLPackage.PATTERN_MODIFICATION__ITERATION:
			setIteration((Integer) newValue);
			return;
		case RhythmMLPackage.PATTERN_MODIFICATION__BEAT_NUMBER:
			setBeatNumber((Integer) newValue);
			return;
		case RhythmMLPackage.PATTERN_MODIFICATION__BEAT:
			setBeat((Beat) newValue);
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
		case RhythmMLPackage.PATTERN_MODIFICATION__PATTERN:
			setPattern((Pattern) null);
			return;
		case RhythmMLPackage.PATTERN_MODIFICATION__ITERATION:
			setIteration(ITERATION_EDEFAULT);
			return;
		case RhythmMLPackage.PATTERN_MODIFICATION__BEAT_NUMBER:
			setBeatNumber(BEAT_NUMBER_EDEFAULT);
			return;
		case RhythmMLPackage.PATTERN_MODIFICATION__BEAT:
			setBeat((Beat) null);
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
		case RhythmMLPackage.PATTERN_MODIFICATION__PATTERN:
			return pattern != null;
		case RhythmMLPackage.PATTERN_MODIFICATION__ITERATION:
			return iteration != ITERATION_EDEFAULT;
		case RhythmMLPackage.PATTERN_MODIFICATION__BEAT_NUMBER:
			return beatNumber != BEAT_NUMBER_EDEFAULT;
		case RhythmMLPackage.PATTERN_MODIFICATION__BEAT:
			return beat != null;
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
		result.append(" (iteration: ");
		result.append(iteration);
		result.append(", beatNumber: ");
		result.append(beatNumber);
		result.append(')');
		return result.toString();
	}

} //PatternModificationImpl
