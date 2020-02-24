package meuprojetojava;
public class ContaPoupanca extends ContaEspecial {

  private int diaRendimento;
  
  public int getDiaRendimento() {
    return diaRendimento;
  }

  public void setDiaRendimento(int diaRendimento) {
    this.diaRendimento = diaRendimento;
  }

  public void calcularNovoSaldo(float taxa){
    float valor = getSaldoConta()*(1+taxa/100)*diaRendimento;//juros simples
    setSaldoConta(valor);
  }
}