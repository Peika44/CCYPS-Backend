package org.example.ccypsbackend;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import static org.assertj.core.api.Assertions.assertThat;
import org.example.ccypsbackend.user.dao.entity.User;
import org.example.ccypsbackend.user.dao.repo.UserRepository;

@SpringBootTest // Loads the Spring application context
@DirtiesContext // Ensures the context is reset between tests
@ActiveProfiles("test") // Use a separate profile for testing
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testFindByUname() {
        // Arrange: Add a user to the database
        User user = new User();
        user.setUname("testuser");
        user.setPassword("password");
        userRepository.save(user);

        // Act: Try to find the user by username
        User foundUser = userRepository.findByUname("testuser");

        // Assert: Check if the found user is the same as the saved one
        assertThat(foundUser).isNotNull();
        assertThat(foundUser.getUname()).isEqualTo("testuser");
    }
}
