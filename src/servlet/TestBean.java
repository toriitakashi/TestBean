package servlet;

public class TestBean {

	@Size(max = 10)
	private String firstName;

	@Size(max = 10)
	private String lastName;

	private String hoge;

	private String fuga;

	@Size(max = 13)
	private String email;


	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String name) {
		this.firstName = name;
	}

	public String getLastName() {
		return lastName;
	}
	public void setLastName(String name) {
		this.lastName = name;
	}

	public String getHoge() {
		return hoge;
	}
	public void setHoge(String hoge) {
		this.hoge = hoge;
	}
	public String getFuga() {
		return fuga;
	}
	public void setFuga(String fuga) {
		this.fuga = fuga;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
