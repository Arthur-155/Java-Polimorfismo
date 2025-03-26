//Criar uma classe "Pagamento" com metodo processarPagamento().
//Criar subclasses PagamentoCartao e PagamentoPix, sobrescrevendo processarPagamento().
//Criar um main() para testar os métodos.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcoes;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a forma de pagamento ?: ");
        System.out.println("1-Cartão (débito/crédito)");
        System.out.println("2 - Pix");
        opcoes = scanner.nextInt();

        switch(opcoes){
            case 1:
                PagamentoCartao pagandoComCartao = new PagamentoCartao();
                pagandoComCartao.processarPagamento();
                break;
            case 2:
                PagamentoPix pagandoComPix = new PagamentoPix();
                pagandoComPix.processarPagamento();
                break;
        }
    }
}