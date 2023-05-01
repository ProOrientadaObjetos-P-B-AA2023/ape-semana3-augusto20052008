package proyecto3;
class InstitucionEducativa {
    //Atributos
    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    private double gastosProyecEstudiante;
    private double presupuesto;
    //Operaciones
    public InstitucionEducativa(){}
    public InstitucionEducativa(String nombre,
            String tipoInstitucion,
            int numeroAlumnos,
            int numeroDocentes,
            int numeroSedes,
            double gastosProyecEstudiante){
        this.nombre = nombre;
        this.tipoInstitucion = tipoInstitucion;
        this.numeroAlumnos = numeroAlumnos;
        this.numeroDocentes = numeroDocentes;
        this.numeroSedes = numeroSedes;
        this.gastosProyecEstudiante = gastosProyecEstudiante;        
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTipoInstitucion(String tipoInstitucion){
         this.tipoInstitucion = tipoInstitucion;   
    }
    public void setNumeroAlumnos(int numeroAlumnos){
        this.numeroAlumnos = numeroAlumnos;
    }
    public void setNumeroDocentes(int numeroDocentes){
        this.numeroDocentes = numeroDocentes;
    }
    public void setNumeroSedes(int numeroSedes){
        this.numeroSedes = numeroSedes;
    }
    public void setGastosProyecEstudiante(double gastosProyecEstudiantes){
        this.gastosProyecEstudiante = gastosProyecEstudiante; 
    }
    public void calcularPresupuesto(){
        this.presupuesto = this.numeroAlumnos * this.gastosProyecEstudiante;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getTipoInstitucion(){
        return this.tipoInstitucion;
    }
    public int getNumeroAlumnos(){
        return this.numeroAlumnos;
    }
    public int getNumeroDocentes(){
        return this.numeroDocentes;
    }
    public int getNumeroSedes(){
        return this.numeroSedes;
    }
    public double getGastosProyecEstudiante(){
        return this.gastosProyecEstudiante;
    }
    public double getCalcularPresupuesto(){
        return this.presupuesto;
    }
    //Presentacion 
    public String toString(){
        String msj = String.format("""
                                   DATOS DE INSTITUCION EDUCATIVA
                                   Nombre: %s 
                                   Tipo de Institucion: %s 
                                   Numero de Alumnos: %d
                                   Numero de Docentes: %d
                                   Numero de Sedes: %d
                                   Gastos Proyectado por Estudiante: %.2f
                                   Presupuesto: %.2f"""
                ,this.getNombre()
                ,this.getTipoInstitucion()
                ,this.getNumeroAlumnos()
                ,this.getNumeroDocentes()
                ,this.getNumeroSedes()
                ,this.getGastosProyecEstudiante()
                ,this.getCalcularPresupuesto());
        return msj;
    }
}
public class Proyecto3 {
    public static void main(String[] args) {
        InstitucionEducativa institucionEducativa1 = new InstitucionEducativa("San Francisco", "Fiscomisional",3000,900,3,27.4);
        institucionEducativa1.calcularPresupuesto();
        System.out.println(institucionEducativa1);
    }
}
