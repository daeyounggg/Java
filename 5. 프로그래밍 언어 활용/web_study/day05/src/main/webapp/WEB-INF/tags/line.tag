<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ attribute name="color" %>
<%@ attribute name="size" type="java.lang.Integer" %>
<div style="color: ${color};" >
<%
    for(int i = 0; i < size; i++) {
    out.print("-");
    }
%>
</div>