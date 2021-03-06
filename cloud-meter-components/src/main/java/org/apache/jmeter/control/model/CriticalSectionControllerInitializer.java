package org.apache.jmeter.control.model;

import org.apache.jmeter.control.CriticalSectionController;
import org.apache.jmeter.testelement.TestElement;
import org.cloudmeter.model.AbstractInitializer;


public class CriticalSectionControllerInitializer extends AbstractInitializer {

	@Override
	public TestElement initilizeElement() {
		CriticalSectionController ele = new CriticalSectionController();
		this.baseElement(ele, "Critical Section Controller");
		
		ele.setLockName("global_lock");
		
		
		return ele;
	}

}
