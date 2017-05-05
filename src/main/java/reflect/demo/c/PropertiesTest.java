package reflect.demo.c;


import java.io.FileReader;
import java.io.IOException;

import java.util.Properties;

/**
 * Created by Administrator on 2017/5/5.
 */
public class PropertiesTest {
    // properties 属性\ ['prɒpətɪz]
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("src/main/java/reflect/demo/c/config.properties"));
        System.out.println(properties.getProperty("key"));
        System.out.println(properties.getProperty("k"));
        System.out.println(properties.getProperty("className"));
        System.out.println(properties.getProperty("methodName"));
    }
}
