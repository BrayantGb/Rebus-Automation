package co.com.rebus.test.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ResponseMessage implements Question<String> {
    private String element;
    ResponseMessage(String element){this.element = element;}

    @Override
    public String answeredBy(Actor actor) {
        return this.element;
    }
    public static ResponseMessage is(String element){return new ResponseMessage(element);}
}
