<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        <title> AGUA QUALIDADE </title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/jumbotron-narrow.css" rel="stylesheet">
    </head>

    <body>
        <div class="container">
            <div class="header clearfix">
                <h1 class="text-muted"><img src="img/aqua.jpg" width="48" alt="..." /> AGUA QUALIDADE</h1>
            </div>
            <div class="container">
                <br />
                <div class="row vertical-offset-100">
                    <div class="col-md-10 col-md-offset-1">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <div class="col-md-10">
                                    <h3 class="panel-title">CLIENTES</h3>
                                </div>
                                <div class="btn-group">
                                    <button type="button" class="btn btn-info dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                        MENU
                                        <span class="caret"></span>
                                        <span class="sr-only">Toggle Dropdown</span>
                                    </button>
                                    <ul class="dropdown-menu">
                                        <li><a href="FrontController?action=BuscarContrato" class="" role="button">Contratos</a></li>
                                        <li><a href="FrontController?action=BuscarContratoColeta" class="" role="button">Contratos Coleta</a></li>
                                        <li><a href="FrontController?action=BuscarContratoAnalise" class="" role="button">Contratos Analise</a></li>
                                        <li><a href="FrontController?action=BuscarContratoFechamento" class="" role="button">Contratos Fechamento</a></li>
                                        <li><a href="FrontController?action=BuscarCliente" class="" role="button">Clientes</a></li>
                                        <li><a href="FrontController?action=BuscarFuncionario" class="" role="button">Funcionarios</a></li>
                                        <li><a href="FrontController?action=BuscarEmpresa" class="" role="button">Empresa</a></li>
                                    </ul>
                                    <a href="FrontController?action=PrepararInserirCliente" class="" role="button"><img src="img/INSERT.jpg" width="36" alt="..." /></a>
                                </div>
                            <div class="panel-body">
                                <div class="table-responsive">
                                    <table class="table">
                                        <div class="alert alert-danger" role="alert"  <c:if test="${!resposta.equals('Alteração recusada')}"> hidden</c:if>>
                                            <span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>
                                            <span class="sr-only">Erro:</span>
                                            ${resposta}
                                        </div>
                                        <tr>
                                            <th>NOME</th>
                                            <th>IDENTIFICACAO</th>
                                            <th>EMAIL</th>
                                            <th colspan=2>Ação</th>
                                        </tr>
                                        <c:forEach items="${clientes}" var="cliente">
                                            <tr>
                                                <td><c:out value="${cliente.nome}" /></td>
                                                <td><c:out value="${cliente.identificacao}" /></td>
                                                <td><c:out value="${cliente.email}" /></td>
                                                <td><a class="btn btn-success btn-xs " role="button" href="FrontController?action=PrepararEditarCliente&codigo=<c:out value="${cliente.codigo}"/>">EDITAR</a></td>
                                                <td><a class="btn btn-danger btn-xs " role="button" href="FrontController?action=PrepararExcluirCliente&codigo=<c:out value="${cliente.codigo}"/>">EXCLUIR</a></td>
                                            </tr>
                                        </c:forEach>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
            <footer class="footer">
                <p>&copy; 2018 AGUA QUALIDADE - GRANBERY JF.</p>
            </footer>
        </div>
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>

