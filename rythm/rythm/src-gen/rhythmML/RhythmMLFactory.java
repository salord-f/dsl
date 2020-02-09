/**
 */
package rhythmML;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see rhythmML.RhythmMLPackage
 * @generated
 */
public interface RhythmMLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RhythmMLFactory eINSTANCE = rhythmML.impl.RhythmMLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Rhythm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rhythm</em>'.
	 * @generated
	 */
	Rhythm createRhythm();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RhythmMLPackage getRhythmMLPackage();

} //RhythmMLFactory
