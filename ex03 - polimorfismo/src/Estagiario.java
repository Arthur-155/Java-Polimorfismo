//Criar uma classe "Funcionario" com metodo calcularSalario().
//Criar subclasses Gerente e Estagiario, sobrescrevendo calcularSalario().
//No main(), criar um array de Funcionario, inserir objetos das subclasses e chamar
//calcularSalario()

public class Estagiario extends Funcionario {

    public Estagiario(double novoSalario){
        this.salario = novoSalario;
    }

    public void calcularSalario() {
        double imposto = salario * 0.07;
        double valorTotal = salario-imposto;
        System.out.printf("Valor total do salário do estagiário esse mês é: %.2f\n", valorTotal);
    }
}
