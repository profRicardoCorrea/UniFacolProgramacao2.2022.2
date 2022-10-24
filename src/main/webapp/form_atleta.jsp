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
          <h2>Formulário de Cadastro de Atleta</h2>
        </div>
        </div>

        <div class="row g-5">
          <div class="col-md-7 col-lg-8">
            <form action="<%= request.getContextPath() %>/AtletaAddServlet" method="get" class="needs-validation" novalidate>
              <div class="row g-3">
                <div class="col-sm-12">
                  <label for="nome" class="form-label">Nome Completo</label>
                  <input
                    type="text"
                    class="form-control"
                    id="nome"
                    placeholder=""
                    value=""
                    disabled

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
                    placeholder=""
                    value=""
                    disabled
                  />
                  <div class="invalid-feedback">Digite um cpf válido.</div>
                </div>
                <div class="col-sm-3">
                  <label for="dt_nascimento" class="form-label">Dt. de Nascimento</label>
                  <input
                    type="date"
                    class="form-control"
                    id="dt_nascimento"
                    placeholder=""
                    value=""
                    disabled
                  />
                  <div class="invalid-feedback">Digite uma data válido.</div>
                </div>

                <div class="col-md-4">
                  <label for="sexo" class="form-label">Sexo</label>
                  <select class="form-select" id="sexo" disabled>

                   
                    <option value="">Selecione...</option>
                    <option>United States</option>
                  </select>
                  <div class="invalid-feedback">
                   Selecione uma opção válida.
                  </div>
                </div>

                 <div class="col-md-4">
                  <label for="genero" class="form-label">Genero</label>
                  <select class="form-select" id="genero" disabled>
                    <option value="">Selecione...</option>
                    <option>United States</option>
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
                    placeholder=""
                    value=""
                    disabled
                  />
                  <div class="invalid-feedback">Digite uma matrícula válida.</div>
                </div>

              <div class="col-sm-3">
                  <label for="dt_contratacao" class="form-label">Dt. de Contratação</label>
                  <input
                    type="date"
                    class="form-control"
                    id="dt_contratacao"
                    placeholder=""
                    value=""
                    disabled
                  />
                  <div class="invalid-feedback">Digite uma data válida.</div>
                </div>

                <div class="col-sm-3">
                  <label for="dt_demissao" class="form-label">Data de Demissao</label>
                  <input
                    type="date"
                    class="form-control"
                    id="dt_demissao"
                    placeholder=""
                    value=""
                    disabled
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
                    disabled
                  />
                  <div class="invalid-feedback">Digite uma data válida.</div>
                </div>
                <div class="col-md-4">
                  <label for="tipo_funcionario" class="form-label">Tipo Funcionário</label>
                  <select class="form-select" id="tipo_funcionario" disabled>
                    <option value="">Selecione...</option>
                    <option>United States</option>
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
                    placeholder=""
                    value=""
                    disabled
                  />
                  <div class="invalid-feedback">Digite um cpf válido.</div>
                </div>
              <hr class="my-4" />
                <div class="col-md-4">
                  <label for="posicao_jogador" class="form-label">Posição do Jogador</label>
                  <select class="form-select" id="posicao_jogador" required>
                    <option value="">Selecione...</option>
                    <c:forEach items="${listPosicaoJogador}" var="tipo">
                      <option value="${tipo}">${tipo}</option>
                    </c:forEach>
                   
                  </select>
                  <div class="invalid-feedback">
                   Selecione uma opção válida.
                  </div>
                </div>

                <div class="col-md-4">
                  <label for="time" class="form-label">Time</label>
                  <select class="form-select" id="time" required>
                    <option value="">Selecione...</option>
                    <c:forEach items="${listTimes}" var="time">
                      <option value="${time.getCodigo()}">${time.getNone()}</option>
                    </c:forEach>
                  </select>
                  <div class="invalid-feedback">
                   Selecione uma opção válida.
                  </div>
                </div>

                <div class="col-md-4">
                  <label for="status_jogador" class="form-label">Status Jogador</label>
                  <select class="form-select" id="status_jogador" required>
                    <option value="">Selecione...</option>
                    <c:forEach items="${listJogadorStatus}" var="status">
                      <option value="${status}">${status}</option>
                    </c:forEach>
                  </select>
                  <div class="invalid-feedback">
                   Selecione uma opção válida.
                  </div>
                </div>
<h2>Cartões Recebidos</h2>
      <div class="table-responsive">
        <table class="table table-striped table-sm">
          <thead>
            <tr>
              <th scope="col">#</th>
              <th scope="col">Tipo</th>
              <th scope="col">Data Ini</th>
              <th scope="col">Data Ini</th>
              <th scope="col">Vl. Multa</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>001</td>
              <td>random</td>
              <td>data</td>
              <td>placeholder</td>
              <td>text</td>
            </tr>
            <tr>
              <td>002</td>
              <td>placeholder</td>
              <td>irrelevant</td>
              <td>visual</td>
              <td>layout</td>
            </tr>
            <tr>
              <td>003</td>
              <td>data</td>
              <td>rich</td>
              <td>dashboard</td>
              <td>tabular</td>
            </tr>
            <tr>
              <td>003</td>
              <td>information</td>
              <td>placeholder</td>
              <td>illustrative</td>
              <td>data</td>
            </tr>
            <tr>
              <td>004</td>
              <td>text</td>
              <td>random</td>
              <td>layout</td>
              <td>dashboard</td>
            </tr>
            <tr>
              <td>005</td>
              <td>dashboard</td>
              <td>irrelevant</td>
              <td>text</td>
              <td>placeholder</td>
            </tr>
            <tr>
              <td>006</td>
              <td>dashboard</td>
              <td>illustrative</td>
              <td>rich</td>
              <td>data</td>
            </tr>
            <tr>
              <td>007</td>
              <td>placeholder</td>
              <td>tabular</td>
              <td>information</td>
              <td>irrelevant</td>
            </tr>
            <tr>
              <td>008</td>
              <td>random</td>
              <td>data</td>
              <td>placeholder</td>
              <td>text</td>
            </tr>
            <tr>
              <td>009</td>
              <td>placeholder</td>
              <td>irrelevant</td>
              <td>visual</td>
              <td>layout</td>
            </tr>
            <tr>
              <td>010</td>
              <td>data</td>
              <td>rich</td>
              <td>dashboard</td>
              <td>tabular</td>
            </tr>
             
          </tbody>
        </table>
      </div>
              <hr class="my-4" />

              <button class="w-100 btn btn-primary btn-lg" type="submit">
                Salvar Dados do Atleta
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
