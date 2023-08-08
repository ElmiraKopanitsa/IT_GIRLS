package kz.kopanitsa.lesson.week10._main;

import kz.kopanitsa.lesson.week10.model.Account;

public class _Main {
    public static void main(String[] args) {
        Account account = new Account("", "", "");
        System.out.println(account);
        account.printUser(account);

        Account account1 = new Account("null", "null", "null");
        System.out.println(account1);
        account1.printUser(account1);

        Account account2 = new Account("ElmiraKopanitsaIn2023", "ElmiraKopanitsaIn2023", "ElmiraKopanitsaIn2023");
        System.out.println(account2);
        account2.printUser(account2);

        Account account3 = new Account("Elmira", "Elmira999", "Elmira777");
        System.out.println(account3);
        account3.printUser(account3);

        Account account4 = new Account("Elmira", "Elmira999", "Elmira999");
        System.out.println(account4);
        account4.printUser(account4);
    }
}
