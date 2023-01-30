package Code.StepDefinitions;

import Code.Utils.CommonMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import java.io.IOException;

public class Hooks extends CommonMethods {

    @Before //This will run before each run
    public void setup(){
        openAndLaunchApplication();
    }


    @After //This will run after each run
    public void tearDown(Scenario scenario) throws IOException {

        byte[] pic;
        if (scenario.isFailed()){
            pic = takeScreenShot("failed/" + scenario.getName());
        }else {
            pic = takeScreenShot("passed/" + scenario.getName());
        }
        scenario.attach(pic,"image/png",scenario.getName());
        closeBrowser();
    }
}
