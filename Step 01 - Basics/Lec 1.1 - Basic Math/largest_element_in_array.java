public class largest_element_in_array {
    public static int largest(int[] arr) {
        int largest = arr[0];
        for(int i : arr){
            if(i > largest){
                largest = i;
            }
        }
        return largest;
    }
}
