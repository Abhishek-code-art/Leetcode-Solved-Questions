# Flip Bits
## Easy
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given an array <strong style="user-select: auto;">A[]</strong> consisting&nbsp;of <strong style="user-select: auto;">0’s</strong> and <strong style="user-select: auto;">1’s</strong>. A flip operation is one in which you turn <strong style="user-select: auto;">1</strong> into&nbsp;<strong style="user-select: auto;">0</strong> and a <strong style="user-select: auto;">0</strong> into&nbsp;<strong style="user-select: auto;">1</strong>. You have to do at most one&nbsp;“Flip” operation&nbsp;of any subarray. Formally, select a range <strong style="user-select: auto;">(l, r) </strong>in the array <strong style="user-select: auto;">A[]</strong>, such that (0 ≤ l ≤ r &lt; n) holds and flip the elements in this range to get the maximum ones in the final array. You can possibly make zero operations to get the answer.</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>
<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong>
N = 5
A[] = {1, 0, 0, 1, 0} 
<strong style="user-select: auto;">Output:</strong>
4
<strong style="user-select: auto;">Explanation:</strong>
We can perform a flip operation in the range [1,2]
After flip operation array is : [<em style="user-select: auto;"> 1</em> <strong style="user-select: auto;">1 1</strong> <em style="user-select: auto;">1 0</em> ]
Count of one after fliping is : 4</span>
<span style="font-size: 14px; user-select: auto;"><em style="user-select: auto;">[Note: the subarray marked in bold is the flipped subarray]</em></span></pre>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>
<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong>
N = 7
A[] = {1, 0, 0, 1, 0, 0, 1}</span>
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Output:</strong>
6
<strong style="user-select: auto;">Explanation:</strong></span>
<span style="font-size: 18px; user-select: auto;">We can perform a flip operation in the range [1,5]
After flip operation array is : [<em style="user-select: auto;"> 1</em> <strong style="user-select: auto;">1 1 0 1 1</strong> <em style="user-select: auto;">1</em></span><span style="font-size: 18px; user-select: auto;">]
Count of one after fliping is : 6</span>
<span style="font-size: 14px; user-select: auto;"><em style="user-select: auto;">[Note: the subarray marked in bold is the flipped subarray]</em></span></pre>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:&nbsp;&nbsp;</strong><br style="user-select: auto;">You don't need to read input or print anything. Your task is to complete the function <strong style="user-select: auto;">maxOnes()</strong>&nbsp;which takes the array <strong style="user-select: auto;">A[]</strong> and its size <strong style="user-select: auto;">N</strong><strong style="user-select: auto;"> </strong>as inputs and returns the&nbsp;maximum number of 1's you can have in the array after atmost one flip operation.</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong> O(N)</span><br style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Auxiliary Space:</strong> O(1)</span></p>
<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">1 ≤ N ≤ 10<sup style="user-select: auto;">6</sup><br style="user-select: auto;">0 ≤ A[i] ≤ 1</span></p></div>