<%@ include file="../commons/header.jspf" %>
<%@ include file="../commons/navigation.jspf" %>

<div class="container">
    <H1>Welcome ${name}</H1>

    <table class="table table-striped">
        <caption>Your Todos are</caption>
        <thead>
            <th>Description</th>
            <th>Category</th>
            <th>Actions</th>
        </thead>
        <tbody>
            <c:forEach items="${todos}" var="todo">
                <tr>
                    <td>${todo.name}</td>
                    <td>${todo.category}</td>
                    <td><a class="btn btn-danger" href="/delete-to.do?todo=${todo.name}&${todo.category}">Delete</a></td>
                </tr>
            </c:forEach>
    </table>
    <p>
        <font color="red">${errorMessage}</font>
    </p>
    <a class="btn btn-success" href="/add-to.do">Add New Todo</a>
</div>

<%@ include file="../commons/footer.jspf" %>