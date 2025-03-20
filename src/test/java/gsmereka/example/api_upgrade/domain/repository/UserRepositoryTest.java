package gsmereka.example.api_upgrade.domain.repository;

import gsmereka.example.api_upgrade.controller.dto.UserDto;
import gsmereka.example.api_upgrade.domain.model.User;
import gsmereka.example.api_upgrade.utils.PredefinedUser;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;


@DataJpaTest // Configura um Ambiente Específico para testes de aplicações JPA
@ActiveProfiles("test")
class UserRepositoryTest {


    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Autowired
    UserRepository userRepository;

    @Autowired
    EntityManager entityManager;


    @Test
    @DisplayName("Should find User successfully from DB.")
    void existsByAccountNumberCase1() {
        String accountNumber = "1234";

        User newUser = PredefinedUser.createUser();
        newUser.getAccount().setNumber(accountNumber);

        this.entityManager.persist(newUser);
        boolean result = this.userRepository.existsByAccountNumber(accountNumber);
        assertTrue(result);
    }

    @Test
    @DisplayName("Should not find User successfully from DB.")
    void existsByAccountNumberCase2() {
        String accountNumber = "1234";
        String falseAccountNumber = "4321";

        User newUser = PredefinedUser.createUser();
        newUser.getAccount().setNumber(accountNumber);

        this.entityManager.persist(newUser);
        boolean result = this.userRepository.existsByAccountNumber(falseAccountNumber);
        assertFalse(result);
    }

    @Test
    @DisplayName("Should find User successfully from DB.")
    void existsByCardNumberCase1() {
        String cardNumber = "1234";

        User newUser = PredefinedUser.createUser();
        newUser.getCard().setNumber(cardNumber);

        this.entityManager.persist(newUser);
        boolean result = this.userRepository.existsByCardNumber(cardNumber);
        assertTrue(result);
    }

    @Test
    @DisplayName("Should not find User successfully from DB.")
    void existsByCardNumberCase2() {
        String cardNumber = "1234";
        String falseCardNumber = "4321";

        User newUser = PredefinedUser.createUser();
        newUser.getCard().setNumber(cardNumber);

        this.entityManager.persist(newUser);
        boolean result = this.userRepository.existsByCardNumber(falseCardNumber);
        assertFalse(result);
    }
}
