package another.world;

import org.springframework.stereotype.Component;

@Component
public class UserRepo {
 
	public void searchUser()
	{
		System.out.println("Found one user");
	}
}
