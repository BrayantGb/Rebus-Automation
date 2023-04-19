package co.com.rebus.test.tasks;

import co.com.rebus.test.models.Information;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Shared;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectPopular implements Task {
    @Shared
    Information information;

    private WebDriver webDriver;

    SelectPopular(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        String itemPopular = webDriver.findElement(By.xpath("//p[contains(.,'HP ELITEPAD 1000 G2 TABLET')]")).getText();
        information.setPopularItem(itemPopular);
    }

    public static SelectPopular item(WebDriver webDriver){return Tasks.instrumented(SelectPopular.class, webDriver);
    }
}
