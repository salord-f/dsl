/**
 */
package rhythmML;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see rhythmML.RhythmMLFactory
 * @model kind="package"
 * @generated
 */
public interface RhythmMLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rhythmML";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polytech.unice.fr/rhythmML";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RhythmMLPackage eINSTANCE = rhythmML.impl.RhythmMLPackageImpl.init();

	/**
	 * The meta object id for the '{@link rhythmML.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rhythmML.impl.NamedElementImpl
	 * @see rhythmML.impl.RhythmMLPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rhythmML.impl.RhythmImpl <em>Rhythm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rhythmML.impl.RhythmImpl
	 * @see rhythmML.impl.RhythmMLPackageImpl#getRhythm()
	 * @generated
	 */
	int RHYTHM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RHYTHM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RHYTHM__RESOLUTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RHYTHM__OFFSET = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>BPM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RHYTHM__BPM = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tracks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RHYTHM__TRACKS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Rhythm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RHYTHM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Rhythm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RHYTHM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rhythmML.impl.TrackImpl <em>Track</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rhythmML.impl.TrackImpl
	 * @see rhythmML.impl.RhythmMLPackageImpl#getTrack()
	 * @generated
	 */
	int TRACK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__SECTIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__PATTERNS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rhythmML.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rhythmML.impl.SectionImpl
	 * @see rhythmML.impl.RhythmMLPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Pattern Loops</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__PATTERN_LOOPS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pattern Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__PATTERN_MODIFICATIONS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rhythmML.impl.PatternImpl <em>Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rhythmML.impl.PatternImpl
	 * @see rhythmML.impl.RhythmMLPackageImpl#getPattern()
	 * @generated
	 */
	int PATTERN = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Bar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__BAR = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rhythmML.impl.BarImpl <em>Bar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rhythmML.impl.BarImpl
	 * @see rhythmML.impl.RhythmMLPackageImpl#getBar()
	 * @generated
	 */
	int BAR = 5;

	/**
	 * The feature id for the '<em><b>Beats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR__BEATS = 0;

	/**
	 * The number of structural features of the '<em>Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rhythmML.impl.BeatImpl <em>Beat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rhythmML.impl.BeatImpl
	 * @see rhythmML.impl.RhythmMLPackageImpl#getBeat()
	 * @generated
	 */
	int BEAT = 6;

	/**
	 * The feature id for the '<em><b>Ticks</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAT__TICKS = 0;

	/**
	 * The number of structural features of the '<em>Beat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Beat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rhythmML.impl.PatternLoopImpl <em>Pattern Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rhythmML.impl.PatternLoopImpl
	 * @see rhythmML.impl.RhythmMLPackageImpl#getPatternLoop()
	 * @generated
	 */
	int PATTERN_LOOP = 7;

	/**
	 * The feature id for the '<em><b>Loop Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_LOOP__LOOP_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_LOOP__PATTERN = 1;

	/**
	 * The number of structural features of the '<em>Pattern Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_LOOP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pattern Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_LOOP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rhythmML.impl.PatternModificationImpl <em>Pattern Modification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rhythmML.impl.PatternModificationImpl
	 * @see rhythmML.impl.RhythmMLPackageImpl#getPatternModification()
	 * @generated
	 */
	int PATTERN_MODIFICATION = 8;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_MODIFICATION__PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Iteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_MODIFICATION__ITERATION = 1;

	/**
	 * The feature id for the '<em><b>Beat Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_MODIFICATION__BEAT_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Beat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_MODIFICATION__BEAT = 3;

	/**
	 * The number of structural features of the '<em>Pattern Modification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_MODIFICATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Pattern Modification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_MODIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rhythmML.DRUM_NOTES <em>DRUM NOTES</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rhythmML.DRUM_NOTES
	 * @see rhythmML.impl.RhythmMLPackageImpl#getDRUM_NOTES()
	 * @generated
	 */
	int DRUM_NOTES = 9;

	/**
	 * Returns the meta object for class '{@link rhythmML.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see rhythmML.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link rhythmML.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rhythmML.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link rhythmML.Rhythm <em>Rhythm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rhythm</em>'.
	 * @see rhythmML.Rhythm
	 * @generated
	 */
	EClass getRhythm();

	/**
	 * Returns the meta object for the attribute '{@link rhythmML.Rhythm#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution</em>'.
	 * @see rhythmML.Rhythm#getResolution()
	 * @see #getRhythm()
	 * @generated
	 */
	EAttribute getRhythm_Resolution();

	/**
	 * Returns the meta object for the attribute '{@link rhythmML.Rhythm#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see rhythmML.Rhythm#getOffset()
	 * @see #getRhythm()
	 * @generated
	 */
	EAttribute getRhythm_Offset();

	/**
	 * Returns the meta object for the attribute '{@link rhythmML.Rhythm#getBPM <em>BPM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BPM</em>'.
	 * @see rhythmML.Rhythm#getBPM()
	 * @see #getRhythm()
	 * @generated
	 */
	EAttribute getRhythm_BPM();

	/**
	 * Returns the meta object for the containment reference list '{@link rhythmML.Rhythm#getTracks <em>Tracks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tracks</em>'.
	 * @see rhythmML.Rhythm#getTracks()
	 * @see #getRhythm()
	 * @generated
	 */
	EReference getRhythm_Tracks();

	/**
	 * Returns the meta object for class '{@link rhythmML.Track <em>Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Track</em>'.
	 * @see rhythmML.Track
	 * @generated
	 */
	EClass getTrack();

	/**
	 * Returns the meta object for the containment reference list '{@link rhythmML.Track#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections</em>'.
	 * @see rhythmML.Track#getSections()
	 * @see #getTrack()
	 * @generated
	 */
	EReference getTrack_Sections();

	/**
	 * Returns the meta object for the containment reference list '{@link rhythmML.Track#getPatterns <em>Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Patterns</em>'.
	 * @see rhythmML.Track#getPatterns()
	 * @see #getTrack()
	 * @generated
	 */
	EReference getTrack_Patterns();

	/**
	 * Returns the meta object for class '{@link rhythmML.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see rhythmML.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the containment reference list '{@link rhythmML.Section#getPatternLoops <em>Pattern Loops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pattern Loops</em>'.
	 * @see rhythmML.Section#getPatternLoops()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_PatternLoops();

	/**
	 * Returns the meta object for the containment reference list '{@link rhythmML.Section#getPatternModifications <em>Pattern Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pattern Modifications</em>'.
	 * @see rhythmML.Section#getPatternModifications()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_PatternModifications();

	/**
	 * Returns the meta object for class '{@link rhythmML.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern</em>'.
	 * @see rhythmML.Pattern
	 * @generated
	 */
	EClass getPattern();

	/**
	 * Returns the meta object for the containment reference '{@link rhythmML.Pattern#getBar <em>Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bar</em>'.
	 * @see rhythmML.Pattern#getBar()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_Bar();

	/**
	 * Returns the meta object for class '{@link rhythmML.Bar <em>Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bar</em>'.
	 * @see rhythmML.Bar
	 * @generated
	 */
	EClass getBar();

	/**
	 * Returns the meta object for the containment reference list '{@link rhythmML.Bar#getBeats <em>Beats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Beats</em>'.
	 * @see rhythmML.Bar#getBeats()
	 * @see #getBar()
	 * @generated
	 */
	EReference getBar_Beats();

	/**
	 * Returns the meta object for class '{@link rhythmML.Beat <em>Beat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Beat</em>'.
	 * @see rhythmML.Beat
	 * @generated
	 */
	EClass getBeat();

	/**
	 * Returns the meta object for the attribute list '{@link rhythmML.Beat#getTicks <em>Ticks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ticks</em>'.
	 * @see rhythmML.Beat#getTicks()
	 * @see #getBeat()
	 * @generated
	 */
	EAttribute getBeat_Ticks();

	/**
	 * Returns the meta object for class '{@link rhythmML.PatternLoop <em>Pattern Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Loop</em>'.
	 * @see rhythmML.PatternLoop
	 * @generated
	 */
	EClass getPatternLoop();

	/**
	 * Returns the meta object for the attribute '{@link rhythmML.PatternLoop#getLoopNumber <em>Loop Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loop Number</em>'.
	 * @see rhythmML.PatternLoop#getLoopNumber()
	 * @see #getPatternLoop()
	 * @generated
	 */
	EAttribute getPatternLoop_LoopNumber();

	/**
	 * Returns the meta object for the reference '{@link rhythmML.PatternLoop#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pattern</em>'.
	 * @see rhythmML.PatternLoop#getPattern()
	 * @see #getPatternLoop()
	 * @generated
	 */
	EReference getPatternLoop_Pattern();

	/**
	 * Returns the meta object for class '{@link rhythmML.PatternModification <em>Pattern Modification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Modification</em>'.
	 * @see rhythmML.PatternModification
	 * @generated
	 */
	EClass getPatternModification();

	/**
	 * Returns the meta object for the reference '{@link rhythmML.PatternModification#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pattern</em>'.
	 * @see rhythmML.PatternModification#getPattern()
	 * @see #getPatternModification()
	 * @generated
	 */
	EReference getPatternModification_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link rhythmML.PatternModification#getIteration <em>Iteration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iteration</em>'.
	 * @see rhythmML.PatternModification#getIteration()
	 * @see #getPatternModification()
	 * @generated
	 */
	EAttribute getPatternModification_Iteration();

	/**
	 * Returns the meta object for the attribute '{@link rhythmML.PatternModification#getBeatNumber <em>Beat Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beat Number</em>'.
	 * @see rhythmML.PatternModification#getBeatNumber()
	 * @see #getPatternModification()
	 * @generated
	 */
	EAttribute getPatternModification_BeatNumber();

	/**
	 * Returns the meta object for the containment reference '{@link rhythmML.PatternModification#getBeat <em>Beat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Beat</em>'.
	 * @see rhythmML.PatternModification#getBeat()
	 * @see #getPatternModification()
	 * @generated
	 */
	EReference getPatternModification_Beat();

	/**
	 * Returns the meta object for enum '{@link rhythmML.DRUM_NOTES <em>DRUM NOTES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DRUM NOTES</em>'.
	 * @see rhythmML.DRUM_NOTES
	 * @generated
	 */
	EEnum getDRUM_NOTES();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RhythmMLFactory getRhythmMLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link rhythmML.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rhythmML.impl.NamedElementImpl
		 * @see rhythmML.impl.RhythmMLPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link rhythmML.impl.RhythmImpl <em>Rhythm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rhythmML.impl.RhythmImpl
		 * @see rhythmML.impl.RhythmMLPackageImpl#getRhythm()
		 * @generated
		 */
		EClass RHYTHM = eINSTANCE.getRhythm();

		/**
		 * The meta object literal for the '<em><b>Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RHYTHM__RESOLUTION = eINSTANCE.getRhythm_Resolution();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RHYTHM__OFFSET = eINSTANCE.getRhythm_Offset();

		/**
		 * The meta object literal for the '<em><b>BPM</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RHYTHM__BPM = eINSTANCE.getRhythm_BPM();

		/**
		 * The meta object literal for the '<em><b>Tracks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RHYTHM__TRACKS = eINSTANCE.getRhythm_Tracks();

		/**
		 * The meta object literal for the '{@link rhythmML.impl.TrackImpl <em>Track</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rhythmML.impl.TrackImpl
		 * @see rhythmML.impl.RhythmMLPackageImpl#getTrack()
		 * @generated
		 */
		EClass TRACK = eINSTANCE.getTrack();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACK__SECTIONS = eINSTANCE.getTrack_Sections();

		/**
		 * The meta object literal for the '<em><b>Patterns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACK__PATTERNS = eINSTANCE.getTrack_Patterns();

		/**
		 * The meta object literal for the '{@link rhythmML.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rhythmML.impl.SectionImpl
		 * @see rhythmML.impl.RhythmMLPackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Pattern Loops</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__PATTERN_LOOPS = eINSTANCE.getSection_PatternLoops();

		/**
		 * The meta object literal for the '<em><b>Pattern Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__PATTERN_MODIFICATIONS = eINSTANCE.getSection_PatternModifications();

		/**
		 * The meta object literal for the '{@link rhythmML.impl.PatternImpl <em>Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rhythmML.impl.PatternImpl
		 * @see rhythmML.impl.RhythmMLPackageImpl#getPattern()
		 * @generated
		 */
		EClass PATTERN = eINSTANCE.getPattern();

		/**
		 * The meta object literal for the '<em><b>Bar</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN__BAR = eINSTANCE.getPattern_Bar();

		/**
		 * The meta object literal for the '{@link rhythmML.impl.BarImpl <em>Bar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rhythmML.impl.BarImpl
		 * @see rhythmML.impl.RhythmMLPackageImpl#getBar()
		 * @generated
		 */
		EClass BAR = eINSTANCE.getBar();

		/**
		 * The meta object literal for the '<em><b>Beats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAR__BEATS = eINSTANCE.getBar_Beats();

		/**
		 * The meta object literal for the '{@link rhythmML.impl.BeatImpl <em>Beat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rhythmML.impl.BeatImpl
		 * @see rhythmML.impl.RhythmMLPackageImpl#getBeat()
		 * @generated
		 */
		EClass BEAT = eINSTANCE.getBeat();

		/**
		 * The meta object literal for the '<em><b>Ticks</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEAT__TICKS = eINSTANCE.getBeat_Ticks();

		/**
		 * The meta object literal for the '{@link rhythmML.impl.PatternLoopImpl <em>Pattern Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rhythmML.impl.PatternLoopImpl
		 * @see rhythmML.impl.RhythmMLPackageImpl#getPatternLoop()
		 * @generated
		 */
		EClass PATTERN_LOOP = eINSTANCE.getPatternLoop();

		/**
		 * The meta object literal for the '<em><b>Loop Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_LOOP__LOOP_NUMBER = eINSTANCE.getPatternLoop_LoopNumber();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_LOOP__PATTERN = eINSTANCE.getPatternLoop_Pattern();

		/**
		 * The meta object literal for the '{@link rhythmML.impl.PatternModificationImpl <em>Pattern Modification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rhythmML.impl.PatternModificationImpl
		 * @see rhythmML.impl.RhythmMLPackageImpl#getPatternModification()
		 * @generated
		 */
		EClass PATTERN_MODIFICATION = eINSTANCE.getPatternModification();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_MODIFICATION__PATTERN = eINSTANCE.getPatternModification_Pattern();

		/**
		 * The meta object literal for the '<em><b>Iteration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_MODIFICATION__ITERATION = eINSTANCE.getPatternModification_Iteration();

		/**
		 * The meta object literal for the '<em><b>Beat Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_MODIFICATION__BEAT_NUMBER = eINSTANCE.getPatternModification_BeatNumber();

		/**
		 * The meta object literal for the '<em><b>Beat</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_MODIFICATION__BEAT = eINSTANCE.getPatternModification_Beat();

		/**
		 * The meta object literal for the '{@link rhythmML.DRUM_NOTES <em>DRUM NOTES</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rhythmML.DRUM_NOTES
		 * @see rhythmML.impl.RhythmMLPackageImpl#getDRUM_NOTES()
		 * @generated
		 */
		EEnum DRUM_NOTES = eINSTANCE.getDRUM_NOTES();

	}

} //RhythmMLPackage
