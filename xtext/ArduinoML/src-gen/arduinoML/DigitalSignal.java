/**
 */
package arduinoML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Digital Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoML.DigitalSignal#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see arduinoML.ArduinoMLPackage#getDigitalSignal()
 * @model
 * @generated
 */
public interface DigitalSignal extends Signal {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link arduinoML.DigitalSignalEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see arduinoML.DigitalSignalEnum
	 * @see #setValue(DigitalSignalEnum)
	 * @see arduinoML.ArduinoMLPackage#getDigitalSignal_Value()
	 * @model default=""
	 * @generated
	 */
	DigitalSignalEnum getValue();

	/**
	 * Sets the value of the '{@link arduinoML.DigitalSignal#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see arduinoML.DigitalSignalEnum
	 * @see #getValue()
	 * @generated
	 */
	void setValue(DigitalSignalEnum value);

} // DigitalSignal
