public abstract class Personagem {
  private String nome;
  private TipoPersonagem tipo;
  private Integer forca;
  private Integer vigor;
  private Integer resistencia;
  private Integer destreza;

  protected Personagem() {}

  protected Personagem(
      String nome,
      TipoPersonagem tipo,
      Integer forca,
      Integer vigor,
      Integer resistencia,
      Integer destreza) {
    this.nome = nome;
    this.tipo = tipo;
    this.forca = forca;
    this.vigor = vigor;
    this.resistencia = resistencia;
    this.destreza = destreza;
  }

  abstract double getDanoAtaque();

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public TipoPersonagem getTipo() {
    return tipo;
  }

  public void setTipo(TipoPersonagem tipo) {
    this.tipo = tipo;
  }

  public Integer getForca() {
    return forca;
  }

  public void setForca(Integer forca) {
    this.forca = forca;
  }

  public Integer getVigor() {
    return vigor;
  }

  public void setVigor(Integer vigor) {
    this.vigor = vigor;
  }

  public Integer getResistencia() {
    return resistencia;
  }

  public void setResistencia(Integer resistencia) {
    this.resistencia = resistencia;
  }

  public Integer getDestreza() {
    return destreza;
  }

  public void setDestreza(Integer destreza) {
    this.destreza = destreza;
  }

  @Override
  public String toString() {
    return String.format(
        "Personagem{nome = %s tipo = %s, forca = %f, vigor = %f, resistencia = %f, destreza = %f }",
        nome, tipo, forca, vigor, resistencia, destreza);
  }
}
