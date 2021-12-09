package marathon.school.project;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import com.bilgeadam.gulten.ConsoleHelper;

public class MainSms {
	PeopleList temp = new PeopleList();
	
	public static void mainMenu() {
		Scanner scan = new Scanner(System.in);
		int choice;
		
		System.out.println("Okul Yönetim Sistemine Hoşgeldiniz");
		System.out.println("Lütfen bir seçim yapınız:");
		
		Map<Integer, String> mainMenu = new TreeMap<>();
		
		mainMenu.put(1, "Yeni çalışan girişi");
		mainMenu.put(2, "Çalışan listesini göster");
		mainMenu.put(3, "Eski çalışan listesini göster");
		mainMenu.put(4, "Yeni sınıf/ders girişi");
		mainMenu.put(5, "Sınıf/Derse öğrenci atama");
		mainMenu.put(6, "Sınıf Bilgisi gösterme");
		mainMenu.put(7, "Öğrenci dersleri gösterme");
		mainMenu.put(8, "Hediye Listesi");
		mainMenu.put(9, "Maaş Listesi");
		mainMenu.put(0, "Çıkış");
		
		while ((choice = ConsoleHelper.showMenu("MENU", mainMenu)) != 0) {
			options(choice);
			
		}
		
	}
	
	public static void options(int num) {
		PeopleList temp = new PeopleList();
		switch (num) {
			case 1:
				addWorker();
				break;
			case 2:
				listWorkers();
				break;
			case 3:
				exWorkers();
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			case 7:
				
				break;
			case 8:
				presentDay();
				break;
			case 9:
				
				break;
			case 0:
				System.exit(0);
				break;
			
			default:
				System.out.println("Yanlış bir veri girdiniz.");
				break;
		}
		
	}
	
	private static void listWorkers() {
//		PeopleList.newPeople();
		PeopleList.showList();
		
	}
	private static void exWorkers() {
		PeopleList.exWorkers();
	}
	private static void presentDay() {
		PeopleList.birthDaythisMonth();;
	}
	
	private static void addWorker() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Öğretmen için T'ye, Memur için O'ya, Hizmetli için E'ye basınız: ");
		int control = 0;
		
		String option = "";
		option = scan.nextLine();
		do {
			if (option.charAt(0) == 't') {
				System.out.println("Lütfen ad giriniz");
				String firstName = scan.nextLine();
				System.out.println("Lütfen göbek adı giriniz");
				String middleName = scan.nextLine();
				System.out.println("Lütfen soyadı giriniz");
				String lastName = scan.nextLine();
				
				W_Teachers teacher1 = new W_Teachers(null, firstName, middleName, lastName);
				System.out.println(teacher1);
				control++;
			} else if (option.charAt(0) == 'o') {
				System.out.println("Lütfen ad giriniz");
				String firstName = scan.nextLine();
				System.out.println("Lütfen göbek adı giriniz");
				String middleName = scan.nextLine();
				System.out.println("Lütfen soyadı giriniz");
				String lastName = scan.nextLine();
				
				W_Officers officer1 = new W_Officers(null, firstName, middleName, lastName);
				System.out.println(officer1);
				control++;
				
			} else if (option.charAt(0) == 'e') {
				System.out.println("Lütfen ad giriniz");
				String firstName = scan.nextLine();
				System.out.println("Lütfen göbek adı giriniz");
				String middleName = scan.nextLine();
				System.out.println("Lütfen soyadı giriniz");
				String lastName = scan.nextLine();
				
				W_Employees employee1 = new W_Employees(null, firstName, middleName, lastName);
				System.out.println(employee1);
				control++;
			} else {
				System.out.println("Yanlış bir giriş yaptınız: ");
				break;
			}
		} while (control == 0);
		
	}
	
	public static void main(String[] args) {
		mainMenu();
	}
	
}
