<%@page import="com.ftsafe.ik.dictionary.DictionaryProxy"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%

//接收消息,执行对应操作

String opt = request.getParameter("opt");

try {
	if("add".equals(opt)){
		DictionaryProxy.addWords();
		out.print("add");
	}else if("remove".equals(opt)){
		DictionaryProxy.disableWords();
		out.print("remove");
	}else{
		out.print("nothing");
	}
} catch (Exception e) {
	out.print(e.getMessage());
}



%>
