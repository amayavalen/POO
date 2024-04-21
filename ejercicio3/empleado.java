package ejercicio3;

public class empleado {
    private String nombre;
    private int id;
    private double salario;
    private String departamento;

    public empleado(String nombre, int id, double salario, String departamento){
        this.nombre=nombre;
        this.id=id;
        this.salario=salario;
        this.departamento=departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void salarioAnual(){
        double anual = getSalario()*12;
        System.out.println("Salario Anual: "+anual);
    }

    public void imprimir (){
        System.out.println("Nombre Empleado: "+getNombre()+"\n"+
        "id Empleado: "+getId()+"\n"+
        "Salario: "+getSalario()+"\n"+
        "Departamento: "+getDepartamento()+"\n"
        );
    }

}
