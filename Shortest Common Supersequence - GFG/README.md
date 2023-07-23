# Shortest Common Supersequence
## Medium
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given two&nbsp;strings X and Y&nbsp;of lengths&nbsp;m and n&nbsp;respectively, find the length of the smallest string which has both, X and Y as its sub-sequences.<br style="user-select: auto;">
Note:&nbsp;X&nbsp;and Y can have both uppercase and lowercase letters.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>X = abcd, Y = xycd
<strong style="user-select: auto;">Output: </strong>6<strong style="user-select: auto;">
Explanation: </strong>Shortest Common Supersequence
would be abxycd which is of length 6 and
has both the strings as its subsequences.</span>
</pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>X = efgh, Y = jghi
<strong style="user-select: auto;">Output: </strong>6<strong style="user-select: auto;">
Explanation: </strong>Shortest Common Supersequence
would be ejfghi which is of length 6 and
has both the strings as its subsequences.</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
Complete&nbsp;<strong style="user-select: auto;">shortestCommonSupersequence()</strong>&nbsp;function that takes X, Y, m, and n as arguments and&nbsp;returns&nbsp;the length of the required string.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:&nbsp;</strong>O(Length(X) * Length(Y)).<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:&nbsp;</strong>O(Length(X) * Length(Y)).</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1&lt;= |X|, |Y| &lt;= 100</span></p>

<p style="user-select: auto;">&nbsp;</p>
</div>