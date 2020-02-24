package polimorfismosAtvPrincipal;

public class ContaPoupanca extends Conta{
    
    @Override
    public double atualizaTaxaPercentual(double taxaPercentual) {
        double saldoConta = getSaldo();
        double novoSaldo = ( ((3*taxaPercentual) * saldoConta ) / 100 )+ saldoConta;
        setSaldo(novoSaldo);
        return getSaldo();    
    }
    
}
