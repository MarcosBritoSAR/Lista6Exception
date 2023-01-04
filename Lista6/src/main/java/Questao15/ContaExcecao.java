
package Questao15;


public class ContaExcecao extends Exception {

    
    @Override
    public String toString() {
        return "<ERRO> saldo insuficiente. "+"Seu saldo é de:"+Conta.getSaldo();
    }
    
}
