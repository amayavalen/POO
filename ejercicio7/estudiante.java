package ejercicio7;
 import java.util.*;

public class estudiante {
    private String nombre;
    private int edad;
    private String curso;
    private double nota;
    private double promedio=0.0;

    public estudiante(String nombre){
        this.nombre=nombre;
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
    public double getPromedio() {
        return promedio;
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
       

       while (contador <=5) {
            System.out.println("Dame la nota "+ contador);
            registroNota=sc.nextDouble();
            totalNotas = totalNotas+registroNota;
            contador++;
       }
       promedio= totalNotas/ 5;


       System.out.println("El total de las notas es: "+totalNotas +"\n y el promedio es: "+promedio);

       if (promedio > 60.0 ) {
        System.out.println("Aprobo la Materia");
       }else{
        System.out.println("Reprobo la Materia");
       }

    }

    public void contarPromedios(){

        promedio = getPromedio();
        int a=0,b=0,c=0,d=0,f=0;

        if(promedio == 100){
            a++;
        }else if(promedio > 90 && promedio <= 100 ){
            b++;
        }else if(promedio > 80 && promedio <= 90){
            c++;
        }else if(promedio > 70 && promedio <= 80){
            d++;
        }else if(promedio <= 60){
            f++;
        }

        System.out.println("Numero de Estudiantes con cada nota: \n"+
        "A: "+a+"\n"+
        "B: "+b+"\n"+
        "C: "+c+"\n"+
        "D: "+d+"\n"+
        "F: "+f+"\n"
        );


    }


}
