package ejercicio5;

import java.util.*;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        
        estudiante estudiante1 = new estudiante();

        System.out.println("Nombre del estudiante");
        estudiante1.setNombre(sc.nextLine());

        System.out.println("Edad del estudiante");
        estudiante1.setEdad(sc.nextInt());

        System.out.println("Curso del estudiante");
        estudiante1.setCurso(sc.nextLine());

        estudiante1.llenarPlanilla();



      
    }
        
}
