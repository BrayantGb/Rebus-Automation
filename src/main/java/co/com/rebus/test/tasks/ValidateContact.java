package co.com.rebus.test.tasks;

import co.com.rebus.test.models.Information;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Shared;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ValidateContact implements Task {

    private WebDriver webDriver;
    @Shared
    Information information;

    ValidateContact(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        String validateTitle = webDriver.findElement(By.xpath("//div//h1[contains(.,'CONTACT US')]")).getText();
        information.setTitleContactUs(validateTitle);
    }

    public static ValidateContact us(WebDriver webDriver){return Tasks.instrumented(ValidateContact.class, webDriver);
    }
}
