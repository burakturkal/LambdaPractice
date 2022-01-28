public class ArraySorting {

    public static void main(String[] args) {

        //-----------------BEHAVIOUR PARAMETERIZATION
        ArraySorting as = new ArraySorting();


        QuickSort qs = new QuickSort(); //new object of QuickSort
        BubbleSort bs = new BubbleSort(); //new object of BubbleSort
        as.sort(qs);
        as.sort(bs);

        //-----------------B.P. ENDS HERE

        /*

        WHY DON'T WE JUST WRITE qs.sort(); INSTEAD?
        Because if we do it that way, we have to adjust it in the main method everytime
        the requirement changes.

        */


        // -------------LAMBDA STARTS HERE
        /*
        Lambda is a different way of writing the B.P. With BP. we need to write an interface,but also
        classes for each scenario. However, you just need a functional interface (meaning an interface
        with only one methods).

         */
        //Here below, quickSort and bubbleSort are actions. Above, we have to make new QuickSort(), but here we didnt
        Sorting quickSort = () -> System.out.println("Quick Sorting-2");
        as.sort(quickSort);

        Sorting bubbleSort = () -> System.out.println("Bubble sorting-2");
        as.sort(bubbleSort);
    }

  /*  private void quick_sort() {
        System.out.println("Quick Sorting Array");

        There are different ways to sort an array. This one will do only quick sorting.
        So either you'll write all the sorting methods in this or the ideal way to do
        it is this sort method and I can pass my action here inside and then I'll get
        the result according to action you pass. See the method below. This came with
        Java 8
         */

         /*
         We used to use Behaviour Parameterization before Java 8 because it depends on
         basic OOP concepts so we always had it even before Java8.

    }
*/

    private void sort(Sorting sorting){
        sorting.sort(); //passing sorting interface here
    }
}


