# Normal BST to Balanced BST
## Easy
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 14pt; user-select: auto;">Given a Binary Search Tree, modify the given BST such that it is balanced and has minimum possible height. Return the balanced BST.</span></p>
<p style="user-select: auto;"><span style="font-size: 14pt; user-select: auto;"><strong style="user-select: auto;">Example1:</strong></span></p>
<pre style="user-select: auto;"><span style="font-size: 14pt; user-select: auto;"><strong style="user-select: auto;">Input:</strong>
       30
      /
     20
    /
   10<br style="user-select: auto;"></span><span style="font-size: 14pt; user-select: auto;"><strong style="user-select: auto;">Output:</strong>
     20
   /   \
 10     30
</span></pre>
<p style="user-select: auto;"><span style="font-size: 14pt; user-select: auto;"><strong style="user-select: auto;">Example2:</strong></span></p>
<pre style="user-select: auto;"><span style="font-size: 14pt; user-select: auto;"><strong style="user-select: auto;">Input:</strong>
         4
        /
       3
      /
     2
    /
   1
<strong style="user-select: auto;">Output:</strong>
      3            3           2
    /  \         /  \        /  \
   1    4   OR  2    4  OR  1    3   
    \          /                  \ <br style="user-select: auto;">     2        1                    4</span></pre>
<p style="user-select: auto;"><span style="font-size: 14pt; user-select: auto;"><strong style="user-select: auto;"><br style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">The task is to complete the function <strong style="user-select: auto;">buildBalancedTree()</strong> which takes root as the input argument and returns the root of tree after converting the given BST&nbsp;into a balanced BST with minimum possible height. The driver code will print the height of the updated tree in output itself. </span><br style="user-select: auto;"><span style="font-size: 14pt; user-select: auto;">&nbsp;</span><br style="user-select: auto;"><span style="font-size: 14pt; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:&nbsp;</strong>O(N)<br style="user-select: auto;"><strong style="user-select: auto;">Expected Auxiliary Space: </strong>O(N)<br style="user-select: auto;">Here N denotes total number of nodes in given BST.</span></p>
<p style="user-select: auto;"><span style="font-size: 14pt; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">1 &lt;= N &lt;= 10<sup style="user-select: auto;">5</sup><br style="user-select: auto;">1 &lt;= Node data &lt;= 10<sup style="user-select: auto;">9</sup></span></p></div>