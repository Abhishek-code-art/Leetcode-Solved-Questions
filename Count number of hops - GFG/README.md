# Count number of hops
## Easy
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">A frog jumps either 1, 2, or 3 steps to go to the top. In how many ways can it reach the top of <strong style="user-select: auto;">Nth</strong> step. As the answer will be large find the answer modulo 1000000007.</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>
<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>N = 1
<strong style="user-select: auto;">Output: </strong>1</span>
</pre>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>
<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>N = 4
<strong style="user-select: auto;">Output: </strong>7<strong style="user-select: auto;">
Explanation:</strong>Below are the 7 ways to reach
4
1 step + 1 step + 1 step + 1 step
1 step + 2 step + 1 step
2 step + 1 step + 1 step
1 step + 1 step + 2 step
2 step + 2 step
3 step + 1 step
1 step + 3 step</span></pre>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">Your task is to complete the function <strong style="user-select: auto;">countWays()&nbsp;</strong>which takes 1 argument(N) and returns the answer%(10^9 + 7).</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong>&nbsp;O(N).<br style="user-select: auto;"><strong style="user-select: auto;">Expected Auxiliary Space:</strong>&nbsp;O(1).</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">1 ≤ N ≤ 10<sup style="user-select: auto;">5</sup></span></p></div>