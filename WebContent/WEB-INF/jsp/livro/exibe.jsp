<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Livros Encontrados</title>
</head>
<body>
	Título: ${livroForm.livro.titulo} <br />
	Loja:   ${livroForm.livro.loja} <br />
	Preço:  <fmt:formatNumber value="${livroForm.livro.preco}" type="currency"/> <br />
	Autor:  ${livroForm.livro.autor}
</body>
</html>