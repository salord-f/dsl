/**
 */
package arduinoML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoML.Condition#getSensor <em>Sensor</em>}</li>
 *   <li>{@link arduinoML.Condition#getOperator <em>Operator</em>}</li>
 *   <li>{@link arduinoML.Condition#getSignal <em>Signal</em>}</li>
 * </ul>
 *
 * @see arduinoML.ArduinoMLPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' reference.
	 * @see #setSensor(Sensor)
	 * @see arduinoML.ArduinoMLPackage#getCondition_Sensor()
	 * @model required="true"
	 * @generated
	 */
	Sensor getSensor();

	/**
	 * Sets the value of the '{@link arduinoML.Condition#getSensor <em>Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor</em>' reference.
	 * @see #getSensor()
	 * @generated
	 */
	void setSensor(Sensor value);

	/**
	 * Returns the value of the '<em><b>Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal</em>' containment reference.
	 * @see #setSignal(Signal)
	 * @see arduinoML.ArduinoMLPackage#getCondition_Signal()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Signal getSignal();

	/**
	 * Sets the value of the '{@link arduinoML.Condition#getSignal <em>Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal</em>' containment reference.
	 * @see #getSignal()
	 * @generated
	 */
	void setSignal(Signal value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The default value is <code>"NONE"</code>.
	 * The literals are from the enumeration {@link arduinoML.Operator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see arduinoML.Operator
	 * @see #setOperator(Operator)
	 * @see arduinoML.ArduinoMLPackage#getCondition_Operator()
	 * @model default="NONE"
	 * @generated
	 */
	Operator getOperator();

	/**
	 * Sets the value of the '{@link arduinoML.Condition#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see arduinoML.Operator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Operator value);

} // Condition
