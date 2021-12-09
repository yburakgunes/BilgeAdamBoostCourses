package atmprojesi;

public interface IBankMethods {
	
	// para görüntüle
	public void showMoney();
	
	// para ekle
	public void addMoney(double money);
	
	// para çekmek
	public void reduceMoney(double money);
	
	// havale yapacağım
	public void sendHavaleMoney(double money);
	
	// eft yapacağım
	public void sendEftMoney(double money);
	
	// fake mail
	public void fakeMail(String emailAdress);
	
}
