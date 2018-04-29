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
                <h1 class="text-muted"><img src="img/aqua.jpg" width="48" alt="..." /> AGUA QUALIDADE </h1>
            </div>
            <div class="container">
                <br />
                <div class="row vertical-offset-100">
                    <div class="col-md-8 col-md-offset-2">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <div class="col-md-10">
                                    <h3 class="panel-title">Editar Contrato</h3>
                                </div>
                                <div>
                                    <a href="FrontController?action=BuscarContrato" class="" role="button"><img src="img/cancelar.png" width="36" alt="..." /></a>
                                </div>
                            </div>
                            <div class="panel-body">
                                <form accept-charset="UTF-8" role="form" action="FrontController?action=AlterarContrato" method="post">
                                    <fieldset>
                                        <div class="col-md-6">
                                                    <div class="form-group">
                                                        <th><span>Codigo </span></th>
                                                        <input name="textCodigo" type="text" value="${contrato.codigo}" hidden/>
                                                        <input class="form-control" placeholder="Numero" name="textCodigo" type="text" value="${contrato.codigo}" readonly="readonly"/>
                                                    </div>
                                                    <div class="form-group">
                                                        <th><span>Cliente </span></th>
                                                        <select name="textCodigoCliente" class="form-control">
                                                            <c:forEach items="${clientes}" var="cliente">
                                                                <option name="textCodigoCliente" value="${cliente.codigo}" <c:if test="${cliente.codigo == contrato.cliente.codigo}"> selected</c:if>>${cliente.nome}</option>
                                                            </c:forEach>
                                                        </select>
                                                    </div>
                                                    <div class="form-group">
                                                        <th><span>Empresa </span></th>
                                                        <select name="textCodigoEmpresa" class="form-control">
                                                            <c:forEach items="${empresas}" var="empresa">
                                                                <option name="textCodigoEmpresa" value="${empresa.codigo}" <c:if test="${empresa.codigo == contrato.empresa.codigo}"> selected</c:if>>${empresa.nome}</option>
                                                            </c:forEach>
                                                        </select>
                                                    </div>
                                                    <div class="form-group">
                                                        <th><span>Estado </span></th>
                                                        <input class="form-control" placeholder="Estado" name="textContratoEstado" type="text" value="${contrato.contratoEstado}" />
                                                    </div>
                                                    <div class="form-group">
                                                        <th><span>Descricao </span></th>
                                                        <input class="form-control" placeholder="Descricao" name="textDescricao" type="text" value="${contrato.descricao}" />
                                                    </div>
                                        </div>
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <th><span>Servicos </span></th>
                                                 <c:forEach items="${servicos}" var="servico">
                                                    <div class="form-check">
                                                        <input type="checkbox" class="form-check-input" name="textServicos" <c:if test="${contratoServicos.contains(servico.codigo)}"> checked="checked"</c:if> value="${servico.codigo}">
                                                        <label class="form-check-label">${servico.nome}</label>
                                                    </div>
                                                 </c:forEach>
                                            </div>
                                        </div>
                                        <input class="btn btn-lg btn-warning btn-block" type="submit" value="Editar">
                                    </fieldset>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <footer class="footer">
                <p>&copy; 2018 AGUA QUALIDADE - GRANBERY JF.</p>
            </footer>
        </div>
        <script src="https://use.fontawesome.com/45e03a14ce.js"></script>
        <script src="js/ie10-viewport-bug-workaround.js"></script>
    </body>
</html>
