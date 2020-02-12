/**
 */
package rhythmML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rhythmML.PatternLoop#getLoopNumber <em>Loop Number</em>}</li>
 *   <li>{@link rhythmML.PatternLoop#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @see rhythmML.RhythmMLPackage#getPatternLoop()
 * @model
 * @generated
 */
public interface PatternLoop extends EObject {
	/**
	 * Returns the value of the '<em><b>Loop Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Number</em>' attribute.
	 * @see #setLoopNumber(int)
	 * @see rhythmML.RhythmMLPackage#getPatternLoop_LoopNumber()
	 * @model
	 * @generated
	 */
	int getLoopNumber();

	/**
	 * Sets the value of the '{@link rhythmML.PatternLoop#getLoopNumber <em>Loop Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Number</em>' attribute.
	 * @see #getLoopNumber()
	 * @generated
	 */
	void setLoopNumber(int value);

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
	 * @see rhythmML.RhythmMLPackage#getPatternLoop_Pattern()
	 * @model
	 * @generated
	 */
	Pattern getPattern();

	/**
	 * Sets the value of the '{@link rhythmML.PatternLoop#getPattern <em>Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(Pattern value);

} // PatternLoop
