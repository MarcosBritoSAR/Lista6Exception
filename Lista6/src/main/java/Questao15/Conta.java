package Questao15;


public class Conta {

    private static double saldo = 0;
    private double limite = 0;

    public void deposita(double valor ) {
        setSaldo(valor);
    }

    public void saca(double valor ) {
        setLimite((-valor)); // o Valor vai negativo p aestou reduzindo o saldo
    }

    public  static double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo ) {

        Conta.saldo += saldo;

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
                Conta.saldo += limite;
                System.out.println("Saque bem sucedido. Seu saldo é de: " +getSaldo());
               
            }
            
            this.limite += limite;
            
        } catch (ContaExcecao e) {

            System.out.println(e.toString());

        }

    }

}
