package org.example;


public class App 
{
    public static void main( String[] args )
    {

        String query = "tigers";
        String apiKey = "AIzaSyASrUMz_UoIENDJcKjwNIfC8EHNDt7lovE";
        googleSearchApi searchApi = new googleSearchApi();
        searchApi.googleSearchApiCall(query, apiKey);



    }
}
