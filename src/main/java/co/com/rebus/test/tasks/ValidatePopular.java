package co.com.rebus.test.tasks;

import co.com.rebus.test.models.Information;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Shared;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ValidatePopular implements Task {

    private WebDriver webDriver;
    @Shared
    Information information;

    ValidatePopular(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        String validateTitle = webDriver.findElement(By.xpath("//h3[contains(.,'POPULAR ITEMS')]")).getText();
        information.setTitlePopularItems(validateTitle);

    }

    public static ValidatePopular items(WebDriver webDriver){return Tasks.instrumented(ValidatePopular.class, webDriver);
    }
}
