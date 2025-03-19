package gsmereka.example.api_upgrade.service.impl;

import gsmereka.example.api_upgrade.domain.model.User;
import gsmereka.example.api_upgrade.domain.repository.UserRepository;
import gsmereka.example.api_upgrade.utils.PredefinedUser;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("test")
class UserServiceImplTest {

    private User user;


//    @Autowired
//    EntityManager entityManager;

    @Autowired
    UserServiceImpl userServiceImpl;

//    @Autowired
//    UserRepository userRepository;

    @Test
    @DisplayName("Should find all Users successfully from DB.")
    void findAllCase1() throws Exception {
        User newUser1 = PredefinedUser.createUser();
        newUser1.setName("User 1");
        newUser1.getAccount().setNumber("1");
        newUser1.getCard().setNumber("1");
        User newUser2 = PredefinedUser.createUser();
        newUser2.setName("User 2");
        newUser2.getAccount().setNumber("2");
        newUser2.getCard().setNumber("2");
        User newUser3 = PredefinedUser.createUser();
        newUser3.setName("User 3");
        newUser3.getAccount().setNumber("3");
        newUser3.getCard().setNumber("3");

//        this.entityManager.persist(newUser1);
//        this.entityManager.persist(newUser2);
//        this.entityManager.persist(newUser3);

        userServiceImpl.create(newUser1);
        userServiceImpl.create(newUser2);
        userServiceImpl.create(newUser3);

        List<User> result = userServiceImpl.findAll();

        assertNotNull(result);
        assertEquals(3, result.size());
        assertEquals("User 1", result.get(0).getName());
        assertEquals("User 2", result.get(1).getName());
        assertEquals("User 3", result.get(2).getName());
    }

    @Test
    void findById() {
    }

    @Test
    void create() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}