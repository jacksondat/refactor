package com.jariast.techniques.extractmethod;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ReportTest {
	
	private Report report;

	@Before
	public void setUp() {
		report = new Report();
	}

	@Test
	public void mustBeBasicReport() {
		String basicReport = report.buildBasicReport();
		assertTrue(basicReport.contains("Basic Report Header"));
		assertTrue(basicReport.contains("Made by John Doe"));
	}
	
	@Test
	public void mustBeCompleteReport() {
		String completeReport = report.buildCompleteReport();
		assertTrue(completeReport.contains("Complete Report Header"));
		assertTrue(completeReport.contains("Made by John Doe"));
	}

}
