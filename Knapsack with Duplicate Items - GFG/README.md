# Knapsack with Duplicate Items
## Medium
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given a set of <strong style="user-select: auto;">N</strong> items, each with a weight and a value, represented by the array <strong style="user-select: auto;">w</strong>&nbsp;and&nbsp;<strong style="user-select: auto;">val</strong>&nbsp;respectively.&nbsp;Also, a knapsack with weight limit <strong style="user-select: auto;">W</strong>.<br style="user-select: auto;">The task is to fill the knapsack in such a way that we can get the maximum profit. Return the maximum profit.<br style="user-select: auto;"><strong style="user-select: auto;">Note:</strong> Each item can be taken any number of times.</span></p>
<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example 1:</span></strong></p>
<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong> <br style="user-select: auto;">N = 2<br style="user-select: auto;">W = 3
val = {1, 1}
wt = {2, 1}
<strong style="user-select: auto;">Output:</strong> <br style="user-select: auto;">3
<strong style="user-select: auto;">Explanation:</strong> 
1.Pick the 2nd element thrice.
2.Total profit = 1 + 1 + 1 = 3. Also the total weight = 1 + 1 + 1  = 3 which is &lt;= 3.</span>
</pre>
<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example 2:</span></strong></p>
<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong> <br style="user-select: auto;">N = 4<br style="user-select: auto;">W = 8
val[] = {6, 1, 7, 7}
wt[] = {1, 3, 4, 5}
<strong style="user-select: auto;">Output:</strong> <br style="user-select: auto;">48
<strong style="user-select: auto;">Explanation:</strong> <br style="user-select: auto;">The optimal choice is to pick the 1st element 8 times.</span></pre>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">You do not need to read input&nbsp;or print anything. Your task is to complete the function <strong style="user-select: auto;">knapSack()</strong> which takes the values <strong style="user-select: auto;">N</strong>, <strong style="user-select: auto;">W </strong>and the arrays <strong style="user-select: auto;">val </strong>and <strong style="user-select: auto;">wt </strong>as input parameters and returns the maximum possible value.</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong> O(N*W)<br style="user-select: auto;"><strong style="user-select: auto;">Expected Auxiliary Space: </strong>O(W)</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">1 ≤ N, W ≤ 1000<br style="user-select: auto;">1 ≤ val[i], wt[i] ≤ 100</span></p></div>