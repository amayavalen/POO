package ejercicio1;

public class main {
    
    public static void main(String[] args) {
        
        
        calificaciones planilla = new calificaciones();
        calificaciones planilla2 = new calificaciones();

        planilla.setNombreCurso("Introducing to Java Programming");
        planilla2.setNombreCurso("Data Structures in java");

        String mensaje1 = planilla.mostrarMensaje();
        System.out.println(mensaje1);

        String mensaje2 =  planilla2.mostrarMensaje();
        System.out.println(mensaje2);
    }
}
