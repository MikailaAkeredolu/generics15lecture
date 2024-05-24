package brooklynzoo;
//Class that every clas sin Java inherits from is Object
//Upper Bound
//E,T,Q
public class Cage<T extends Animal & Eats & Runs> {
    private T firstAnimal, secondAnimal;

    public Cage() {
    }

    public Cage(T firstAnimal, T secondAnimal) {
        this.firstAnimal = firstAnimal;
        this.secondAnimal = secondAnimal;
    }

    public void feedCagedAnimals(){
        this.firstAnimal.eats();
        this.secondAnimal.eats();
    }

    //static methods you must specify the generic types
    public static <T extends Animal> boolean isCompatible(T firstAnimal, T secondAnimal){
        return firstAnimal.getType().equals(secondAnimal.getType());
    }

    public T getFirstAnimal() {
        return firstAnimal;
    }

    public void setFirstAnimal(T firstAnimal) {
        this.firstAnimal = firstAnimal;
    }

    public T getSecondAnimal() {
        return secondAnimal;
    }

    public void setSecondAnimal(T secondAnimal) {
        this.secondAnimal = secondAnimal;
    }
}
