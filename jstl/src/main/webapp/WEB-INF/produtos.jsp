<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<fmt:message key="mensagem.bemVindo" />
	<fmt:setLocale value="en_US" />
	<c:forEach var="produto" items="${produtos}" varStatus="status">
		<ul>
			<c:if test="${produto.valido}">
				<li>${status.index}:${produto.nome.toUpperCase()}=<fmt:formatNumber
						value="${produto.preco}" type="currency" />: <fmt:formatDate
						pattern="EEEE, dd 'de' MMMM 'de' yyyy"
						value="${produto.dataAdicao}" /></li>
			</c:if>

			<c:if test="${not produto.valido}">
				<li>${status.index}:${produto.nome}-produtoinválido</li>
			</c:if>

			<%--
			<c:choose>
				<c:when test="${produto.valido}">
					<li>${status.index}:${produto.nome} = ${produto.preco}</li>
				</c:when>

				<c:otherwise>
					<li>${status.index}:${produto.nome} - produto inválido</li>
				</c:otherwise>
			</c:choose>
 			--%>
		</ul>
	</c:forEach>
	<c:url value="/formulario" var="urlAdicionar" />
	<a href="${urlAdicionar}">Teste</a>

	<c:set var="nome" value="João da Silva" />
	<c:out value="${nome}" />

	<fmt:message key="mensagem.novoProduto" />

	<c:import url="rodape.jsp" />
</body>
</html>