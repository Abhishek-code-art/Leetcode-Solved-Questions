# Trie | (Insert and Search)
## Medium
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Trie is an efficient information retrieval data structure. Use this data structure to store Strings and search strings. Your task is to use TRIE data structure and search the given string A. If found print 1 else 0.</span></p>

<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example 1:</span></strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Input:
</span></strong><span style="font-size: 18px; user-select: auto;">N = 8
key[] = {the,a,there,answer,any,by,
&nbsp;        bye,their}
search = the
<strong style="user-select: auto;">Output: </strong>1<strong style="user-select: auto;">
Explanation: </strong>the is present in the given
string "the a there answer any by bye
their"</span>
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example 2:</span></strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Input:
</span></strong><span style="font-size: 18px; user-select: auto;">N = 8
key[] = {the,a,there,answer,any,by,
&nbsp;        bye,their}
search = geeks
<strong style="user-select: auto;">Output: </strong>0<strong style="user-select: auto;">
Explanation: </strong>geeks is not present in the
given string "the a there answer any by
bye their"</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
Complete <strong style="user-select: auto;">insert</strong> and <strong style="user-select: auto;">search</strong> function and return <strong style="user-select: auto;">true</strong>&nbsp;if key is present in the formed trie else <strong style="user-select: auto;">false</strong> in the search function. (In case of true, 1 is printed and false, 0 is printed by the driver's code.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong>&nbsp;O(M+|search|).<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:</strong>&nbsp;O(M).<br style="user-select: auto;">
M = sum of the&nbsp;length of all strings which is&nbsp;present in the key[]&nbsp;</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">|search| denotes the length of the string search.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 &lt;= N &lt;= 10<sup style="user-select: auto;">4</sup><br style="user-select: auto;">
1 &lt;= |input strings|, |A| &lt;= 100</span></p>
</div>