package ejercicio6;

public class interesCompuesto {
    private long inversion;
    private double interes;
    private double montoFinal;
    private int anio;

    public interesCompuesto(long inversion, double interes, int anio){
        this.inversion=inversion;
        this.interes=interes;
        this.anio=anio;
    }

    public int getAnio() {
        return anio;
    }
    public double getInteres() {
        return interes;
    }
    public long getInversion() {
        return inversion;
    }
    public double getMontoFinal() {
        return montoFinal;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public void setInteres(double interes) {
        this.interes = interes;
    }
    public void setInversion(long inversion) {
        this.inversion = inversion;
    }
    public void setMontoFinal(double montoFinal) {
        this.montoFinal = montoFinal;
    }

    public void imprimir (){
        System.out.println("Inversion Inicial: "+getInversion()+"\n"+
        "Interes: "+getInteres()+"\n"+
        "Tiempo : "+getAnio()+" años \n"
        );
    }  

    public void calcularInteresCompuesto(){
        long inversion = getInversion();
        double interes = getInteres();
        int anio = getAnio();

        double montoFinal =  Math.pow((inversion*(1+interes)), anio);

        System.out.println("El monto final es: "+montoFinal);
    }
   
}
