<p>给定一个二进制数组 <code>nums</code> (&nbsp;<strong>索引从0开始&nbsp;</strong>)。</p>

<p>我们将<code>x<sub>i</sub></code>&nbsp;定义为其二进制表示形式为子数组&nbsp;<code>nums[0..i]</code>&nbsp;(从最高有效位到最低有效位)。</p>

<ul> 
 <li>例如，如果 <code>nums =[1,0,1]</code> ，那么&nbsp;<code>x<sub>0</sub>&nbsp;= 1</code>,&nbsp;<code>x<sub>1</sub>&nbsp;= 2</code>, 和&nbsp;<code>x<sub>2</sub>&nbsp;= 5</code>。</li> 
</ul>

<p>返回布尔值列表&nbsp;<code>answer</code>，只有当&nbsp;<code>x<sub>i</sub></code><em>&nbsp;</em>可以被 <code>5</code>&nbsp;整除时，答案&nbsp;<code>answer[i]</code> 为&nbsp;<code>true</code>，否则为 <code>false</code>。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong>nums = [0,1,1]
<strong>输出：</strong>[true,false,false]
<strong>解释：</strong>
输入数字为 0, 01, 011；也就是十进制中的 0, 1, 3 。只有第一个数可以被 5 整除，因此 answer[0] 为 true 。
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>nums = [1,1,1]
<strong>输出：</strong>[false,false,false]
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code><sup>&nbsp;</sup></li> 
 <li><code>nums[i]</code>&nbsp;仅为&nbsp;<code>0</code>&nbsp;或&nbsp;<code>1</code></li> 
</ul>

<details><summary><strong>Related Topics</strong></summary>位运算 | 数组</details><br>

<div>👍 158, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/issues' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.online/algo/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.online/algo/' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：网站新增大量习题，新增排序算法专题及可视化，具体请查看 [网站更新日志](https://labuladong.online/algo/changelog/website/)~**

</div>

