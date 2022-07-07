import java.util.List;

public class BebidaComLeite extends BebidaDecorator {
  public BebidaComLeite(Bebida bebidaDecorada) {
    super(bebidaDecorada);
  }

  @Override
  public List<String> obterIngredientes() {
    List<String> ingredientes = super.bebidaDecorada.obterIngredientes();
    ingredientes.add("leite");
    return ingredientes;
  }

  @Override
  public double obterPreco() {
    return super.bebidaDecorada.obterPreco() + 3.2;
  }
}
