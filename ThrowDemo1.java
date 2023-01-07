import java.io.IOException;

public class ThrowDemo1 {
static void validAge(int age) throws ValidAgeException

{
	if(age<18)
		throw new ValidAgeException("Age is not valid");
	else 
		System.out.println("age is valid");
	}
	public static void main(String[] args) {
		try {
			validAge(10);
		} catch (ValidAgeException e) {
			System.out.println(e.getMessage());
		}
		

	}

}