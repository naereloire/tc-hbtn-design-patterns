import java.util.List;
import java.util.Locale;

public abstract class Bebida {
  public abstract List<String> obterIngredientes();

  public abstract double obterPreco();

  @Override
  public String toString() {
    return String.format(
        Locale.GERMANY, "Preco: %.2f - Ingredientes: %s", obterPreco(), obterIngredientes());
  }
}
