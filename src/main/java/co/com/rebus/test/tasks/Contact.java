package co.com.rebus.test.tasks;

import co.com.rebus.test.interactions.Click;
import co.com.rebus.test.interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.rebus.test.userinterfaces.Home.*;

public class Contact implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.visible(OPTION_CONTACT_US),
                Click.on(OPTION_CONTACT_US),
                WaitElement.visible(TITLE_CONTACT_US)
        );

    }

    public static Contact us(){return Tasks.instrumented(Contact.class);
    }
}
