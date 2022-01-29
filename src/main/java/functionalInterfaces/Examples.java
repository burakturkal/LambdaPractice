package functionalInterfaces;

import java.util.function.*;

//this class to show Ready-To-Use java functional interfaces
public class Examples {

    public static void main(String[] args) {


        //---------PREDICATE EXAMPLE----------->We'll use this a lot

            /*  Writing with Anonymous Class
            Predicate<Integer> lesserThan = new Predicate<Integer>() {
                @Override
                public boolean test(Integer integer) { //this is not an object of Predicate. This
                    return integer<18;                 //is "anonymous class"
                }
            };

            lesserThan.test(50);
            //this test method is predefined in Predicate interface. You can find the name in the documentation


             */

            //Writing with Lambda
        Predicate<Integer> lesserThan = a -> a<18; //-> implementation of test method that belongs to Predicate Interface
        System.out.println( lesserThan.test(50) ); //50 is a behavior here

        //----------END PREDICATE--------------





        //---------CONSUMER EXAMPLE---------------

            //CTRL + Click to see details about Consumer. We see there is one method "Accept" and it is void

        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(50); //50 here is a behavior. You can pass many behavior

        //---------END CONSUMER--------------




        //--------BICONSUMER EXAMPLE-------------

        BiConsumer<Integer,Integer> addTwo = (x,y) -> System.out.println(x+y);
        addTwo.accept(100,200);

        //--------END BICONSUMER-----------------




        //---------FUNCTION EXAMPLE--------------
        Function<String,String> fun = s->"Hello " + s;
        String str = fun.apply("Burak");
        System.out.println(str);
            //or you can just say sout(fun.apply("Burak") instead of last two lines

        //---------END FUNCTION-----------------



        //---------SUPPLIER EXAMPLE-------------
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());












    }
}
