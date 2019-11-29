import java.util.Arrays;

/**
 * @author shubham chaudhary
 * @date 29 Nov 2019
 * */
public class MergeSort {
  
  public static void main(String[] args) {
    int[] arr = { 3, 2, 1, 6, 5, 4, 1, 2, 3, 4, 5, 6 };
    new MergeSort().mergeSort(arr);
    System.out.println(Arrays.toString(arr));
  }

  public void mergeSort(int[] arr) {
    if (arr == null || arr.length <= 1) {
      return;
    }
    int[] temp = new int[arr.length];
    mergeSortRec(arr, 0, arr.length - 1, temp);
  }

  private void mergeSortRec(int[] arr, int start, int end, int[] temp) {

    if (start < end) {
      int mid = (start + end) / 2;
      mergeSortRec(arr, start, mid, temp);
      mergeSortRec(arr, mid + 1, end, temp);
      merge(arr, start, mid, end, temp);
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

