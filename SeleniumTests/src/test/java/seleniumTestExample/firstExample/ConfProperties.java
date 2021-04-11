package seleniumTestExample.firstExample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class ConfProperties {
    protected static FileInputStream fileInputStream;
    protected static Properties PROPERTIES;
    static {
        try {
            //указание пути до файла с настройками
            //fileInputStream = new FileInputStream("C:\\Users\\win7\\IdeaProjects\\seleniumtest1\\src\\main\\resources\\conf.properties");
            System.out.println(new File(ConfProperties.class.getClassLoader().getResource("conf.properties").getPath()).exists());
            fileInputStream = new FileInputStream(ConfProperties.class.getClassLoader().getResource("conf.properties").getPath());
            PROPERTIES = new Properties();
            PROPERTIES.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
            //обработка возможного исключения (нет файла и т.п.)
        } finally {
            if (fileInputStream != null)
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace(); } } }
    /**
     * метод для возврата строки со значением из файла с настройками
     */
    public static String getProperty(String key) {
        return PROPERTIES.getProperty(key);
    }
}