package com.example.brouser2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;

public class HtmlCode {
        public static StringBuilder getURLSource(String url){
            try {
                URL urlObject = new URL(url);
                URLConnection urlConnection = urlObject.openConnection();
                urlConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");

                return toString(urlConnection.getInputStream());
            }catch (IOException e){
                return new StringBuilder("");
            }
        }
        public static String toHost(String adress){
            try {
                URL url = new URL(adress);
                String domain = url.getHost();
                return domain;
            }
            catch (MalformedURLException e) {
                return "My htmlCode";
            }
        }
    private static StringBuilder toString(InputStream inputStream) throws IOException
        {
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8")))
            {
                String inputLine;
                StringBuilder stringBuilder = new StringBuilder();
                while ((inputLine = bufferedReader.readLine()) != null)
                {
                    stringBuilder.append(inputLine+"\n");
                }

                return stringBuilder;
            }
        }
}
