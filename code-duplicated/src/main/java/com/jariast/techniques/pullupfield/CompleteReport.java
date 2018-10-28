package com.jariast.techniques.pullupfield;

public class CompleteReport extends Report {

	private String reportBody;

	public CompleteReport() {
		reportBody = "";
	}
	
	@Override
	public String buildReport() {
		
		String reportHeader = "Complete Report Header";
		
		reportBody += reportHeader;
		
		//doing some complete report processes
		
		String reportFooter = "\nMade by John Doe";
		reportFooter += "\nCopyright.";
		reportFooter += "\n2018";
		
		reportBody += reportFooter;
		
		return reportBody;
	}

}
