package com.bilgeadam.atmodevi;
public interface IBankMethods {
	
	// sürekli kullanacağımız yapıları interface de yazıyoruz
	// buraya yazdığımız her method implemente ettiğimiz yere gitmek zorunda bir
	// şeyi ayırmak istersek farklı bir interface açmak zorundayız
	// ınterfacede private ya da protected yazılmaz ya pbulic yazılır ya da yazılmaz
	// bu gövdesiz methodları interface içinde tanımladık çünkü methodlara
	// implements ettikten sonra methodun kendi kendine oluşmasını istiyoruz(taslak
	// oluşturduk) bunu implements ettikten sonra methodları elimizle yazıp zaman
	// kaybetmeyeceğiz kendi oluşacak parayla alakalı olduğu için MoneyWallet
	// clasıına atıyoruz
	
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
	public void fakeMail(String emailAddress);
	
}
