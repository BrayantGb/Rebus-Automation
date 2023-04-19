package co.com.rebus.test.tasks;

import co.com.rebus.test.interactions.Click;
import co.com.rebus.test.interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.rebus.test.userinterfaces.Home.*;

public class PopularItem implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.visible(TITLE_POPULAR_ITEMS),
                Click.on(TITLE_POPULAR_ITEMS),
                WaitElement.visible(SUBTITLE_POPULAR_ITEMS)
        );

    }

    public static PopularItem option(){return Tasks.instrumented(PopularItem.class);
    }
}
