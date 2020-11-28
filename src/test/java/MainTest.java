import junit.framework.TestCase;

public class MainTest extends TestCase {

    public void testStart() {
        assertEquals(new Main().init().start("ShiqiGuo","161830129"),"语文:60\n数学:70\n英语:80\n");
    }
    public void testStart2() {
        assertEquals(new Main().init().start("ShiqiGuo","161830130"),"学号或姓名错误");
    }
}