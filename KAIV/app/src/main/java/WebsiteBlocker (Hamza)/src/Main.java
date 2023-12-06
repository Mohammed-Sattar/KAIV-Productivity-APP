import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayDeque;

class WebsiteBlocker {
    private static String hostsPath = "C:\\Windows\\System32\\drivers\\etc\\hosts";
    public static void blockWebsite(String website) {
        String redirectIP = "127.0.0.1";
        try (FileWriter fw = new FileWriter(hostsPath, true);
             PrintWriter writer = new PrintWriter(fw)) {

            writer.println("\n" + redirectIP + " " + website);
            System.out.println(website + " has been blocked.");

        } catch (IOException e) {
            System.out.println("Error writing to the hosts file: " + e.getMessage());
        }
    }

    public static void unblcokWebsite(String URL) throws IOException {
        BufferedReader reader=new BufferedReader(new FileReader(hostsPath));
        String line="";
        ArrayDeque<String> lines=new ArrayDeque<>();
        while((line=reader.readLine())!=null){
            if (!line.contains(URL))
                lines.addFirst(line);
        }
        reader.close();
        FileWriter f=new FileWriter(hostsPath,false);
        PrintWriter writer=new PrintWriter(f);
        while (!lines.isEmpty())
            writer.println(lines.removeLast());
        writer.close();
        System.out.println(URL +" has been unblocked.");
    }


}
public class Main {
    public static void main(String[] args) throws Exception {
        WebsiteBlocker.blockWebsite("www.upm.edu.sa");

    }

}
