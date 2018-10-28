package com.jariast.techniques.pullupfield;

public class CompleteReport extends Report {

	public CompleteReport() {
		super();
	}
	
	@Override
	public String buildReport() {
		
		String reportHeader = "Complete Report Header";
		
		reportBody += reportHeader;
		
		//doing some complete report processes
		
		addFooter();
		
		return reportBody;
	}

}
