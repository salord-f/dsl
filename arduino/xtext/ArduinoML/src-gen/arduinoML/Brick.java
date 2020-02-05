/**
 */
package arduinoML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Brick</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoML.Brick#getPins <em>Pins</em>}</li>
 * </ul>
 *
 * @see arduinoML.ArduinoMLPackage#getBrick()
 * @model abstract="true"
 * @generated
 */
public interface Brick extends NamedElement {
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
	 * @see arduinoML.ArduinoMLPackage#getBrick_Pins()
	 * @model
	 * @generated
	 */
	EList<Integer> getPins();

} // Brick
