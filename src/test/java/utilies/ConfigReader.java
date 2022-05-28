package utilies;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties properties;

    static{
        String dosyaYolu ="configuration.properties";

        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            /*
            fis dosya yolunu tanımladığımız configuration.properties dosyasını okudu
             */

            properties = new Properties();
            properties.load(fis); // fis'in okuduğu bilgileri properties'e yükledi



        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static String getProperty(String key) {
        /*
        test methodundan yolladığımız String key değerini alıp properties class'ından getProperty
        methodunu kullanarak bu key'e ait value'yi bize getirdi.
         */




        return properties.getProperty(key);

    }

}
