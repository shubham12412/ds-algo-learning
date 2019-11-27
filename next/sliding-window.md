https://www.geeksforgeeks.org/tag/sliding-window/

https://medium.com/outco/how-to-solve-sliding-window-problems-28d67601a66


1) https://www.geeksforgeeks.org/find-the-smallest-window-in-a-string-containing-all-characters-of-another-string/ \
***Fast/Slow window*** ***** TODO code impl ask-in-interview think-again \
https://medium.com/outco/how-to-solve-sliding-window-problems-28d67601a66

These ones have a fast pointer that grows your window under a certain condition.

It will also have a slow pointer, that shrinks the window. Once you find a valid window with the fast pointer, you want to start sliding the slow pointer up until you no longer have a valid window.

2) https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/ ***Fast/Catchup window*** **** \
https://medium.com/outco/how-to-solve-sliding-window-problems-28d67601a66

This is very similar to the first kind, except, instead of incrementing the slow pointer up, you simply move it up the fast pointer’s location and then keep moving the fast pointer up. It sort of “jumps” to the index of the fast pointer when a certain condition is met.

https://www.geeksforgeeks.org/maximize-number-0s-flipping-subarray/

3) https://www.geeksforgeeks.org/find-maximum-possible-stolen-value-houses/ ***Fast/Lagging window*** 

This one is a little different, but essentially the slow pointer is simply referencing one or two indices behind the fast pointer and it’s keeping track of some choice you’ve made.

4) https://www.geeksforgeeks.org/trapping-rain-water/ ***Front/Back window***   O(1) space sol beauty

--------------------------------------------------------------------------------------------------------------------------


1) https://www.geeksforgeeks.org/subarray-no-pair-sum-divisible-k/ ask-in-interview medium *****
