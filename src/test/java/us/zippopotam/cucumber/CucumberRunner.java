package us.zippopotam.cucumber;


import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import us.zippopotam.testbase.TestBase;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/java/us/zippopotam/resources/feature")

public class CucumberRunner extends TestBase {
    
}
