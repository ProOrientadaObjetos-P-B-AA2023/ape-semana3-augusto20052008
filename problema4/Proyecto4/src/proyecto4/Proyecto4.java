package proyecto4;
class EquipoCelular{
    //Atrivutos
    private String sistemaOperativo;
    private double tamanoPantalla;
    private double costoInicial;
    private double ivaPorc;
    private double ivaCostoInicial;
    private double costoFinal;
    private String direccionMac;
    private String infoImei;
    //Operaciones
    public EquipoCelular(){}
    public EquipoCelular(String sistemaOperativo,
            double tamanoPantalla,
            double costoInicial,
            double ivaPorc,
            String direccionMac,
            String infoImei){
        this.sistemaOperativo = sistemaOperativo;
        this.tamanoPantalla = tamanoPantalla;
        this.costoInicial = costoInicial;
        this.ivaPorc = ivaPorc;
        this.direccionMac = direccionMac;
        this.infoImei = infoImei;
    }
    public void setSistemaOperativo(String sistemaOperativo){
        this.sistemaOperativo = sistemaOperativo;
    }
    public void setTamanoPantalla(double tamanoPantalla){
        this.tamanoPantalla = tamanoPantalla;
    }
    public void setCostoInicial(double costoInicial){
        this.costoInicial = costoInicial;
    }
    public void setIvaPorc(double ivaPorc){
        this.ivaPorc = ivaPorc;
    }
    public void setDireccionMac(String direccionMac){
        this.direccionMac = direccionMac;
    }
    public void setInfoImei(String infoImei){
        this.infoImei = infoImei;
    }
    public void calcularIvaCostoInicial (){
        this.ivaCostoInicial = this.costoInicial * (this.ivaPorc/100);
    }
    public void calcularCostoFinal(){
        this.costoFinal = this.ivaCostoInicial + this.costoInicial;
    }
    public String getSistemaOperativo(){
        return this.sistemaOperativo;
    }
    public double getTamanoPantalla(){
        return this.tamanoPantalla;
    }
    public double getCostoInicial(){
        return this.costoInicial;
    }
    public double getIvaPorc(){
        return this.ivaPorc;
    }
    public double getIvaCostoInicial(){
        return this.ivaCostoInicial;
    }
    public double getCostoFinal(){
        return this.costoFinal;
    }
    public String getDireccionMac(){
        return this.direccionMac;
    }
    public String getInfoImei(){
        return this.infoImei;
    }
    //Presentacion 
    public String toString(){
        String msj = String.format("""
                                   DATOS DE EQUIPO CELULAR
                                   Sistema Operativo: %s 
                                   Tamano Pantalla en cm: %.2f
                                   Costo Inicial: %.2f
                                   Iva en Porcentaje: %.2f
                                   Iva Costo Inicial: %.2f
                                   Costo Final: %.2f
                                   Direccion Mac: %s
                                   Información IMEI: %s"""
                ,this.getSistemaOperativo()
                ,this.getTamanoPantalla()
                ,this.getCostoInicial()
                ,this.getIvaPorc()
                ,this.getIvaCostoInicial()
                ,this.getCostoFinal()
                ,this.getDireccionMac()
                ,this.getInfoImei());
        return msj;
    }
}
public class Proyecto4 {
    public static void main(String[] args) {
        EquipoCelular equipoCelular1 = new EquipoCelular("Redmi",163.1,300,12,"10 de Agosto, y, Loja 110108","010928/00/389023/3");
        equipoCelular1.calcularIvaCostoInicial();
        equipoCelular1.calcularCostoFinal();
        System.out.println(equipoCelular1);
    }
    
}
