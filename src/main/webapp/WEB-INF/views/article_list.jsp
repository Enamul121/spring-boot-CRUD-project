
<%@include file="fragments/header.jspf"%>
<%@include file="fragments/nav.jspf"%>


<h1>ALL ARTICLES :) </h1>
<br>
<table class="table table-striped">
    <thead>
    <th scope="row">#ID</th>
    <th scope="row">Title</th>
    <th scope="row">Category</th>
    <th scope="row">Update</th>
    <th scope="row">Delete</th>
    </thead>
    <tbody>
    <c:forEach items="${articleLists}" var="article" >
        <tr>
            <td>${article.id}</td>
            <td>${article.title}</td>
            <td>${article.category}</td>
            <td>
                <spring:url value="/updateArticle/${article.id }" var="updateURL" />
                <a class="btn btn-primary" href="${updateURL}" role="button" >Update</a>
            </td>
            <td>
                <spring:url value="/deleteArticle/${article.id}" var="deleteURL" />
                <a class="btn btn-primary" href="${deleteURL}" role="button" >Delete</a>
            </td>
        </tr>

    </c:forEach>

    </tbody>
</table>
<br>
<spring:url value="/addArticle" var="addURL" />
<a class="btn btn-primary" href="${addURL}" role="button" >Add New Article</a>

<br>

<%@include file="fragments/footer.jspf"%>