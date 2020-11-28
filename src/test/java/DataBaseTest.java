import junit.framework.TestCase;

import java.io.IOException;

public class DataBaseTest extends TestCase {
    DataBase dataBase;
    @Override
    public void setUp() throws Exception {
        super.setUp();
        dataBase=new DataBase();
    }

    public void testGetScore() throws IOException {
        assertEquals(dataBase.getScore("161830129","数学"), new Integer(70));
    }

    public void testGetAvg() throws IOException {
        assertEquals(dataBase.getAvg("语文"),new Integer(63));
    }
}