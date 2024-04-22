package ejercicio7;
import java.util.*;

public class curso {
    estudiante estudiante1 = new estudiante("Juan");
    estudiante estudiante2 = new estudiante("Pedro");
    estudiante estudiante3 = new estudiante("Maria");
    estudiante estudiante4 = new estudiante("Albeiro");
    estudiante estudiante5 = new estudiante("Jose");

    public void menu(){
        Scanner sc = new Scanner (System.in);
        int opcion;
        do{
            System.out.println("Bienvenido al registro de notas del curso Programación Orientada a Objetos \n ");
            System.out.println(" 1. Registrar Nota Individual \n 2. Estadisticas curso en general \n 0. para salir");
            opcion=sc.nextInt();

            switch (opcion) {
                case 1:
                
                int opcionE;

                do{
                    System.out.println("Listado de estudiantes \n "+
                    "1.Juan Perez \n "+
                    "2.Pedro Suarez \n "+
                    "3.Maria Granados \n "+
                    "4.Albeiro Jose \n "+
                    "5.Jose Albeiro ");
                    System.out.println("Que estudiante desea registar ");
                    System.out.println("0 para dejar de registar");
                    opcionE = sc.nextInt();
                        

                    if(opcionE == 1){
                        estudiante1.llenarPlanilla();
                        estudiante1.imprimir();
                    }else if(opcionE == 2){
                        estudiante2.llenarPlanilla();
                        estudiante2.imprimir();
                    }else if(opcionE == 3){
                        estudiante3.llenarPlanilla();
                        estudiante3.imprimir();
                    }else if(opcionE == 4){
                        estudiante4.llenarPlanilla();
                        estudiante4.imprimir();
                    }else if(opcionE == 5){
                        estudiante5.llenarPlanilla();
                        estudiante5.imprimir();
                    }
                }while (opcionE != 0);
                
                break;
                case 2 :
                    estudiante1.contarPromedios();
                break;
        
                default:
                
                
            }     
        }while(opcion != 0);
    }    
}
