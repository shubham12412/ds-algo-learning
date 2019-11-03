
### keywords to keep in mind : 

***most recently*** \
***last*** \
***latest***\
***reverse*** \
***backtracking***


***pipe whose one end is closed and other is open***

***function call (call stack)*** \
***recursive function call*** \
***balance parenthesis*** \
***reverse word*** \
***undo operation*** \
***back functionality in browser*** \
***dfs(depth first search)***

-----------------------------------------------------------------------------------------------------------------

***A stack or LIFO (last in, first out) is an abstract data type that serves as a collection of elements, with two principal operations: push, which adds an element to the collection, and pop, which removes the last element that was added***. In stack both the operations of push and pop takes place at the same end that is top of the stack.


https://www.geeksforgeeks.org/overview-of-data-structures-set-1-linear-data-structures/

https://en.wikipedia.org/wiki/Stack_(abstract_data_type)

https://www.geeksforgeeks.org/stack-data-structure/


***Stacks are used for maintaining function calls (the last called function must finish execution first)***, we can always remove recursion with the help of stacks. ***Stacks are also used in cases where we have to reverse a word, check for balanced parenthesis and in editors where the word you typed the last is the first to be removed when you use undo operation. Similarly, to implement back functionality in web browsers.***

-------------------------------------------------------------------------------------------------------------------------

1) https://www.geeksforgeeks.org/check-for-balanced-parentheses-in-an-expression/

(new insight : using doubly linked list, remove smaller chunk of balanced parenthesis)

=> above thinking leads to one end tube (stack) (gather all unprocessed along the path in one end tube)

=> (left parenthesis on stack represent no of left open bracket for which right bracket is not seen therefore instaed of stack we can used simply counter which represent no of left open braces)

2) https://www.geeksforgeeks.org/next-greater-element/
 
 https://www.geeksforgeeks.org/next-greater-frequency-element/

https://www.geeksforgeeks.org/number-nges-right/

https://www.geeksforgeeks.org/maximum-product-of-indexes-of-next-greater-on-left-and-right/  (ask in interview ,solve in one pass, only one stack )

https://www.geeksforgeeks.org/the-stock-span-problem/   (previous greater element, solve without stack , you only have input[] and output[] array)

3) 




