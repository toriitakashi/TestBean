package servlet;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TestBean {


	@Size(max = 10)
	private String firstName;

	@Size(max = 10)
	private String lastName;

	private String hoge;

	private String fuga;

	@Size(max = 13)
	private String email;

}
