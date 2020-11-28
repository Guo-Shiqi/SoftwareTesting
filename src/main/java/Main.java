import java.util.HashMap;
import java.util.Map;

import static javax.swing.UIManager.put;

public class Main {
    Map<String, String> AUTHOR_BOOK_MAP = new HashMap<String, String>() {
        {
            put("Dan Simmons", "Hyperion");
            put("Douglas Adams", "The Hitchhiker's Guide to the Galaxy");
        }
    };

    String[] HEADERS = { "author", "title"};
    public void t(){
        System.out.println("Helloworld");
    }
}
