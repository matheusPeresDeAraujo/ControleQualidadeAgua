
package modelTeste;

import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import junit.framework.TestCase;
import static junit.framework.TestCase.assertTrue;
import model.*;
import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;

public class funcionarioTest extends TestCase{
    
    
    public void testFuncionarioSucessoUpdate() throws SQLException, ClassNotFoundException {
        
        HttpServletRequest requestMock = createMock(HttpServletRequest.class);
        expect(requestMock.getParameter("textCodigo")).andReturn("2");
        expect(requestMock.getParameter("textNome")).andReturn("alterado");
        expect(requestMock.getParameter("textIdentificacao")).andReturn("12345678910");
        expect(requestMock.getParameter("textEmpresa")).andReturn("3");
        expect(requestMock.getParameter("textCargo")).andReturn("1");
        replay(requestMock);

        Funcionario funcionario = new Funcionario();
        assertTrue(funcionario.updateFuncionario(requestMock));
    }
}
