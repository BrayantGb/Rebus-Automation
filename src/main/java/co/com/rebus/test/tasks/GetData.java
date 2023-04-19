package co.com.rebus.test.tasks;

import co.com.rebus.test.models.DataExcel;
import co.com.rebus.test.utils.SetData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Shared;

public class GetData implements Task {
    @Shared
    DataExcel dataExcel;

    private int idPrueba;
    public GetData(int idPrueba) {this.idPrueba = idPrueba;}
    @Override
    public <T extends Actor> void performAs(T actor) {
        dataExcel.setDeDatos(SetData.ofTest(idPrueba));

    }

    public static GetData ofUser(int idPrueba){return Tasks.instrumented(GetData.class, idPrueba);
    }
}
