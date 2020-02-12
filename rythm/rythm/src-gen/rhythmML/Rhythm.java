/**
 */
package rhythmML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rhythm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rhythmML.Rhythm#getResolution <em>Resolution</em>}</li>
 *   <li>{@link rhythmML.Rhythm#getOffset <em>Offset</em>}</li>
 *   <li>{@link rhythmML.Rhythm#getBPM <em>BPM</em>}</li>
 *   <li>{@link rhythmML.Rhythm#getTracks <em>Tracks</em>}</li>
 * </ul>
 *
 * @see rhythmML.RhythmMLPackage#getRhythm()
 * @model
 * @generated
 */
public interface Rhythm extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolution</em>' attribute.
	 * @see #setResolution(int)
	 * @see rhythmML.RhythmMLPackage#getRhythm_Resolution()
	 * @model
	 * @generated
	 */
	int getResolution();

	/**
	 * Sets the value of the '{@link rhythmML.Rhythm#getResolution <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution</em>' attribute.
	 * @see #getResolution()
	 * @generated
	 */
	void setResolution(int value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(float)
	 * @see rhythmML.RhythmMLPackage#getRhythm_Offset()
	 * @model
	 * @generated
	 */
	float getOffset();

	/**
	 * Sets the value of the '{@link rhythmML.Rhythm#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(float value);

	/**
	 * Returns the value of the '<em><b>BPM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BPM</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BPM</em>' attribute.
	 * @see #setBPM(int)
	 * @see rhythmML.RhythmMLPackage#getRhythm_BPM()
	 * @model
	 * @generated
	 */
	int getBPM();

	/**
	 * Sets the value of the '{@link rhythmML.Rhythm#getBPM <em>BPM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BPM</em>' attribute.
	 * @see #getBPM()
	 * @generated
	 */
	void setBPM(int value);

	/**
	 * Returns the value of the '<em><b>Tracks</b></em>' containment reference list.
	 * The list contents are of type {@link rhythmML.Track}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tracks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracks</em>' containment reference list.
	 * @see rhythmML.RhythmMLPackage#getRhythm_Tracks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Track> getTracks();
} // Rhythm
