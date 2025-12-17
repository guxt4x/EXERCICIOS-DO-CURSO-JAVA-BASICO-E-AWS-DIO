//  teste
public class ContaBancaria {

    private String NomedoTitular;
    private String NumeroDaConta;
    private double Saldo;
    private boolean ChequeEspecialAtivo;

    public ContaBancaria(boolean chequeEspecialAtivo, double saldo, String numeroDaConta, String nomedoTitular) {
        ChequeEspecialAtivo = chequeEspecialAtivo;
        Saldo = saldo;
        NumeroDaConta = numeroDaConta;
        NomedoTitular = nomedoTitular;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            Saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public String getNomedoTitular() {
        return NomedoTitular;
    }

    public void setNomedoTitular(String nomedoTitular) {
        NomedoTitular = nomedoTitular;
    }

    public String getNumeroDaConta() {
        return NumeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        NumeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

    public boolean isChequeEspecialAtivo() {
        return ChequeEspecialAtivo;
    }

    public void setChequeEspecialAtivo(boolean chequeEspecialAtivo) {
        ChequeEspecialAtivo = chequeEspecialAtivo;
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: R$ " + Saldo);
    }

    public void consultarChequeEspecial() {
        if (ChequeEspecialAtivo) {
            System.out.println("O cheque especial está ativo.");
        } else {
            System.out.println("O cheque especial não está ativo.");
        }
    }
}