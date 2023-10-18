<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<c:set var="num" value="100000000.123" />
0 패턴 : <fmt:formatNumber value="${num}" pattern="0,000.00000" /><br>
# 패턴 : <fmt:formatNumber value="${num}" pattern="#,###.#####" /><br>