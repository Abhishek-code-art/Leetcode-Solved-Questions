# Right View of Binary Tree
## Easy
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given a Binary Tree, find&nbsp;<strong style="user-select: auto;">Right view</strong> of it. Right view of a Binary Tree is set of nodes visible when tree is viewed from <strong style="user-select: auto;">right </strong>side.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Right view of following tree is 1 3 7 8.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1<br style="user-select: auto;">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; /&nbsp;&nbsp;&nbsp;&nbsp; \<br style="user-select: auto;">
&nbsp;&nbsp;&nbsp;&nbsp; 2&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 3<br style="user-select: auto;">
&nbsp;&nbsp; /&nbsp;&nbsp; \&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; /&nbsp;&nbsp;&nbsp; \<br style="user-select: auto;">
&nbsp; 4&nbsp;&nbsp;&nbsp;&nbsp; 5&nbsp;&nbsp; 6&nbsp;&nbsp;&nbsp; 7<br style="user-select: auto;">
&nbsp;&nbsp;&nbsp; \<br style="user-select: auto;">
&nbsp;&nbsp;&nbsp;&nbsp; 8</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>&nbsp; &nbsp; &nbsp; &nbsp;1
 &nbsp; &nbsp;/&nbsp;&nbsp;&nbsp; \
 &nbsp;&nbsp;3 &nbsp;&nbsp;&nbsp;&nbsp; 2
<strong style="user-select: auto;">Output: </strong>1 2
</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;10
 &nbsp;&nbsp;&nbsp;/&nbsp;&nbsp;&nbsp;\
 &nbsp;20&nbsp; &nbsp;&nbsp; 30
 /&nbsp;&nbsp; \
40&nbsp; 60 
<strong style="user-select: auto;">Output: </strong>10 30 60
</span></pre>

<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Your Task:</span></strong><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;">Just complete the <strong style="user-select: auto;">function rightView()&nbsp;</strong>that takes <strong style="user-select: auto;">node </strong>as <strong style="user-select: auto;">parameter </strong>and returns&nbsp;the right view as a list.&nbsp;</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:&nbsp;</strong>O(N).<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:&nbsp;</strong>O(Height of the Tree).</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></span><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;">1 ≤ Number of nodes ≤ 10<sup style="user-select: auto;">5</sup></span><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;">0 ≤ Data of a node ≤ 10<sup style="user-select: auto;">5</sup></span></p>
</div>