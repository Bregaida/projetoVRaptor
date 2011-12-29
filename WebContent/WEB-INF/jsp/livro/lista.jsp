<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Livros Cadastrados no Sistema</title>
</head>
<body>
	<table>
		<c:forEach var="livro" items="${livroList}">
			<tr id="livroRemove-${livro.id}">
				<td>${livro.titulo}</td>
				<td>${livro.loja}</td>
				<td><fmt:formatNumber value="${livro.preco}" type="currency"/></td>
				<td>${livro.autor}</td>
				<td><a href="javascript:void(0);" onclick="remove(${livro.id}); return false;">Remove</a></td>
			</tr>
		</c:forEach>
	</table>
</body>

<script type="text/javascript" src="<c:url value="http://ajax.googleapis.com/ajax/libs/jquery/1.6.1/jquery.min.js" />"></script>
<script type="text/javascript">
	function remove(id){
		$.get('remove?livro.id='+id,function(){
			$('#livroRemove-' + id).hide();
			alert('livro removido com sucesso');
			$('#livroRemove-' + id).remove();
		});
	}
</script>
</html>