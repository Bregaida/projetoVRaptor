<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Cadastro de Livros</title>
</head>
<body>
	<c:url var="adiciona" value="/livro/adiciona" />
	<form action="${adiciona}" method="post">
		<c:forEach var="error" items="${errors}">
    		${error.category} - ${error.message}<br />
		</c:forEach>
		<table>
			<tr>
				<td>Título</td>
				<td><input name="livroForm.livro.titulo" /> </td>
			</tr>
			<tr>
				<td>Loja</td>
				<td><input name="livroForm.livro.loja" /> </td>
			</tr>
			<tr>
				<td>Preço</td>
				<td><input name="livroForm.livro.preco" /> </td>
			</tr>
			<tr>
				<td>Autor</td>
				<td><input name="livroForm.livro.autor" /> </td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Adicionar" /> </td>
			</tr>		
		</table>
	</form>
</body>
</html>