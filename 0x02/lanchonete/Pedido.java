import java.util.HashSet;

public class Pedido {
  private  HashSet<ItemPedido> itensForaCaixa;
  private  HashSet<ItemPedido> itensDentroCaixa;

  public Pedido() {
    this.itensDentroCaixa = new HashSet<ItemPedido>();
    this.itensForaCaixa = new HashSet<ItemPedido>();
  }

//  public Pedido(HashSet<ItemPedido> itensDentroCaixa, HashSet<ItemPedido> itensForaCaixa) {
//    this.itensDentroCaixa = itensDentroCaixa;
//    this.itensForaCaixa = itensForaCaixa;
//  }

  public void adicionarItemDentroCaixa(ItemPedido item) {
    this.itensDentroCaixa.add(item);
  }

  public void adicionarItemForaCaixa(ItemPedido item) {
    this.itensForaCaixa.add(item);
  }

  @Override
  public String toString() {
    StringBuilder itemForaCx = new StringBuilder();
    StringBuilder itemDentroCx = new StringBuilder();
    for (ItemPedido element : this.itensForaCaixa) {
      itemForaCx.append(String.format("- %s %s%n", element.getTipo().name(), element.getNome()));
    }
    for (ItemPedido e : this.itensDentroCaixa) {
      itemDentroCx.append(String.format("- %s %s%n", e.getTipo().name(), e.getNome()));
    }

    return String.format("Fora da Caixa: %n %sDentro da Caixa: %n %s", itemForaCx, itemDentroCx);
  }
}
