import java.util.HashSet;

public class Pedido {
  private  HashSet<ItemPedido> itensDentroCaixa;
  private  HashSet<ItemPedido> itensForaCaixa;

  public Pedido() {
    this.itensDentroCaixa = new HashSet<ItemPedido>();
    this.itensForaCaixa = new HashSet<ItemPedido>();
  }

  public Pedido(HashSet<ItemPedido> itensDentroCaixa, HashSet<ItemPedido> itensForaCaixa) {
    this.itensDentroCaixa = itensDentroCaixa;
    this.itensForaCaixa = itensForaCaixa;
  }

  public void adicionarItemDentroCaixa(ItemPedido item) {
    this.itensDentroCaixa.add(item);
  }

  public void adicionarItemForaCaixa(ItemPedido item) {
    this.itensForaCaixa.add(item);
  }

  @Override
  public String toString() {
    String itemForaCx = "";
    String itemDentroCx = "";
    for (ItemPedido element : this.itensForaCaixa) {
      itemForaCx += String.format("- %s %s%n", element.tipo, element.nome);
    }
    for (ItemPedido e : this.itensDentroCaixa) {
      itemDentroCx += String.format("- %s %s%n", e.tipo, e.nome);
    }

    return String.format("Fora da Caixa: %n %sDentro da Caixa: %n %s", itemForaCx, itemDentroCx);
  }

  public HashSet<ItemPedido> getItensDentroCaixa() {
    return itensDentroCaixa;
  }

  public HashSet<ItemPedido> getItensForaCaixa() {
    return itensForaCaixa;
  }
}
