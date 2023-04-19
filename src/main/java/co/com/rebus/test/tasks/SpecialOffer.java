package co.com.rebus.test.tasks;

import co.com.rebus.test.interactions.Click;
import co.com.rebus.test.interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.rebus.test.userinterfaces.Home.*;

public class SpecialOffer implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.visible(ITEMMENU_SPECIAL_OFFER),
                Click.on(ITEMMENU_SPECIAL_OFFER),
                WaitElement.visible(TITLE_SPECIAL_OFFER)
        );
    }

    public static SpecialOffer option(){return Tasks.instrumented(SpecialOffer.class);
    }
}
