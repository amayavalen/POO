package ejercicio1;

public class calificaciones {

     private String nombreCurso;

    //  public calificaciones(String nombreCurso){
    //     this.nombreCurso=nombreCurso;
    //  }

     public String getNombreCurso() {
         return nombreCurso;
     }

     public void setNombreCurso(String nombreCurso) {
         this.nombreCurso = nombreCurso;
     }

     public String mostrarMensaje(){
        return "Bienvenido al sistema de planillas de calificaciones del curso: " + getNombreCurso();
     }
}
