package gsmereka.example.api_upgrade.domain.repository;

import gsmereka.example.api_upgrade.controller.dto.UserDto;
import gsmereka.example.api_upgrade.domain.model.Account;
import gsmereka.example.api_upgrade.domain.model.User;
import gsmereka.example.api_upgrade.utils.PredefinedUser;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
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

    @Mock
    UserRepository userRepository;

    @Mock
    EntityManager entityManager;


    @Test
    @DisplayName("Should find User successfully from DB.")
    void existsByAccountNumberCase1() {
        String accountNumber = "1234";
        UserDto userDto = PredefinedUser.createUserDto();
        this.entityManager.persist(userDto);
        boolean result = this.userRepository.existsByAccountNumber(accountNumber);
        assertTrue(result);
    }

    @Test
    @DisplayName("Should not find User successfully from DB.")
    void existsByAccountNumberCase2() {
        String accountNumber = "1234";
        UserDto userDto = PredefinedUser.createUserDto();
        this.entityManager.persist(userDto);
        boolean result = this.userRepository.existsByAccountNumber(accountNumber);
        System.out.print(result);
        assertFalse(result);
    }

    @Test
    void existsByCardNumber() {
    }

}
