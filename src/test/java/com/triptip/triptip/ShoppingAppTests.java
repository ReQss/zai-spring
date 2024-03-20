package com.triptip.triptip;

import com.triptip.triptip.model.User;
import com.triptip.triptip.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShoppingAppTests {
	private UserRepository userRepository;

	@Test
	void contextLoads() {

	}
	@Test
	void testSaveTwoUsers() {
		// Given
		User user1 = new User("adam", "nowak");
		User user2 = new User("jan", "kowalski");

		// When
		userRepository.save(user1);
		userRepository.save(user2);

		// Then
		User savedUser1 = userRepository.findByLogin("adam");
		User savedUser2 = userRepository.findByLogin("jan");

//		assertNotNull(savedUser1);
//		assertNotNull(savedUser2);
//		assertEquals("nowak", savedUser1.getPassword());
//		assertEquals("kowalski", savedUser2.getPassword());
	}
	private User createUser(String login, String password){
		return userRepository.save(new User(login,password));
	}
}
