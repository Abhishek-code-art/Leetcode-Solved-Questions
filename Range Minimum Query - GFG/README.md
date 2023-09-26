# Range Minimum Query
## Medium
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given an array<strong style="user-select: auto;"> A[ ] </strong>and its size <strong style="user-select: auto;">N</strong> your task is to complete two functions&nbsp; a <strong style="user-select: auto;">constructST</strong>&nbsp; function which builds the segment tree&nbsp; and a function <strong style="user-select: auto;">RMQ</strong> which finds range minimum query in a range [a,b] of the given array.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input</strong>:<br style="user-select: auto;">
The task is to complete two functions <strong style="user-select: auto;">constructST</strong> and <strong style="user-select: auto;">RMQ</strong>.<br style="user-select: auto;">
The constructST function builds the segment tree and takes two arguments the array <strong style="user-select: auto;">A[ ]</strong> and the size of the array <strong style="user-select: auto;">N</strong>.<br style="user-select: auto;">
It returns a pointer to the first element of the segment tree array.<br style="user-select: auto;">
The <strong style="user-select: auto;">RMQ </strong>function takes 4 arguments the first being the segment tree <strong style="user-select: auto;">st </strong>constructed, second being the size <strong style="user-select: auto;">N</strong> and then third and forth arguments are the range of query <strong style="user-select: auto;">a</strong> and<strong style="user-select: auto;"> b</strong>. The function RMQ returns the <strong style="user-select: auto;">min</strong> of the elements in the array from index range a and b. There are multiple test cases. For each test case, this method will be called individually.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Output:</strong><br style="user-select: auto;">
The function <strong style="user-select: auto;">RMQ</strong> should return the min element in the array from range <strong style="user-select: auto;">a</strong> to <strong style="user-select: auto;">b</strong>.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input (To be used only for expected output) </strong>
1
4
1 2 3 4
2
0 2 2 3
<strong style="user-select: auto;">Output</strong>
1 3
<strong style="user-select: auto;">Explanation
1.</strong> For query 1 ie 0 2 the element in this range are 1 2 3 
&nbsp;  and the min element is 1. 
<strong style="user-select: auto;">2.</strong> For query 2 ie 2 3 the element in this range are 3 4 
&nbsp;  and the min element is 3.</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1&lt;=T&lt;=100<br style="user-select: auto;">
1&lt;=N&lt;=10^3+1</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">1&lt;=A[i]&lt;=10^9</span><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;">1&lt;=Q(no of queries)&lt;=10000<br style="user-select: auto;">
0&lt;=a&lt;=b</span></p>
</div>