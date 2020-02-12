/**
 */
package rhythmML.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import rhythmML.Rhythm;
import rhythmML.RhythmMLPackage;
import rhythmML.Track;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rhythm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rhythmML.impl.RhythmImpl#getResolution <em>Resolution</em>}</li>
 *   <li>{@link rhythmML.impl.RhythmImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link rhythmML.impl.RhythmImpl#getBPM <em>BPM</em>}</li>
 *   <li>{@link rhythmML.impl.RhythmImpl#getTracks <em>Tracks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RhythmImpl extends NamedElementImpl implements Rhythm {
	/**
	 * The default value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected static final int RESOLUTION_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected int resolution = RESOLUTION_EDEFAULT;
	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final float OFFSET_EDEFAULT = 0.0F;
	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected float offset = OFFSET_EDEFAULT;
	/**
	 * The default value of the '{@link #getBPM() <em>BPM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPM()
	 * @generated
	 * @ordered
	 */
	protected static final int BPM_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getBPM() <em>BPM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPM()
	 * @generated
	 * @ordered
	 */
	protected int bpm = BPM_EDEFAULT;
	/**
	 * The cached value of the '{@link #getTracks() <em>Tracks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracks()
	 * @generated
	 * @ordered
	 */
	protected EList<Track> tracks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RhythmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RhythmMLPackage.Literals.RHYTHM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getResolution() {
		return resolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolution(int newResolution) {
		int oldResolution = resolution;
		resolution = newResolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RhythmMLPackage.RHYTHM__RESOLUTION, oldResolution,
					resolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(float newOffset) {
		float oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RhythmMLPackage.RHYTHM__OFFSET, oldOffset, offset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBPM() {
		return bpm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPM(int newBPM) {
		int oldBPM = bpm;
		bpm = newBPM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RhythmMLPackage.RHYTHM__BPM, oldBPM, bpm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Track> getTracks() {
		if (tracks == null) {
			tracks = new EObjectContainmentEList<Track>(Track.class, this, RhythmMLPackage.RHYTHM__TRACKS);
		}
		return tracks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RhythmMLPackage.RHYTHM__TRACKS:
			return ((InternalEList<?>) getTracks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RhythmMLPackage.RHYTHM__RESOLUTION:
			return getResolution();
		case RhythmMLPackage.RHYTHM__OFFSET:
			return getOffset();
		case RhythmMLPackage.RHYTHM__BPM:
			return getBPM();
		case RhythmMLPackage.RHYTHM__TRACKS:
			return getTracks();
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
		case RhythmMLPackage.RHYTHM__RESOLUTION:
			setResolution((Integer) newValue);
			return;
		case RhythmMLPackage.RHYTHM__OFFSET:
			setOffset((Float) newValue);
			return;
		case RhythmMLPackage.RHYTHM__BPM:
			setBPM((Integer) newValue);
			return;
		case RhythmMLPackage.RHYTHM__TRACKS:
			getTracks().clear();
			getTracks().addAll((Collection<? extends Track>) newValue);
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
		case RhythmMLPackage.RHYTHM__RESOLUTION:
			setResolution(RESOLUTION_EDEFAULT);
			return;
		case RhythmMLPackage.RHYTHM__OFFSET:
			setOffset(OFFSET_EDEFAULT);
			return;
		case RhythmMLPackage.RHYTHM__BPM:
			setBPM(BPM_EDEFAULT);
			return;
		case RhythmMLPackage.RHYTHM__TRACKS:
			getTracks().clear();
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
		case RhythmMLPackage.RHYTHM__RESOLUTION:
			return resolution != RESOLUTION_EDEFAULT;
		case RhythmMLPackage.RHYTHM__OFFSET:
			return offset != OFFSET_EDEFAULT;
		case RhythmMLPackage.RHYTHM__BPM:
			return bpm != BPM_EDEFAULT;
		case RhythmMLPackage.RHYTHM__TRACKS:
			return tracks != null && !tracks.isEmpty();
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
		result.append(" (resolution: ");
		result.append(resolution);
		result.append(", offset: ");
		result.append(offset);
		result.append(", BPM: ");
		result.append(bpm);
		result.append(')');
		return result.toString();
	}

} //RhythmImpl
