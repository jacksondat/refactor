package com.jariast.techniques.extractmethod;

public class Report {

	private String reportBody;

	public Report() {
		reportBody = "";
	}
	
	public String buildBasicReport() {
		String reportHeader = "Basic Report Header";
		
		reportBody += reportHeader;
		
		//doing some basic report processes
		
		addFooter();
		
		return reportBody;
	}
	
	public String buildCompleteReport() {
		String reportHeader = "Complete Report Header";
		
		reportBody += reportHeader;
		
		//doing some complete report processes
		
		addFooter();
		
		return reportBody;
	}

	private void addFooter() {
		String reportFooter = "\nMade by John Doe";
		reportFooter += "\nCopyright.";
		reportFooter += "\n2018";
		
		reportBody += reportFooter;
	}
}
