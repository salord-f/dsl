/**
 */
package rhythmML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rhythmML.Bar#getBeats <em>Beats</em>}</li>
 * </ul>
 *
 * @see rhythmML.RhythmMLPackage#getBar()
 * @model
 * @generated
 */
public interface Bar extends EObject {
	/**
	 * Returns the value of the '<em><b>Beats</b></em>' containment reference list.
	 * The list contents are of type {@link rhythmML.Beat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beats</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beats</em>' containment reference list.
	 * @see rhythmML.RhythmMLPackage#getBar_Beats()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Beat> getBeats();

} // Bar
