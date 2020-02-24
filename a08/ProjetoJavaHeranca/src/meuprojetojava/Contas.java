package meuprojetojava;
import java.util.Scanner;
public class Contas {
    public static void main(String args[]){
      int opcao,resposta;
      Scanner ler = new Scanner(System.in);
      ContaBancaria conta = new ContaBancaria();
      ContaPoupanca acesso = new ContaPoupanca();
      for(;;){
        System.out.printf("\n____________________________\n"
        + "Escolha uma opção:\n\n"
        +"1) Incluir dados relativos ás contas dos clientes\n"
        +"2) Sacar determinado valor da(s) sua(s) conta(s)\n"
        +"3) Depositar determinado valor da(s) sua(s) conta(s)\n"
        +"4) Mostrar novo saldo do cliente, a partir da taxa de rendimento\n"
        +"5) Mostrar os dados da conta de um cliente\n"
        +"6) Sair\n\n");
        opcao=ler.nextInt();
          switch(opcao){
            
            case 1:{
            String aux=ler.nextLine();//só para pegar o enter.
            System.out.println("Entre com o nome do cliente");
            acesso.setCliente(ler.nextLine());
            System.out.println("Entre com o número da conta");
            acesso.setNumeroConta(ler.nextInt());
            System.out.println("Entre com o saldo inicial da conta");
            acesso.setSaldoConta(ler.nextFloat());
          }break;
          
          case 2:{
            System.out.println("Você tem cheque especial? (sim = 1 não = 2)");
            resposta=ler.nextInt();
            if(resposta == 1){
              System.out.println("Qual o limite do cheque especial?");
              acesso.setLimiteCredito(ler.nextFloat());
              acesso.sacarValor(1);
            }
            if(resposta == 2) acesso.sacarValor(2);
            if(resposta != 1 && resposta != 2)System.out.println("Opção inválida");
          }break;
          
          case 3:acesso.depositarValor();break;
          
          case 4:{
            System.out.println("Qual a a taxa de rendimento? (em %)");
            acesso.calcularNovoSaldo(ler.nextFloat());
            System.out.println("Quantos dias de aplicação?");
            acesso.setDiaRendimento(ler.nextInt());
          }break;
          
          case 5:{
            System.out.printf("Nome: %s\n",acesso.getCliente());
            System.out.printf("Conta: %d\n",acesso.getNumeroConta());
            System.out.printf("Saldo: R$ %.2f\n",acesso.getSaldoConta());
          };break;
          
          case 6:System.exit(0);break;
          
          default:System.out.println("Opção inválida!");break;
         }
      }
    }
}