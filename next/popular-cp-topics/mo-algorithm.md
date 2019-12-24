
https://blog.anudeep2011.com/mos-algorithm/


```

currentL = 0
currentR = 0
answer = 0
count[] = 0
for each query:
  // currentL should go to L, currentR should go to R
  while currentL &amp;lt; L:
    remove(currentL)
    currentL++
  while currentL &amp;gt; L:
    add(currentL)
    currentL--
  while currentR &amp;lt; R:
    add(currentR)
    currentR++
  while currentR &amp;gt; R:
    remove(currentR)
    currentR--
  output answer

```


MO’s algorithm is just an order in which we process the queries. We were given M queries, we will re-order the queries in a particular order and then process them. Clearly, this is an offline algorithm. Each query has L and R, we will call them opening and closing. Let us divide the given input array into Sqrt(N) blocks. Each block will be N / Sqrt(N) = Sqrt(N) size. Each opening has to fall in one of these blocks. Each closing has to fall in one of these blocks.

A query belongs to P’th block if the opening of that query fall in P’th block. In this algorithm we will process the queries of 1st block. Then we process the queries of 2nd block and so on.. finally Sqrt(N)’th block. We already have an ordering, queries are ordered in the ascending order of its block. There can be many queries that belong to the same block.

From now, I will ignore about all the blocks and only focus on how we query and answer block 1. We will similarly do for all blocks. All of these queries have their opening in block 1, but their closing can be in any block including block 1. Now let us reorder these queries in ascending order of their R value. We do this for all the blocks.

How does the final order look like?
All the queries are first ordered in ascending order of their block number (block number is the block in which its opening falls). Ties are ordered in ascending order of their R value.



***Now we use the same code stated in previous section and solve the problem. Above algorithm is correct as we did not do any changes but just reordered the queries.***


---------------------------------------------------------------------------------------------------------------------


***Explain where and when we can use above algorithm***

As mentioned, this algorithm is offline, that means we cannot use it when we are forced to stick to given order of queries. 

That also means we cannot use this when there are update operations. Not just that, there is one important possible limitation: We should be able to write the functions add and remove. 

There will be many cases where add is trivial but remove is not. One such example is where we want maximum in a range. As we add elements, we can keep track of maximum. But when we remove elements it is not trivial. Anyways in that case we can use a set to add elements, remove elements and report minimum. In that case the add and delete operations are O(log N) (Resulting in O(N * Sqrt(N) * log N) algorithm).

There are many cases where we can use this algorithm. In few cases we can also use other Data Structures like segment trees, but for few problems using MO’s algorithm is a must.


----------------------------------------------------------------------------------------------------------------------



