package Listeners;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import qa.util.TestLinkManager;
import testlink.api.java.client.TestLinkAPIClient;
import testlink.api.java.client.TestLinkAPIException;

import static org.testng.reporters.XMLReporterConfig.TEST_FAILED;
import static org.testng.reporters.XMLReporterConfig.TEST_PASSED;

public class TestListener extends TestListenerAdapter {

    private static final TestLinkManager testLinkManager = TestLinkManager.getTestLinkManager();
    private static final String PROJECT_NAME = "InsurePro";
    private static final String TEST_PLAN_NAME = "Datarock plan 1";
    private static final String BUILD_NAME = "Datarock test build 1";
    private Scenario scn;

    @AfterStep
    public void doSomethingAfterStep(Scenario scenario){
        this.scn = scenario;
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        updateResult(result, "Success", TEST_PASSED);
    }

    @Override
    public void onTestFailure(ITestResult result) {
        updateResult(result, "Failed", TEST_FAILED);
    }

    private void updateResult(ITestResult result, String notes, String status) {
        //String description = result.getMethod().getDescription();
        String description = scn.getName();
        try {
            TestLinkAPIClient api = testLinkManager.getTestLinkAPIClient();
            api.reportTestCaseResult(
                    PROJECT_NAME,
                    TEST_PLAN_NAME,
                    description,
                    BUILD_NAME,
                    notes,
                    status );
        } catch (TestLinkAPIException e) {
            e.printStackTrace();
        }
    }

}
