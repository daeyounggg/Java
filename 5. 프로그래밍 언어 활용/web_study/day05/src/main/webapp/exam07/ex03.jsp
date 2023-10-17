<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:set var="num1" value="100" />

<c:if test="${num1 == 100}">
    num1이 100이다.
</c:if>
<c:if test="${num1 != 100}">
    num1이 100이 아니다.
</c:if>
<c:if test="true">
    <div>참</div>
</c:if>