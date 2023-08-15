# Form a palindrome
## Medium
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given a string, find the minimum number of characters to be inserted to convert it to palindrome.<br style="user-select: auto;">
For Example:<br style="user-select: auto;">
ab: Number of insertions required is 1.&nbsp;<strong style="user-select: auto;">b</strong>ab or aba<br style="user-select: auto;">
aa: Number of insertions required is 0. aa<br style="user-select: auto;">
abcd: Number of insertions required is 3.&nbsp;<strong style="user-select: auto;">dcb</strong>abcd</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong>
abcd</span>
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Output:</strong>
3</span>
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Explanation:
</strong>Here we can append 3 characters in the 
beginning,and the resultant string will 
be a palindrome ("dcbabcd").</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong>
aba</span>
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Output:</strong>
0</span>
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Explanation:</strong>
Given string is already a pallindrome hence
no insertions are required.</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:&nbsp;&nbsp;</strong><br style="user-select: auto;">
You don't need to read input or print anything. Your task is to complete the function <strong style="user-select: auto;">findMinInsertions()</strong>&nbsp;which takes string S<strong style="user-select: auto;"> </strong>as input parameters&nbsp;and returns minimimum numser of insertions required.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong> O(|S|<sup style="user-select: auto;">2</sup>)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:</strong> O(|S|<sup style="user-select: auto;">2</sup>)</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 ≤ |S| ≤ 500</span></p>
</div>