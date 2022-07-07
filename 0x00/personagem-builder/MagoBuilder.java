public class MagoBuilder implements Builder {
  private String nome;
  private int inteligencia;
  private int forca;
  private int vigor;
  private int resistencia;
  private int destreza;

  public Mago build() {
    return new Mago(
        this.nome, this.inteligencia, this.forca, this.vigor, this.resistencia, this.destreza);
  }

  @Override
  public void setNome(String nome) {

  }

  @Override
  public void setTipo(String tipo) {

  }

  @Override
  public void setInteligencia(int inteligencia) {

  }

  @Override
  public void setForca(int forca) {

  }

  @Override
  public void setDestreza(int destreza) {

  }

  @Override
  public void setVigor(int vigor) {

  }

  @Override
  public void setResistencia(int resistencia) {

  }
}
