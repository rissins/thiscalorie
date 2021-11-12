package hello.thiscalorie.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.http.HttpClient;

public class FoodApiParsing {
    public String FoodApiParsing1() {
        StringBuilder result = new StringBuilder();

        try {
            String requestURL = "http://apis.data.go.kr/1471000/FoodNtrIrdntInfoService1/getFoodNtrItdntList1" +
                    "?serviceKey=THhaqujicZ%2Bl3QmDSeFbiv3BFxLVf1XYLH93nceuUPDCcWbKuAI%2Bc6zKs55EUZgxZlXodgebMK7lFL63M10IYA%3D%3D" +
                    "&desc_kor=%EC%A7%9C%EC%9E%A5%EB%A9%B4" +
                    //                "&pageNo=1" +
                    //                "&numOfRows=1" +
                    //                "&bgn_year=1" +
                    //                "&animal_plant=1" +
                    "&type=json";

            URL url = new URL(requestURL);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");

            BufferedReader br;
            br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(), "UTF-8"));
            String returnLine;

            while ((returnLine = br.readLine()) != null) {
                result.append(returnLine + "\n\r");
            }

            urlConnection.disconnect();

        } catch (IOException e) {
            e.printStackTrace();
        }


        return result.toString();
    }
}
