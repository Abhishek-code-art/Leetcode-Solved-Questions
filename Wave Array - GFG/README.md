# Wave Array
## Easy
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given a <strong style="user-select: auto;">sorted</strong> array <strong style="user-select: auto;">arr[]</strong>&nbsp;of distinct integers. Sort the array into a wave-like array(In Place).<br style="user-select: auto;">In other words, arrange the elements into a sequence such that arr[1] &gt;= arr[2] &lt;= arr[3] &gt;= arr[4] &lt;= arr[5].....</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">If there are multiple solutions, find the lexicographically smallest one.</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Note:</strong>The given array is sorted in ascending order, and you don't need to return anything to make changes in the original array itself.</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>
<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>n = 5
arr[] = {1,2,3,4,5}
<strong style="user-select: auto;">Output: </strong>2 1 4 3 5<strong style="user-select: auto;">
Explanation: </strong>Array elements after 
sorting it in wave form are 
2 1 4 3 5.</span></pre>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>
<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>n = 6
arr[] = {2,4,7,8,9,10}
<strong style="user-select: auto;">Output: </strong>4 2 8 7 10 9<strong style="user-select: auto;">
Explanation: </strong>Array elements after 
sorting it in wave form are 
4 2 8 7 10 9.</span></pre>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your&nbsp;Task:</strong><br style="user-select: auto;">The task is to complete the function <strong style="user-select: auto;">convertToWave</strong>(), which converts the given array to a wave array.</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:&nbsp;</strong>O(n).<br style="user-select: auto;"><strong style="user-select: auto;">Expected Auxiliary Space:&nbsp;</strong>O(1).</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">1 ≤ n&nbsp;≤ 10<sup style="user-select: auto;">6</sup><br style="user-select: auto;">0 ≤ arr[i] ≤10<sup style="user-select: auto;">7</sup></span></p></div>