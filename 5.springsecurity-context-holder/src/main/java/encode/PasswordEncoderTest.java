package encode;

import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordEncoderTest {

	public static void main(String[] args) {

		PasswordEncoder encoder=(PasswordEncoder) NoOpPasswordEncoder.getInstance();
		String pwd=encoder.encode("student");
		System.out.println("pwd:::::::::"+pwd);
	}

}
