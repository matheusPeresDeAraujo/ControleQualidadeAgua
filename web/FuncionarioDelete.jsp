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
                                    <h3 class="panel-title">Apagar Funcionario</h3>
                                </div>
                                <div>
                                    <a href="FrontController?action=BuscarFuncionario" class="" role="button"><img src="img/cancelar.png" width="36" alt="..." /></a>
                                </div>
                            </div>
                            <div class="panel-body">
                                <form accept-charset="UTF-8" role="form" action="FrontController?action=ApagarFuncionario" method="post">
                                    <fieldset>
                                        <div class="form-group">
                                            <th><span>Codigo </span></th>
                                            <input name="textCodigo" type="text" value="${funcionario.codigo}" hidden/>
                                            <input class="form-control" placeholder="Numero" name="textCodigo" type="text" value="${funcionario.codigo}" readonly="readonly"/>
                                        </div>
                                        <div class="form-group">
                                            <th><span>Nome </span></th>
                                            <input name="textNome" type="text" value="${funcionario.nome}" hidden/>
                                            <input class="form-control" placeholder="Nome" name="textNome" type="text" value="${funcionario.nome}" readonly="readonly"/>
                                        </div>
                                        <div class="form-group">
                                            <th><span>Identificacao </span></th>
                                            <input name="textIdentificacao" type="text" value="${funcionario.identificacao}" hidden/>
                                            <input class="form-control" placeholder="Identificacao" name="textIdenificacao" type="text" value="${funcionario.identificacao}" readonly="readonly"/>
                                        </div>
                                        <div class="form-group">
                                            <th><span>Empresa </span></th>
                                            <input name="textEmpresa" type="text" value="${funcionario.empresa.nome}" hidden/>
                                            <input class="form-control" placeholder="Empresa" name="textEmpresa" type="text" value="${funcionario.empresa.nome}" readonly="readonly"/>
                                        </div>
                                        <div class="form-group">
                                            <th><span>Cargo </span></th>
                                            <input name="textCargo" type="text" value="${funcionario.cargo}" hidden/>
                                            <input class="form-control" placeholder="Cargo" name="textCargo" type="text" 
                                                   <c:if test="${funcionario.cargo == 1}"> value="Profissional de Analise"</c:if> 
                                                   <c:if test="${funcionario.cargo == 2}"> value="Profissional de Coleta"</c:if>readonly="readonly"/>
                                        </div>
                                        <input class="btn btn-lg btn-danger btn-block" type="submit" value="Apagar">
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
