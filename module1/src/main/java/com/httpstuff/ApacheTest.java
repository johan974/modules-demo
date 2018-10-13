package com.httpstuff;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ApacheTest {
    public String accessHttp() {
        String firstpart = null;

        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet request = new HttpGet("http://example.org");
        request.addHeader("User-Agent", "Chrome");

        try (CloseableHttpResponse response = httpClient.execute(request)) {
            System.out.println("response code = " + response.getStatusLine().getStatusCode());

            BufferedReader inputReader = new BufferedReader(
                    new InputStreamReader(response.getEntity().getContent()));

            String line;
            while ((line = inputReader.readLine()) != null) {
                if (firstpart == null) {
                    firstpart = line.substring(0, line.length() > 20 ? 20 : 15);
                }
            }
            inputReader.close();
        } catch (IOException e) {
            System.out.println("IOException = " + e.getMessage());
        }
        return firstpart;
    }
}