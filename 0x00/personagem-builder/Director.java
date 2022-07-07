public class Director {
  public void buildGuerreiro(Builder builder) {
    builder.setNome("Guerreiro");
    builder.setTipo("GUERREIRO");
    builder.setInteligencia(1);
    builder.setForca(8);
    builder.setDestreza(6);
    builder.setVigor(5);
    builder.setResistencia(10);
  }

  public void buildLadrao(Builder builder) {
    builder.setNome("Ladrão");
    builder.setTipo("LADRÃO");
    builder.setInteligencia(2);
    builder.setForca(6);
    builder.setDestreza(10);
    builder.setVigor(8);
    builder.setResistencia(5);
  }

  public void buildMago(Builder builder) {
    builder.setNome("Mago");
    builder.setTipo("MAGO");
    builder.setInteligencia(10);
    builder.setForca(2);
    builder.setDestreza(4);
    builder.setVigor(5);
    builder.setResistencia(3);
  }
}
