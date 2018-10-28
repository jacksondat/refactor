package com.jariast.techniques.pullupfield;

public class BasicReport extends Report {
	
	private String reportBody;

	public BasicReport() {
		reportBody = "";
	}

	@Override
	public String buildReport() {
		
		String reportHeader = "Basic Report Header";
		
		reportBody += reportHeader;
		
		//doing some basic report processes
		
		String reportFooter = "\nMade by John Doe";
		reportFooter += "\nCopyright.";
		reportFooter += "\n2018";
		
		reportBody += reportFooter;
		
		return reportBody;
	}

}
