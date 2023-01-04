package Questao14;

public class Conta {

    private double saldo = 0;
    private double limite = 0;

    public void deposita(double valor) {
        setSaldo(valor);
    }

    public void saca(double valor) {
        setLimite((-valor)); // o Valor vai negativo p aestou reduzindo o saldo
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {

        this.saldo += saldo;

    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        try {

            if ((this.limite + limite) < 0) { //se o this.limite for +\- limite == 0 ele inicia o tratamento
                throw new ContaExcecao();
            }
            if(limite < 0){ //Aqui é so para o programa apresentar uma mensagem de sucesso cado o usuário consiga sacar
                System.out.println("Saque bem sucedido");
            }
            this.limite += limite;

        } catch (ContaExcecao e) {

            System.out.println(e.toString());

        }

    }

}
