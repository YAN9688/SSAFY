
public class House {
	// private 멤버변수 작성
	private int id;
	private String owner;
	private int size;
	private int price;

	// 기본생성자 작성
	public House() {
	}

	// 모든필드를 가진 생성자 작성
	public House(int id, String owner, int size, int price) {
		super();
		this.id = id;
		this.owner = owner;
		this.size = size;
		this.price = price;
	}

	// getter와 setter 구현
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// toString 구현
	@Override
	public String toString() {
		return "House [id=" + id + ", owner=" + owner + ", size=" + size + ", price=" + price + "]";
	}

}
