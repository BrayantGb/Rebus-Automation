package co.com.rebus.test.exceptions;

public class AnswerNotFound extends AssertionError{

    public static final String TITLE_SPECIAL_OFFERS = "Title information does not match";
    public static final String SUBTITLE_SPECIAL_OFFERS = "Subtitle information does not match";
    public static final String POPULAR_ITEMS_TITLE = "Popular items title information does not match";
    public static final String CONTACT_US_TITLE = "Popular items title information does not match";
    public static final String CONTACT_VALIDATION = "Contact validation does not match";
    public static final String POPULAR_ITEM = "Item found does not match";
    public AnswerNotFound(String message, Throwable cause){
        super(message, cause);
    }
}
