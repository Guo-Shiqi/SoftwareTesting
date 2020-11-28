import junit.framework.TestCase;
import org.junit.Test;

import java.io.IOException;

import static org.mockito.Mockito.*;

public class MockTest extends TestCase {
    @Test
    public void testCase1() throws IOException {
        Main main=new Main();

        DataBase dataBase=mock(DataBase.class);
        when(dataBase.getScore(anyString(),anyString())).thenReturn(100).thenReturn(100).thenReturn(100);

        main.dataBase=dataBase;

        Login login=mock(Login.class);
        when(login.login(anyString(),anyString())).thenReturn(true);
        main.login=login;

        assertEquals(main.start("小明","161830199"),"语文:100\n数学:100\n英语:100\n");

    }
}
