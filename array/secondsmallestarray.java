public class secondsmallestarray {

    public static void main(String args[])
    {
        int arr[] = { 20, 40, 10, 12, 5, 50 };
        int n = arr.length;
       int smallest = Integer.MAX_VALUE;


        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest) {
        smallest = arr[i];
            }
        }
        System.out.println("smallest element is: " + smallest);

        int second_smallest = Integer.MAX_VALUE;

         //traversing the array to find second smallestelement
        for (int i = 0; i < n; i++) {
            if (arr[i] < second_smallest && arr[i] > smallest) {
                second_smallest = arr[i];
            }
        }
        System.out.println("second smallest element is: " + second_smallest);
    }
}



