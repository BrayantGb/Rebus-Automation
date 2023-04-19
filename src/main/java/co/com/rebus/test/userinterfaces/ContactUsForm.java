package co.com.rebus.test.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ContactUsForm extends PageObject {
    public static final Target CHECKBOX_CATEGORY = Target.the("Select Checkbox Category").located(By.xpath("//select[@name=\"categoryListboxContactUs\"]"));
    public static final Target CHECKBOX_EMAIL = Target.the("Input checkbox email").located(By.xpath("//input[@name=\"emailContactUs\"]"));
    public static final Target CHECKBOX_SUBJECT = Target.the("Textarea subject").located(By.xpath("//textarea[@name=\"subjectTextareaContactUs\"]"));
    public static final Target BUTTON_SEND = Target.the("Button Send").located(By.xpath("//button[@id=\"send_btnundefined\"]"));
    public static final Target VALIDATION = Target.the("Validation contact").located(By.xpath("//label[contains(.,' Thank you for contacting Advantage support. ')]"));
}
