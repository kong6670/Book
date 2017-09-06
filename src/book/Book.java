package book;



public class Book implements sale {

	private String IDbook;
	private  String name;
	private  int price;

	public String getName(String name) {
		return name;
	
	}

	public void setName(String Name) {
		this.name=Name;
	}

	public int getPrice(int price) {
		return price;
	}

	public void setPrice(int Price) {
		this.price=Price;
	}

	public String getIDbook() {
		return IDbook;
	}

	
	public void setID_book(String IDbook) {
		this.IDbook=IDbook;
	}
	
	

	@Override
	public void saleBook(Book b) {
	
	System.out.println(b.IDbook+" ชื้อ  "+b.name+" ราคา"+b.price+"บาท");
		
	}
	

}