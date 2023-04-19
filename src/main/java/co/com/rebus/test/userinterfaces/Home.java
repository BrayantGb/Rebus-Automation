package co.com.rebus.test.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Home extends PageObject {
    public static final Target ITEMMENU_SPECIAL_OFFER = Target.the("Select item special offer").located(By.xpath("//a[contains(.,'SPECIAL OFFER')]"));
    public static final Target TITLE_SPECIAL_OFFER = Target.the("Title special offer").located(By.xpath("//h3[contains(.,'SPECIAL OFFER')]"));
    public static final Target TITLE_POPULAR_ITEMS = Target.the("Title popular items").located(By.xpath("//a[contains(.,'POPULAR ITEMS')]"));
    public static final Target SUBTITLE_POPULAR_ITEMS = Target.the("Subtitle popular items").located(By.xpath("//h3[contains(.,'POPULAR ITEMS')]"));
    public static final Target OPTION_CONTACT_US = Target.the("Select option contact us").located(By.xpath("//a[contains(.,'CONTACT US')]"));
    public static final Target TITLE_CONTACT_US = Target.the("Title contact us").located(By.xpath("//div//h1[contains(.,'CONTACT US')]"));
}
