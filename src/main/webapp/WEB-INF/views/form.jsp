
<%@include file="fragments/header.jspf"%>
<%@include file="fragments/nav.jspf"%>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">



<h1>

    WELCOME ARTICLE FORM ::::::::::::::::::::::::::::::::
</h1>
<spring:url value="/saveArticle" var="saveURL" />
<h2>Article</h2>
<form:form modelAttribute="articleForm" method="post" action="${saveURL }" cssClass="form" >
    <form:hidden path="id"/>
    <div class="form-group">
        <label>Title</label>
        <form:input path="title" cssClass="form-control" id="title" />
    </div>
    <div class="form-group">
        <label>Category</label>
        <form:input path="category" cssClass="form-control" id="category" />
    </div>
    <button type="submit" class="btn btn-primary">Save</button>
</form:form>
<br>




<%@include file="fragments/footer.jspf"%>