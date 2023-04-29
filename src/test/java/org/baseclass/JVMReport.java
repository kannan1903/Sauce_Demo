package org.baseclass;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	
	public static void generateJvmReport(String json) {
		
		File loc =new File(System.getProperty("user.dir")+"\\JVMreports");
		
		Configuration con =new Configuration(loc, "SauceDemo");
		
		List<String> jsonFiles=new LinkedList<>();
		jsonFiles.add(json);
		ReportBuilder r=new ReportBuilder(jsonFiles, con);
		r.generateReports();
		
		
	}

}
