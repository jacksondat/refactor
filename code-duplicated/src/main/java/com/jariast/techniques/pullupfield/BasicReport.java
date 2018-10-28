package com.jariast.techniques.pullupfield;

public class BasicReport extends Report {
	
	public BasicReport() {
		super();
	}

	@Override
	public String buildReport() {
		
		String reportHeader = "Basic Report Header";
		
		reportBody += reportHeader;
		
		//doing some basic report processes
		
		addFooter();
		
		return reportBody;
	}

}
