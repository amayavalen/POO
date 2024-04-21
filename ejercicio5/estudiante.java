package ejercicio5;
 import java.util.*;

public class estudiante {
    private String nombre;
    private int edad;
    private String curso;
    private double nota;


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

    public void llenarPlanilla(){

        Scanner sc = new Scanner (System.in);

       int contador =1;
       double registroNota=0.0;
       double totalNotas=0.0;
       double promedio=0.0;

       while (contador <=10) {
            System.out.println("Dame la nota "+ contador);
            registroNota=sc.nextDouble();
            totalNotas = totalNotas+registroNota;
            contador++;
       }
       promedio= totalNotas/ 10;

       System.out.println("El total de las notas es: "+totalNotas +"\n y el promedio es: "+promedio);

       if (promedio > 60.0) {
        System.out.println("Aprobo la Materia");
       }else{
        System.out.println("Reprobo la Materia");
       }
    }


}
