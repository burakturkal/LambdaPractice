package AppleTask;//PART BEHAVIOUR PARAMETERIZATION

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AppleTest {
    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<Apple>();

        //Adding some test data
        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(100, Color.RED));
        inventory.add(new Apple(200, Color.GREEN));
        inventory.add(new Apple(50, Color.RED));

        /* for BEHAVIOR PARAM.

        List<AppleTask.Apple> heavyApple = filterApples(inventory, new AppleTask.AppleHeavyPredicate()); //Behaviour is here
        System.out.println(heavyApple); //this is to test HEAVY Behaviour -- will return anything more than 200

        System.out.println("------------------------");


        List<AppleTask.Apple> greenApple = filterApples(inventory,new AppleTask.AppleGreenColorPredicate());
        System.out.println(greenApple);


         */
        System.out.println("------------------------");

        List<Apple> greenApple = filterApples(inventory, anything -> anything.getColor().equals(Color.GREEN));
        System.out.println(greenApple);

    }

    /*  for BEHAVIOR PARAM.
    private static List<AppleTask.Apple> filterApples(List<AppleTask.Apple> inventory, AppleTask.ApplePredicate applePredicate){
        //for parameters ( Test Data, Interface )
        //We use interface to be able to call every child class (requirements)
        List<AppleTask.Apple> result = new ArrayList<>();

        for(AppleTask.Apple apple : inventory){
            if(applePredicate.test(apple)){ //calling the method in interface
                result.add(apple);
            }
        }
        return result;
    }

    */


    // Below For LAMBDA
    private static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> applePredicate){

        List<Apple> result = new ArrayList<>();

        for(Apple apple : inventory){
            if(applePredicate.test(apple)){ //calling the method in interface
                result.add(apple);
            }
        }
        return result;
    }

}