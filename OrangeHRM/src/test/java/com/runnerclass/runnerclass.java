package com.runnerclass;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features", glue = {"com.LoginSteps"},
monochrome = true,
plugin = {"html:Reports1\\Reports\\HTMLReports" , "json:Reports1\\Reports1\\cucumber.json" , "junit:Reports1\\Reports2\\cucumber.xml"}

)


public class runnerclass {

}
