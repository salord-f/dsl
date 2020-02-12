/**
 */
package rhythmML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Beat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rhythmML.Beat#getTicks <em>Ticks</em>}</li>
 * </ul>
 *
 * @see rhythmML.RhythmMLPackage#getBeat()
 * @model
 * @generated
 */
public interface Beat extends EObject {
	/**
	 * Returns the value of the '<em><b>Ticks</b></em>' attribute list.
	 * The list contents are of type {@link rhythmML.DRUM_NOTES}.
	 * The literals are from the enumeration {@link rhythmML.DRUM_NOTES}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ticks</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ticks</em>' attribute list.
	 * @see rhythmML.DRUM_NOTES
	 * @see rhythmML.RhythmMLPackage#getBeat_Ticks()
	 * @model
	 * @generated
	 */
	EList<DRUM_NOTES> getTicks();

} // Beat
