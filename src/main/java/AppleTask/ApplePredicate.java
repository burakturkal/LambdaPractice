package AppleTask;

//PART BEHAVIOUR PARAMETERIZATION
@FunctionalInterface
public interface ApplePredicate {

    boolean test(Apple apple); // implemented in both AppleTask.AppleHeavyPredicate and ApplyGreenColorPredicatea

}
