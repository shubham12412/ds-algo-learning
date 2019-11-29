import java.util.Arrays;

/**
 * @author shubham chaudhary
 * @date 29 Nov 2019
 * */
public class IterativeMergeSort {
  
  public static void main(String[] args) {
    int[] arr = { 3, 2, 1, 6, 5, 4, 1, 2, 3, 4, 5, 6,0,0,-2,-10,1000 };
    new IterativeMergeSort().mergeSort(arr);
    System.out.println(Arrays.toString(arr));
  }

  public void mergeSort(int[] arr) {
    if (arr == null || arr.length <= 1) {
      return;
    }
    int[] temp = new int[arr.length];
    
    int n = arr.length;
    
    for(int width=1; width<n; width*=2) {
      
      for(int left=0; left<n; left+= 2*width) {
        
        int right = left + 2*width - 1;
        int  mid = (left + right)/2;
        
        if(mid < n-1) {
          right= Math.min(right, n-1);
          merge(arr, left, mid, right, temp);  
        }
   
      }
      
    }
    
  }

  private void merge(int[] arr, int start, int mid, int end, int[] temp) {
    System.arraycopy(arr, start, temp, start, end - start + 1);
    int i = start, j = mid + 1;
    for (int k = start; k <= end; k++) {
      if (i <= mid && (j > end || temp[i] <= temp[j])) {
        arr[k] = temp[i];
        i++;
      } else {
        arr[k] = arr[j];
        j++;
      }
    }
  }

}
