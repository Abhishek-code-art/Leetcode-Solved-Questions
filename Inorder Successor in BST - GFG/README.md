# Inorder Successor in BST
## Easy
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given a BST, and a reference to a Node x in the BST. Find the Inorder Successor of the given node in the BST.</span><br style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>
<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
&nbsp;     2</strong>
&nbsp;   /   \
<strong style="user-select: auto;">   </strong>1     3
K(data of x) = 2
<strong style="user-select: auto;">Output: </strong>3 
<strong style="user-select: auto;">Explanation:</strong> 
Inorder traversal : 1 2 3 
Hence, inorder successor of 2 is 3.</span>
</pre>
<p style="user-select: auto;"><br style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>
<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong><strong style="user-select: auto;">            </strong> 20
&nbsp;           /   \
&nbsp;          8<strong style="user-select: auto;">     </strong>22
&nbsp;         / \
&nbsp;        4   12
&nbsp;           /<strong style="user-select: auto;">  </strong>\
&nbsp;          10   14
K(data of x) = 8
<strong style="user-select: auto;">Output: </strong>10<strong style="user-select: auto;">
Explanation:
</strong>Inorder traversal: 4 8 10 12 14 20 22
Hence, successor of 8 is 10.</span></pre>
<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">You don't need to read input or print anything. Your task is to complete the function</span><span style="font-size: 18px; user-select: auto;">&nbsp;<strong style="user-select: auto;">inOrderSuccessor()</strong>. This function takes the root node and the reference node as argument and returns the node that is inOrder successor of&nbsp;the reference node. If there is no successor, return null value.</span></p>
<p style="user-select: auto;"><br style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong>&nbsp;O(Height of the BST).<br style="user-select: auto;"><strong style="user-select: auto;">Expected Auxiliary Space:</strong>&nbsp;O(1).</span></p>
<p style="user-select: auto;"><br style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">1 &lt;= N &lt;= 10<sup style="user-select: auto;">5</sup><sup style="user-select: auto;">,</sup> where N is number of nodes</span></p></div>