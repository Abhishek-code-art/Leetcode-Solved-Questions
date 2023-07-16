# Longest Common Subsequence
## Medium
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given two strings, find the length of longest subsequence present in both of them. Both the strings are in <strong style="user-select: auto;">uppercase </strong>latin alphabets.</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>
<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>A = 6, B = 6
str1 = ABCDGH
str2 = AEDFHR
<strong style="user-select: auto;">Output: </strong>3<strong style="user-select: auto;">
Explanation: </strong>LCS for input strings “ABCDGH” and “AEDFHR” is “ADH” of length 3.</span>
</pre>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>
<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>A = 3, B = 2
str1 = ABC
str2 = AC
<strong style="user-select: auto;">Output: </strong>2<strong style="user-select: auto;">
Explanation: </strong>LCS of "ABC" and "AC" is "AC" of length 2.</span></pre>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">Complete the function&nbsp;<strong style="user-select: auto;">lcs()</strong>&nbsp;which takes the length of two strings respectively and two strings as input parameters&nbsp;and returns the&nbsp;length of the longest subsequence present in both of them. </span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity</strong> : O(|str1|*|str2|)<br style="user-select: auto;"><strong style="user-select: auto;">Expected Auxiliary Space</strong>: O(|str1|*|str2|)</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">1&lt;=size(str1),size(str2)&lt;=10<sup style="user-select: auto;">3</sup></span></p></div>