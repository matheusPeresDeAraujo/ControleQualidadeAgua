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
                                    <h3 class="panel-title">Editar Empresa</h3>
                                </div>
                                <div>
                                    <a href="FrontController?action=BuscarEmpresa" class="" role="button"><img src="img/cancelar.png" width="36" alt="..." /></a>
                                </div>
                            </div>
                            <div class="panel-body">
                                <form accept-charset="UTF-8" role="form" action="FrontController?action=AlterarEmpresa" method="post">
                                    <fieldset>
                                        <div class="form-group">
                                            <th><span>Codigo </span></th>
                                            <input name="textCodigo" type="text" value="${empresa.codigo}" hidden/>
                                            <input class="form-control" placeholder="Numero" name="textCodigo" type="text" value="${empresa.codigo}" readonly="readonly"/>
                                        </div>
                                        <div class="form-group">
                                            <th><span>Nome </span></th>
                                            <input class="form-control" placeholder="Nome" name="textNome" type="text" value="${empresa.nome}"/>
                                        </div>
                                        <div class="form-group">
                                            <th><span>Identificacao </span></th>
                                            <input class="form-control" placeholder="Identificacao" name="textIdentificacao" type="text" value="${empresa.identificacao}" />
                                        </div>
                                        <div class="form-group">
                                            <th><span>Logradouro </span></th>
                                            <input class="form-control" placeholder="Logradouro" name="textLogradouro" type="text" value="${empresa.logradouro}" />
                                        </div>
                                        <div class="form-group">
                                            <th><span>Numero </span></th>
                                            <input class="form-control" placeholder="Numero" name="textNumero" type="text" value="${empresa.numero}" />
                                        </div>
                                        <div class="form-group">
                                            <th><span>Complemento </span></th>
                                            <input class="form-control" placeholder="Complemento" name="textComplemento" type="text" value="${empresa.complemento}" />
                                        </div>
                                        <div class="form-group">
                                            <th><span>Bairro </span></th>
                                            <input class="form-control" placeholder="Bairro" name="textBairro" type="text" value="${empresa.bairro}" />
                                        </div>
                                        <div class="form-group">
                                            <th><span>Cidade </span></th>
                                            <input class="form-control" placeholder="Cidade" name="textCidade" type="text" value="${empresa.cidade}" />
                                        </div>
                                        <div class="form-group">
                                            <th><span>Estado </span></th>
                                            <input class="form-control" placeholder="Estado" name="textEstado" type="text" value="${empresa.estado}" />
                                        </div>
                                        <div class="form-group">
                                            <th><span>Pais </span></th>
                                            <input class="form-control" placeholder="Pais" name="textPais" type="text" value="${empresa.pais}" />
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
