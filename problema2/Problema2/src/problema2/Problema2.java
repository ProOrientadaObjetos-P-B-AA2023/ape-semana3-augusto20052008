package problema2;
class EquivalenteHora{
    //Atributos
    private double horas;
    private double valorDias;
    private double valorMinutos;
    private double valorSegundos;
    //Operaciones
    public EquivalenteHora(){}
    public EquivalenteHora(double horas){
        this.horas = horas;
    }
    public void setHoras (double horas){
        this.horas = horas;
    }
    public void calcularDias(){
        this.valorDias = this.horas / 24;
    }
    public void calcularMinutos(){
        this.valorMinutos = horas * 60;
    }
    public void calcularSegundos(){
        this.valorSegundos = horas * 3600;
    }
    public double getHoras(){
        return this.horas;
    }
    public double getCalcularDias(){
        return this.valorDias;
    }
    public double getCalcularMinutos(){
        return this.valorMinutos;
    }
    public double getCalcularSegundos(){
        return this.valorSegundos;
    }   
    //Presentación
    public String toString(){
        String msj = String.format("""
                                   DATOS DE EQUIVALENCIAS 
                                   Horas: %.2f 
                                   Equivalencia en Dias: %.2f 
                                   Equivalencia en Minutos: %.2f
                                   Equivalencia en Segundos: %.2f"""
                ,this.getHoras(),this.getCalcularDias(),this.getCalcularMinutos(),this.getCalcularSegundos());
        return msj;
    }
}
//Ejecución
public class Problema2 {
    public static void main(String[] args) {
        EquivalenteHora equivalenteHora1 = new EquivalenteHora(24);
        equivalenteHora1.calcularDias();
        equivalenteHora1.calcularMinutos();
        equivalenteHora1.calcularSegundos();
        System.out.println(equivalenteHora1);
    }
    
}
