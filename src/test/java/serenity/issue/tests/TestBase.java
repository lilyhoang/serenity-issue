package serenity.issue.tests;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;
import serenity.issue.actions.BrowseClientPage;
import serenity.issue.actions.BrowserStaffPage;

import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;

/**
 * @author CW-Hueht7167
 */
public class TestBase {



    public static void setup(Actor staff, Actor client, WebDriver aBrowser, WebDriver aSecondBrowser) {
        givenThat(staff).can(BrowseTheWeb.with(aBrowser));
        givenThat(client).can(BrowseTheWeb.with(aSecondBrowser));

        givenThat(staff).wasAbleTo(new BrowserStaffPage());
        givenThat(client).wasAbleTo(new BrowseClientPage());
    }
}