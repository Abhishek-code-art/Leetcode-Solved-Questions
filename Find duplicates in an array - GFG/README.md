# Find duplicates in an array
## Easy
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given an array <strong style="user-select: auto;">a</strong> of size <strong style="user-select: auto;">N</strong> which contains elements from <strong style="user-select: auto;">0</strong> to <strong style="user-select: auto;">N-1</strong>, you need to find all the elements occurring more than once in the given array. Return the answer in ascending order.&nbsp;</span><span style="font-size: 18px; user-select: auto;">If no such element is found, return list containing <strong style="user-select: auto;">[-1]</strong>.&nbsp;</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Note:</strong> The extra space is only for the array to be returned. Try and perform all operations within the provided array.&nbsp;</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>
<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>N = 4
a[] = {0,3,1,2}
<strong style="user-select: auto;">Output: <br style="user-select: auto;"></strong>-1<strong style="user-select: auto;">
Explanation: <br style="user-select: auto;"></strong></span><span style="font-size: 14pt; user-select: auto;">There is no repeating element in the array. </span><span style="box-sizing: inherit; font-size: 14pt; user-select: auto;">Therefore output is -1.</span></pre>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>
<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>N = 5
a[] = {2,3,1,2,3}
<strong style="user-select: auto;">Output: <br style="user-select: auto;"></strong>2 3&nbsp;<strong style="user-select: auto;">
Explanation: <br style="user-select: auto;"></strong>2 and 3 occur more than once in the given array.</span></pre>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">Complete the function <strong style="user-select: auto;">duplicates()</strong> which takes array a[] and n as input as parameters and returns a list of elements that occur more than once in the given array in a sorted manner.&nbsp;</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong> O(n).<br style="user-select: auto;"><strong style="user-select: auto;">Expected Auxiliary Space:</strong> O(n).</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">1 &lt;= N &lt;= 10<sup style="user-select: auto;">5</sup><br style="user-select: auto;">0 &lt;= A[i] &lt;= N-1, for each valid i</span></p></div>