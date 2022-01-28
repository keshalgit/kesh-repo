package qa.util;

import testlink.api.java.client.TestLinkAPIClient;

public class TestLinkManager {
    public static final String DEV_KEY = "89d6d2aa62235dcbf572b3d87d8bfb38";
    public static final String TESTLINK_URL = "http://localhost/testlink/lib/api/xmlrpc/v1/xmlrpc.php";
    public static final TestLinkManager testLinkManager = new TestLinkManager();
    private final TestLinkAPIClient testLinkAPIClient;

    private TestLinkManager() {
        testLinkAPIClient = new TestLinkAPIClient(DEV_KEY, TESTLINK_URL);
    }

    public static TestLinkManager getTestLinkManager() {
        return testLinkManager;
    }

    public TestLinkAPIClient getTestLinkAPIClient() {
        return testLinkAPIClient;
    }
}
