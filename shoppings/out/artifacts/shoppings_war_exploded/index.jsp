<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/26
  Time: 18:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
<script type="text/javascript" src="js/jquery-1.4.3.min.js"></script>
<script>
function commits() {
  $.getJSON("tree/select",function (res) {
    alert("-----");
  })
}

function tiaozhuan(){
  $.getJSON("tree/tiaozhuan",function(res){



  });

}
/*function selectNav(){
  $.getJSON("nav/navlist",{"id":"1"},function(res){
           alert(res);


  });

}*/

function httpTiao(){

  window.location="tree/httpTiao";
}

function chongdingx(){
  window.location="tree/chongDing";

}
function selectNav(){
  window.location="nav/navlist?id=1";
}

function navInsert(){

  window.location="nav/navInsert";
}
</script>
  </head>
  <body>
  hello world !
  <input type="button"  value="查看" onclick="commits()" />
  <input type="button"  value="跳转" onclick="tiaozhuan()" />
  <input type="button"  value="http跳转" onclick="httpTiao()" />
  <input type="button"  value="http跳转" onclick="chongdingx()" />
  <input type="button"  value="小程序查询" onclick="selectNav()" />
  <input type="button"  value="插入" onclick="navInsert()" />
  <a href="demo.jsp">222</a>
  </body>
</html>
