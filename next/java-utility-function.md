import java.util.Arrays; \
import java.util.Collections; 


1) Arrays.fill(array, 0); 

2) System.arraycopy(src, srcPos, dest, destPos, length);

3) Arrays.stream(arr).max().getAsInt()

4) Arrays.sort(arr, Collections.reverseOrder()); \
Arrays.sort(arr, from_Index, to_Index); //from_index inclusive , to_index exclusive

5) Arrays.copyOf(original, newLength); \
  Arrays.copyOfRange(original, from, to);   //from inclusive, to exclusive

6)  Arrays.binarySearch(array, key); \
return value : index of the search key, if it is contained in the array; otherwise, (-(insertion point) - 1). 

The insertion point is defined as the point at which the key would be inserted into the array: the index of the first element greater than the key, or a.length if all elements in the array are less than the specified key. 

Note that this guarantees that the return value will be >= 0 if and only if the key is found.

7) 



--------------------------------------------------------------------------------------------------------------------

1) interface Comparable<T> { int compareTo(T o) }                // ***class natural ordering***
