//Criar uma classe "Pagamento" com metodo processarPagamento().
//Criar subclasses PagamentoCartao e PagamentoPix, sobrescrevendo processarPagamento().
//Criar um main() para testar os métodos.

import java.util.Scanner;

public class PagamentoCartao extends Pagamento{


    @Override
    public void processarPagamento() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o saldo da sua conta bancária: ");
        saldo = scanner.nextDouble();
        System.out.println("Qual valor da compra que deseja realizar");
        valor = scanner.nextDouble();
        System.out.println("Deseja realizar o pagamento com: ");
        System.out.println("1 - Crédito");
        System.out.println("2 - Débito");
        escolha = scanner.nextInt();

        switch(escolha){
            case 1:
                System.out.println("Você escolheu pagar com o crédito");
                System.out.println("Valor Saldo: " + saldo);
                System.out.println("Valor divida crédito: "+ valor);
                break;
            case 2:
                System.out.println("Você escolheu pagar com o débito");
                System.out.println("Valor do saldo: " + (saldo-valor));
                System.out.println("Valor divida crédito: 0");
                break;
        }
    }
}