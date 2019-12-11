https://en.wikipedia.org/wiki/Binary_search_algorithm

https://www.geeksforgeeks.org/the-ubiquitous-binary-search-set-1/ todo-impl

----------------------------------------------------------------------------------------------------------------------

***Duplicate elements***

***The procedure may return any index whose element is equal to the target value, even if there are duplicate elements in the array.*** 

For example, if the array to be searched was [1,2,3,4,4,5,6,7]  and the target was 4, then it would be correct for the algorithm to either return the 4th (index 3) or 5th (index 4) element. 

The regular procedure would return the 4th element (index 3) in this case. 

It does not always return the first duplicate (consider [1,2,4,4,4,5,6,7] which still returns the 4th element). 

***However, it is sometimes necessary to find the leftmost element or the rightmost element for a target value that is duplicated in the array.*** 

In the above example, the 4th element is the leftmost element of the value 4, while the 5th element is the rightmost element of the value 4. 

The alternative procedure above will always return the index of the rightmost element if such an element exists

```
function binary_search_leftmost(A, n, T):
    L := 0
    R := n
    while L < R:
        m := floor((L + R) / 2)
        if A[m] < T:
            L := m + 1
        else:
            R := m
    return L

```

```
function binary_search_rightmost(A, n, T):
    L := 0
    R := n
    while L < R:
        m := floor((L + R) / 2)
        if A[m] > T:
            R := m
        else:
            L := m + 1
    return L - 1

```


------------------------------------------------------------------------------------------------------------------------

***Approximate matches***

The above procedure only performs exact matches, finding the position of a target value. 

However, it is trivial to extend binary search to perform approximate matches because binary search operates on sorted arrays. 

For example, binary search can be used to compute, 

for a given value, 

its ***rank (the number of smaller elements)***, \
predecessor (next-smallest element), \
successor (next-largest element), \
and nearest neighbor. 

 Range queries seeking the number of elements between two values can be performed with two rank queries.
 
-------------------------------------------------------------------------------------------------------------------------
