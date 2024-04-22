package ejercicio6;

public class main {
    
    public static void main(String[] args) {
        
        interesCompuesto inversion1 = new interesCompuesto(1000, 0.05, 10);

        inversion1.imprimir();
        inversion1.calcularInteresCompuesto();
    }
}
