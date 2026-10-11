package Academia;


public class PlanoAnual extends Plano {

  private static final double MULTIPLICAR_DESCONTO = 0.78;

  public PlanoAnual(double valorBase) {
     super(valorBase);
  }


  @Override 
  public double calcularMensalidade() {
    return (getValorBase() * MULTIPLICAR_DESCONTO);
  }

}