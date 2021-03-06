package OrangeTask_AfterAppleTask;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class OrangeTest {
    public static void main(String[] args) {
        List<Orange> inventory = new ArrayList<>();
        inventory.add(new Orange(300,Color.GREEN));
        inventory.add(Orange.builder().weight(200).color(Color.GREEN).build()); //We delete GREEN and it's going to be NULL or default. It won't give error
        inventory.add(Orange.builder().weight(100).color(Color.RED).build());
        inventory.add(Orange.builder().weight(500).color(Color.RED).build());
        inventory.add(Orange.builder().weight(300).color(Color.GREEN).build());

        /*
        You can define the behavior like below as simpleFormatter. This is lambda. You can also see this in
        fancyFormatter below. But you can also simplify it more
        and write the behavior directly inside the method call.

        simpleFormatter and fancyFormatter here are the behavior names
         */
        OrangeFormatter simpleFormatter = /*( */ /*Orange */ orange /*) */ -> "An orange of " + orange.getWeight() + "g"; //return is string because that's the return of interface

       // prettyPrintApple(inventory, simpleFormatter);
        prettyPrintApple(inventory, orange ->"An orange of " + orange.getWeight() + "g");

        System.out.println("---------------------------");

        OrangeFormatter fancyFormatter = orange ->{
            String characteristic = orange.getWeight()>150 ? "Heavy" : "Light";
            return "A" + characteristic + " " + orange.getColor() + "orange";
        };

        prettyPrintApple(inventory, fancyFormatter);

        weightyPrintApple(inventory, orange24 -> "Weight: An orange of " + orange24.getWeight() + "g" );
    }



    private static void prettyPrintApple(List<Orange> inventory, OrangeFormatter orangeFormatter){
        for(Orange orange25 : inventory){
            String output = orangeFormatter.accept(orange25);
            System.out.println(output);
        }
    }

    private static void weightyPrintApple(List<Orange> inventory, Function<Orange, String> trial){
        for(Orange orange25 : inventory){
            String output = trial.apply(orange25);
            System.out.println(output);
        }
    }
}
