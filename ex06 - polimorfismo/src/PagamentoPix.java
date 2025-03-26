//Criar uma classe "Pagamento" com metodo processarPagamento().
//Criar subclasses PagamentoCartao e PagamentoPix, sobrescrevendo processarPagamento().
//Criar um main() para testar os métodos.

import java.util.Scanner;

public class PagamentoPix extends Pagamento{

    @Override
    public void processarPagamento() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o saldo da sua conta bancária: ");
        saldo = scanner.nextDouble();
        System.out.println("Qual valor da compra que deseja realizar");
        valor = scanner.nextDouble();
        if(saldo<valor){
            System.out.println("Você não tem valor suficiente para realizar a compra!");
            System.out.println("Compra cancelada!");
            System.exit(0);
        }
        System.out.println("Deseja realizar o pagamento com pix ?: ");
        System.out.println("1 - Sim");
        System.out.println("2 - Não, me arrependi");
        escolha = scanner.nextInt();

        if(escolha == 1){
            System.out.println("Você escolheu pagar com o pix");
            System.out.println("Valor Saldo: " + (saldo-valor));
        }else if(escolha == 2){
            System.out.println("Compra cancelada!");
        }
    }
}
