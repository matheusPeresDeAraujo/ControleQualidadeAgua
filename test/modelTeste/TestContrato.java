
package modelTeste;

import javax.servlet.http.HttpServletRequest;
import junit.framework.TestCase;
import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestContrato extends TestCase{
    
    public void testProfissionalEspecialistaReprovadoInfrequencia() {
        
        HttpServletRequest requestMock = createMock(HttpServletRequest.class);
        expect(requestMock.getParameter("vNome")).andReturn("Marco");
        expect(requestMock.getParameter("vNota1")).andReturn("0");
        expect(requestMock.getParameter("vNota2")).andReturn("0");
        expect(requestMock.getParameter("vNotaFinal")).andReturn("0");
        expect(requestMock.getParameter("vFrequencia")).andReturn("74");
        replay(requestMock);

        ServletControllerWeb servletControllerWeb = new ServletControllerWeb();
        assertFalse(servletControllerWeb.verificarAprovacao(requestMock));
    }
    
}
