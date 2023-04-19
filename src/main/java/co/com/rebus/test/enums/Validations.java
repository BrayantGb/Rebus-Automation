package co.com.rebus.test.enums;

public enum Validations {

    TITLE_SPECIALOFFERS("SPECIAL OFFER"),
    SUBTITLE_SPECIALOOFERS("EXPLORE THE NEW DESIGN"),
    TITLE_POPULAR_ITEMS("POPULAR ITEMS"),
    TITLE_CONTACT_US("CONTACT US"),
    VALIDATION_CONTACT("Thank you for contacting Advantage support."),
    VALIDATE_POPULAR_ITEM("HP ELITEPAD 1000 G2 TABLET")
    ;

    private  String validations;
    Validations(String validations){this.validations = validations;}
    public String getValidations(){return validations;}
}
