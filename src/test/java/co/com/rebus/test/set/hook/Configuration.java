package co.com.rebus.test.set.hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.openqa.selenium.WebDriver;

import static co.com.rebus.test.enums.Resourses.URL_BASE;
import static co.com.rebus.test.enums.Resourses.USER;
import static net.serenitybdd.screenplay.actors.OnStage.drawTheCurtain;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class Configuration {
    @Managed(driver = "firefox")
    WebDriver herBrowser;
    Actor user = Actor.named(USER.getResourses());

    @Before
    public void start(){
        setTheStage(new OnlineCast());
        user.can(BrowseTheWeb.with(herBrowser));
        user.attemptsTo(Open.url(SystemEnvironmentVariables.createEnvironmentVariables().getProperty(URL_BASE.getResourses())));
    }

    @After
    public void finalize(){drawTheCurtain();}
}
