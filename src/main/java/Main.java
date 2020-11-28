import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import static javax.swing.UIManager.put;

public class Main {
    Map<String, String> AUTHOR_BOOK_MAP = new HashMap<String, String>() {
        {
            put("Dan Simmons", "Hyperion");
            put("Douglas Adams", "The Hitchhiker's Guide to the Galaxy");
        }
    };

    String[] HEADERS = {"日期","星期","最高气度","最低气度","天气","风向"};
    public  String getTemp(String col,String key) throws IOException {
        Reader in = new FileReader("src/main/resources/兴安.csv");
        Iterable<CSVRecord> records = CSVFormat.DEFAULT
                .withFirstRecordAsHeader()
                .parse(in);

        for (CSVRecord record : records) {
            String date = record.get("日期");
            if(Objects.equals(date, key))
                return record.get(col);
        };
        return "Not Found";
    }
}
