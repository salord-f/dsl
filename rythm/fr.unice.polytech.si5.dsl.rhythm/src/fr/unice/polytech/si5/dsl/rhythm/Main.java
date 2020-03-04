package fr.unice.polytech.si5.dsl.rhythm;

import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import rhythmML.Rhythm;
import rhythmML.RhythmMLSwitchPrinter;

public class Main {

	public static void main(String[] args) {
		String modelPath = "./resources/test3.rhythm";
		String destinationPath = "./result/rhythm3.xmi";
		try {
			rhythmML2xmi(modelPath, destinationPath);
			xmi2NativeMidi(destinationPath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void rhythmML2xmi(String modelPath, String destinationPath) throws IOException {
		// register ArduinoML
		ResourceSet resources = new ResourceSetImpl();
		Map<String, Object> packageRegistry = resources.getPackageRegistry();
		packageRegistry.put(rhythmML.RhythmMLPackage.eNS_URI, rhythmML.RhythmMLPackage.eINSTANCE);

		// load ArduinoML dependencies
		Injector injector = new RhythmStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);

		// load the dsl file and parse it
		URI uri = URI.createURI(modelPath);
		Resource xtextResource = resourceSet.getResource(uri, true);
		EcoreUtil.resolveAll(xtextResource);
		Resource xmiResource = resourceSet.createResource(URI.createURI(destinationPath));
		// add the root (often forgotten)
		xmiResource.getContents().add(xtextResource.getContents().get(0));

		xmiResource.save(null);
	}

	private static String xmi2NativeMidi(String xmiPath) throws IOException {
		// register ArduinoML
		ResourceSet resourceSet = new ResourceSetImpl();
		Map<String, Object> packageRegistry = resourceSet.getPackageRegistry();
		packageRegistry.put(rhythmML.RhythmMLPackage.eNS_URI, rhythmML.RhythmMLPackage.eINSTANCE);

		// load the xmi file
		XMIResource resource = new XMIResourceImpl(URI.createURI("file:" + xmiPath));
		resource.load(null);

		// get the root of the model
		Rhythm rhythm = (Rhythm) resource.getContents().get(0);

		// Launch the visitor on the root
		RhythmMLSwitchPrinter printer = new RhythmMLSwitchPrinter();
		return printer.doSwitch(rhythm);
	}
}
