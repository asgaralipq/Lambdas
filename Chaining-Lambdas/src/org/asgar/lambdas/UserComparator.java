package org.asgar.lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.asgar.lambdas.model.User;

public class UserComparator {

	public static void main(String[] args) {
		
		User asgar = new User("Asgar", 20);
		User adnan = new User("Adnan", 21);
		User rahil = new User("Rahil", 22);
		User umair = new User("Umair", 82);
		User umair2 = new User("Umair", 81);
		
		List<User> users = Arrays.asList(asgar, adnan, rahil, umair, umair2);
		
		Comparator<User> cmpName = Comparator.comparing(
				(User user) -> {
					return user.getName();
				});
		
		Comparator<User> cmpAge = Comparator.comparing(
				(User user) -> {
					return user.getAge();
				});
		
		Comparator<User> cmp = cmpName.thenComparing(cmpAge).reversed();
		
		users.sort(cmp);
		users.forEach((User user) -> System.out.println(user));
	}

}
