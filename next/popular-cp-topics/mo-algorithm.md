MO’s algorithm is just an order in which we process the queries. We were given M queries, we will re-order the queries in a particular order and then process them. Clearly, this is an offline algorithm. Each query has L and R, we will call them opening and closing. Let us divide the given input array into Sqrt(N) blocks. Each block will be N / Sqrt(N) = Sqrt(N) size. Each opening has to fall in one of these blocks. Each closing has to fall in one of these blocks.

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
