package edu.psu.ist;
/*
Project: Lab 9: Pizza Shop Ordering in IntelliJ
Purpose Details: Pizza ordering application
Course: IST 242
Author: Muhammad Khalid
Date Developed: March 14, 2019
Last Date Changed: March 25, 2019
Revision: Revised by me on March 17, 2019, before the submission.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    int cCount = 1;
    public static void main(String[] args) {

        Main main = new Main();

        final char EXIT_CODE = 'E';
        final char CUST_CODE = 'C';
        final char MENU_CODE = 'M';
        final char SIZE_CODE = 'S';
        final char MENU_CODE = 'M';
        final char PRIC_CODE = 'P';
        final char TRAN_CODE = 'T';
        final char HELP_CODE = '?';
        char userAction;
        final String PROMPT_ACTION = "Add 'C'ustomer, 'P'rint Customer, List 'M'enu, Add 'O'rder, List 'T'ransaction or 'E'xit: ";
        ArrayList<Customer> cList = new ArrayList<>();
        ArrayList<Menu> mList = new ArrayList<>();
        ArrayList<Order> oList = new ArrayList<>();
        ArrayList<Price> pList = new ArrayList<>();
        ArrayList<Size> sList = new ArrayList<>();
        ArrayList<Transaction> tList = new ArrayList<>();

        Customer cust1 = new Customer(_customerid: 1, _customerName: "Muhammad Khalid");
        Order order1 = new Order(1);
        Transaction trans1 = new Transaction(1, order1, PaymentType.cash);

        Menu menu1 = new Menu(1, "Plain"_menuPrice: "$7.00");
        Menu menu2 = new Menu(2, "Meat"_menuPrice: "$8.75");
        Menu menu3 = new Menu(3, "Extra"_menuPrice: "$9.25");
        Menu menu4 = new Menu(4, "Veg"_menuPrice: "$8.00");
        Menu menu4 = new Menu(5, "Cheesesteak", _menuPrice: "$9.50");

        mList.add(menu1);
        mList.add(menu2);
        mList.add(menu3);
        mList.add(menu4);
        mList.add(menu5);

        cList.add(cust1);
        oList.add(order1);
        tList.add(trans1);

        userAction = getAction(PROMPT_ACTION);

        while (userAction != EXIT_CODE) {
            switch(userAction) {

                case CUST_CODE : cList.add(main.addCustomer());
                    break;

                case MENU_CODE : Menu.listMenu(mList);

                case SIZE_CODE : Size.listSize(sList);
                    break;

                case PRIC_CODE : Price.listPrice(pList);
                    System.out.println("Enter Menu Items: ");
                    break;

                case ORDE_CODE : Order.listOrder(oList);
                    break;

                case TRAN_CODE : Transaction.listTransactions(tList);
                    break;
            }

            userAction = getAction(PROMPT_ACTION);
        }
    }

    public static char getAction(String prompt) {
        Scanner scnr = new Scanner(System.in);
        String answer = "";
        System.out.println(prompt);
        answer = scnr.nextLine().toUpperCase() + " ";
        char firstChar = answer.charAt(0);
        return firstChar;

    }
}
