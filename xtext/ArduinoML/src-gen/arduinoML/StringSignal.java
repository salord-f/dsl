/**
 */
package arduinoML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoML.StringSignal#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see arduinoML.ArduinoMLPackage#getStringSignal()
 * @model
 * @generated
 */
public interface StringSignal extends Signal {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"HIGH"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see arduinoML.ArduinoMLPackage#getStringSignal_Value()
	 * @model default="HIGH"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link arduinoML.StringSignal#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // StringSignal
