   package Academia;


   public class PlanoMensal extends Plano {

      public PlanoMensal (double valorBase)   {
      super(valorBase);
      } 

      @Override 
      public double calcularMensalidade() {
      return getValorBase();
      }
   }