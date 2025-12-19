//  teste
public class ContaBancaria {

    private String NomedoTitular;
    private String NumeroDaConta;
    private double Saldo;
    private boolean ChequeEspecialAtivo;
    private double limiteChequeEspecial;

    public ContaBancaria(boolean chequeEspecialAtivo, double saldo, String numeroDaConta, String nomedoTitular, double limiteChequeEspecial) {
        ChequeEspecialAtivo = chequeEspecialAtivo;
        Saldo = saldo;
        NumeroDaConta = numeroDaConta;
        NomedoTitular = nomedoTitular;
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public void realizarDeposito(double valor) {
        if (valor > 0) {
            Saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public boolean Sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
            return false;
        }
        double disponivel = Saldo + limiteChequeEspecial;
        if (valor <= disponivel) {
            if (valor <= Saldo) {
                Saldo -= valor;
            } else {
                double falta = valor - Saldo;
                Saldo = 0;
                limiteChequeEspecial -= falta;
            }
            System.out.printf("Saque realizado: R$ %.2f%n", valor);
            return true;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
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

    public double getLimiteChequeEspecial() {
        if (this.Saldo <= 500.0) {
            limiteChequeEspecial = 50.0;
        } else {
            limiteChequeEspecial = Saldo * 50 / 100;
        }
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public void pagarBoleto(double valor) {
        if (valor > 0 && valor <= Saldo + getLimiteChequeEspecial()) {
            Saldo -= valor;
            System.out.println("Boleto pago com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para pagar o boleto.");
        }
        Sacar(valor);
    }
}