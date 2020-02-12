package myrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Training1\\eclipse-workspace\\SampleMaven\\MyFeatures_Bhavya\\Test1.feature" , glue ="myDefinitions" )
public class Runner {

}
