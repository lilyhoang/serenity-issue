package serenity.issue.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("page:staff.page")
public class LoginPage extends PageObject {
    public static final Target INPUT_USERNAME = Target.the("Textbox Username")
            .located(By.id("StaffAccount"));
    public static final Target INPUT_PASSWORD = Target.the("Textbox Password")
            .located(By.id("StaffPassword"));
    public static final Target BTN_LOGIN = Target.the("Button Login")
            .located(By.xpath("//input[@type='submit']"));
}
