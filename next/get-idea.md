1) use input array for visited array => O(1), mark element negative for visited \
precondition : max - min + 1 <= n \
preprocessing : index = arr[i] - min

https://www.geeksforgeeks.org/check-if-array-elements-are-consecutive/


2) to check if all elment of subarray is consecutive, max-min+1 = subarray_length

https://www.geeksforgeeks.org/length-largest-subarray-contiguous-elements-set-1/

3) recursive call stack variable to iterative stack 

https://www.geeksforgeeks.org/iterative-quick-sort/    

4) https://www.geeksforgeeks.org/check-if-any-two-intervals-overlap-among-a-given-set-of-intervals/

https://www.geeksforgeeks.org/find-the-point-where-maximum-intervals-overlap/

idea arr[start]++ and arr[end+1]-- => count overlap , also can count max interval overlap

check physical meaning of it , check-again, think-again

***prefix sum give you => no of interval which is open but not closed yet***

***could think like no of open parenthesis for which closed parenthesis not seen yet***

5) geeksforgeeks.org/find-surpasser-count-of-each-element-in-array/ 

inversion like idea , explore more this trick

6) https://www.geeksforgeeks.org/find-a-repeating-and-a-missing-number/

7) https://www.geeksforgeeks.org/given-a-sorted-and-rotated-array-find-if-there-is-a-pair-with-a-given-sum/

index incremented or decremented in rotational manner (modular arithmetic)

 l = (l + 1) % n; 
 
 r = (n + r - 1) % n;
 
 // Keep moving either l or r till they meet 
 
 while (l != r) {}
 
 corner case for all pair
 
 ```
 if (arr[l] + arr[r] == x) 
        { 
            cnt++; 
              
            // This condition is required  
            // to be checked, otherwise  
            // l and r will cross each  
            // other and loop will never  
            // terminate. 
            if(l == (r - 1 + n) % n) 
            { 
                return cnt; 
            } 
              
            l = (l + 1) % n; 
            r = (r - 1 + n) % n; 
        } 
 ```
 
 8) https://www.geeksforgeeks.org/search-an-element-in-an-array-where-difference-between-adjacent-elements-is-1/  \
 https://www.geeksforgeeks.org/efficient-search-in-an-array-where-difference-between-adjacent-is-1/ \
https://www.geeksforgeeks.org/searching-array-adjacent-differ-k/

 
