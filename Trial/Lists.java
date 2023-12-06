import java.util.ArrayList;
import java.util.Scanner;
public class Lists {
    static private ArrayList BlackList= new ArrayList(10);
    static private ArrayList WhiteList= new ArrayList(10);

    public static ArrayList getWhiteList() {
        return WhiteList;
    }

    public static void setWhiteList(ArrayList whiteList) {
        WhiteList = whiteList;
    }

    static Scanner input = new Scanner(System.in);//for user input

    public static ArrayList getBlackList() {
        return BlackList;
    }

    public static void setBlackList(ArrayList blackList) {
        BlackList = blackList;
    }

    public static void BlacklistConfig(){
        do {
            System.out.println("Enter name of the url you want to blacklist");
            String url=input.nextLine();
            if (url.equalsIgnoreCase("proceed")){
                break;
            }
            BlackList.add(url);
        }while (true);
    }
    public static void WhitelistConfig(){
        do {
            System.out.println("Enter name of the url you want to whitelist");
            String url=input.nextLine();
            if (url.equalsIgnoreCase("proceed")){
                break;
            }
            WhiteList.add(url);
        }while (true);
    }
}
