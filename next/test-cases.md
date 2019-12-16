Array

1) multiple duplicates   :   {2, 2, 2, 2, 3, 2, 2, 2, 2}

2) in binary search when 2 element left, use following observation in other problems also to verify correctness and infinite loop

mid = (low+high)/2;

when 2 element left then mid is always equal to low , so write code carefully while keeping this thing in mind, otherwise
infinite loop may occur , if you don't handle it properly

always keep above point in mind, and always check whether in each iteration your interval is shrinking or not.


3) e.g. https://www.geeksforgeeks.org/find-the-maximum-element-in-an-array-which-is-first-increasing-and-then-decreasing/

https://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/

In many cases binary-search like solution will only ***when all elements are distinct***, it ***will not work when it contains duplicate elements***.  when it contain duplicate then we can't take decision that whether we ignore left or right.


----------------------------------------------------------------------------------------------------------------
