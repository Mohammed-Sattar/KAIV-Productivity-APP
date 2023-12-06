import java.util.Scanner;

public class PasswordLock{
    private String password;
    private boolean status;
    Scanner input=new Scanner(System.in);


    public PasswordLock(String password) {
        this.password = password;
        this.status=true;
    }
    public void requestPassword(){

    }

    public void lock(){
        if (status) System.out.println("Already Locked!");
        else {
            String entered="";
            System.out.println("Enter password:");
            while (!password.equals(entered=input.nextLine())){
                if (entered.equals("0") || entered.equals("exit")) return;
                System.out.println("Incorrect! \n try again:");
            }
            this.status=true;
            System.out.println("Locked");}
    }
    public void unlock(){
        if(!this.status) return;
        String entered="";
        System.out.println("Enter password:");
        while (!password.equals(entered=input.nextLine())){
            if (entered.equals("0") || entered.equals("exit")) return;
            System.out.println("Incorrect! \n try again:");
        }
        this.status=false;
        System.out.println("Unlocked");
    }
}
