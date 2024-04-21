package ejercicio4;

public class cuenta {
    private long numCuenta;
    private double saldo;
    private String titular;
    private String tipoCuenta;

    public cuenta (long numCuenta, double saldo, String titular, String tipoCuenta){
        this.numCuenta=numCuenta;
        this.saldo=saldo;
        this.titular=titular;
        this.tipoCuenta=tipoCuenta;
    }

    public long getNumCuenta() {
        return numCuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    public String getTipoCuenta() {
        return tipoCuenta;
    }
    public String getTitular() {
        return titular;
    }
    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }
    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void imprimir (){
        System.out.println("Nombre Titular: "+getTitular()+"\n"+
        "Numero de Cuenta: "+getNumCuenta()+"\n"+
        "Tipo de cuenta: "+getTipoCuenta()+"\n"+
        "Saldo: "+getSaldo()+"\n"
        );
    }    

    public void saldo(){
        System.out.println("Su saldo Actual es: "+saldo);
    }

    public void depositar(double deposito){
        if(saldo > 0.0){
            saldo=saldo+deposito;
        }
        System.out.println(" Deposito Exitoso \n El nuevo saldo es: "+saldo+"\n Su deposito fue de : "+deposito);
   }

   public void retirar(double retiro){
    if (saldo < retiro ) {

        System.out.println("No cuenta con fondos Suficientes para retirar ");

    }else if(saldo > 0.0 && saldo > retiro){

        saldo=saldo-retiro;

        System.out.println("Su retiro fue exitoso \n Su nuevo saldo es: "+saldo +"\n Retiro de su cuenta:"+retiro);
    }
    
   }
   

   
}
