//Criar uma classe "ContaBancaria" com metodo sacar().
//Criar subclasses ContaCorrente e ContaPoupanca, sobrescrevendo sacar().
//Criar um main() para instanciar e testar os métodos.

public class Main {
    public static void main(String[] args) {
        //ContaCorrente contaCorrente = new ContaCorrente();
        //contaCorrente.sacar();

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.sacar();
    }
}