package functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

//        users.add(new User ("Harry" , "Potter", 20));
//        users.add(new User ("Ronald" , "Enom", 20));
//        users.add(new User ("Hermonie" , "Granger", 20));

        users.add(User.builder().firstName("Harry").lastName("Potter").age(20).build());
        users.add(User.builder().firstName("Ronald").lastName("Wishley").age(20).build());
        users.add(User.builder().firstName("Hermonie").lastName("Granger").age(20).build());
        users.add(User.builder().firstName("Draco").lastName("EMalfoy").age(20).build());



        //Print all elements in the list - user list
        printName(users, anything -> true);



        //Print all users whose last name starts with E
        printName (users, user -> user.getLastName().startsWith("E"));


    }

    //accept method
    public static void printName(List<User> users, Predicate<User> p){
        for(User user : users){
            if(p.test(user)){
                System.out.println(user.toString());
            }
        }
    }
}

