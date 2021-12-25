import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


import java.io.*;
import java.nio.Buffer;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/********************************************
 * 文件名称: Tool.java
 * 功能说明:
 * 开发人员: 雪域青竹
 * 开发时间: 2021/1/7 21:30
 *********************************************/
public class Tool {
    public static void tool(String filePath) throws Exception {
        File file=new File(filePath);
        BufferedReader br=new BufferedReader(
                new FileReader(filePath));
        Stream<String> lines = br.lines();
        if(lines.count()>3){
            lines=new BufferedReader(
                    new FileReader(filePath)).lines();

            List<String> collect = lines.collect(Collectors.toList());
            collect.remove(0);
            collect.remove(collect.size()-1);
            file.delete();
            PrintWriter pw=new PrintWriter(new FileWriter(filePath));
            Stream.of(collect.toArray()).forEach(pw::println);
            pw.flush();
        }
    }
    public static void main(String[] args) throws IOException {
//        tool("F:\\JAVA全栈\\毕向东Java基础");
    }
}
