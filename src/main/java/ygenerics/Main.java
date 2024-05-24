package ygenerics;

import java.util.ArrayList;
//Why Generics
//Avoid weird casting issues
//Cath bugs at compile time
public class Main {
    public static void main(String[] args) {
            //Without generics
        ArrayList<String> names = new ArrayList();
        //names.add(2);
        names.add("Mike Jones");
        names.add("Immortal Technique");
        names.add("Sean Price");


        String topList =  names.get(0);
        System.out.println(topList);

    }
}
