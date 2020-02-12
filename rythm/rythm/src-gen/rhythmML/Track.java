/**
 */
package rhythmML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Track</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rhythmML.Track#getSections <em>Sections</em>}</li>
 *   <li>{@link rhythmML.Track#getPatterns <em>Patterns</em>}</li>
 * </ul>
 *
 * @see rhythmML.RhythmMLPackage#getTrack()
 * @model
 * @generated
 */
public interface Track extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
	 * The list contents are of type {@link rhythmML.Section}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sections</em>' containment reference list.
	 * @see rhythmML.RhythmMLPackage#getTrack_Sections()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Section> getSections();

	/**
	 * Returns the value of the '<em><b>Patterns</b></em>' containment reference list.
	 * The list contents are of type {@link rhythmML.Pattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patterns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patterns</em>' containment reference list.
	 * @see rhythmML.RhythmMLPackage#getTrack_Patterns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pattern> getPatterns();

} // Track
