public class Impressao {
  int paginasTotais;
  int paginasColoridas;
  boolean ehFrenteVerso;
  double valorColoridasFrenteVerso;
  double valorPretoBrancoFrenteVerso;
  double valorColoridasFrenteApenas;
  double valorPretoBrancoFrenteApenas;
  TamanhoImpressao tamanhoImpressao;

  public Impressao(
      TamanhoImpressao tamanhoImpressao,
      int paginasTotais,
      int paginasColoridas,
      boolean ehFrenteVerso) {
    this.paginasTotais = paginasTotais;
    this.paginasColoridas = paginasColoridas;
    this.ehFrenteVerso = ehFrenteVerso;
  }

  public double getTotalA2() {
    double valorTotalPb = 0;
    double valorTotalCor = 0;
    double valorTotal;

    if (this.tamanhoImpressao == TamanhoImpressao.A2 && !ehFrenteVerso) {
      this.valorPretoBrancoFrenteApenas = 0.22;
      this.valorColoridasFrenteApenas = 0.32;

      valorTotalPb = valorTotalPb * valorPretoBrancoFrenteApenas;
      valorTotalCor = valorTotalCor * valorColoridasFrenteApenas;

    } else if (this.tamanhoImpressao == TamanhoImpressao.A2) {
      this.valorPretoBrancoFrenteVerso = 0.18;
      this.valorColoridasFrenteVerso = 0.28;

      valorTotalPb = valorTotalPb * valorPretoBrancoFrenteVerso;
      valorTotalCor = valorTotalCor * valorColoridasFrenteVerso;
    }

    valorTotal = valorTotalPb + valorTotalCor;
    return valorTotal;
  }

  public double getTotalA3() {
    double valorTotalPb = 0;
    double valorTotalCor = 0;
    double valorTotal;

    if (this.tamanhoImpressao == TamanhoImpressao.A3 && !ehFrenteVerso) {
      this.valorPretoBrancoFrenteApenas = 0.20;
      this.valorColoridasFrenteApenas = 0.30;

      valorTotalPb = valorTotalPb * valorPretoBrancoFrenteApenas;
      valorTotalCor = valorTotalCor * valorColoridasFrenteApenas;

    } else if (this.tamanhoImpressao == TamanhoImpressao.A3) {
      this.valorPretoBrancoFrenteVerso = 0.15;
      this.valorColoridasFrenteVerso = 0.25;

      valorTotalPb = valorTotalPb * valorPretoBrancoFrenteVerso;
      valorTotalCor = valorTotalCor * valorColoridasFrenteVerso;
    }
    valorTotal = valorTotalPb + valorTotalCor;
    return valorTotal;
  }

  public double getTotalA4() {
    double valorTotalPb = 0;
    double valorTotalCor = 0;
    double valorTotal;
    if (this.tamanhoImpressao == TamanhoImpressao.A4 && !ehFrenteVerso) {
      this.valorPretoBrancoFrenteApenas = 0.15;
      this.valorColoridasFrenteApenas = 0.25;

      valorTotalPb = valorTotalPb * valorPretoBrancoFrenteApenas;
      valorTotalCor = valorTotalCor * valorColoridasFrenteApenas;

    } else if (this.tamanhoImpressao == TamanhoImpressao.A4) {
      this.valorPretoBrancoFrenteVerso = 0.10;
      this.valorColoridasFrenteVerso = 0.20;

      valorTotalPb = valorTotalPb * valorPretoBrancoFrenteVerso;
      valorTotalCor = valorTotalCor * valorColoridasFrenteVerso;
    }
    valorTotal = valorTotalPb + valorTotalCor;
    return valorTotal;
  }

  public double calcularTotal() {
    return getTotalA2() + getTotalA3() + getTotalA4();
  }

  @Override
  public String toString() {
    String frente = "frente";
    String frenteVerso = "frente e verso";

    String s = ehFrenteVerso ? frenteVerso : frente;

    return String.format(
        "total de paginas: %d, total coloridas: %d, total preto e branco: %d, %s. total: R$ %.2f",
        getPaginasTotais(), getPaginasColoridas(), getPaginasPb(), s, calcularTotal());
  }

  public int getPaginasTotais() {
    return paginasTotais;
  }

  public int getPaginasColoridas() {
    return paginasColoridas;
  }

  public int getPaginasPb() {
    return getPaginasTotais() - getPaginasColoridas();
  }
}