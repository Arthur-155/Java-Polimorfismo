//Criar uma classe "Animal" com um metodo fazerSom().
//Criar subclasses Cachorro e Gato que sobrescrevem fazerSom().
//No main(), instanciar um Animal, um Cachorro e um Gato e chamar fazerSom().

public class Cachorro extends Animal{

    @Override
    public void fazerSom() {
        System.out.println("au au");
    }
}
