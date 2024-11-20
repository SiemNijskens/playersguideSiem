package Players_guide;

public class Challenge19 {
    public static void main(String[] args) {
        int[] array = { 4, 51, -7, 13, -99, 15, -8, 45, 90 };
        int currentSmallest = Integer.MAX_VALUE; // Start higher than anything in the array.
        for (int element: array){
            if (element < currentSmallest)
                currentSmallest = element;
        }
        System.out.println(currentSmallest);

        /*(int index = 0; index < array.length; index++)
        {
            if (array[index] < currentSmallest)
                currentSmallest = array[index];
        }
        System.out.println(currentSmallest);*/

        int total = 0;
        for (int element: array){
            total += element;
        }

        double average = (double)total / array.length;
        System.out.println(average);

        /*  (int index = 0; index < array.length; index++)
        // total += array[index];

        //double average = (double)total / array.length;
        //System.out.println(average);

        */
    }
}
