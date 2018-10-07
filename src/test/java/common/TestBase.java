package common;

import io.restassured.RestAssured;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.ITestContext;

public class TestBase {

    public String runId = String.valueOf(System.currentTimeMillis()).substring(5, 12);

    @BeforeClass
    public void beforeClass(ITestContext context) {
        RestAssured.baseURI = context.getCurrentXmlTest().getParameter("BaseURI");
        Reporter.log("Execution Started", true);
    }

}
