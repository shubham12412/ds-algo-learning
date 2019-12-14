import java.util.Arrays;

public class BinarySearchLeftmostRightmostWithInsertionPointExample {

  public static void main(String[] args) {
    
    int[] arr = {10, 20, 30,40,50};
    System.out.println(binarySearchRightmost(arr, 41));
    
    

  }
  
  
  public static int binarySearchRightmost(int[] arr, int key) {
    
    //corner cases
    
    if(arr == null || arr.length==0 || key < arr[0]) {
      return -1;
    }
    
    if(key > arr[arr.length-1]) {
      return -arr.length-1;
    }
    
    if(key == arr[arr.length-1]) {
      return arr.length-1;
    }
    
    
    int low = 0;
    int high = arr.length-1;
    
    while(low < high) {
      System.out.print(String.format("(low,high) = (%d,%d) , %s   ===> ", low,high, Arrays.toString(Arrays.copyOfRange(arr, low, high+1))));
      int mid = (low+high+1)/2; //selecting middle from right half when total elements is even
      if(arr[mid] <= key) {
        low = mid;
      }else {
        high = mid-1;
      }
      System.out.println(String.format("(low,high) = (%d,%d), %s", low,high, Arrays.toString(Arrays.copyOfRange(arr, low, high+1))));
    }
    
    if(arr[low] == key) {
      return low;
    }else {
      return -low-2;
    }
    
  }
  
  
  
  
  
  public static int binarySearchLeftmost(int[] arr, int key) {
    
    //corner cases
    
    // key is smaller than all elements present in the array
    if(arr == null || arr.length == 0 || key < arr[0]) {
      return -1;
    }
    
    // key is larger than all elements present in the array
    if (key > arr[arr.length-1]) {
      return -arr.length-1;
    }
    
    if(key == arr[0]) {
      return 0;
    }
    
    
    int low = 0;
    int high = arr.length-1;
    
    while(low<high) {
      System.out.print(String.format("(low,high) = (%d,%d) , %s   ===> ", low,high, Arrays.toString(Arrays.copyOfRange(arr, low, high+1))));
      int mid = (low + high)/2; // selecting middle from left half when total elements is even
      if(key <= arr[mid]) {
        high = mid;
      }else {
        low = mid+1;
      }
      System.out.println(String.format("(low,high) = (%d,%d), %s", low,high, Arrays.toString(Arrays.copyOfRange(arr, low, high+1))));
    }
    if(arr[low] == key) {
      return low;
    }else {
      return -low-1;
    }
    
  }
  
}
