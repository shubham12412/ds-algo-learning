
//Arrays.binarySearch(a, key);
//code copied from java.util.Arrays class
public class BinarySearch {

  public static int binarySearch(int[] a, int key) {
    return binarySearch0(a, 0, a.length, key);
  }
  
  
  /**
   * return :
   * 
   * index of the search key, if it is contained in the array; 
   * otherwise, (-(insertion point) - 1). 
   * 
   * The insertion point is defined as the point at which the key would be inserted into 
   * the array: the index of the first element greater than the key, or a.length 
   * if all elements in the array are less than the specified key. 
   * 
   * Note that this guarantees that the return value will be >= 0 
   * if and only if the key is found.
   * 
   * */
  private static int binarySearch0(int[] a, int fromIndex, int toIndex, int key) {
    int low = fromIndex;
    int high = toIndex - 1;

    while (low <= high) {
      int mid = (low + high) >>> 1;
      int midVal = a[mid];

      if (midVal < key)
        low = mid + 1;
      else if (midVal > key)
        high = mid - 1;
      else
        return mid; // key found
    }
    return -(low + 1); // key not found.
  }

}
