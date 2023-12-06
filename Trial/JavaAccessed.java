import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;


public class JavaAccessed {
    static ArrayList FakeBlackList= new ArrayList(10);
    static Scanner input = new Scanner(System.in);//for user input

    public static String PageReader(String url) throws IOException {
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // Set the request method (GET by default)
        con.setRequestMethod("GET");

        // Get the response code
        int responseCode = con.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }

            in.close();
            return response.toString();
        }
        else {
            throw new IOException("HTTP Request Failed with response code: " + responseCode);
        }
    }
    public static void PageOpener(String url) throws URISyntaxException, IOException {
        URI uri = new URI(url);
        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            desktop.browse(uri);
        }
        else {
            System.out.println("Desktop is not supported, please open the URL manually: " + url);
        }
    }
    public static void Decision(String url) throws IOException, URISyntaxException {
        for (Object BlackURL : FakeBlackList){
            if (url.toLowerCase().contains(BlackURL.toString())){
                System.out.println("You are not allowed to access "+url+" because it is blacklisted");
                return;
            }
        }
        if (url.contains("https://")){
            PageOpener(url);
        }
        else {
            url="https://"+url;
            PageOpener(url);
        }
    }
    public static void main(String[] args) throws IOException, URISyntaxException {
        FakeBlackList.add("rpcs3.net");
        FakeBlackList.add("fmoviesz.to");
        FakeBlackList.add("animension.to");
        FakeBlackList.add("facebook.com");
        System.out.println(FakeBlackList);
        System.out.println("Please enter the url of the website you want to open: ");
        String websiteURL =input.nextLine();
//        Decision(websiteURL);
        String response=PageReader(websiteURL);
        System.out.println("Website Details: \n"+response);
    }
}