package com.sample.FindString;

import static org.junit.Assert.*;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;

public class RepeateCharTest {
	private static final Logger log = LogManager.getLogger(RepeateCharTest.class);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		BasicConfigurator.configure();
	}

	@Test
	public void testCountRepeatChar() {
		String repFindStr = "aaaa";
		String expectedOutput = "a4";

		String actualOutput = RepeateChar.countRepeatChar(repFindStr);
		log.info("Actual results - " + actualOutput);
		assertEquals(expectedOutput, actualOutput);
	}

	@Test
	public void testCountRepeatCharTwo() {
		String repFindStr = "aaaaXXXXX";
		String expectedOutput = "a4 X5";

		String actualOutput = RepeateChar.countRepeatChar(repFindStr);
		log.info("Actual results - " + actualOutput);
		assertEquals(expectedOutput, actualOutput);
	}
}
