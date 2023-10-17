package org.example;


import org.apache.http.HttpConnection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class googleSearchApi  {


    public void googleSearchApiCall (String query, String apiKey) {

        try {
            String apiUrl = "https://www.googleapis.com/customsearch/v1?key=" + apiKey+ "&cx=07b1e9d5f1ec14f97&q="+query;
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK){
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                StringBuffer response = new StringBuffer();

                while((line = reader.readLine())!= null){
                    response.append(line);
                }
                reader.close();
                System.out.println("Ответ от Google Search API:");
                System.out.println(response.toString());

            }
            else {
                System.out.println("Ошибка: " + responseCode);
            }



        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }



}

//e404ad47fe3b34b96 непонятный идентификатор
// "&cx=017576662512468239146:omuauf_lfve&q="
