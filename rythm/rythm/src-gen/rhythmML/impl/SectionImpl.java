/**
 */
package rhythmML.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import rhythmML.PatternLoop;
import rhythmML.PatternModification;
import rhythmML.RhythmMLPackage;
import rhythmML.Section;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rhythmML.impl.SectionImpl#getPatternLoops <em>Pattern Loops</em>}</li>
 *   <li>{@link rhythmML.impl.SectionImpl#getPatternModifications <em>Pattern Modifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SectionImpl extends NamedElementImpl implements Section {
	/**
	 * The cached value of the '{@link #getPatternLoops() <em>Pattern Loops</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternLoops()
	 * @generated
	 * @ordered
	 */
	protected EList<PatternLoop> patternLoops;
	/**
	 * The cached value of the '{@link #getPatternModifications() <em>Pattern Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<PatternModification> patternModifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RhythmMLPackage.Literals.SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PatternLoop> getPatternLoops() {
		if (patternLoops == null) {
			patternLoops = new EObjectContainmentEList<PatternLoop>(PatternLoop.class, this,
					RhythmMLPackage.SECTION__PATTERN_LOOPS);
		}
		return patternLoops;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PatternModification> getPatternModifications() {
		if (patternModifications == null) {
			patternModifications = new EObjectContainmentEList<PatternModification>(PatternModification.class, this,
					RhythmMLPackage.SECTION__PATTERN_MODIFICATIONS);
		}
		return patternModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RhythmMLPackage.SECTION__PATTERN_LOOPS:
			return ((InternalEList<?>) getPatternLoops()).basicRemove(otherEnd, msgs);
		case RhythmMLPackage.SECTION__PATTERN_MODIFICATIONS:
			return ((InternalEList<?>) getPatternModifications()).basicRemove(otherEnd, msgs);
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
		case RhythmMLPackage.SECTION__PATTERN_LOOPS:
			return getPatternLoops();
		case RhythmMLPackage.SECTION__PATTERN_MODIFICATIONS:
			return getPatternModifications();
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
		case RhythmMLPackage.SECTION__PATTERN_LOOPS:
			getPatternLoops().clear();
			getPatternLoops().addAll((Collection<? extends PatternLoop>) newValue);
			return;
		case RhythmMLPackage.SECTION__PATTERN_MODIFICATIONS:
			getPatternModifications().clear();
			getPatternModifications().addAll((Collection<? extends PatternModification>) newValue);
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
		case RhythmMLPackage.SECTION__PATTERN_LOOPS:
			getPatternLoops().clear();
			return;
		case RhythmMLPackage.SECTION__PATTERN_MODIFICATIONS:
			getPatternModifications().clear();
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
		case RhythmMLPackage.SECTION__PATTERN_LOOPS:
			return patternLoops != null && !patternLoops.isEmpty();
		case RhythmMLPackage.SECTION__PATTERN_MODIFICATIONS:
			return patternModifications != null && !patternModifications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SectionImpl
