//Criar uma classe "Calculadora" com um metodo somar().
//Criar versões sobrecarregadas de somar(), aceitando int, double e três números.
//No main(), chamar os diferentes métodos para testar.

public class Calculadora {
    int numero1;
    int numero2;
    int numero3;
    double somaNumero1;
    double somaNumero2;
    double somaNumero3;


    public void somar(int numero1, int numero2){
        this.numero1=numero1;
        this.numero2=numero2;
        System.out.println("Soma entre 2 números: " + (numero1+numero2));
    }

    public void somar(int numero1, int numero2,int numero3){
        this.numero1=numero1;
        this.numero2=numero2;
        this.numero3=numero3;
        System.out.println("Soma entre 3 números: " + (numero1+numero2+numero3));
    }


    public void somar(double numero1, double numero2){
        this.somaNumero1=numero1;
        this.somaNumero2=numero2;
        System.out.println("Soma entre 2 números: " + (numero1+numero2));
    }

    public void somar(double numero1, double numero2, double numero3){
        this.somaNumero1=numero1;
        this.somaNumero2=numero2;
        this.somaNumero3=numero3;
        System.out.println("Soma entre 3 números: " + (numero1+numero2+numero3));
    }


}
