<h2><a href="https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/">1491. Average Salary Excluding the Minimum and Maximum Salary</a></h2><h3>Easy</h3><hr><div style="user-select: text;"><p style="user-select: text;">You are given an array of <strong style="user-select: text;">unique</strong> integers <code style="user-select: text;">salary</code> where <code style="user-select: text;">salary[i]</code> is the salary of the <code style="user-select: text;">i<sup style="user-select: text;">th</sup></code> employee.</p>

<p style="user-select: text;">Return <em style="user-select: text;">the average salary of employees excluding the minimum and maximum salary</em>. Answers within <code style="user-select: text;">10<sup style="user-select: text;">-5</sup></code> of the actual answer will be accepted.</p>

<p style="user-select: text;">&nbsp;</p>
<p style="user-select: text;"><strong class="example" style="user-select: text;">Example 1:</strong></p>

<pre style="user-select: text;"><strong style="user-select: text;">Input:</strong> salary = [4000,3000,1000,2000]
<strong style="user-select: text;">Output:</strong> 2500.00000
<strong style="user-select: text;">Explanation:</strong> Minimum salary and maximum salary are 1000 and 4000 respectively.
Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500
</pre>

<p style="user-select: text;"><strong class="example" style="user-select: text;">Example 2:</strong></p>

<pre style="user-select: text;"><strong style="user-select: text;">Input:</strong> salary = [1000,2000,3000]
<strong style="user-select: text;">Output:</strong> 2000.00000
<strong style="user-select: text;">Explanation:</strong> Minimum salary and maximum salary are 1000 and 3000 respectively.
Average salary excluding minimum and maximum salary is (2000) / 1 = 2000
</pre>

<p style="user-select: text;">&nbsp;</p>
<p style="user-select: text;"><strong style="user-select: text;">Constraints:</strong></p>

<ul style="user-select: text;">
	<li style="user-select: text;"><code style="user-select: text;">3 &lt;= salary.length &lt;= 100</code></li>
	<li style="user-select: text;"><code style="user-select: text;">1000 &lt;= salary[i] &lt;= 10<sup style="user-select: text;">6</sup></code></li>
	<li style="user-select: text;">All the integers of <code style="user-select: text;">salary</code> are <strong style="user-select: text;">unique</strong>.</li>
</ul>
</div>