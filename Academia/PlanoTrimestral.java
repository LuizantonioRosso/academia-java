package Academia;


public class PlanoTrimestral extends Plano {

  private static final double MULTIPLICAR_DESCONTO = 0.90;

  public PlanoTrimestral (double valorBase ) {
    super(valorBase);

  }

@Override
  public double calcularMensalidade() {
    return getValorBase() * MULTIPLICAR_DESCONTO;
    
  }
}