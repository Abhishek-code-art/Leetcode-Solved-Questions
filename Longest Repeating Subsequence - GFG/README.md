# Longest Repeating Subsequence
## Medium
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given string str, find the length of the longest repeating subsequence such that it can be found twice in the given string. </span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">The two identified subsequences A and B can use the same ith character from string str if and only if that ith character has different indices in A and B. For example, A = "xax" and B = "xax" then the index of first "x" must be different in the original string for A and B.</span></p>

<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example 1:</span></strong></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong>
str = "axxzxy"
<strong style="user-select: auto;">Output:</strong> 2
<strong style="user-select: auto;">Explanation:</strong>
The given array with indexes looks like
a x x z x y 
0 1 2 3 4 5</span>

<span style="font-size: 18px; user-select: auto;">The longest subsequence is "xx". 
It appears twice as explained below.</span>

<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">subsequence A</strong>
x x
0 1  &lt;-- index of subsequence A
------
1 2  &lt;-- index of str </span>

<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">
subsequence B</strong>
x x
0 1  &lt;-- index of subsequence B
------
2 4  &lt;-- index of str </span>

<span style="font-size: 18px; user-select: auto;">We are able to use character 'x' 
(at index 2 in str) in both subsequences
as it appears on index 1 in subsequence A 
and index 0 in subsequence B.</span></pre>

<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example 2:</span></strong></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong>
str = "axxxy"
<strong style="user-select: auto;">Output:</strong> 2
<strong style="user-select: auto;">Explanation:</strong>
The given array with indexes looks like
a x x x y&nbsp;
0 1 2 3 4

The longest subsequence is "xx".&nbsp;
It appears twice as explained below.

<strong style="user-select: auto;">subsequence A</strong>
x x
0 1 &nbsp;&lt;-- index of subsequence A
------
1 2 &nbsp;&lt;-- index of str&nbsp;


<strong style="user-select: auto;">subsequence B</strong>
x x
0 1 &nbsp;&lt;-- index of subsequence B
------
2 3 &nbsp;&lt;-- index of str&nbsp;

We are able to use character 'x'&nbsp;
(at index 2 in str) in both subsequences
as it appears on index 1 in subsequence A&nbsp;
and index 0 in subsequence B.</span></pre>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
You don't need to read or print anything. Your task is to complete the <strong style="user-select: auto;">LongestRepeatingSubsequence()</strong> which takes str as input parameter and returns the length of the longest repeating subsequnece.</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong> O(n<sup style="user-select: auto;">2</sup>)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Space Complexity:</strong> O(n<sup style="user-select: auto;">2</sup>)</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 &lt;= |str| &lt;= 10<sup style="user-select: auto;">3</sup></span></p>
</div>