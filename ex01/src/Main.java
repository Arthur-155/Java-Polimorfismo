//Criar uma classe "Animal" com um metodo fazerSom().
//Criar subclasses Cachorro e Gato que sobrescrevem fazerSom().
//No main(), instanciar um Animal, um Cachorro e um Gato e chamar fazerSom().

public class Main {
    public static void main(String[] args) {
        Animal novoAnimal = new Animal();
        novoAnimal.fazerSom();
        Cachorro novoCachorro = new Cachorro();
        novoCachorro.fazerSom();
        Gato novoGato = new Gato();
        novoGato.fazerSom();
    }
}