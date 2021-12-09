package com.bilgeadam.preparationforexam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.UUID;
import java.util.stream.Collectors;

import com.bilgeadam.a012.date.Person;
import com.bilgeadam.gulten.ConsoleHelper;

public class MainLogin {
    private static final String PATH = "C:\\Users\\cturk\\OneDrive\\Masaüstü\\Java Ders - Ödev PrtSc\\UserInformation\\userName.txt";
    private static List<Person> personList;
    
    public static void main(String[] args) {
        
        int choise;
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "Kullanıcı ekle");
        map.put(2, "Kullanıcı sil");
        
        map.put(3, "Listele");
        map.put(4, "Ara");
        map.put(99, "Çıkış");

        while ((choise = ConsoleHelper.showMenu("Benim Menüm", map)) != 99) {
            personList = getUsersFromDatabase();
            
            switch (choise) {
                case 1: {
                    addUser();
                    break;
                }
                case 2: {
                    deleteUser();
                }
                case 3: {
                    listUsers();
                }
                case 4: {
                    findUser();
                }
                case 99,0: {
                    System.exit(0);
                }
                
                default:
                    System.out.println("Hatalı giriş yaptınızç");
            }
            
        }
        
    }
    
    private static void findUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bişe gir");
        String searchText = scan.nextLine();
        List<Person> tempList = personList.stream().filter(p -> p.getName().startsWith(searchText))
                .collect(Collectors.toList());
        tempList.forEach(System.out::println);
    }
    
    private static void listUsers() {
        personList = getUsersFromDatabase();
        personList.forEach(System.out::println);
    }
    
    private static List<Person> getUsersFromDatabase() {
        
        List<Person> temp = new ArrayList<>();
        
        String readText = "";
        try (BufferedReader bR = new BufferedReader(new FileReader(PATH))) {
            while ((readText = bR.readLine()) != null) {
                temp.add(castToPerson(readText));
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e1) {
            
            e1.printStackTrace();
        }
        
        return temp;
    }
    
    private static Person castToPerson(String readText) {
        // 709c326b-7b45-4cdd-81cc-90cf84af8648; ali; 1234
        
        StringTokenizer tok = new StringTokenizer(readText, ";");
        
        Person p1 = new Person();
        p1.setUUID(tok.nextToken());
        p1.setName(tok.nextToken());
        p1.setPassword(tok.nextToken());
        
        return p1;
    }
    
    private static void deleteUser() {
        //arama
    personList.indexOf(0);
    }
    
    public static void addUser() {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Kullanıcı adınızı belirleyiniz: ");
        String userName = scan.nextLine();
        System.out.println("Kullanıcı şifrenizi belirleyiniz: ");
        String password = scan.nextLine();
        personList.add(new Person(userName, password, UUID.randomUUID().toString()));
        writeDatabase(personList);
    }
    
    private static void writeDatabase(List<Person> listPerson) {
        try (BufferedWriter bW = new BufferedWriter(new FileWriter(PATH))) {
            for (Person person : listPerson) {
                bW.write(person.UUID + ";" + person.name + ";" + person.password + "\n");
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}