/**
 */
package rhythmML;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>DRUM NOTES</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rhythmML.RhythmMLPackage#getDRUM_NOTES()
 * @model
 * @generated
 */
public enum DRUM_NOTES implements Enumerator {
	/**
	 * The '<em><b>BD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BD_VALUE
	 * @generated
	 * @ordered
	 */
	BD(0, "BD", "BD"),

	/**
	 * The '<em><b>SD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SD_VALUE
	 * @generated
	 * @ordered
	 */
	SD(1, "SD", "SD"),

	/**
	 * The '<em><b>BLANK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLANK_VALUE
	 * @generated
	 * @ordered
	 */
	BLANK(2, "BLANK", "BLANK"),

	/**
	 * The '<em><b>CH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CH_VALUE
	 * @generated
	 * @ordered
	 */
	CH(3, "CH", "CH"),

	/**
	 * The '<em><b>OH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OH_VALUE
	 * @generated
	 * @ordered
	 */
	OH(4, "OH", "OH"),

	/**
	 * The '<em><b>CC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CC_VALUE
	 * @generated
	 * @ordered
	 */
	CC(5, "CC", "CC"),

	/**
	 * The '<em><b>RC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RC_VALUE
	 * @generated
	 * @ordered
	 */
	RC(6, "RC", "RC");

	/**
	 * The '<em><b>BD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BD_VALUE = 0;

	/**
	 * The '<em><b>SD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SD_VALUE = 1;

	/**
	 * The '<em><b>BLANK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BLANK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLANK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BLANK_VALUE = 2;

	/**
	 * The '<em><b>CH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CH_VALUE = 3;

	/**
	 * The '<em><b>OH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OH_VALUE = 4;

	/**
	 * The '<em><b>CC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CC_VALUE = 5;

	/**
	 * The '<em><b>RC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RC_VALUE = 6;

	/**
	 * An array of all the '<em><b>DRUM NOTES</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DRUM_NOTES[] VALUES_ARRAY = new DRUM_NOTES[] { BD, SD, BLANK, CH, OH, CC, RC, };

	/**
	 * A public read-only list of all the '<em><b>DRUM NOTES</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DRUM_NOTES> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>DRUM NOTES</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DRUM_NOTES get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DRUM_NOTES result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DRUM NOTES</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DRUM_NOTES getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DRUM_NOTES result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DRUM NOTES</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DRUM_NOTES get(int value) {
		switch (value) {
		case BD_VALUE:
			return BD;
		case SD_VALUE:
			return SD;
		case BLANK_VALUE:
			return BLANK;
		case CH_VALUE:
			return CH;
		case OH_VALUE:
			return OH;
		case CC_VALUE:
			return CC;
		case RC_VALUE:
			return RC;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DRUM_NOTES(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //DRUM_NOTES
