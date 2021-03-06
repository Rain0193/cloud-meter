package org.apache.jmeter.protocol.model;

import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.config.ConfigTestElement;
import org.apache.jmeter.testelement.TestElement;
import org.apache.jmeter.testelement.property.CollectionProperty;
import org.cloudmeter.model.AbstractInitializer;

public class LDAPConfigInitializer extends AbstractInitializer {

	@Override
	public TestElement initilizeElement() {
		ConfigTestElement ele = new ConfigTestElement();
		this.baseElement(ele, "LDAP Request Defaults");
		
		ele.setProperty(this.createArgs());
		ele.setProperty("base_entry_dn", EMPTY_STRING);
		ele.setProperty("port", EMPTY_STRING);
		ele.setProperty("rootdn", EMPTY_STRING);
		ele.setProperty("servername", EMPTY_STRING);
		ele.setProperty("test", "add");
		ele.setProperty("user_defined", false);
		
		
		return ele;
	}
	
	private CollectionProperty createArgs() {
		Arguments args = new Arguments();
		
		args.setName("arguments");
		
		return args.getArguments();
	}

}
