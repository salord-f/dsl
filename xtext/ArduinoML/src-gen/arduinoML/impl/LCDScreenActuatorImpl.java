/**
 */
package arduinoML.impl;

import arduinoML.ArduinoMLPackage;
import arduinoML.LCDScreenActuator;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LCD Screen Actuator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduinoML.impl.LCDScreenActuatorImpl#getPins <em>Pins</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LCDScreenActuatorImpl extends ActuatorImpl implements LCDScreenActuator {
	/**
	 * The cached value of the '{@link #getPins() <em>Pins</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPins()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> pins;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LCDScreenActuatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoMLPackage.Literals.LCD_SCREEN_ACTUATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getPins() {
		if (pins == null) {
			pins = new EDataTypeUniqueEList<Integer>(Integer.class, this, ArduinoMLPackage.LCD_SCREEN_ACTUATOR__PINS);
		}
		return pins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArduinoMLPackage.LCD_SCREEN_ACTUATOR__PINS:
			return getPins();
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
		case ArduinoMLPackage.LCD_SCREEN_ACTUATOR__PINS:
			getPins().clear();
			getPins().addAll((Collection<? extends Integer>) newValue);
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
		case ArduinoMLPackage.LCD_SCREEN_ACTUATOR__PINS:
			getPins().clear();
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
		case ArduinoMLPackage.LCD_SCREEN_ACTUATOR__PINS:
			return pins != null && !pins.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (pins: ");
		result.append(pins);
		result.append(')');
		return result.toString();
	}

} //LCDScreenActuatorImpl
