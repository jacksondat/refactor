package com.jariast.techniques.pullupfield;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ReportTest {

	Report report;

	@Test
	public void mustBeBasicReport() {
		report = new BasicReport();
		String basicReport = report.buildReport();
		assertTrue(basicReport.contains("Basic Report Header"));
		assertTrue(basicReport.contains("Made by John Doe"));
	}
	
	@Test
	public void mustBeCompleteReport() {
		report = new CompleteReport();
		String completeReport = report.buildReport();
		assertTrue(completeReport.contains("Complete Report Header"));
		assertTrue(completeReport.contains("Made by John Doe"));
	}

}
