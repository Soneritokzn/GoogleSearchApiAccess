package org.example;

import com.google.gson.Gson;

import java.io.FileReader;

public class ExtractApiKey {

    public void extractApiKey () {

        try {
            // Создайте объект Gson
            Gson gson = new Gson();

            // Откройте JSON-файл для чтения
            FileReader reader = new FileReader("C:\\Users\\Timur\\Desktop\\GoogleSearchApiAccess\\src\\main\\resources\\integral-server-401623-14029f24631c.json");

            // Анализируйте JSON и создайте объект класса ServiceAccount
            ServiceAccount serviceAccount = gson.fromJson(reader, ServiceAccount.class);

            // Извлеките значение private_key
            String privateKey = serviceAccount.getPrivateKey();

            // Выведите значение private_key
            System.out.println("Private Key: " + privateKey);

            // Закройте файл
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
