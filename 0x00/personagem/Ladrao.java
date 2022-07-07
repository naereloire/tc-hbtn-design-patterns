public class Ladrao extends Personagem {
  public Ladrao() {}

  public Ladrao(
      String nome, int inteligencia, int forca, int vigor, int resistencia, int destreza) {
    super(nome, TipoPersonagem.LADRAO, inteligencia, forca, vigor, resistencia, destreza);
  }

  @Override
  double getDanoAtaque() {
    return (this.getForca() * 0.5)
        + (this.getDestreza() * 0.35)
        + (this.getVigor() * 0.1)
        + (this.getInteligencia() * 0.05);
  }
}
