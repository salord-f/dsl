/**
 */
package arduinoML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LCD Screen Actuator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoML.LCDScreenActuator#getPins <em>Pins</em>}</li>
 * </ul>
 *
 * @see arduinoML.ArduinoMLPackage#getLCDScreenActuator()
 * @model
 * @generated
 */
public interface LCDScreenActuator extends Actuator {
	/**
	 * Returns the value of the '<em><b>Pins</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pins</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pins</em>' attribute list.
	 * @see arduinoML.ArduinoMLPackage#getLCDScreenActuator_Pins()
	 * @model
	 * @generated
	 */
	EList<Integer> getPins();

} // LCDScreenActuator
