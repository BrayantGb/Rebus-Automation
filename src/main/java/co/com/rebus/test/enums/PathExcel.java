package co.com.rebus.test.enums;

public enum PathExcel {
    FILE_EXCEL("./src/test/resources/co/com/rebus/test/data"),
    SEPARADOR("/"),
    NOMBRE_ARCHIVO("Data.xlsx"),
    SELECT("SELECT * FROM Test"),
    WHERE(" WHERE IdPrueba = ")
    ;
    private String pathExcel;
    PathExcel(String pathExcel){this.pathExcel = pathExcel;}
    public String getPathExcel(){return pathExcel;}
}
