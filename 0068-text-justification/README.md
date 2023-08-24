<h2><a href="https://leetcode.com/problems/text-justification/">68. Text Justification</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given an array of strings <code style="user-select: auto;">words</code> and a width <code style="user-select: auto;">maxWidth</code>, format the text such that each line has exactly <code style="user-select: auto;">maxWidth</code> characters and is fully (left and right) justified.</p>

<p style="user-select: auto;">You should pack your words in a greedy approach; that is, pack as many words as you can in each line. Pad extra spaces <code style="user-select: auto;">' '</code> when necessary so that each line has exactly <code style="user-select: auto;">maxWidth</code> characters.</p>

<p style="user-select: auto;">Extra spaces between words should be distributed as evenly as possible. If the number of spaces on a line does not divide evenly between words, the empty slots on the left will be assigned more spaces than the slots on the right.</p>

<p style="user-select: auto;">For the last line of text, it should be left-justified, and no extra space is inserted between words.</p>

<p style="user-select: auto;"><strong style="user-select: auto;">Note:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">A word is defined as a character sequence consisting of non-space characters only.</li>
	<li style="user-select: auto;">Each word's length is guaranteed to be greater than <code style="user-select: auto;">0</code> and not exceed <code style="user-select: auto;">maxWidth</code>.</li>
	<li style="user-select: auto;">The input array <code style="user-select: auto;">words</code> contains at least one word.</li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> words = ["This", "is", "an", "example", "of", "text", "justification."], maxWidth = 16
<strong style="user-select: auto;">Output:</strong>
[
&nbsp; &nbsp;"This &nbsp; &nbsp;is &nbsp; &nbsp;an",
&nbsp; &nbsp;"example &nbsp;of text",
&nbsp; &nbsp;"justification. &nbsp;"
]</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> words = ["What","must","be","acknowledgment","shall","be"], maxWidth = 16
<strong style="user-select: auto;">Output:</strong>
[
&nbsp; "What &nbsp; must &nbsp; be",
&nbsp; "acknowledgment &nbsp;",
&nbsp; "shall be &nbsp; &nbsp; &nbsp; &nbsp;"
]
<strong style="user-select: auto;">Explanation:</strong> Note that the last line is "shall be    " instead of "shall     be", because the last line must be left-justified instead of fully-justified.
Note that the second line is also left-justified because it contains only one word.</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> words = ["Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"], maxWidth = 20
<strong style="user-select: auto;">Output:</strong>
[
&nbsp; "Science &nbsp;is &nbsp;what we",
  "understand &nbsp; &nbsp; &nbsp;well",
&nbsp; "enough to explain to",
&nbsp; "a &nbsp;computer. &nbsp;Art is",
&nbsp; "everything &nbsp;else &nbsp;we",
&nbsp; "do &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"
]</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= words.length &lt;= 300</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= words[i].length &lt;= 20</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">words[i]</code> consists of only English letters and symbols.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= maxWidth &lt;= 100</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">words[i].length &lt;= maxWidth</code></li>
</ul>
</div>