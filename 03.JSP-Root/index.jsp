<%-- 상단 지시어 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%! // 스크립트 요소 선언부
    String str1 = "나야나!";
    String str2 = "JSP로 개발해야지!!!";

%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>나의 첫 JSP!</title>
</head>
<body>
    <%-- 스크립트요소(표현식) --%>
    <h1><%=str1%></h1>
    <p>
        <% // 스크립트요소(스크립트릿)
            out.println(str2+" 화이팅!!!");
        %>
    </p>
    
</body>
</html>