# BinaryHeap

A simple Java implementation of a binary Min-Heap.
The Min-Heap is generic, so it works with every type that either implements Comparable,
or is Subtype of another type that implements Comparable.<br>

class BinaryMinHeap <T extends Comparable<? super T>>
---

<i><b>public methods:</i></b><br>
void size()<br>
void insert(T elem)<br>
T extractMin()<br>
void buildHeap(Collection&lt;? extends T&gt; keys)<br>

---

The method extractMin has a runtime of <b>O(log n)</b>. The method buildHeap has a runtime of <b>O(n)</b>.
Internally the binary tree is just represented as an ArrayList, where the children of a node with index i have the indices 2i and 2i+1.<br>
A more detailed explanation can be found here: http://interactivepython.org/runestone/static/pythonds/Trees/BinaryHeapImplementation.html

Status
---
all methods implemented and tested successfully.
