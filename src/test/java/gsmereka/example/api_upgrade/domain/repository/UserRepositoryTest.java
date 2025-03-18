package gsmereka.example.api_upgrade.domain.repository;

import gsmereka.example.api_upgrade.controller.dto.UserDto;
import gsmereka.example.api_upgrade.domain.model.Account;
import gsmereka.example.api_upgrade.domain.model.User;
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
    EntityManager entityManager;


    @Test
    @DisplayName("Should get User successfully from DB.")
    void existsByAccountNumberCase1() {
//        User data = new User(0,"Gabriel", Account(""))
    }

    @Test
    @DisplayName("Should not get User successfully from DB.")
    void existsByAccountNumberCase2() {
    }

    @Test
    void existsByCardNumber() {
    }


    private User createUser(UserDto data){
        User newUser = new User(data);
        this.entityManager.persist(newUser);
        return newUser;
    }


}
