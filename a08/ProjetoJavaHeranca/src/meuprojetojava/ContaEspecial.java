package meuprojetojava;
import java.util.Scanner;
public class ContaEspecial extends ContaBancaria {
  private float limiteCredito;
  
  public float getLimiteCredito() {
    return limiteCredito;
  }
  public void setLimiteCredito(float limiteCredito) {
    this.limiteCredito = limiteCredito;
  }

  //@Override//deixando explícito no código fonte que este método foi reescrito
  public void sacarValor(int ref){
    if(ref==2)super.sacarValor();
    else{
      Scanner var = new Scanner(System.in);
      System.out.println("Qual o valor do saque?");
      float valor=var.nextFloat();
        if((getSaldoConta()+limiteCredito-valor) < 0)
          System.out.println("Saque não autorizado."
          + "Saque ultrapssa o limite de crédito!");
        else {
          setSaldoConta(getSaldoConta()-valor);
          System.out.println("Saque efetuado com sucesso!");
          System.out.printf("Saldo atualizado = R$ %.2f\n",getSaldoConta());
        }
    }
  }
}