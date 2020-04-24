package CaseStudy.Controllers;

import CaseStudy.Commons.FuncGeneric;
import CaseStudy.Commons.FuncValidation;
import CaseStudy.Commons.FuncWriteAndReadFileCSV;
import CaseStudy.Commons.ScannerUtils;
import CaseStudy.Models.Customer;

import java.util.ArrayList;

import static CaseStudy.Commons.FuncGeneric.displayList;
import static CaseStudy.Controllers.MainController.backMainMenu;

public class CustomerControllers {
    private static final String ENTER_CUSTOMER_NAME = "Enter Customer Name: ";
    private static final String INVALID_CUSTOMER_NAME = "First Character Is UpperCase. Format Xxxxxx";
    private static final String ENTER_BIRTHDAY = "Enter Birthday:";
    private static final String INVALID_BIRTHDAY = "Birthday Format is dd/mm/yyyy. Year > 1900 and < 2002";

    public static void addNewCustomer(){
        Customer customer = new Customer();

        customer.setFullName(FuncValidation.getValidCustomerName(ENTER_CUSTOMER_NAME,INVALID_CUSTOMER_NAME));

        customer.setBirthDay(FuncValidation.getValidBirthday(ENTER_BIRTHDAY,INVALID_BIRTHDAY));

        String gender = "";
        customer.setGender("");

        customer.setIdCard("");

        System.out.println("Enter Phone Number Customer: ");
        customer.setPhone(ScannerUtils.scanner.nextLine());

        customer.setEmail("");

        System.out.println("Enter Type Customer: ");
        customer.setCustomerType(ScannerUtils.scanner.nextLine());

        System.out.println("Enter Address Customer");
        customer.setAddress(ScannerUtils.scanner.nextLine());

        ArrayList<Customer> customerList = FuncGeneric.getLisFromCSV(FuncGeneric.EntityType.CUSTOMER);

        customerList.add(customer);

        FuncWriteAndReadFileCSV.writeCustomerToFileCSV(customerList);

        System.out.println("------Add Customer: " + customer.getFullName() + " Successfully !!");

        backMainMenu();


    }
    public static void showInformationCustomers(){
        ArrayList<Customer> customerList = FuncGeneric.getLisFromCSV(FuncGeneric.EntityType.CUSTOMER);

        displayList(customerList);

    }
}
