package meuprojetojava;
import java.util.Scanner;
public class ContaBancaria {
  private String cliente;
  private int numeroConta;
  private float saldoConta;
  
  public String getCliente() {
    return cliente;
  }
  public void setCliente(String cliente) {
    this.cliente = cliente;
  }
  public int getNumeroConta() {
    return numeroConta;
  }
  public void setNumeroConta(int numeroConta) {
    this.numeroConta = numeroConta;
  }
  public float getSaldoConta() {
    return saldoConta;
  }
  public void setSaldoConta(float saldoConta) {
    this.saldoConta = saldoConta;
  }
  
  public void sacarValor(){
    Scanner var = new Scanner(System.in);
    System.out.println("Qual o valor do saque?");
    float valor=var.nextFloat();
    if(saldoConta-valor < 0)
      System.out.println("Saldo negativo não autorizado!");
    else {
      saldoConta-=valor;
      System.out.println("Saque efetuado com sucesso!");
      System.out.printf("Saldo atualizado = R$ %.2f\n",saldoConta);
    }
  }
  
  public void depositarValor(){
    Scanner var = new Scanner(System.in);
    System.out.println("Qual o valor do depósito?");
    float valor=var.nextFloat();
    saldoConta+=valor;
    System.out.println("Depósito efetuado com sucesso!");
    System.out.printf("Saldo atualizado = R$ %.2f\n",saldoConta);
  }
}
