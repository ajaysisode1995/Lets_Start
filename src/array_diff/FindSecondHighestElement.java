package array_diff;

public class FindSecondHighestElement {
	public static void main(String[] args) {
       
        
        int arr[] = { 4, 9, 61, 2, 8, 5, 1, 9 };
        int temp;
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            
        }
        System.out.println("Second Highest number in the array is:" + arr[size-2]);
    }
}
