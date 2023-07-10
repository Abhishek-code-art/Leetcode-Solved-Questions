# Transpose of Matrix
## Easy
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Write a program to find the <strong style="user-select: auto;">transpose </strong>of a square matrix&nbsp;of size N*N. Transpose of a matrix is obtained by changing rows to columns and columns to rows.</span><br style="user-select: auto;"><br style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>
<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input</strong>:
N = 4
mat[][] = {{1, 1, 1, 1},
&nbsp;          {2, 2, 2, 2}
&nbsp;          {3, 3, 3, 3}
&nbsp;          {4, 4, 4, 4}}
<strong style="user-select: auto;">Output</strong>: 
{{1, 2, 3, 4}, &nbsp;
&nbsp;{1, 2, 3, 4} &nbsp;
&nbsp;{1, 2, 3, 4}
&nbsp;{1, 2, 3, 4}} </span>
</pre>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>
<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input</strong>:
N = 2
mat[][] = {{1, 2},
&nbsp;          {-9, -2}}
<strong style="user-select: auto;">Output</strong>:
{{1, -9}, 
&nbsp;{2, -2}}
</span>
</pre>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong></span><br style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">You dont need to read input or print anything.&nbsp;</span><span style="font-size: 18px; user-select: auto;">Complete the function <strong style="user-select: auto;">transpose</strong>() which takes matrix[][] and N as input parameter and&nbsp;finds the transpose of the input matrix. You need to do this in-place. That is you need to update the original matrix with the transpose.&nbsp;<br style="user-select: auto;"><br style="user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong> O(N * N)<br style="user-select: auto;"><strong style="user-select: auto;">Expected Auxiliary Space:</strong> O(1)<br style="user-select: auto;"><br style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">1 &lt;= N &lt;= 10<sup style="user-select: auto;">3</sup><br style="user-select: auto;">-10<sup style="user-select: auto;">9</sup> &lt;= mat[i][j] &lt;= 10<sup style="user-select: auto;">9</sup></span></p></div>