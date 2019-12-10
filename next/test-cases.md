Array

1) multiple duplicates   :   {2, 2, 2, 2, 3, 2, 2, 2, 2}

2) in binary search when 2 element left, use following observation in other problems also to verify correctness and infinite loop

mid = (low+high)/2;

when 2 element left then mid is always equal to low , so write code carefully while keeping this thing in mind, otherwise
infinite loop may occur , if you don't handle it properly

always keep above point in mind, and always check whether in each iteration your interval is shrinking or not.



----------------------------------------------------------------------------------------------------------------
