import Data.PostgresDB;
import Data.interfaces.IDB;
import controrllers.UserController;
import repositories.UserRepository;
import repositories.interfaces.IUserRepository;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IDB db = new PostgresDB();
        IUserRepository repo = new UserRepository(db);
        UserController controller = new UserController(repo);
        Appl app = new Appl(controller);
        while (true){
            System.out.print("1.Registration\n2.Log in\n3.Break\nSelect next step: ");
            int choice = sc.nextInt();
            if (choice==1)
            {
                app.startreg();
                continue;
            } else if (choice==2) {
                app.startlog();
                break;
            }
            else if (choice==3){
                break;
            }
            else {System.out.print("Wrong input!\nTry again: ");
                continue;}

    }
}}