//Criar subclasses ContaCorrente e ContaPoupanca, sobrescrevendo sacar().
//Criar um main() para instanciar e testar os métodos.

import java.util.Scanner;

public class ContaCorrente extends contaBancaria{




    @Override
    public void sacar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual valor você tem disponível ?");
        saldo = scanner.nextDouble();
        System.out.println("Qual é o valor que deseja sacar ?");
        valorSacado = scanner.nextDouble();
        if(saldo < valorSacado){
            System.out.println("Você está tentando sacar um dinheiro que não tem!");
        }else{
            saldoFinal = saldo - valorSacado;
            System.out.println("Você sacou: " + valorSacado);
            System.out.println("Novo saldo: "+ saldoFinal);
        }
    }
}
