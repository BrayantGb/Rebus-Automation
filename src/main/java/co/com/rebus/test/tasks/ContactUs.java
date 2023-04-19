package co.com.rebus.test.tasks;

import co.com.rebus.test.interactions.Click;
import co.com.rebus.test.interactions.Type;
import co.com.rebus.test.interactions.WaitElement;
import co.com.rebus.test.models.ContactUsForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.rebus.test.userinterfaces.ContactUsForm.*;

public class ContactUs implements Task {

    private ContactUsForm contactUsForm;

    public ContactUs(ContactUsForm contactUsForm){
        this.contactUsForm = contactUsForm;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.visible(CHECKBOX_CATEGORY),
                Scroll.to(BUTTON_SEND),
                WaitElement.visible(CHECKBOX_EMAIL),
                Type.on(CHECKBOX_EMAIL, contactUsForm.getEmail()),
                WaitElement.visible(CHECKBOX_SUBJECT),
                Type.on(CHECKBOX_SUBJECT, contactUsForm.getSubject())
        );
    }

    public static ContactUs form(ContactUsForm contactUsForm){return Tasks.instrumented(ContactUs.class, contactUsForm);
    }
}
