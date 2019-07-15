package com.kira.service.feature;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"com/kira/service/feature/"},
		glue = {"com.kira.service.stepdefination"},
		format = {"pretty","html:test-output"},
		monochrome = true,
		dryRun = false
		)

public class CucumberrunnerIT {

}
