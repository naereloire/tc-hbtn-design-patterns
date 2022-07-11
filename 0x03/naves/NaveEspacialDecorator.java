public class NaveEspacialDecorator extends NaveEspacial {
  private NaveEspacial naveDecorada;

  public NaveEspacialDecorator(NaveEspacial naveEspacial) {
    super(naveEspacial.getSaude(), naveEspacial.getAtaque());
    this.naveEspacial = naveEspacial;
  }

  @Override
  public int getSaude() {
    return this.naveEspacial.getSaude();
  }

  @Override
  public int getAtaque() {
    return this.naveEspacial.getAtaque();
  }
}
