<%@ include file="../commons/header.jspf" %>
<%@ include file="../commons/navigation.jspf" %>

<div class="container">
    Your New Action Item:
    <form method="POST" action="/add-to.do">
        <fieldset class="form-group">
            <label>Description</label>
            <input name="todo" type="text" class="form-control"/>
        </fieldset>
        <fieldset class="form-group">
            <label>Category</label>
            <input name="category" type="text" class="form-control"/>
        </fieldset>
        <input name="add" type="submit" class="btn btn-success" value="Submit"/>
    </form>
</div>

<%@ include file="../common/footer.jspf"