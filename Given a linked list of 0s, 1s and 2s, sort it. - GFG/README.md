# Given a linked list of 0s, 1s and 2s, sort it.
## Easy
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given a linked list of <strong style="user-select: auto;">N</strong>&nbsp;nodes where nodes can contain values&nbsp;<strong style="user-select: auto;">0s</strong>, <strong style="user-select: auto;">1s,</strong> and <strong style="user-select: auto;">2s&nbsp;</strong>only. The task is to segregate <strong style="user-select: auto;">0s</strong>, <strong style="user-select: auto;">1s,</strong> and <strong style="user-select: auto;">2s</strong>&nbsp;linked list such that all zeros segregate to head side, 2s at the end of the linked list, and 1s in the mid of 0s and 2s.</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>
<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>N = 8
value[] = {1,2,2,1,2,0,2,2}
<strong style="user-select: auto;">Output: </strong>0 1 1 2 2 2 2 2<strong style="user-select: auto;">
Explanation: </strong>All the 0s are segregated
to the left end of the linked list,
2s to the right end of the list, and
1s in between.</span>
</pre>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>
<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>N = 4
value[] = {2,2,0,1}
<strong style="user-select: auto;">Output: </strong>0 1 2 2<strong style="user-select: auto;">
Explanation: </strong>After arranging all the
0s,1s and 2s in the given format,
the output will be 0 1 2 2.</span></pre>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">The task is to complete the function <strong style="user-select: auto;">segregate</strong>() which segregates the nodes in the linked list as asked in the problem statement and returns the head of the modified linked list. The <strong style="user-select: auto;">printing </strong>is done <strong style="user-select: auto;">automatically </strong>by the <strong style="user-select: auto;">driver code</strong>.</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:&nbsp;</strong>O(N).<br style="user-select: auto;"><strong style="user-select: auto;">Expected Auxiliary Space:&nbsp;</strong>O(N).</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">1 &lt;= N &lt;= 10<sup style="user-select: auto;">6</sup></span></p></div>