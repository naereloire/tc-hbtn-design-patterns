public class GuerreiroBuilder implements Builder {
  private String nome;
  private int inteligencia;
  private int forca;
  private int vigor;
  private int resistencia;
  private int destreza;

  public GuerreiroBuilder() {}

  public Guerreiro build() {
    return new Guerreiro(
        this.nome, this.inteligencia, this.forca, this.vigor, this.resistencia, this.destreza);
  }

  @Override
  public void setNome(String nome) {
    this.nome = nome;
  }

  @Override
  public void setInteligencia(int inteligencia) {
    this.inteligencia = inteligencia;
  }

  @Override
  public void setForca(int forca) {
    this.forca = forca;
  }

  @Override
  public void setDestreza(int destreza) {
    this.destreza = destreza;
  }

  @Override
  public void setVigor(int vigor) {
    this.vigor = vigor;
  }

  @Override
  public void setResistencia(int resistencia) {
    this.resistencia = resistencia;
  }
}
