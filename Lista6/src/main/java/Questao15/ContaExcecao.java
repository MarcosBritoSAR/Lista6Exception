
package Questao15;


public class ContaExcecao extends Exception {

    
    @Override
    public String toString() {
        return "<ERRO> saldo insuficiente. "+"Seu saldo é de:"+Conta.getSaldo(); //Os métodos que eu declar como statico na classe conta eu posso acessar por aqui
        //entao usei isso pra acessar meu saldo 
    }
    
}
