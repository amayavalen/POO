package ejercicio2;

public class estudiante {
    private String nombre;
    private int edad;
    private String curso;
    private double nota;

    public estudiante(String nombre, int edad, String curso, double nota){
        this.nombre=nombre;
        this.edad=edad;
        this.curso=curso;
        this.nota=nota;
    }
    public String getCurso() {
        return curso;
    }
    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }

    public void imprimir(){
        System.out.println(getNombre()+" "+getEdad()+" "+getCurso()+" "+getNota());
        
    }
}
