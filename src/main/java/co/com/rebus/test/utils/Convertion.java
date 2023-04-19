package co.com.rebus.test.utils;

import co.com.rebus.test.models.ContactUsForm;
import co.com.rebus.test.models.DataExcel;

import static co.com.rebus.test.enums.Resourses.EMAIL;
import static co.com.rebus.test.enums.Resourses.SUBJECT;

public class Convertion {

    private Convertion(){}

    public static ContactUsForm dePage(DataExcel dataExcel){
        ContactUsForm contactUsForm = new ContactUsForm();
        contactUsForm.setEmail(dataExcel.getSetDeDatos().get(0).get(EMAIL.getResourses()));
        contactUsForm.setSubject(dataExcel.getSetDeDatos().get(0).get(SUBJECT.getResourses()));
        return contactUsForm;
    }
}
