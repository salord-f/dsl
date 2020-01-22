package arduinoML.homemade;

import arduinoML.util.*;
import fr.unice.polytech.si5.dsl.generator.Generator;
import arduinoML.modelDTO.AppDTO;
import fr.unice.polytech.si5.dsl.App;



public class ArduinoMLSwitchPrinter extends ArduinoMLSwitch<String> {
	
	private Generator generator;
	
	public ArduinoMLSwitchPrinter() {
		this.generator = new Generator();
	}

	@Override
	public String caseApp(arduinoML.App object) {
		
		AppDTO appDTO = new AppDTO();
		App app = appDTO.buildKernelApp(object);
	
		
		generator.visit(app);
		return generator.getResult().toString();
	}
	
	
	
	
}
