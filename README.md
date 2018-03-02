# BinaryHeap

A simple Java implementation of a binary Min-Heap.
The Min-Heap is generic, so it works with every type that either implements Comparable,
or is Subtype of another type that implements Comparable.<br>

class BinaryMinHeap <T extends Comparable<? super T>>
---
<i><b>private methods:</i></b><br>
void percUp(int i)<br>
void percDown(int i)<br>
void minChild(int i)<br>
<i><b>public methods:</i></b><br>
void size()<br>
void insert(T elem)<br>
int extractMin()<br>
void buildHeap(List&lt;? extends T&gt; keys)<br>

Internally the binary tree is just represented as an ArrayList, where the children of a node with index i have the indices 2n and 2n+1.<br>
A more detailed explanation can be found here: http://interactivepython.org/runestone/static/pythonds/Trees/BinaryHeapImplementation.html

Status
---
all methods implemented and tested successfully.
