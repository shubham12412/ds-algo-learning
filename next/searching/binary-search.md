https://en.wikipedia.org/wiki/Binary_search_algorithm

----------------------------------------------------------------------------------------------------------------------

***Duplicate elements***

***The procedure may return any index whose element is equal to the target value, even if there are duplicate elements in the array.*** 

For example, if the array to be searched was [1,2,3,4,4,5,6,7]  and the target was 4, then it would be correct for the algorithm to either return the 4th (index 3) or 5th (index 4) element. 

The regular procedure would return the 4th element (index 3) in this case. 

It does not always return the first duplicate (consider [1,2,4,4,4,5,6,7] which still returns the 4th element). 

***However, it is sometimes necessary to find the leftmost element or the rightmost element for a target value that is duplicated in the array.*** 

In the above example, the 4th element is the leftmost element of the value 4, while the 5th element is the rightmost element of the value 4. 

The alternative procedure above will always return the index of the rightmost element if such an element exists

------------------------------------------------------------------------------------------------------------------------

