<%@ include file="../commons/header.jspf" %>
<%@ include file="../commons/navigation.jspf" %>

<div class="container">
    <p><font color="red">${errorMessage}</font></p>
        <form action="/login.do" method="post">
            Enter your name <input type="text" name="name"/>
            Enter your password <input type="password" name="password"/> <input value="Login" type="submit"/>
        </form>
</div>

<%@ include file="../common/footer.jspf" %>