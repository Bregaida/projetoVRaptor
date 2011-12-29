<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Livros</title>
	</head>
	<body>
		<c:url var="pesquisa" value="/livro/pesquisa" />
		<c:url var="listaTodos" value="/livro/lista" />
		
		<h1>Livros</h1>
		
		<form action="${pesquisa}" method="post">
			<table>
				<tr>
					<td>Código: </td>
					<td><input name="livroForm.livro.id" /> </td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Pesquisar" /> </td>
				</tr>
			</table>
			<a href="${listaTodos}"> Listar Todos </a>
		</form>
	</body>
</html>