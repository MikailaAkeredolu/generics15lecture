package brooklynzoo;
//Class that every clas sin Java inherits from is Object

//E,T,Q
public class Cage<T> {
    private T firstAnimal, secondAnimal;

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
