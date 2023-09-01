# Leftmost and rightmost nodes of binary tree
## Medium
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given a Binary Tree of size N, Print the corner nodes ie- the node at the leftmost and rightmost of each level.</span></p>
<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example 1:</span></strong></p>
<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input :</strong>
         1
       /  \
     2      3
    / \    / \
   4   5  6   7    </span>
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Output:</strong> 1 2 3 4 7</span>
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Explanation:</strong>
Corners at level 0: 1
Corners at level 1: 2 3
Corners at level 2: 4 7</span>
</pre>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>
<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong></span>

<span style="font-size: 18px; user-select: auto;">        10
      /    \
     20     30
    / \  
   40  60</span>
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Output: </strong>10 20 30 40 60</span></pre>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task: &nbsp;</strong><br style="user-select: auto;">You dont need to read input. Complete the function <strong style="user-select: auto;">printCorner() </strong>which takes root node as input parameter and prints the corner nodes separated by spaces. The left corner should be printed before the right for each level starting from level 0.<br style="user-select: auto;"><strong style="user-select: auto;">Note: </strong>Don't print a new line after printing all the corner nodes.</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong> O(N)<br style="user-select: auto;"><strong style="user-select: auto;">Expected Auxiliary Space:</strong> O(number of nodes in a level)</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">1 ≤ N ≤ 10^5</span></p></div>