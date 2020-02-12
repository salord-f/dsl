/**
 */
package rhythmML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Modification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rhythmML.PatternModification#getPattern <em>Pattern</em>}</li>
 *   <li>{@link rhythmML.PatternModification#getIteration <em>Iteration</em>}</li>
 *   <li>{@link rhythmML.PatternModification#getBeatNumber <em>Beat Number</em>}</li>
 *   <li>{@link rhythmML.PatternModification#getBeat <em>Beat</em>}</li>
 * </ul>
 *
 * @see rhythmML.RhythmMLPackage#getPatternModification()
 * @model
 * @generated
 */
public interface PatternModification extends EObject {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' reference.
	 * @see #setPattern(Pattern)
	 * @see rhythmML.RhythmMLPackage#getPatternModification_Pattern()
	 * @model
	 * @generated
	 */
	Pattern getPattern();

	/**
	 * Sets the value of the '{@link rhythmML.PatternModification#getPattern <em>Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(Pattern value);

	/**
	 * Returns the value of the '<em><b>Iteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iteration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iteration</em>' attribute.
	 * @see #setIteration(int)
	 * @see rhythmML.RhythmMLPackage#getPatternModification_Iteration()
	 * @model
	 * @generated
	 */
	int getIteration();

	/**
	 * Sets the value of the '{@link rhythmML.PatternModification#getIteration <em>Iteration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iteration</em>' attribute.
	 * @see #getIteration()
	 * @generated
	 */
	void setIteration(int value);

	/**
	 * Returns the value of the '<em><b>Beat Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beat Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beat Number</em>' attribute.
	 * @see #setBeatNumber(int)
	 * @see rhythmML.RhythmMLPackage#getPatternModification_BeatNumber()
	 * @model
	 * @generated
	 */
	int getBeatNumber();

	/**
	 * Sets the value of the '{@link rhythmML.PatternModification#getBeatNumber <em>Beat Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beat Number</em>' attribute.
	 * @see #getBeatNumber()
	 * @generated
	 */
	void setBeatNumber(int value);

	/**
	 * Returns the value of the '<em><b>Beat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beat</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beat</em>' containment reference.
	 * @see #setBeat(Beat)
	 * @see rhythmML.RhythmMLPackage#getPatternModification_Beat()
	 * @model containment="true"
	 * @generated
	 */
	Beat getBeat();

	/**
	 * Sets the value of the '{@link rhythmML.PatternModification#getBeat <em>Beat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beat</em>' containment reference.
	 * @see #getBeat()
	 * @generated
	 */
	void setBeat(Beat value);

} // PatternModification
