package serenity.issue.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("page:client.page")
public class ClientStartPage extends PageObject {
    public static final Target BTN_CONNECT = Target.the("Button Connect")
            .located(By.xpath("//a[@class='btn btn-connect']"));
    public static final Target LOADING = Target.the("Open send coin button")
            .located(By.xpath("//img[contains(@src,'loading_connect.png')]"));
    public static final Target MEETING_CODE = Target.the("Meeting code")
            .located(By.xpath("//div[@id='numberbox']"));
}
