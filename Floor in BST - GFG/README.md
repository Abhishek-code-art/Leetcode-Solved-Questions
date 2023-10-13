# Floor in BST
## Medium
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">You are given a BST(Binary Search Tree) with <strong style="user-select: auto;">n</strong>&nbsp;number of nodes and value <strong style="user-select: auto;">x</strong>. your task is to find the greatest value node of the BST which is smaller than or equal to x.<br style="user-select: auto;"><strong style="user-select: auto;">Note:</strong> when x is smaller than the smallest node of BST then returns -1.</span></p>
<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example:</span></strong></p>
<pre style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Input:</span></strong><span style="font-size: 18px; user-select: auto;">
n = 7               2
                     \
                      81
                    /     \
                 42       87
                   \       \
                    66      90
                   /
                 45
x = 87
<strong style="user-select: auto;">Output:</strong>
87
<strong style="user-select: auto;">Explanation:</strong>
87 is present in tree so floor will be 87.</span>
</pre>
<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example 2:</span></strong></p>
<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong>
n = 4                     6
                           \
                            8
                          /   \
                        7       9
x = 11
<strong style="user-select: auto;">Output:</strong>
9</span>
</pre>
<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Your Task:-</span></strong><br style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">You don't need to read input or print anything. Complete the function <strong style="user-select: auto;">floor() </strong>which takes<strong style="user-select: auto;">&nbsp;</strong>the integer&nbsp;<strong style="user-select: auto;">n</strong>&nbsp;and BST&nbsp;and integer x returns the floor&nbsp;value.</span></p>
<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Constraint:</span></strong><br style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">1 &lt;= Noda data &lt;= 10<sup style="user-select: auto;">9</sup><br style="user-select: auto;">1 &lt;= n &lt;= 10<sup style="user-select: auto;">5</sup></span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong> O(n)<br style="user-select: auto;"><strong style="user-select: auto;">Expected Space Complexity:</strong> O(1)</span></p></div>