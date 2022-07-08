public class ItemPedido {

  TipoItemPedido tipo;
  String nome;

  public ItemPedido() {}

  public ItemPedido(TipoItemPedido tipo, String nome) {
    this.tipo = tipo;
    this.nome = nome;
  }

  public TipoItemPedido getTipo() {
    return tipo;
  }

  public String getNome() {
    return nome;
  }
}
