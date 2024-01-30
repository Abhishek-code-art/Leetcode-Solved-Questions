<h2><a href="https://leetcode.com/problems/evaluate-reverse-polish-notation/">150. Evaluate Reverse Polish Notation</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given an array of strings <code style="user-select: auto;">tokens</code> that represents an arithmetic expression in a <a href="http://en.wikipedia.org/wiki/Reverse_Polish_notation" target="_blank" style="user-select: auto;">Reverse Polish Notation</a>.</p>

<p style="user-select: auto;">Evaluate the expression. Return <em style="user-select: auto;">an integer that represents the value of the expression</em>.</p>

<p style="user-select: auto;"><strong style="user-select: auto;">Note</strong> that:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">The valid operators are <code style="user-select: auto;">'+'</code>, <code style="user-select: auto;">'-'</code>, <code style="user-select: auto;">'*'</code>, and <code style="user-select: auto;">'/'</code>.</li>
	<li style="user-select: auto;">Each operand may be an integer or another expression.</li>
	<li style="user-select: auto;">The division between two integers always <strong style="user-select: auto;">truncates toward zero</strong>.</li>
	<li style="user-select: auto;">There will not be any division by zero.</li>
	<li style="user-select: auto;">The input represents a valid arithmetic expression in a reverse polish notation.</li>
	<li style="user-select: auto;">The answer and all the intermediate calculations can be represented in a <strong style="user-select: auto;">32-bit</strong> integer.</li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> tokens = ["2","1","+","3","*"]
<strong style="user-select: auto;">Output:</strong> 9
<strong style="user-select: auto;">Explanation:</strong> ((2 + 1) * 3) = 9
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> tokens = ["4","13","5","/","+"]
<strong style="user-select: auto;">Output:</strong> 6
<strong style="user-select: auto;">Explanation:</strong> (4 + (13 / 5)) = 6
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
<strong style="user-select: auto;">Output:</strong> 22
<strong style="user-select: auto;">Explanation:</strong> ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
= ((10 * (6 / (12 * -11))) + 17) + 5
= ((10 * (6 / -132)) + 17) + 5
= ((10 * 0) + 17) + 5
= (0 + 17) + 5
= 17 + 5
= 22
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= tokens.length &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">tokens[i]</code> is either an operator: <code style="user-select: auto;">"+"</code>, <code style="user-select: auto;">"-"</code>, <code style="user-select: auto;">"*"</code>, or <code style="user-select: auto;">"/"</code>, or an integer in the range <code style="user-select: auto;">[-200, 200]</code>.</li>
</ul>
</div>