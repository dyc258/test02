<#import  "test02.ftl" as tm2 >
欢迎您${user}!!!<br/>
${numb}<br/>
${doub}<br/>
${date?string("yyyy-MM-dd hh:mm:ss")}<br/>

<#list list as ac>
	${ac}<br/>
</#list>

${user.id}||${user.addr}<br/>

<#list aa as li>
${li.id}||${li.addr}<br/>
</#list>
<br/>
${aaaaa!"test"}
<br/>
${2*5}
--------map-------<br/>
<#list mm?keys as mapk>
${mapk}----${mm["${mapk}"]}<br/>
</#list>
<#if usertemp=="dd">
来错地方了
<#else>
欢迎来讯
</#if>

<#if cj gte 90>
优秀
<#elseif cj gte 80>
良好
<#else>
渣渣
</#if>
<br/>
<include "test.txt" />

<#macro tt>
自定义内容<br/>
 	自定义内容<br/>
 	
</#macro>
<@tt></@tt>
<br/>
<#macro tt1 person="sxt">
	自定义内容 ${person}
 	自定义内容${person}
</#macro>

<@tt1></@tt1>

<@tt1 person="qqqqqq"></@tt1>

<#macro tt2 count>
	<#list 1..count as temp>
		<#nested temp><br/>
	</#list>
</#macro>

<@tt2 count=6; ip>
 tt2--${ip}<br/>
</@tt2>

<@tm2.tt3 count=20; mm>
tt2||${mm}
</@tm2.tt3>

