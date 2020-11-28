import junit.framework.TestCase;

import java.io.IOException;

public class LoginTest extends TestCase {

    Login login;
    @Override
    public void setUp() throws Exception {
        super.setUp();
        login=new Login();
    }

    public void testLogin() throws IOException {
        assertEquals(login.login("ShiqiGuo","161830129"),true);
    }

    public void testLogin2() throws IOException {
        assertEquals(login.login("ShiqiGuo","161830130"),false);
    }
    public void testLogin3() throws IOException {
        assertEquals(login.login("ShiqiGuo","16183012"),false);
    }
}