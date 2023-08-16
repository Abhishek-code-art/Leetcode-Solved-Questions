# Minimum Deletions
## Easy
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given a string of S as input. Your task is to write a program to remove or delete the minimum number of characters from the string so that the resultant string is a palindrome.<br style="user-select: auto;">
<strong style="user-select: auto;">Note:</strong> The order of characters in the string should be maintained.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input: </strong>S<strong style="user-select: auto;"> </strong>=<strong style="user-select: auto;"> "</strong>aebcbda"
<strong style="user-select: auto;">Output:</strong> 2
<strong style="user-select: auto;">Explanation</strong>: Remove characters 'e' 
and 'd'.</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input</strong>: S = "geeksforgeeks"
<strong style="user-select: auto;">Output:</strong> 8
<strong style="user-select: auto;">Explanation</strong>: One of the possible result
string can be "eefee", so answer is 
13 - 5 = 8.
</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:&nbsp;&nbsp;</strong><br style="user-select: auto;">
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong style="user-select: auto;">minimumNumberOfDeletions()</strong>&nbsp;which takes the string <strong style="user-select: auto;">S </strong>as inputs and returns the minimum number of deletions required to convert <strong style="user-select: auto;">S</strong> into a pallindrome.<br style="user-select: auto;">
<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Time Complexity:</strong>&nbsp;O(|S|<sup style="user-select: auto;">2</sup>)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:</strong>&nbsp;O(|S|<sup style="user-select: auto;">2</sup>)<br style="user-select: auto;">
<br style="user-select: auto;">
<strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 ≤ |S| ≤ 10<sup style="user-select: auto;">3</sup></span></p>
</div>