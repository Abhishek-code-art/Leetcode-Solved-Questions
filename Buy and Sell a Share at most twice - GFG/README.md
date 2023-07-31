# Buy and Sell a Share at most twice
## Medium
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">In daily share trading, a buyer buys shares in the morning and sells them on the same day. If the trader is allowed to make at most 2 transactions in a day, the second transaction can only start after the first one is complete (Buy-&gt;sell-&gt;Buy-&gt;sell). The stock prices throughout the day are represented&nbsp;in the form of&nbsp;an array of&nbsp;<strong style="user-select: auto;">prices</strong>.&nbsp;</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given an array <strong style="user-select: auto;">price</strong> of size <strong style="user-select: auto;">N</strong>, find out the <strong style="user-select: auto;">maximum</strong> profit that a share trader could have made.</span></p>
<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example 1:</span></strong></p>
<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong>
6
10 22 5 75 65 80
<strong style="user-select: auto;">Output:</strong>
87
<strong style="user-select: auto;">Explanation:</strong>
Trader earns 87 as sum of 12, 75&nbsp;
Buy at 10, sell at 22,&nbsp;
Buy at 5 and sell at 80</span></pre>
<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example 2:</span></strong></p>
<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong></span>
<span style="font-size: 18px; user-select: auto;">7
2 30 15 10 8 25 80
<strong style="user-select: auto;">Output:</strong></span>
<span style="font-size: 18px; user-select: auto;">100</span>
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Explanation:</strong></span>

<span style="font-size: 18px; user-select: auto;">Trader earns 100 as sum of 28 and 72
Buy at price 2, sell at 30,
Buy at 8 and sell at 80</span></pre>
<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Your Task:</span></strong></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Complete the function <strong style="user-select: auto;">maxProfit()</strong> which takes an integer array <strong style="user-select: auto;">price</strong> as the only argument and returns an integer, representing the maximum profit, if only two transactions are allowed.</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong> O(N)</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Space Complexity:</strong> O(N)</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></span></p>
<ul style="user-select: auto;">
<li style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">1 &lt;= N &lt;= 10<sup style="user-select: auto;">5</sup></span></li>
<li style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">1 &lt;= price[i] &lt;= 10<sup style="user-select: auto;">5</sup></span></li>
</ul></div>