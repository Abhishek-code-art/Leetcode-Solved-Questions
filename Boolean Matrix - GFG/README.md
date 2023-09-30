# Boolean Matrix
## Medium
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given a boolean matrix of size RxC where each cell contains either 0 or 1, modify it such that if a matrix cell matrix[i][j] is 1 then all the cells in its i</span><sup style="user-select: auto;">th</sup><span style="font-size: 18px; user-select: auto;">&nbsp;row and j</span><sup style="user-select: auto;">th</sup><span style="font-size: 18px; user-select: auto;">&nbsp;column will become 1.</span></p>
<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example 1:</span></strong></p>
<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong>
R = 2, C = 2
matrix[][] = {{1, 0},
              {0, 0}}
<strong style="user-select: auto;">Output: </strong>
1 1
1 0 </span>
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Explanation:</strong>
Only cell that has 1 is at (0,0) so all 
cells in row 0 are modified to 1 and all 
cells in column 0 are modified to 1.</span></pre>
<p style="user-select: auto;"><br style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>
<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong>
R = 4, C = 3
matrix[][] = {{ 1, 0, 0},
              { 1, 0, 0},
              { 1, 0, 0},
              { 0, 0, 0}}</span>
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Output: </strong>
1 1 1
1 1 1
1 1 1
1 0 0 </span>
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Explanation:</strong>
The position of cells that have 1 in
the original matrix are (0,0), (1,0)
and (2,0). Therefore, all cells in row
0,1,2 are and column 0 are modified to 1. </span></pre>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">You dont need to read input or print anything. Complete the function <strong style="user-select: auto;">booleanMatrix()</strong> that takes the matrix as input parameter and modifies it <strong style="user-select: auto;">in-place</strong>.</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong> O(R * C)<br style="user-select: auto;"><strong style="user-select: auto;">Expected Auxiliary Space:</strong> O(R + C)&nbsp;</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">1 ≤ R, C ≤ 1000<br style="user-select: auto;">0 ≤ matrix[i][j] ≤ 1</span></p></div>