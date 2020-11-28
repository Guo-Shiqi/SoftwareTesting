import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Objects;

public class DataBase {
    public Integer getScore(String id,String subjects) throws IOException {
        Reader in = new FileReader("src/main/resources/Score.csv");
        Iterable<CSVRecord> records = CSVFormat.DEFAULT
                .withHeader(new String[]{"id","语文","数学","英语"})
                .parse(in);
        for (CSVRecord record : records) {
            String _id = record.get("id");
            if(Objects.equals(_id, id))
                return Integer.parseInt(record.get(subjects));
        };
        return null;
    }
    public Integer getAvg(String subjects)throws IOException{
        Reader in = new FileReader("src/main/resources/Score.csv");
        Iterable<CSVRecord> records = CSVFormat.DEFAULT
                .withHeader(new String[]{"id","语文","数学","英语"})
                .parse(in);
        int sum=0,num=0;
        for (CSVRecord record : records) {
            sum-=Integer.parseInt(record.get(subjects));
            num++;
        };
        return sum/num;
    }
}
