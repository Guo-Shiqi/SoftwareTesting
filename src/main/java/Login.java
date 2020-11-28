import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Objects;

public class Login {
    public boolean login(String name,String id) throws IOException {
        Reader in = new FileReader("src/main/resources/User.csv");
        Iterable<CSVRecord> records = CSVFormat.DEFAULT
                .withHeader(new String[]{"id","name"})
                .parse(in);
        for (CSVRecord record : records) {
            String _id = record.get("id");
            if(_id.equals(id))
                return record.get("name").equals(name);
        };
        return false;
    }
}
