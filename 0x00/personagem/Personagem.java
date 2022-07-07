public abstract class Personagem {
  private String nome;
  private TipoPersonagem tipo;
  private int inteligencia;
  private int forca;
  private int vigor;
  private int resistencia;
  private int destreza;

  protected Personagem() {}

  protected Personagem(
      String nome,
      TipoPersonagem tipo,
      int inteligencia,
      int forca,
      int vigor,
      int resistencia,
      int destreza) {
    this.nome = nome;
    this.tipo = tipo;
    this.inteligencia = inteligencia;
    this.forca = forca;
    this.vigor = vigor;
    this.resistencia = resistencia;
    this.destreza = destreza;
  }

  abstract double getDanoAtaque();

  public String getNome() {
    return nome;
  }

  public int getInteligencia() {
    return inteligencia;
  }

  public int getForca() {
    return forca;
  }

  public int getVigor() {
    return vigor;
  }

  public int getDestreza() {
    return destreza;
  }

  @Override
  public String toString() {
    return String.format(
        "Personagem{nome = %s tipo = %s inteligencia = %d forca = %d vigor = %d resistencia = %d destreza = %d dano ataque = %.2f }",
        nome, tipo, inteligencia, forca, vigor, resistencia, destreza, getDanoAtaque());
  }
}
