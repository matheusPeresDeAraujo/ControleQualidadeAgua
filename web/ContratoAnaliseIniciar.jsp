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
                    <div class="col-md-4 col-md-offset-4">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <div class="col-md-10">
                                    <h3 class="panel-title">Analise</h3>
                                </div>
                                <div>
                                    <a href="FrontController?action=BuscarContratoAnalise" class="" role="button"><img src="img/cancelar.png" width="36" alt="..." /></a>
                                </div>
                            </div>
                            <div class="panel-body">
                                <form accept-charset="UTF-8" role="form" action="FrontController?action=GravarContratoAnalise" method="post">
                                    <fieldset>
                                        <div class="form-group">
                                                        <th><span>Amostra </span></th>
                                                        <input name="textCodigoAmostra" type="text" value="${amostra.codigo}" hidden/>
                                                        <input class="form-control" placeholder="Numero" name="textCodigoAmostra" type="text" value="${amostra.codigo}" readonly="readonly"/>
                                        </div>
                                        <div class="form-group">
                                                    <th><span>Progissional de Analise </span></th>
                                                    <select name="textCodigoFuncionario" class="form-control">
                                                        <c:forEach items="${funcionarios}" var="funcionario">
                                                            <option name="textCodigoFuncionario" value="${funcionario.codigo}">${funcionario.nome}</option>
                                                        </c:forEach>
                                                    </select>
                                        </div>
                                        <div class="form-group">
                                            <th><span>Metricas </span></th>
                                             <c:forEach items="${servicos}" var="servico">
                                                <div class="form-group" <c:if test="${!servicosContratados.contains(servico.codigo)}"> hidden</c:if>>
                                                    <th><span>${servico.nome} </span></th>
                                                    <input class="form-control" placeholder="" name="textServicos" id="${servico.codigo}" type="text" value=""/>
                                                </div>
                                             </c:forEach>
                                        </div>
                                        <input class="btn btn-lg btn-success btn-block" type="submit" value="Gravar">
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

