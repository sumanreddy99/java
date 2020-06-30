<%@ page import = "java.util.Locale" %>
<%@ page import = "org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%@ page import="org.springframework.context.ApplicationContext"%>
<%@ page import = "org.springframework.context.support.ResourceBundleMessageSource"%>


<%
String lang=request.getHeader("accept-language");


Locale locale= new Locale(lang);

ApplicationContext ap=new ClassPathXmlApplicationContext("classpath*:beans.xml");

String value=ap.getMessage("lable",null,locale);
%>
<form action="./hello">
<%=value%>:<input type="text" name="name"/>
           <input type="submit" name="submit">

</form>