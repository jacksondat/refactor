package com.jariast.techniques.pullupfield;

public abstract class Report {
	protected String reportBody;
	
	public Report() {
		reportBody = "";
	}

	public abstract String buildReport();

	protected void addFooter() {
		String reportFooter = "\nMade by John Doe";
		reportFooter += "\nCopyright.";
		reportFooter += "\n2018";
		
		reportBody += reportFooter;
	}
}
