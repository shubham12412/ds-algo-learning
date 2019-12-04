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

4) 
```
interface NavigableMap<K,V> extends SortedMap<K,V> {

  Note: A SortedMap extended with navigation methods returning the closest matches for 
  given search targets. Methods lowerEntry, floorEntry, ceilingEntry, and higherEntry 
  return Map.Entry objects associated with keys respectively less than, less than or equal, 
  greater than or equal, and  greater than a given key, returning null if there is no such key. 
  
  Similarly, methods lowerKey, floorKey, ceilingKey, and higherKey  return only the associated 
  keys. All of these methods     are designed for locating, not traversing entries.

  A NavigableMap may be accessed and traversed in either ascending or descending key order. 

  Methods subMap, headMap, and tailMap differ from the like-named SortedMap methods in accepting 
  additional arguments describing whether lower and upper bounds are inclusive versus exclusive. 
  
  This interface additionally defines methods firstEntry, pollFirstEntry, lastEntry, and pollLastEntry 
  that return and/or remove the least and greatest mappings, if any exist, else returning null
  
  
  
  Map.Entry<K,V> lowerEntry(K key);
  
  Returns a key-value mapping associated with the greatest 
  key strictly less than the given key, or null if there is no such key.
  
  K lowerKey(K key);
  
  Map.Entry<K,V> floorEntry(K key);
  
  Returns a key-value mapping associated with the greatest key
  less than or equal to the given key or null if there is no such key.
  
  K floorKey(K key);
  
  Map.Entry<K,V> ceilingEntry(K key);
  
  Returns a key-value mapping associated with the least key greater 
  than or equal to the given key, or null if there is no such key.
  
  K ceilingKey(K key);
  
  Map.Entry<K,V> higherEntry(K key);
  
  Returns a key-value mapping associated with the least key strictly greater
  than the given key, or null if there is no such key
  
  K higherKey(K key);
  
  Map.Entry<K,V> firstEntry();
  
  Map.Entry<K,V> lastEntry();
  
  Map.Entry<K,V> pollFirstEntry();
  
  Removes and returns a key-value mapping associated with the least key in 
  this map, or null if the map is empty.
  
  Map.Entry<K,V> pollLastEntry();
  
  Removes and returns a key-value mapping associated with the greatest key in 
  this map, or null if the map is empty.
  
  NavigableMap<K,V> descendingMap();
  
  NavigableSet<K> descendingKeySet()
  
  NavigableSet<K> navigableKeySet();
  
  NavigableMap<K,V> subMap(K fromKey, boolean fromInclusive,
                             K toKey,   boolean toInclusive);
  
  NavigableMap<K,V> headMap(K toKey, boolean inclusive);
  
  NavigableMap<K,V> tailMap(K fromKey, boolean inclusive);
  
}

-----------------------------------------------------------------------------------------------------------------------
  


