package co.com.rebus.test.tasks;

import co.com.rebus.test.models.Information;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Shared;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ValidateSpecial implements Task {

    private WebDriver webDriver;
    @Shared
    Information information;

    ValidateSpecial(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String validateTitleSpecialOffer = webDriver.findElement(By.xpath("//h3[contains(.,'SPECIAL OFFER')]")).getText();
        information.setSpecialOffer(validateTitleSpecialOffer);
        String validateSubTitleSpecialOffer = webDriver.findElement(By.xpath("//span[contains(.,'EXPLORE THE NEW DESIGN')]")).getText();
        information.setSubTitleSpecialOffer(validateSubTitleSpecialOffer);
    }

    public static ValidateSpecial offer(WebDriver webDriver){return Tasks.instrumented(ValidateSpecial.class, webDriver);
    }
}
