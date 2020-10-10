package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)


@CucumberOptions(
        //Where is the path of the features folder
        features = "src\\test\\resources\\features",
        glue = "stepdefinitions",
        tags = "@flowersearch",
        dryRun = false


)

public class Runner {


    //Runner class is to Run the feature files
    //This runner class is also used to configure and control the framework


}
