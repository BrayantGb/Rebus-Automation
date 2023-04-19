package co.com.rebus.test.stepdefinitions;

import co.com.rebus.test.exceptions.AnswerNotFound;
import co.com.rebus.test.models.DataExcel;
import co.com.rebus.test.models.Information;
import co.com.rebus.test.questions.ResponseMessage;
import co.com.rebus.test.tasks.*;
import co.com.rebus.test.utils.Convertion;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Shared;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static co.com.rebus.test.enums.Resourses.USER;
import static co.com.rebus.test.enums.Validations.*;
import static co.com.rebus.test.exceptions.AnswerNotFound.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class ShoppingStepDefinitions {

    @Shared
    Information information;
    @Shared
    DataExcel dataExcel;
    @Managed(driver = "firefox")
    WebDriver herBrowser;
    Actor user = Actor.named(USER.getResourses());

    @Given("the user enters the page advantage")
    public void theUserEntersThePageAdvantage() {
        user.can(BrowseTheWeb.with(herBrowser));
    }

    @When("a user clicks on the special offer option")
    public void aUserClicksOnTheSpecialOfferOption() {
        user.attemptsTo(SpecialOffer.option());
    }

    @When("a user clicks on the popular items option")
    public void aUserClicksOnThePopularItemsOption() {
        user.attemptsTo(PopularItem.option());
    }

    @When("a user clicks on the contact us option")
    public void aUserClicksOnTheContactUsOption() {
        user.attemptsTo(Contact.us());
    }

    @When("the user fills out the contact form {int}")
    public void theUserFillsOutTheContactFormIdPrueba(Integer IdPrueba) {
        user.attemptsTo(GetData.ofUser(IdPrueba));
        user.attemptsTo(Contact.us());
        user.attemptsTo(ContactUs.form(Convertion.dePage(dataExcel)));
    }

    @When("you find a popular item")
    public void youFindAPopularItem() {
        user.attemptsTo(PopularItem.option());
    }

    @Then("validate the item that is on special offer")
    public void validateTheItemThatIsOnSpecialOffer() {
        user.attemptsTo(ValidateSpecial.offer(herBrowser));
        user.should(seeThat(ResponseMessage.is(information.getSpecialOffer()), Matchers.equalTo(TITLE_SPECIALOFFERS.getValidations()))
                .orComplainWith(AnswerNotFound.class,TITLE_SPECIAL_OFFERS));
        user.should(seeThat(ResponseMessage.is(information.getSubTitleSpecialOffer()), Matchers.equalTo(SUBTITLE_SPECIALOOFERS.getValidations()))
                .orComplainWith(AnswerNotFound.class, SUBTITLE_SPECIAL_OFFERS));
    }

    @Then("validate the item that is on popular items")
    public void validateTheItemThatIsOnPopularItems() {
        user.attemptsTo(ValidatePopular.items(herBrowser));
        user.should(seeThat(ResponseMessage.is(information.getTitlePopularItems()), Matchers.equalTo(TITLE_POPULAR_ITEMS.getValidations()))
                .orComplainWith(AnswerNotFound.class,POPULAR_ITEMS_TITLE));
    }


    @Then("validate the item that is on contact us")
    public void validateTheItemThatIsOnContactUs() {
        user.attemptsTo(ValidateContact.us(herBrowser));
        user.should(seeThat(ResponseMessage.is(information.getTitleContactUs()), Matchers.equalTo(TITLE_CONTACT_US.getValidations()))
                .orComplainWith(AnswerNotFound.class,CONTACT_US_TITLE));
    }


    @Then("the system validates that the information has been sent")
    public void theSystemValidatesThatTheInformationHasBeenSent() {
        user.attemptsTo(ValidateContactUs.form(herBrowser));
        user.should(seeThat(ResponseMessage.is(information.getContactValidation()), Matchers.equalTo(VALIDATION_CONTACT.getValidations()))
                .orComplainWith(AnswerNotFound.class,CONTACT_VALIDATION));
    }


    @Then("a popular item is validated")
    public void aPopularItemIsValidated() {
        user.attemptsTo(SelectPopular.item(herBrowser));
        user.should(seeThat(ResponseMessage.is(information.getPopularItem()), Matchers.equalTo(VALIDATE_POPULAR_ITEM.getValidations()))
                .orComplainWith(AnswerNotFound.class,POPULAR_ITEM));
    }
}
