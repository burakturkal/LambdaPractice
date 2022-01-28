public class ArraySorting {

    public static void main(String[] args) {

        //BEHAVIOUR PARAMETERIZATION
        ArraySorting as = new ArraySorting();

        QuickSort qs = new QuickSort(); //this is a behaviour now
        BubbleSort bs = new BubbleSort();
        as.sort(qs);
        as.sort(bs);

        //Initializing the Lambda



        //Here below, quickSort and bubbleSort are actions. Above, we have to make new QuickSort(), but here we didnt
        Sorting quickSort = () -> System.out.println("Quick Sorting");
        as.sort(quickSort);

        Sorting bubbleSort = () -> System.out.println("Bubble sorting");
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


