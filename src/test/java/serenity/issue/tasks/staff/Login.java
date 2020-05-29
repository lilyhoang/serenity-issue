package serenity.issue.tasks.staff;

import serenity.issue.ui.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
public class Login implements Task {
    private static String username;
    private static String password;

    public Login(String user, String pass) {
        this.username = user;
        this.password = pass;
    }

    public static Task loginWithCredetial(String username, String password) {
        return instrumented(Login.class, username, password);
    }


    @Override
    @Step("{0} logs in to system with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(LoginPage.INPUT_USERNAME),
                Enter.theValue(password).into(LoginPage.INPUT_PASSWORD),
                JavaScriptClick.on(LoginPage.BTN_LOGIN),
                WaitUntil.the(LoginPage.BTN_LOGIN,isNotVisible())
        );

    }
    private void ClickUtil(){

    }
}
