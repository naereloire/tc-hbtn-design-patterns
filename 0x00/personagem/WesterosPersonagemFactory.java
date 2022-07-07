public class WesterosPersonagemFactory extends PersonagemFactory {
  @Override
  Personagem createPersonagem(TipoPersonagem tipoPersonagem, String nome) {
    switch (tipoPersonagem) {
      case MAGO:
        return new Mago(nome, 8, 3, 3, 3, 4);
      case LADRAO:
        return new Ladrao(nome, 1, 8, 7, 7, 10);
      case GUERREIRO:
        return new Guerreiro(nome, 0, 9, 7, 10, 7);
      default:
        return null;
    }
  }
}
