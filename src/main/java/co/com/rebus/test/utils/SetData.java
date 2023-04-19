package co.com.rebus.test.utils;

import java.util.List;
import java.util.Map;

import static co.com.rebus.test.enums.PathExcel.*;

public class SetData {

    private SetData(){}

    public static List<Map<String, String>> ofTest(int fila) {
        List<Map<String, String>> datos;
        String ruta = FILE_EXCEL.getPathExcel();
        String rutaAbsoluta = ruta + SEPARADOR.getPathExcel() + NOMBRE_ARCHIVO.getPathExcel();
        datos = GetData.deExcel(rutaAbsoluta, SELECT.getPathExcel() + WHERE.getPathExcel() + fila);
        return datos;
    }
}
