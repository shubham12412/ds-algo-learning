import java.util.Arrays;
import java.util.Collections; 


1) Arrays.fill(array, 0); 

2) System.arraycopy(src, srcPos, dest, destPos, length);

3) Arrays.stream(arr).max().getAsInt()

4) Arrays.sort(arr, Collections.reverseOrder()); \
Arrays.sort(arr, from_Index, to_Index); //from_index inclusive , to_index exclusive

5) Arrays.copyOf(original, newLength); \
  Arrays.copyOfRange(original, from, to);   //from inclusive, to exclusive
