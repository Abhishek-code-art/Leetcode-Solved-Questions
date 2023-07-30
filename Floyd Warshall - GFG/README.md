# Floyd Warshall
## Medium
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">The problem is to find the shortest distances between every pair of vertices in a given <strong style="user-select: auto;">edge-weighted directed</strong>&nbsp;graph. The graph is represented as an adjacency matrix of size&nbsp;<strong style="user-select: auto;">n*n</strong>. <strong style="user-select: auto;">Matrix[i][j]</strong> denotes&nbsp;the weight of the edge from <strong style="user-select: auto;">i to j.&nbsp;</strong>If&nbsp;<strong style="user-select: auto;">Matrix[i][j]=-1,&nbsp;</strong>it means there is no&nbsp;edge from <strong style="user-select: auto;">i to j.</strong><br style="user-select: auto;">
<strong style="user-select: auto;">Do it in-place.</strong></span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input: </strong>matrix = {{0,25},{-1,0}}
<img alt="" src="https://media.geeksforgeeks.org/wp-content/uploads/20221106202714/WhatsAppImage20221106at82359PM.jpeg" style="height: 125px; width: 135px; user-select: auto;">
<strong style="user-select: auto;">Output: </strong>{{0,25},{-1,0}}
<img alt="" src="https://media.geeksforgeeks.org/wp-content/uploads/20221106202714/WhatsAppImage20221106at82359PM.jpeg" style="height: 125px; width: 135px; user-select: auto;">
<strong style="user-select: auto;">Explanation: </strong>The shortest distance between
every pair is already given(if it exists).</span>
</pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input: </strong>matrix = {{0,1,43},{1,0,6},{-1,-1,0}}
<img alt="" src="https://media.geeksforgeeks.org/wp-content/uploads/20221106203741/WhatsAppImage20221106at83711PM.jpeg" style="height: 164px; width: 176px; user-select: auto;">
<strong style="user-select: auto;">Output: </strong>{{0,1,7},{1,0,6},{-1,-1,0}}
<img alt="" src="https://media.geeksforgeeks.org/wp-content/uploads/20221106204057/WhatsAppImage20221106at84031PM.jpeg" style="height: 167px; width: 177px; user-select: auto;">
<strong style="user-select: auto;">Explanation: </strong>We can reach 2 from 0 as 0-&gt;1-&gt;2
and the cost will be 1+6=7 which is less than 
43.</span>
</pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
You don't need to read, return or print anything. Your task is to complete the function&nbsp;<strong style="user-select: auto;">shortest_distance()&nbsp;</strong>which takes the <strong style="user-select: auto;">matrix</strong> as input parameter and <strong style="user-select: auto;">modifies</strong> the distances <strong style="user-select: auto;">for every pair in-place.</strong></span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:&nbsp;</strong>O(n<sup style="user-select: auto;">3</sup>)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Space Complexity:&nbsp;</strong>O(1)</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 &lt;= n &lt;= 100<br style="user-select: auto;">
-1 &lt;= matrix[ i ][ j ] &lt;= 1000</span></p>
</div>