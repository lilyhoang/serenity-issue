package serenity.issue.tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.ClearCookiesPolicy;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.util.EnvironmentVariables;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)
@Narrative(text =
        ""
)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestCase {
    EnvironmentVariables environmentVariables;

    @BeforeClass
    public static void setup() throws InterruptedException {
    }

    @Managed(uniqueSession = true, clearCookies = ClearCookiesPolicy.BeforeEachTest)
    private WebDriver aSecondBrowser;

    @Managed(uniqueSession = true, clearCookies = ClearCookiesPolicy.BeforeEachTest, driver = "chrome")
    private WebDriver aBrowser;


    private Actor staff = new Actor("Staff");
    private Actor client = new Actor("Client");

    @Before
    public void startConnection() {
        TestBase.setup(staff, client, aBrowser, aSecondBrowser);
    }


    @Test
    public void test01() {
        Assert.assertEquals(true, false);
    }

    @Test
    public void test02() {
    }

    @Test
    public void test03() {
    }

    @Test
    public void test04() {
    }


    @After
    public void stopConnection() throws InterruptedException {
//        aSecondBrowser.quit();
//        aBrowser.quit();
        Thread.sleep(5000);

    }

    @AfterClass
    public static void tearDown() throws InterruptedException {
        Thread.sleep(5000);
    }
}
