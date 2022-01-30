package AppHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import io.cucumber.java.Scenario;
import org.junit.Assume;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import qa.factory.DriverFactory;
import qa.util.ConfigReader;

import java.net.MalformedURLException;
import java.util.Properties;

public class ApplicationHooks {
    private WebDriver driver;
    Properties prop;

    @Before(value = "@skip_scenario", order = 0)
    public void skip_scenario(Scenario scenario) {
        System.out.println("Skipped scenario is : " + scenario.getName());
        Assume.assumeTrue(false);
    }

    @Before(order = 1)
    public void getProperty() {
        ConfigReader configReader = new ConfigReader();
        prop = configReader.init_prop();
    }

    @Before(order = 2)
    public void launchBrowser() throws MalformedURLException {
        String bsUrl = "https://" + prop.getProperty("browser_stack_username") + ":" + prop.getProperty("browser_stack_accesskey") + "@hub.browserstack.com/wd/hub";
        String browserName = prop.getProperty("browser");
        DriverFactory driverFactory = new DriverFactory();
        driver = driverFactory.init_driver(browserName, bsUrl);
    }

    @After(order = 1)
    public void quitBrowser(Scenario scn) {
        driver.quit();
    }

    @After(order = 2)
    public void getScenarioForAutomation(Scenario scn){
        String[] instanceID = scn.getName().split("-");
        System.out.println("xxxxxxxxxxxxx"+instanceID[1]);
        if (scn.isFailed()){
            System.out.println("xxxxxxxxxxxxx------Failed");
        }
        else {
            System.out.println("xxxxxxxxxxxxx------Passed");
        }
    }

    @After(order = 3)
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            String ssName = scenario.getName().replaceAll("", "_");
            byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(sourcePath, "image/png", ssName);
        }
    }
}
