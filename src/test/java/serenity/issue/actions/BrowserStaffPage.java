package serenity.issue.actions;

import serenity.issue.ui.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;

public class BrowserStaffPage implements Performable {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(new LoginPage()));
        BrowseTheWeb.as(actor).getDriver().manage().deleteAllCookies();
        BrowseTheWeb.as(actor).getDriver().navigate().refresh();

    }
}
