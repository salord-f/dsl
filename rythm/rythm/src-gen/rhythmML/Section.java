/**
 */
package rhythmML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rhythmML.Section#getPatternLoops <em>Pattern Loops</em>}</li>
 *   <li>{@link rhythmML.Section#getPatternModifications <em>Pattern Modifications</em>}</li>
 * </ul>
 *
 * @see rhythmML.RhythmMLPackage#getSection()
 * @model
 * @generated
 */
public interface Section extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Pattern Loops</b></em>' containment reference list.
	 * The list contents are of type {@link rhythmML.PatternLoop}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Loops</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Loops</em>' containment reference list.
	 * @see rhythmML.RhythmMLPackage#getSection_PatternLoops()
	 * @model containment="true"
	 * @generated
	 */
	EList<PatternLoop> getPatternLoops();

	/**
	 * Returns the value of the '<em><b>Pattern Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link rhythmML.PatternModification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Modifications</em>' containment reference list.
	 * @see rhythmML.RhythmMLPackage#getSection_PatternModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<PatternModification> getPatternModifications();
} // Section
