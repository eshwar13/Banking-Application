

import java.util.Scanner; ;

public class Main {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
       int acc_no;
       int bal;
       int choice;
       int credit;
       int debit;
       String acc_name;
       String type;
       System.out.println("Enter the account number");
       acc_no = in.nextInt();
       System.out.println("Enter the account holder name");
       acc_name = in.next();
       System.out.println("Enter the type of account");
       type = in.next();
       System.out.println("Enter the balance");
       bal = in.nextInt();
       Account a = new Account(acc_no,acc_name,type,bal);
       do
       {
       System.out.println("1. Credit Account \n2. Debit Account \n3. Display Account Details");
       System.out.println("Enter your choice");
       choice = in.nextInt();
       switch(choice)
       {
           case 1: System.out.println("Enter the amount to be credited");
           credit = in.nextInt();
           a.credit(credit);
           break;
           case 2: System.out.println("Enter the amount to be debited");
           debit = in.nextInt();
           a.debit(debit);
           break;
           case 3:a.display();
           break;
       }
      }while(choice<4);
    }
}



class Account {
   int acc_no;
    int bal;
   String acc_name;
   String type;
    Account(int acc_no, String acc_name, String type, int bal) {
        this.acc_no = acc_no;
        this.bal = bal;
        this.acc_name = acc_name;
        this.type = type;
    }
    int credit(int credit) {
     return  bal = bal + credit;
    }
    void display()
    {
       System.out.println("Account Details");
        System.out.println("Accont Number : "+acc_no);
        System.out.println("Accont Name : "+acc_name);
        System.out.println("Accout type :"+type);
        System.out.println("Accout Balance :"+bal);
        System.out.println();
    }
    int debit(Integer debit) {
         return bal = bal - debit;
    }
}