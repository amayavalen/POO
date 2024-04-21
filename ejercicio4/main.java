package ejercicio4;

public class main {
    public static void main(String[] args) {
        
        cuenta cuenta1 = new cuenta(89893456, 23.000, "Juan Jose", "ahorros");

        cuenta1.saldo();
        cuenta1.depositar(15.000);
        cuenta1.retirar(40.000);
        cuenta1.retirar(20.000);
    }
}
