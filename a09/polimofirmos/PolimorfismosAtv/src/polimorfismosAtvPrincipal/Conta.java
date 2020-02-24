package polimorfismosAtvPrincipal;

//import java.util.*;

public class Conta {
    
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public double deposita(double valorDeposito) {
        double saldoConta = getSaldo();
        double novoSaldo = saldoConta + valorDeposito;
        setSaldo(novoSaldo);
        return getSaldo();    
    }
    
    public double saca(double valorSaque) {
        double saldoConta = getSaldo();
        double novoSaldo = saldoConta - valorSaque;
        setSaldo(novoSaldo);
        return getSaldo();    
    }
    
    public double atualizaTaxaPercentual(double taxaPercentual) {
        double saldoConta = getSaldo();
        double novoSaldo = ( (saldoConta * taxaPercentual) / 100 )+ saldoConta;
        setSaldo(novoSaldo);
        return getSaldo();    
    }
}
