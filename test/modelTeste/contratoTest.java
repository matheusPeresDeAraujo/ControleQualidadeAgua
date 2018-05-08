
package modelTeste;

import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import junit.framework.TestCase;
import model.Contrato;
import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;

public class contratoTest extends TestCase{
    
    public void testContratoSucessoUpdate() throws SQLException, ClassNotFoundException {
        
        HttpServletRequest requestMock = createMock(HttpServletRequest.class);
        expect(requestMock.getParameter("textCodigo")).andReturn("17");
        expect(requestMock.getParameter("textCodigoCliente")).andReturn("4");
        expect(requestMock.getParameter("textCodigoEmpresa")).andReturn("3");
        expect(requestMock.getParameter("textContratoEstado")).andReturn("1");
        expect(requestMock.getParameter("textDescricao")).andReturn("0");
        replay(requestMock);

        Contrato contrato = new Contrato();
        assertTrue(contrato.updateContrato(requestMock));
    }
    
}
