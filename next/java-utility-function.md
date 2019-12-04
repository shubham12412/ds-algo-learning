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

Arrays.binarySearch(array, fromIndex_inclusive, toIndex_exclusive, key);

The insertion point is defined as the point at which the key would be inserted into the array: the index of the first element greater than the key, or a.length if all elements in the array are less than the specified key. 

Note that this guarantees that the return value will be >= 0 if and only if the key is found.

7) 



----------------------------------------------------------------------------------------------------------------------
***important interfaces and some important methods***


1) interface Comparable<T> { int compareTo(T o) }                // ***class natural ordering***

2) interface Comparator<T> { int compare(T o1, T o2); }

3) 
```
interface SortedMap<K,V> extends Map<K,V> { 
  
 K firstKey(); 
 
 K lastKey(); 

 SortedMap<K,V> subMap(K fromKey, K toKey); 
 
 Returns a view of the portion of this map whose keys range from fromKey, inclusive, to toKey, exclusive. 
 (If fromKey and toKey are equal, the returned map is empty.) 
 
 Note: The returned map is backed by this map, so changes in the returned map are reflected in 
 this map, and vice-versa. The returned map supports all optional map operations that this map supports.
 The returned map will throw an IllegalArgumentException on an attempt to insert a key outside its range.
 
 
 SortedMap<K,V> headMap(K toKey);
 
 Returns a view of the portion of this map whose keys are strictly less than toKey.
 
 
 SortedMap<K,V> tailMap(K fromKey);
 
 Returns a view of the portion of this map whose keys are greater than or equal to fromKey.
 
}
```
small finding : In java generally range is half closed , start is inclusive, end is exclusive

-----------------------------------------------------------------------------------------------------------------------
  


