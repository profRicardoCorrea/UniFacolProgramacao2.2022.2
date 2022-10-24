<%@ page language="java" contentType="text/html; charset=utf-8"	pageEncoding="utf-8"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <meta name="description" content="" />
    <meta
      name="author"
      content="Mark Otto, Jacob Thornton, and Bootstrap contributors"
    />
    <meta name="generator" content="Hugo 0.104.2" />
    <title>Checkout example · Bootstrap v5.2</title>

    <link href="./assets/dist/css/bootstrap.min.css" rel="stylesheet" />

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }

      .b-example-divider {
        height: 3rem;
        background-color: rgba(0, 0, 0, 0.1);
        border: solid rgba(0, 0, 0, 0.15);
        border-width: 1px 0;
        box-shadow: inset 0 0.5em 1.5em rgba(0, 0, 0, 0.1),
          inset 0 0.125em 0.5em rgba(0, 0, 0, 0.15);
      }

      .b-example-vr {
        flex-shrink: 0;
        width: 1.5rem;
        height: 100vh;
      }

      .bi {
        vertical-align: -0.125em;
        fill: currentColor;
      }

      .nav-scroller {
        position: relative;
        z-index: 2;
        height: 2.75rem;
        overflow-y: hidden;
      }

      .nav-scroller .nav {
        display: flex;
        flex-wrap: nowrap;
        padding-bottom: 1rem;
        margin-top: -1px;
        overflow-x: auto;
        text-align: center;
        white-space: nowrap;
        -webkit-overflow-scrolling: touch;
      }
    </style>

    <!-- Custom styles for this template -->
    <link href="form-validation.css" rel="stylesheet" />
  </head>
  <body class="bg-light">
    <div class="container ">
      <main>
      <div class="row g-5">
        
          <div class="col-sm-12  ">
          <h2>Times Cadastrados</h2>
        </div>
        </div>

        <div class="row g-5">
          <div class="col-md-7 col-lg-8">
            <form action="<%= request.getContextPath() %>/CadastrarTime" method="post" class="needs-validation" novalidate>
              <input type="hidden" name="op" value="cadastrar"/>
              
      
      <div class="table-responsive">
        <table class="table table-striped table-sm">
          <thead>
            <tr>
              <th scope="col">Código</th>
              <th scope="col">Nome</th>
              <th scope="col">Dt. Fundação</th>
              <th scope="col">Técnico</th>  
              <th scope="col">ALTERAR</th>             
            </tr>
          </thead>
          <tbody>
          <c:forEach items="${listTimes}" var="time">
            <tr>
              
                <td>${time.getCodigo()}</td>
                <td>${time.getNome()}</td>                
                <td>${time.getDataCriacao()}</td>
                <td>${time.getTecnico().getNome()}</td>   
                <td><a href="<%= request.getContextPath() %>/CadastrarTime?op=atualizar&idTime=${time.getCodigo()}">Editar</a></td>                
                       
            </tr>    
            </c:forEach>             
          </tbody>
        </table>
      </div>
          
              <hr class="my-4" />
               
            </form>
          </div>
        </div>
      </main>

      <footer class="my-5 pt-5 text-muted text-center text-small">
        
      </footer>
    </div>

    <script src="../assets/dist/js/bootstrap.bundle.min.js"></script>

    <script src="form-validation.js"></script>
  </body>
</html>
