import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import javax.sound.midi.Soundbank;

import static javax.swing.UIManager.put;

public class Main {
    public Login login;
    public DataBase dataBase;
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in );
        String name,id;
        System.out.print("姓名:");
        name=s.next();
        System.out.print("学号:");
        id=s.next();
        Main main=new Main();
        main.init();
        System.out.println(main.start(name,id));
    }
    public Main init(){
        login=new Login();
        dataBase=new DataBase();
        return this;
    }

    public String start(String name,String id){

        try {
            if(login.login(name,id)){
                String[]Subjects=new String[]{"语文","数学","英语"};
                StringBuilder result= new StringBuilder();
                for(String s:Subjects){
                    result.append(s).append(":").append(dataBase.getScore(id, s)).append("\n");
                }
                return result.toString();
            }
            return "学号或姓名错误";
        }catch (IOException e){
            return "数据文件不存在";
        }

    }
}
