//PART BEHAVIOUR PARAMETERIZATION

import java.util.ArrayList;
import java.util.List;

public class AppleTest {
    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<Apple>();

        //Adding some test data
        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(200,Color.GREEN));
        inventory.add(new Apple(50,Color.RED));

        List<Apple> heavyApple = filterApples(inventory, new AppleHeavyPredicate()); //Behaviour is here
        System.out.println(heavyApple); //this is to test HEAVY Behaviour -- will return anything more than 200

        System.out.println("------------------------");


        List<Apple> greenApple = filterApples(inventory,new AppleGreenColorPredicate());
        System.out.println(greenApple);



    }

    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate){
        //for parameters ( Test Data, Interface )
        //We use interface to be able to call every child class (requirements)
        List<Apple> result = new ArrayList<>();

        for(Apple apple : inventory){
            if(applePredicate.test(apple)){ //calling the method in interface
                result.add(apple);
            }
        }
        return result;
    }
}