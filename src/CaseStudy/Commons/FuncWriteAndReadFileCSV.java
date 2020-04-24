package CaseStudy.Commons;

import CaseStudy.Models.Customer;
import CaseStudy.Models.House;
import CaseStudy.Models.Room;
import CaseStudy.Models.Villa;
import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class FuncWriteAndReadFileCSV {
    public static final char DEFAULT_SEPARATOR = ',';
    public static final char DEFAULT_QUOTE = '"';
    public static final int NUM_OF_LINE_SHIP = 1;

    public static final String pathVilla = "src/CaseStudy/FileCSV/Villa.csv";
    public static final String pathRoom = "src/CaseStudy/FileCSV/Room.csv";
    public static final String pathHouse = "src/CaseStudy/FileCSV/House.csv";
    public static final String pathCustomer = "src/CaseStudy/FileCSV/Customer.csv";
    public static final String pathBooking = "src/CaseStudy/FileCSV/Booking.csv";
    public static final String pathEmployee = "src/CaseStudy/FileCSV/Employee.csv";

    public static String[] headerRecordVilla = new String[]{"ID", "ServiceName", "Area", "RentalCost", "NumberOfPeople", "NumberOfDay", "RoomStandard", "AreaPool", "NumberOfFloor"};
    public static String[] headerRecordHouse = new String[]{"ID", "ServiceName", "Area", "RentalCost", "NumberOfPeople", "NumberOfDay", "RoomStandard", "NumberOfFloor"};
    public static String[] headerRecordRoom = new String[]{"ID", "ServiceName", "Area", "RentalCost", "NumberOfPeople", "NumberOfDay", "FreeService"};
    public static String[] headerRecordCustomer = new String[]{"FullName", "Birthday", "Gender", "ID Card", "Phone", "Email", "Customer Type", "Address"};
    public static String[] headerRecordEmployee = new String[]{"ID", "FullName", "Age", "Address"};

    public static void writeVillaToFileCSV(ArrayList<Villa> arrayList) {
        try (Writer writer = new FileWriter(pathVilla);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.DEFAULT_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END);) {
            csvWriter.writeNext(headerRecordVilla);
            for (Villa villa : arrayList) {
                csvWriter.writeNext(new String[]{
                        villa.getId(), villa.getName(), String.valueOf(villa.getArea()), String.valueOf(villa.getRentalCost()), String.valueOf(villa.getMaxNumberOfPeople()), String.valueOf(villa.getNumberOfDay()),
                        villa.getRoomStandard(), String.valueOf(villa.getAreaPool()), String.valueOf(villa.getNumberOfFloor())
                });
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeHouseToFileCSV(ArrayList<House> arrayList) {
        try (Writer writer = new FileWriter(pathHouse);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.DEFAULT_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END);) {
            csvWriter.writeNext(headerRecordHouse);
            for (House house : arrayList) {
                csvWriter.writeNext(new String[]{
                        house.getId(), house.getName(), String.valueOf(house.getArea()), String.valueOf(house.getRentalCost()), String.valueOf(house.getMaxNumberOfPeople()), String.valueOf(house.getNumberOfDay()),
                        house.getRoomStandard(), String.valueOf(house.getNumberOfFloors())
                });
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeRoomToFileCSV(ArrayList<Room> arrayList) {
        try (Writer writer = new FileWriter(pathRoom);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.DEFAULT_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END);) {
            csvWriter.writeNext(headerRecordRoom);
            for (Room room : arrayList) {
                csvWriter.writeNext(new String[]{
                        room.getId(), room.getName(), String.valueOf(room.getArea()), String.valueOf(room.getRentalCost()), String.valueOf(room.getMaxNumberOfPeople()), String.valueOf(room.getNumberOfDay()),
                        String.valueOf(room.getFreeService())
                });
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeCustomerToFileCSV(ArrayList<Customer> arrayList){
        try (Writer writer = new FileWriter(pathCustomer);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.DEFAULT_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END);) {
            csvWriter.writeNext(headerRecordCustomer);
            for (Customer customer : arrayList) {
                csvWriter.writeNext(new String[]{
                        customer.getFullName(), customer.getBirthDay(),customer.getGender(), String.valueOf(customer.getIdCard()), String.valueOf(customer.getPhone()), String.valueOf(customer.getEmail()),
                        String.valueOf(customer.getCustomerType()),customer.getAddress()
                });
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
