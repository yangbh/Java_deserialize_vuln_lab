package MySQLJDBC;

/**
 * @author mody
 * @title: MysqlJdbc8Test
 * @projectName Java_deserialize_vuln_lab
 * @description: TODO
 * @date 2020/3/243:59 PM
 */

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlJdbc8Test {
    public static void main(String[] args) throws Exception{
        String driver = "com.mysql.cj.jdbc.Driver";
        String user = "root";
        String password = "ubuntu";
        String url = "jdbc:mysql://127.0.0.1:3306/mysql?characterEncoding=utf8&useSSL=false&queryInterceptors=com.mysql.cj.jdbc.interceptors.ServerStatusDiffInterceptor&autoDeserialize=true";
        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url, user, password);
    }
}
