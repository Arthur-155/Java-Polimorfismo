//Criar uma classe "Funcionario" com metodo calcularSalario().
//Criar subclasses Gerente e Estagiario, sobrescrevendo calcularSalario().
//No main(), criar um array de Funcionario, inserir objetos das subclasses e chamar
//calcularSalario().

public class Gerente extends Funcionario{

    public Gerente (double novoSalario, double novosBeneficios, int qtdHoraExtra){
        this.salario = novoSalario;
        this.beneficios = novosBeneficios;
        this.horaExtra = qtdHoraExtra;
    }


    public void calcularSalario() {
        double imposto = salario * 0.07;
        double valorHoraExtra = horaExtra*12.50;
        double valorTotal = (salario-imposto)+valorHoraExtra+beneficios;
        System.out.printf("Valor total do salário do Gerente esse mês é: %.2f\n", valorTotal);
    }
}
