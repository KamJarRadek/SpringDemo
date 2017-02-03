package kam.jar.radek.spring.demo;

public class Line {

	private String type;
	private int height;
	
	public Line(String type, int height) {
		super();
		this.type = type;
		this.height = height;
	}
	

	public Line(int height) {
		super();
		this.height = height;
	}

	public Line(String type) {
		super();
		this.type = type;
	}
	public int getHeight() {
		return height;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void draw() {
		System.out.println(getType() + " Triangle drawn of height " + getHeight());
	}
}
