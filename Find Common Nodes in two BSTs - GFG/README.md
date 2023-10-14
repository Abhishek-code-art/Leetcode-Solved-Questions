# Find Common Nodes in two BSTs
## Easy
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given two Binary Search Trees. Find&nbsp;the&nbsp;nodes that are common in both of them, ie-&nbsp;find the intersection of the two BSTs.</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Note</strong>: Return&nbsp;</span><span style="font-size: 18px; user-select: auto;">the common nodes in <strong style="user-select: auto;">sorted </strong>order.</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>
<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong></span><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">BST1:
</span></strong> <span style="font-size: 18px; user-select: auto;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&nbsp; &nbsp; &nbsp;5
 &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;/ &nbsp; &nbsp; \
 &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;1 &nbsp; &nbsp; &nbsp;  10
 &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;/ &nbsp; \ &nbsp; &nbsp;  /
 &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; 0 &nbsp; &nbsp; 4&nbsp;&nbsp;&nbsp; 7
 &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  \
 &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;9
</span><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">BST2:
</span></strong> <span style="font-size: 18px; user-select: auto;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; 10 
&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  / &nbsp; &nbsp;\
 &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;7&nbsp; &nbsp; &nbsp;20
 &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;/ &nbsp; \ 
&nbsp;&nbsp; &nbsp; &nbsp; &nbsp;  4&nbsp; &nbsp; &nbsp;9
<strong style="user-select: auto;">Output: </strong>4 7 9 10

</span></pre>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>
<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
BST1:
</strong>&nbsp;    10
&nbsp;   /  \
&nbsp;  2   11
&nbsp; /  \
&nbsp;1   3
<strong style="user-select: auto;">BST2:
</strong>&nbsp;      2
&nbsp;    /  \
&nbsp;   1    3
<strong style="user-select: auto;">Output: </strong>1 2 3
</span></pre>
<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Your Task:</span></strong><br style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">You don't need to read input or print anything. Your task is to complete the function</span><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">&nbsp;findCommon()</strong> that takes roots of the two&nbsp;BSTs as input parameters and returns a list of integers&nbsp;containing the common nodes in&nbsp;sorted order.&nbsp;</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:&nbsp;</strong>O(N1 + N2) where N1 and N2 are the sizes of the 2 BSTs.<br style="user-select: auto;"><strong style="user-select: auto;">Expected Auxiliary Space:&nbsp;</strong>O(H1 + H2) where H1 and H2 are the heights of the 2 BSTs.</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">1 &lt;= Number of Nodes &lt;= 10<sup style="user-select: auto;">5</sup><br style="user-select: auto;">1 &lt;= Node data &lt;= 10<sup style="user-select: auto;">9</sup></span></p></div>