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
    <link href="./assets/dist/css/form-validation.css" rel="stylesheet" />
  </head>
  <body class="bg-light">
    <div class="container ">
      <main>
      <div class="row g-5">
        
          <div class="col-sm-12  ">
          <h2>Formulário de Cadastro de Funcionário</h2>
        </div>
        </div>

        <div class="row g-5">
          <div class="col-md-7 col-lg-8">
            <form action="<%= request.getContextPath() %>/CadastrarFuncionario" method="post" class="needs-validation" novalidate>
              
              <div class="row g-3">
                <div class="col-sm-12">
                  <label for="nome" class="form-label">Nome Completo</label>
                  <input
                    type="text"
                    class="form-control"
                    id="nome"
                    name="nome"
                    placeholder=""
                    value=""
                    required
                  />
                  <div class="invalid-feedback">
                    Nome completo é obrigatório.
                  </div>
                </div>

                <div class="col-sm-3">
                  <label for="cpf" class="form-label">CPF</label>
                  <input
                    type="text"
                    class="form-control"
                    id="cpf"
                    name="cpf"
                    placeholder=""
                    value=""
                    required
                  />
                  <div class="invalid-feedback">Digite um cpf válido.</div>
                </div>
                <div class="col-sm-3">
                  <label for="dt_nascimento" class="form-label">Dt. de Nascimento</label>
                  <input
                    type="date"
                    class="form-control"
                    id="dt_nascimento"
                    name="dt_nascimento"
                    placeholder=""
                    value=""
                    required
                  />
                  <div class="invalid-feedback">Digite uma data válido.</div>
                </div>

                <div class="col-md-4">
                  <label for="sexo" class="form-label">Sexo</label>
                  <select class="form-select" id="sexo" name="sexo" required>
                    <option value="">Selecione...</option>
                    <c:forEach items="${listSexo}" var="sexo">
                      <option value="${sexo}">${sexo}</option>
                    </c:forEach>
                  </select>
                  <div class="invalid-feedback">
                   Selecione uma opção válida.
                  </div>
                </div>

                <div class="col-md-4">
                  <label for="genero" class="form-label">Genero</label>
                  <select class="form-select" id="genero" name="genero" required>
                    <option value="">Selecione...</option>
                    <c:forEach items="${listGenero}" var="genero">
                      <option value="${genero}">${genero}</option>
                    </c:forEach>
                  </select>
                  <div class="invalid-feedback">
                   Selecione uma opção válida.
                  </div>
                </div>

                 <hr class="my-4" />

                 <div class="col-sm-3">
                  <label for="matricula" class="form-label">Matrícula</label>
                  <input
                    type="text"
                    class="form-control"
                    id="matricula"
                    name="matricula"
                    placeholder=""
                    value=""
                    required
                  />
                  <div class="invalid-feedback">Digite uma mmatrícula válida.</div>
                </div>

              <div class="col-sm-3">
                  <label for="dt_contratacao" class="form-label">Dt. de Contratação</label>
                  <input
                    type="date"
                    class="form-control"
                    id="dt_contratacao"
                    name="dt_contratacao"
                    placeholder=""
                    value=""
                    required
                  />
                  <div class="invalid-feedback">Digite uma data válida.</div>
                </div>

                <!-- <div class="col-sm-3">
                  <label for="dt_demissao" class="form-label">Data de Demissao</label>
                  <input
                    type="date"
                    class="form-control"
                    id="dt_demissao"
                    placeholder=""
                    value=""
                    required
                  />
                  <div class="invalid-feedback">Digite uma data válida.</div>
                </div>
              <div class="col-sm-3">
                  <label for="dt_renovacao" class="form-label">Data de Renovação</label>
                  <input
                    type="date"
                    class="form-control"
                    id="dt_renovacao"
                    placeholder=""
                    value=""
                    required
                  />
                  <div class="invalid-feedback">Digite uma data válida.</div>
                </div> -->
                <div class="col-md-4">
                  <label for="tipo_funcionario" class="form-label">Tipo Funcionário</label>
                  <select class="form-select" id="tipo_funcionario" name="tipo_funcionario" required>
                    <option value="">Selecione...</option>
                    <c:forEach items="${listTipoFuncionario}" var="tipo">
                      <option value="${tipo}">${tipo}</option>
                    </c:forEach>
                  </select>
                  <div class="invalid-feedback">
                   Selecione uma opção válida.
                  </div>
                </div>
                 <div class="col-sm-3">
                  <label for="salario" class="form-label">Valor do Salário</label>
                  <input
                    type="number"
                    class="form-control"
                    id="salario"
                     name="salario"
                    placeholder=""
                    value=""
                    required
                  />
                  <div class="invalid-feedback">Digite um salario válido.</div>
                </div>



 

              <hr class="my-4" />

              <button class="w-100 btn btn-primary btn-lg" type="submit">
                Salvar Dados do Funcionário
              </button>
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
