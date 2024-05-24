package brooklynzoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {

        Monkey monkey1 = new Monkey();
        Monkey monkey2 = new Monkey();
        Cage.isCompatible(monkey1, monkey2);

        Cage<Monkey> cageOfMonkeys = new Cage<Monkey>();
       // cageOfMonkeys.feedCagedAnimals();

        //Cage<FakeAnimal> cageOfFakes = new Cage<FakeAnimal>();
       // Cage<RoboDog> cageOfLions = new Cage<RoboDog>();
//        cageOfMonkeys.setFirstAnimal(new Monkey());
          // Cage<Lion> cageOfLions = new Cage<Lion>(new Lion(), new Monkey());

        //Fix issue later
        //Cage<String>gCage = new Cage<>();

        List<Integer> intNumbers = new ArrayList<>();
        intNumbers.add(1);  intNumbers.add(2);  intNumbers.add(3);

        List<Double> dubNumbers = new ArrayList<>();
        dubNumbers.add(1.0);  dubNumbers.add(2.0);  dubNumbers.add(3.0);

        List<String> text = new ArrayList<>();
        text.add("1.0");  text.add("2.0");  text.add("3.0");

        List<Object> numbers = new ArrayList<>();
        numbers.add(22.0);    numbers.add(222.0);

//       printList(intNumbers);
//       printList(dubNumbers);
        //printList(numbers);

    }

    //UpperBound
//    public static void printList(List<? extends Number>  list){
//        System.out.println(list);
//    }

    //LowerBound
    public static void printList(List<? super Number>  list){
        System.out.println(list);
    }

}
