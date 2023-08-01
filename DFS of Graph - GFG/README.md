# DFS of Graph
## Easy
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">You are given a connected undirected graph. Perform a Depth First Traversal of the graph.</span><br style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Note: </strong>Use a recursive approach to</span><span style="font-size: 18px; user-select: auto;">&nbsp;find the DFS traversal of the graph starting from the 0th vertex from left to right according to the graph.</span></p>
<p style="user-select: auto;"><br style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>
<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input: </strong>V = 5 , adj = [[2,3,1] , [0], [0,4], [0], [2]]
</span><img style="height: 300px; width: 300px; user-select: auto;" src="https://media.geeksforgeeks.org/img-practice/graph-1659528381.png" alt=""><span style="font-size: 18px; user-select: auto;">
<strong style="user-select: auto;">Output:</strong> 0 2 4 3 1
<strong style="user-select: auto;">Explanation</strong>: 
0 is connected to 2, 3, 1.
1 is connected to 0.
2 is connected to 0 and 4.
3 is connected to 0.
4 is connected to 2.
so starting from 0, it will go to 2 then 4,
and then 3 and 1.
Thus dfs will be 0 2 4 3 1.</span>
</pre>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>
<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong> V = 4, adj = [[1,3], [2,0], [1], [0]]
</span><img style="height: 300px; width: 300px; user-select: auto;" src="https://media.geeksforgeeks.org/img-practice/graph(1)-1659528893.png" alt=""><span style="font-size: 18px; user-select: auto;">
<strong style="user-select: auto;">Output:</strong> 0 1 2 3
<strong style="user-select: auto;">Explanation</strong>:
0 is connected to 1 , 3.
1 is connected to 0, 2. 
2 is connected to 1.
3 is connected to 0. 
so starting from 0, it will go to 1 then 2
then back to 0 then 0 to 3
thus dfs will be 0 1 2 3. </span>
</pre>
<p style="user-select: auto;"><br style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your task:</strong><br style="user-select: auto;">You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong style="user-select: auto;">dfsOfGraph()</strong>&nbsp;which takes the integer V denoting the number of vertices and adjacency list as input parameters and returns a list containing the DFS traversal of the graph starting from the 0th vertex from left to right according to the graph.</span></p>
<p style="user-select: auto;"><br style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:&nbsp;</strong>O(V + E)<br style="user-select: auto;"><strong style="user-select: auto;">Expected Auxiliary Space:&nbsp;</strong>O(V)</span></p>
<p style="user-select: auto;"><br style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">1 ≤ V, E ≤ 10<sup style="user-select: auto;">4</sup></span></p></div>