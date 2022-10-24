<%@ page language="java" contentType="text/html; charset=utf-8"	pageEncoding="utf-8"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Hugo 0.104.2">
    <title>Pricing example · Bootstrap v5.2</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/5.2/examples/pricing/">

    

    

<link href="./assets/dist/css/bootstrap.min.css" rel="stylesheet">

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
        background-color: rgba(0, 0, 0, .1);
        border: solid rgba(0, 0, 0, .15);
        border-width: 1px 0;
        box-shadow: inset 0 .5em 1.5em rgba(0, 0, 0, .1), inset 0 .125em .5em rgba(0, 0, 0, .15);
      }

      .b-example-vr {
        flex-shrink: 0;
        width: 1.5rem;
        height: 100vh;
      }

      .bi {
        vertical-align: -.125em;
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
    <link href="./assets/dist/css/pricing.css" rel="stylesheet">
  </head>
  <body>
    
<svg xmlns="http://www.w3.org/2000/svg" style="display: none;">
  <symbol id="check" viewBox="0 0 16 16">
    <title>Check</title>
    <path d="M13.854 3.646a.5.5 0 0 1 0 .708l-7 7a.5.5 0 0 1-.708 0l-3.5-3.5a.5.5 0 1 1 .708-.708L6.5 10.293l6.646-6.647a.5.5 0 0 1 .708 0z"/>
  </symbol>
</svg>

<div class="container py-3">
  <header>
    <div class="d-flex flex-column flex-md-row align-items-center pb-3 mb-4 border-bottom">
      <a href="/" class="d-flex align-items-center text-dark text-decoration-none">
        <svg xmlns="http://www.w3.org/2000/svg" width="40" height="32" class="me-2" viewBox="0 0 118 94" role="img"><title>Bootstrap</title><path fill-rule="evenodd" clip-rule="evenodd" d="M24.509 0c-6.733 0-11.715 5.893-11.492 12.284.214 6.14-.064 14.092-2.066 20.577C8.943 39.365 5.547 43.485 0 44.014v5.972c5.547.529 8.943 4.649 10.951 11.153 2.002 6.485 2.28 14.437 2.066 20.577C12.794 88.106 17.776 94 24.51 94H93.5c6.733 0 11.714-5.893 11.491-12.284-.214-6.14.064-14.092 2.066-20.577 2.009-6.504 5.396-10.624 10.943-11.153v-5.972c-5.547-.529-8.934-4.649-10.943-11.153-2.002-6.484-2.28-14.437-2.066-20.577C105.214 5.894 100.233 0 93.5 0H24.508zM80 57.863C80 66.663 73.436 72 62.543 72H44a2 2 0 01-2-2V24a2 2 0 012-2h18.437c9.083 0 15.044 4.92 15.044 12.474 0 5.302-4.01 10.049-9.119 10.88v.277C75.317 46.394 80 51.21 80 57.863zM60.521 28.34H49.948v14.934h8.905c6.884 0 10.68-2.772 10.68-7.727 0-4.643-3.264-7.207-9.012-7.207zM49.948 49.2v16.458H60.91c7.167 0 10.964-2.876 10.964-8.281 0-5.406-3.903-8.178-11.425-8.178H49.948z" fill="currentColor"></path></svg>
        <span class="fs-4">MENU OPERACIONAL</span>
      </a>

      <nav class="d-inline-flex mt-2 mt-md-0 ms-md-auto">
        
      </nav>
    </div>

     
  </header>

  <main>
    <div class="row row-cols-1 row-cols-md-3 mb-3 text-center">
      <div class="col">
        <div class="card mb-4 rounded-3 shadow-sm border-secondary">
          <div class="card-header py-3 text-bg-secondary border-secondary">
            <h4 class="my-0 fw-normal">TIME</h4>
          </div>
          <div class="card-body">
            
            <form>
            <button type="submit" formaction=<%= request.getContextPath() %>/CadastrarTime class="w-100 btn btn-lg btn-outline-secondary" style="margin:0px 5px 5px 0px;">CADASTRAR</button>
            </form><form>
            <button type="submit" formaction="https://www.w3docs.com" class="w-100 btn btn-lg btn-outline-secondary" style="margin:0px 5px 5px 0px;">LISTAR</button>
            </form><form>
            <button type="submit" formaction="https://www.w3docs.com" class="w-100 btn btn-lg btn-outline-secondary" style="margin:0px 5px 5px 0px;">PESQUISAR</button>
            </form>
          </div>
        </div>
      </div>
      <div class="col">
        <div class="card mb-4 rounded-3 shadow-sm border-success">
          <div class="card-header py-3 text-bg-success border-success">
            <h4 class="my-0 fw-normal">FUNCIONÁRIO</h4>
          </div>
          <div class="card-body">
          <form>
            <button type="submit" formaction=<%= request.getContextPath() %>/CadastrarFuncionario class="w-100 btn btn-lg btn-outline-success" style="margin:0px 5px 5px 0px;">CADASTRAR</button>
           </form>
           <form>
            <button type="submit" formaction="https://www.w3docs.com" class="w-100 btn btn-lg btn-outline-success" style="margin:0px 5px 5px 0px;">LISTAR</button>
            </form>
            <form>
            <button type="submit" formaction="https://www.w3docs.com" class="w-100 btn btn-lg btn-outline-success" style="margin:0px 5px 5px 0px;">PESQUISAR</button>
            </form>
          </div>
        </div>
      </div>
      <div class="col">
        <div class="card mb-4 rounded-3 shadow-sm border-primary">
          <div class="card-header py-3 text-bg-primary border-primary">
            <h4 class="my-0 fw-normal">ATLETA</h4>
          </div>
          <div class="card-body">
            <form>
            <button type="submit" formaction=<%= request.getContextPath() %>/CadastrarAtleta class="w-100 btn btn-lg btn-outline-primary" style="margin:0px 5px 5px 0px;">CADASTRAR</button>
            </form> 
            <form>
            <button type="submit" formaction="https://www.w3docs.com" class="w-100 btn btn-lg btn-outline-primary" style="margin:0px 5px 5px 0px;">LISTAR</button>
            </form> <form>
            <button type="submit" formaction="https://www.w3docs.com" class="w-100 btn btn-lg btn-outline-primary" style="margin:0px 5px 5px 0px;">PESQUISAR</button>
            </form>
          </div>
        </div>
      </div>
    </div>

    
  </main>

  <footer class="pt-4 my-md-5 pt-md-5 border-top">
    <div class="row">
      <div class="col-12 col-md">
       
      </div>
    </div>
  </footer>
</div>


    
  </body>
</html>