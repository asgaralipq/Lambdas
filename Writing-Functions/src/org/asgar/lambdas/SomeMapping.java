package org.asgar.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import org.asgar.lambdas.model.User;

public class SomeMapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1 = new User("Asgar");
		User user2 = new User("Omkar");
		User user3 = new User("Rahil");
		User user4 = new User("Umair");
		
		List<User> users = List.of(user1, user2, user3, user4);
		List<String> names = new ArrayList<>();
		
		Function<User, String> toName = (User user) -> {
			return user.getName();
		};
		
		for(User user : users) {
			String name = toName.apply(user);
			names.add(name);
		}
		
		Consumer<User> action = (User user) -> {
			System.out.println(user);
		};
		
		users.forEach(action);
		
		Consumer<String> action1 = (String string) -> {
			System.out.println(string);
		};
		
		names.forEach(action1);
		
	}

}
