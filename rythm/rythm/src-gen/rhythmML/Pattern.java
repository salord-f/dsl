/**
 */
package rhythmML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rhythmML.Pattern#getBar <em>Bar</em>}</li>
 * </ul>
 *
 * @see rhythmML.RhythmMLPackage#getPattern()
 * @model
 * @generated
 */
public interface Pattern extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Bar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bar</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bar</em>' containment reference.
	 * @see #setBar(Bar)
	 * @see rhythmML.RhythmMLPackage#getPattern_Bar()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Bar getBar();

	/**
	 * Sets the value of the '{@link rhythmML.Pattern#getBar <em>Bar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bar</em>' containment reference.
	 * @see #getBar()
	 * @generated
	 */
	void setBar(Bar value);

} // Pattern
