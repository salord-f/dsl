/**
 */
package rhythmML.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import rhythmML.Bar;
import rhythmML.Beat;
import rhythmML.NamedElement;
import rhythmML.Pattern;
import rhythmML.PatternLoop;
import rhythmML.PatternModification;
import rhythmML.Rhythm;
import rhythmML.RhythmMLFactory;
import rhythmML.RhythmMLPackage;
import rhythmML.Section;
import rhythmML.Track;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RhythmMLPackageImpl extends EPackageImpl implements RhythmMLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rhythmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass barEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternLoopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternModificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum druM_NOTESEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see rhythmML.RhythmMLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RhythmMLPackageImpl() {
		super(eNS_URI, RhythmMLFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link RhythmMLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RhythmMLPackage init() {
		if (isInited)
			return (RhythmMLPackage) EPackage.Registry.INSTANCE.getEPackage(RhythmMLPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRhythmMLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RhythmMLPackageImpl theRhythmMLPackage = registeredRhythmMLPackage instanceof RhythmMLPackageImpl
				? (RhythmMLPackageImpl) registeredRhythmMLPackage
				: new RhythmMLPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theRhythmMLPackage.createPackageContents();

		// Initialize created meta-data
		theRhythmMLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRhythmMLPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RhythmMLPackage.eNS_URI, theRhythmMLPackage);
		return theRhythmMLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRhythm() {
		return rhythmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRhythm_Resolution() {
		return (EAttribute) rhythmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRhythm_Offset() {
		return (EAttribute) rhythmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRhythm_BPM() {
		return (EAttribute) rhythmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRhythm_Tracks() {
		return (EReference) rhythmEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrack() {
		return trackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrack_Sections() {
		return (EReference) trackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrack_Patterns() {
		return (EReference) trackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSection() {
		return sectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSection_PatternLoops() {
		return (EReference) sectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSection_PatternModifications() {
		return (EReference) sectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern() {
		return patternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_Bar() {
		return (EReference) patternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBar() {
		return barEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBar_Beats() {
		return (EReference) barEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBeat() {
		return beatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeat_Ticks() {
		return (EAttribute) beatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatternLoop() {
		return patternLoopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatternLoop_LoopNumber() {
		return (EAttribute) patternLoopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternLoop_Pattern() {
		return (EReference) patternLoopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatternModification() {
		return patternModificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternModification_Pattern() {
		return (EReference) patternModificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatternModification_Iteration() {
		return (EAttribute) patternModificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatternModification_BeatNumber() {
		return (EAttribute) patternModificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternModification_Beat() {
		return (EReference) patternModificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDRUM_NOTES() {
		return druM_NOTESEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RhythmMLFactory getRhythmMLFactory() {
		return (RhythmMLFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		rhythmEClass = createEClass(RHYTHM);
		createEAttribute(rhythmEClass, RHYTHM__RESOLUTION);
		createEAttribute(rhythmEClass, RHYTHM__OFFSET);
		createEAttribute(rhythmEClass, RHYTHM__BPM);
		createEReference(rhythmEClass, RHYTHM__TRACKS);

		trackEClass = createEClass(TRACK);
		createEReference(trackEClass, TRACK__SECTIONS);
		createEReference(trackEClass, TRACK__PATTERNS);

		sectionEClass = createEClass(SECTION);
		createEReference(sectionEClass, SECTION__PATTERN_LOOPS);
		createEReference(sectionEClass, SECTION__PATTERN_MODIFICATIONS);

		patternEClass = createEClass(PATTERN);
		createEReference(patternEClass, PATTERN__BAR);

		barEClass = createEClass(BAR);
		createEReference(barEClass, BAR__BEATS);

		beatEClass = createEClass(BEAT);
		createEAttribute(beatEClass, BEAT__TICKS);

		patternLoopEClass = createEClass(PATTERN_LOOP);
		createEAttribute(patternLoopEClass, PATTERN_LOOP__LOOP_NUMBER);
		createEReference(patternLoopEClass, PATTERN_LOOP__PATTERN);

		patternModificationEClass = createEClass(PATTERN_MODIFICATION);
		createEReference(patternModificationEClass, PATTERN_MODIFICATION__PATTERN);
		createEAttribute(patternModificationEClass, PATTERN_MODIFICATION__ITERATION);
		createEAttribute(patternModificationEClass, PATTERN_MODIFICATION__BEAT_NUMBER);
		createEReference(patternModificationEClass, PATTERN_MODIFICATION__BEAT);

		// Create enums
		druM_NOTESEEnum = createEEnum(DRUM_NOTES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		rhythmEClass.getESuperTypes().add(this.getNamedElement());
		trackEClass.getESuperTypes().add(this.getNamedElement());
		sectionEClass.getESuperTypes().add(this.getNamedElement());
		patternEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rhythmEClass, Rhythm.class, "Rhythm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRhythm_Resolution(), ecorePackage.getEInt(), "resolution", null, 0, 1, Rhythm.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRhythm_Offset(), ecorePackage.getEFloat(), "offset", null, 0, 1, Rhythm.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRhythm_BPM(), ecorePackage.getEInt(), "BPM", null, 0, 1, Rhythm.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRhythm_Tracks(), this.getTrack(), null, "tracks", null, 1, -1, Rhythm.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(trackEClass, Track.class, "Track", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrack_Sections(), this.getSection(), null, "sections", null, 1, -1, Track.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrack_Patterns(), this.getPattern(), null, "patterns", null, 0, -1, Track.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sectionEClass, Section.class, "Section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSection_PatternLoops(), this.getPatternLoop(), null, "patternLoops", null, 0, -1,
				Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSection_PatternModifications(), this.getPatternModification(), null, "patternModifications",
				null, 0, -1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patternEClass, Pattern.class, "Pattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPattern_Bar(), this.getBar(), null, "bar", null, 1, 1, Pattern.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(barEClass, Bar.class, "Bar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBar_Beats(), this.getBeat(), null, "beats", null, 1, -1, Bar.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(beatEClass, Beat.class, "Beat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBeat_Ticks(), this.getDRUM_NOTES(), "ticks", null, 0, -1, Beat.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patternLoopEClass, PatternLoop.class, "PatternLoop", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPatternLoop_LoopNumber(), ecorePackage.getEInt(), "loopNumber", null, 0, 1, PatternLoop.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternLoop_Pattern(), this.getPattern(), null, "pattern", null, 0, 1, PatternLoop.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patternModificationEClass, PatternModification.class, "PatternModification", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPatternModification_Pattern(), this.getPattern(), null, "pattern", null, 0, 1,
				PatternModification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatternModification_Iteration(), ecorePackage.getEInt(), "iteration", null, 0, 1,
				PatternModification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatternModification_BeatNumber(), ecorePackage.getEInt(), "beatNumber", null, 0, 1,
				PatternModification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternModification_Beat(), this.getBeat(), null, "beat", null, 0, 1,
				PatternModification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(druM_NOTESEEnum, rhythmML.DRUM_NOTES.class, "DRUM_NOTES");
		addEEnumLiteral(druM_NOTESEEnum, rhythmML.DRUM_NOTES.BD);
		addEEnumLiteral(druM_NOTESEEnum, rhythmML.DRUM_NOTES.SD);
		addEEnumLiteral(druM_NOTESEEnum, rhythmML.DRUM_NOTES.BLANK);
		addEEnumLiteral(druM_NOTESEEnum, rhythmML.DRUM_NOTES.CH);
		addEEnumLiteral(druM_NOTESEEnum, rhythmML.DRUM_NOTES.OH);
		addEEnumLiteral(druM_NOTESEEnum, rhythmML.DRUM_NOTES.CC);
		addEEnumLiteral(druM_NOTESEEnum, rhythmML.DRUM_NOTES.RC);

		// Create resource
		createResource(eNS_URI);
	}

} //RhythmMLPackageImpl
