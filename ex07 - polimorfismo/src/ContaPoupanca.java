//Criar subclasses ContaCorrente e ContaPoupanca, sobrescrevendo sacar().
//Criar um main() para instanciar e testar os métodos.

import java.util.Scanner;

public class ContaPoupanca extends contaBancaria {

    @Override
    public void sacar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual valor você tem Guardado ?");
        saldo = scanner.nextDouble();

        System.out.println("Tem certeza que deseja tirar dinheiro da sua poupança ?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        escolha = scanner.nextInt();
        switch (escolha){
            case 1:
                System.out.println("Qual é o valor que deseja sacar ?");
                valorSacado = scanner.nextDouble();
                if(saldo < valorSacado){
                    System.out.println("Você está tentando sacar mais do que tem guardado!");
                }else{
                    saldoFinal = saldo - valorSacado;
                    System.out.println("Você sacou: " + valorSacado);
                    System.out.println("Novo saldo guardado: "+ saldoFinal);
                }
                break;
            case 2:
                System.out.println("Encerrando...");
                System.exit(0);
                break;
        }


    }
}
