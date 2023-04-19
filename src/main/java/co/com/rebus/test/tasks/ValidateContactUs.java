package co.com.rebus.test.tasks;

import co.com.rebus.test.interactions.Click;
import co.com.rebus.test.interactions.WaitElement;
import co.com.rebus.test.models.Information;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Shared;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static co.com.rebus.test.userinterfaces.ContactUsForm.BUTTON_SEND;
import static co.com.rebus.test.userinterfaces.ContactUsForm.VALIDATION;

public class ValidateContactUs implements Task {

    @Shared
    Information information;

    private WebDriver webDriver;

    ValidateContactUs(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(BUTTON_SEND),
                WaitElement.visible(VALIDATION),
                Scroll.to(BUTTON_SEND)
        );
        webDriver.findElement(By.xpath("//sec-sender//button[@id=\"send_btnundefined\"]")).click();
        String validationContact = webDriver.findElement(By.xpath("//label[contains(.,' Thank you for contacting Advantage support. ')]")).getText();
        information.setContactValidation(validationContact);
    }

    public static ValidateContactUs form(WebDriver webDriver){return Tasks.instrumented(ValidateContactUs.class, webDriver);}
}
