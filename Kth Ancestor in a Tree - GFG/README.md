# Kth Ancestor in a Tree
## Medium
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given a binary tree of size&nbsp; <strong style="user-select: auto;">N</strong>,&nbsp;a <strong style="user-select: auto;">node,</strong> and a positive integer <strong style="user-select: auto;">k</strong>., Your task is to complete the function <strong style="user-select: auto;">kthAncestor()</strong>, the function should return the <strong style="user-select: auto;">kth</strong> ancestor of the given node in the binary tree. If there does not exist any such ancestor then return&nbsp;-1.<br style="user-select: auto;"><strong style="user-select: auto;">Note</strong>: It is guaranteed that the <strong style="user-select: auto;">node</strong> exists in the tree.</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>
<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">
<img style="height: 230px; width: 287px; user-select: auto;" src="https://contribute.geeksforgeeks.org/wp-content/uploads/reverse.jpg" alt="">
<strong style="user-select: auto;">Input:</strong>
K = 2 Node = 4
<strong style="user-select: auto;">Output:</strong> 1
<strong style="user-select: auto;">Explanation:</strong>
Since, K is 2 and node is 4, so we
first need to locate the node and
look k times its ancestors.
Here in this Case node 4 has 1 as his
2nd Ancestor aka the Root of the tree.</span></pre>
<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example 2:</span></strong></p>
<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong>
k=1 </span>
<span style="font-size: 18px; user-select: auto;">node=3
      1
    /   \</span>
    <span style="font-size: 18px; user-select: auto;">2     3</span>

<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Output:</strong>
1
<strong style="user-select: auto;">Explanation:
</strong>K=1 and node=3 ,Kth ancestor of node 3 is 1.</span></pre>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">You are asked to complete the function <strong style="user-select: auto;">kthAncestor()</strong> which accepts <strong style="user-select: auto;">root</strong> of the tree, <strong style="user-select: auto;">k</strong> and <strong style="user-select: auto;">node</strong> as input parameters, and returns the <strong style="user-select: auto;">kth ancestor </strong>of Node which contains node as its value.</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong>&nbsp;O(N)<br style="user-select: auto;"><strong style="user-select: auto;">Expected Auxiliary Space:</strong>&nbsp;O(N)</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">1&lt;=N&lt;=10<sup style="user-select: auto;">5</sup><sup style="user-select: auto;"><br style="user-select: auto;"></sup></span><span style="font-size: 18px; user-select: auto;">1&lt;= K &lt;= 100<br style="user-select: auto;">1 &lt;= Node.data &lt;= N</span></p></div>