# Copy Set Bits in Range
## Easy
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given two numbers <strong style="user-select: auto;">X</strong> and <strong style="user-select: auto;">Y</strong>, and a range [<strong style="user-select: auto;">L</strong>, <strong style="user-select: auto;">R</strong>] where 1 &lt;= L &lt;= R &lt;= 31. You have to copy the set bits of <strong style="user-select: auto;">'Y'</strong> in the range L to R in<strong style="user-select: auto;"> 'X'.</strong>&nbsp;Return this modified X.</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Note: Range count will be from Right to Left &amp; start from 1.</span></p>
<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example 1:</span></strong></p>
<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong> 
X = 44, Y = 3 
L = 1,  R = 5
<strong style="user-select: auto;">Output:</strong> <br style="user-select: auto;">47
<strong style="user-select: auto;">Explaination:</strong> <br style="user-select: auto;">Binary represenation of 44 and 3 is 1011<span style="text-decoration: underline; user-select: auto;">00</span> and 0000<strong style="user-select: auto;">11</strong>. So in the range 1 to 5 there are two set bits of 3 (1st &amp; 2nd position). If those are set in 44 it will become 1011<span style="text-decoration: underline; user-select: auto;"><strong style="user-select: auto;">11</strong></span> which is 47.</span></pre>
<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example 2:</span></strong></p>
<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong> 
X = 16, Y = 2
L = 1,  R = 3
<strong style="user-select: auto;">Output:</strong> 18
<strong style="user-select: auto;">Explaination:</strong> Binary represenation of 16 and 2 is 100<span style="text-decoration: underline; user-select: auto;">00</span> and <strong style="user-select: auto;">10</strong>. If the mentioned conditions are applied then 16 will become 100<span style="text-decoration: underline; user-select: auto;"><strong style="user-select: auto;">10</strong></span> which is 18.</span></pre>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">You do not need to read input or print anything. Your task is to complete the function <strong style="user-select: auto;">setSetBit()</strong> which takes the numbers X, Y, L and R as input parameters and returns the modified value of X.</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong> O(R - L)<br style="user-select: auto;"><strong style="user-select: auto;">Expected Auxiliary Space:</strong> O(1)</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">1 ≤ X, Y ≤ 10<sup style="user-select: auto;">9</sup><br style="user-select: auto;">1 ≤ L ≤ R ≤ 32</span></p></div>