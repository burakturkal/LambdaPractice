
/*
public void sort(action){
        action()
        }

        Lambda are just functions. They don't belong to any class. They can assuma as values

        String name = "Ozzy";
        abc = public void sort(){  ---> this doesn't look like lambda
        Systemout.println("Quicksorting");
        }

        Correct Lambda is this:

        abc = () ->{
        Systemout.println("Quicksorting");
        }

        you can write this in one line: abc= () -> {Systemout.printlin("Quicksorting");}
        If it is one line of Lambda, you can also remove curly brackets: abc= () -> Systemout.printlin("Quicksorting")

public void sort(abc) {
        abc()
        }

        or you don't even have to write abc, you can just write this instead:

public void sort(Systemout.printlin("Quicksorting");) {
        abc()
        }


        ---

        Fuction(lambda) that takes parameters:

        For this:

        weightApple = public boolean test (Apple apple){
        return apple.getWeight()>200;
        }

        Turning above into Lambda

        weightApple= (Apple apple) -> apple.getWeight()>200;

        ---

        Another example: return length:  lengthCount = (String s) -> s.length;
        Another example:

        myFunction = (int x,int y) -> {
        System.out.println("Result");
        System.out.println(x+y);
        }

        Another example: myLambda = () -> 42;   // just return 42

----

Creating Lambda:

Step 1: Create a new interace

Step 2: Create a method with the exact same signature of Lambda expression

interface MyLambdaType{
    void print();
}
MyLambdaType myLambda = () -> System.out.print("Sorting the array");


---

When to use Lambda: when there is a functional interface
Functional interface is an interface that soecifies exactly one abstract method. If there is
more than one abstract method, you can't use lambda

To make sure no more than one method is added by other people, you can add
@FunctionalInterface. It gives an error if you have more than one method. Example:

@FunctionInterface
public interface Sorting{
    public void sort();
   }


Type Inference:

interface StringLengthLambda{
    int getLength(String s);
}

StringLengthLambda myLambda = (String s) -> s.length;   // you don't have to write the type ::type inference
StringLengthLambda myLambda = (s) -> s.length; //

another example


weightApple = (apple) -> apple.getWeight()>200

If you have only one argument, no need parantheses

StringLengthLambda myLambda = s -> s.length;
weightApple = apple -> apple.getWeight()>200




--- end of Lambda



















 */








































public class LambdaReview {

}
