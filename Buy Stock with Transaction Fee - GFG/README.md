# Buy Stock with Transaction Fee
## Medium
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">You are given an array&nbsp;<code style="user-select: auto;">prices</code>&nbsp;where&nbsp;<code style="user-select: auto;">prices[i]</code>&nbsp;is the price of a given stock on the&nbsp;<code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code>&nbsp;day, and an integer&nbsp;<code style="user-select: auto;">fee</code>&nbsp;representing a transaction fee.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Find the maximum profit you can achieve. You may complete as many transactions as you like, but you need to pay the transaction fee for each transaction.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Note:</strong>&nbsp;You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).</span></p>

<pre style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example:
Input:
</span></strong><span style="font-size: 18px; user-select: auto;">n = 6
prices = [1,3,2,8,4,9]
fee = 2
<strong style="user-select: auto;">Output:
</strong>8
<strong style="user-select: auto;">Explanation:</strong></span>
<span style="font-size: 18px; user-select: auto;">The maximum profit can be achieved by:
- Buying at prices[0] = 1
- Selling at prices[3] = 8
- Buying at prices[4] = 4
- Selling at prices[5] = 9
The total profit is ((8 - 1) - 2) + ((9 - 4) - 2) = 8.</span>
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Your Task:</span></strong><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;">You don't have to read input or print anything. Your task is to complete the function&nbsp;<strong style="user-select: auto;">maximumProfit()&nbsp;</strong>which takes the integer&nbsp;<strong style="user-select: auto;">n</strong>&nbsp;and array prices and transaction <strong style="user-select: auto;">fee&nbsp;</strong>and returns the maximum profit that can earn.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity: </strong>O(n)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Space Complexity: </strong>O(1)</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraint:</strong><br style="user-select: auto;">
1 &lt;= n &lt;= 5*10<sup style="user-select: auto;">4</sup></span><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;">1 &lt;= prices[i] &lt;&nbsp;5 * 10<sup style="user-select: auto;">4&nbsp;</sup><br style="user-select: auto;">
0 &lt;= fee &lt; 5 * 10<sup style="user-select: auto;">4</sup></span></p>

<p style="user-select: auto;">&nbsp;</p>
</div>