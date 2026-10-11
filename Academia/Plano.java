package Academia;


public abstract class Plano {

   private double valorBase;

   public Plano (double valorBase) {
    this.valorBase = valorBase;

   }

   public double getValorBase() {
       return valorBase;

   }

   public abstract double calcularMensalidade();
     
}