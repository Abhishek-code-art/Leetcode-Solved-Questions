# Stickler Thief
## Medium
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Stickler</span><span style="font-size: 18px; user-select: auto;"> the thief wants to loot money from a society<strong style="user-select: auto;"> </strong>having<strong style="user-select: auto;"> n</strong> houses in a single line. He is a weird person and follows a certain <strong style="user-select: auto;">rule </strong>when looting the houses. According to the rule, he will <strong style="user-select: auto;">never loot two consecutive houses</strong>. At the same time, he wants to <strong style="user-select: auto;">maximize </strong>the amount he loots. The thief knows which house has what amount of money but is unable to come up with an optimal looting strategy. He asks for your help to find the <strong style="user-select: auto;">maximum money</strong> he can get if he strictly follows the rule. ith house has </span><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">a[i] </span></strong><span style="font-size: 18px; user-select: auto;">amount of money present in it.</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>
<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>n = 5
a[] = {6,5,5,7,4}
<strong style="user-select: auto;">Output: <br style="user-select: auto;"></strong>15
<strong style="user-select: auto;">Explanation: <br style="user-select: auto;"></strong>Maximum amount he can get by looting 1st, 3rd and 5th house. Which is 6+5+4=15.</span></pre>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>
<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>n = 3
a[] = {1,5,3}
<strong style="user-select: auto;">Output: <br style="user-select: auto;"></strong>5
<strong style="user-select: auto;">Explanation: <br style="user-select: auto;"></strong>Loot only 2nd house and get maximum amount of 5.</span></pre>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">Complete the function<strong style="user-select: auto;">FindMaxSum() </strong>which takes an array <strong style="user-select: auto;">arr[]</strong> and <strong style="user-select: auto;">n</strong> as input which returns the maximum money he can get following the rules.</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong>O(N).<br style="user-select: auto;"><strong style="user-select: auto;">Expected Space Complexity:</strong>O(N).</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">1 ≤ n ≤ 10<sup style="user-select: auto;">5</sup><br style="user-select: auto;">1 ≤ a[i] ≤ 10<sup style="user-select: auto;">4</sup></span></p></div>