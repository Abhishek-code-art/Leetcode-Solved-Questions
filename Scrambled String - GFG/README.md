# Scrambled String
## Hard
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given two strings&nbsp;<strong style="user-select: auto;">S1</strong>&nbsp;and&nbsp;<strong style="user-select: auto;">S2</strong>&nbsp;of equal length, the task is to determine if S2 is a scrambled form of S1.</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Scrambled string:</strong>&nbsp;Given string&nbsp;<strong style="user-select: auto;">str</strong>, we can represent it as a binary tree&nbsp;by partitioning it into two non-empty substrings recursively.<br style="user-select: auto;">Below is one possible representation of str = <strong style="user-select: auto;">coder:</strong><br style="user-select: auto;">&nbsp;</span><img src="https://media.geeksforgeeks.org/img-practice/PROD/addEditProblem/707514/Web/Other/5360f3bd-09bb-4f9d-9c84-be3844091359_1685087790.png" style="user-select: auto;"><br style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">To scramble the string, we may choose any non-leaf node and swap its two children.&nbsp;<br style="user-select: auto;">Suppose, we choose the node <strong style="user-select: auto;">co</strong> and swap its two children, it produces a scrambled string <strong style="user-select: auto;">ocder</strong>.<br style="user-select: auto;">Similarly, if we continue to swap the children of nodes <strong style="user-select: auto;">der</strong> and <strong style="user-select: auto;">er</strong>, it produces a scrambled string <strong style="user-select: auto;">ocred</strong>.</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Note:</strong>&nbsp;Scrambled string is not the same as an Anagram.</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Print "Yes" if S2 is a scrambled form of S1 otherwise print "No".</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>
<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong> S1="coder", S2="ocder"
<strong style="user-select: auto;">Output:</strong> Yes
<strong style="user-select: auto;">Explanation:</strong> ocder is a scrambled 
form of coder.

    ocder
   /    \
  oc    der
 / \    
o   c  

As "ocder" can represent it 
as a binary tree by partitioning 
it into two non-empty substrings.
We just have to swap 'o' and 'c' 
to get "coder".</span>
</pre>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>
<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong> S1="abcde", S2="caebd" 
<strong style="user-select: auto;">Output:</strong> No
<strong style="user-select: auto;">Explanation:</strong> caebd is not a 
scrambled form of abcde.</span></pre>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">You don't need to read input or print anything.&nbsp;You only need to complete the function<strong style="user-select: auto;">&nbsp;isScramble</strong><strong style="user-select: auto;">()&nbsp;</strong>which takes two strings S1 and S2&nbsp;as input and returns a boolean value.</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:&nbsp;</strong>O(N<sup style="user-select: auto;">2</sup>)<br style="user-select: auto;"><strong style="user-select: auto;">Expected Auxiliary Space:</strong>&nbsp;O(N<sup style="user-select: auto;">2</sup>)</span></p>
<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Constrains:&nbsp;</span></strong></p>
<ul style="user-select: auto;">
<li style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">S1.length = S2.length</span></li>
<li style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">S1.length&lt;=31</span></li>
<li style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">S1 and S2 consist of lower-case English letters.</span></li>
</ul></div>