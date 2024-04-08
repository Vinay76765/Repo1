package Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/resources/CucumberFeatures/Student_course_enroll.feature", glue={"CucumberDefinitions","Hooks"},
plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
)
public class TestNGTestRunner extends AbstractTestNGCucumberTests {



}