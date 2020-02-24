package polimorfismosAtvPrincipal;

public class ContaCorrente extends Conta {
    
    @Override
    public double atualizaTaxaPercentual(double taxaPercentual) {
        double saldoConta = getSaldo();
        double novoSaldo = ( ((2*taxaPercentual) * saldoConta ) / 100 )+ saldoConta;
        setSaldo(novoSaldo);
        return getSaldo();    
    }    
}
