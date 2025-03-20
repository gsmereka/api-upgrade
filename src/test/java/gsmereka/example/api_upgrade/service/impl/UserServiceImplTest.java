package gsmereka.example.api_upgrade.service.impl;

import gsmereka.example.api_upgrade.domain.model.User;
import gsmereka.example.api_upgrade.domain.repository.UserRepository;
import gsmereka.example.api_upgrade.service.exception.BusinessException;
import gsmereka.example.api_upgrade.service.exception.NotFoundException;
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

    @Autowired
    UserServiceImpl userServiceImpl;

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

        userServiceImpl.create(newUser1);
        userServiceImpl.create(newUser2);
        userServiceImpl.create(newUser3);

        User userFound = userServiceImpl.findById(1L);

        assertNotNull(userFound);
        assertEquals("User 1", userFound.getName());
        assertEquals(1L, userFound.getId());
    }

    @Test
    @DisplayName("Should successfully create a new user.")
    void createUserSuccessfully() {
        User newUser = PredefinedUser.createUser();
        newUser.setName("New User");
        newUser.getAccount().setNumber("12345");
        newUser.getCard().setNumber("67890");

        User createdUser = userServiceImpl.create(newUser);

        assertNotNull(createdUser);
        assertEquals("New User", createdUser.getName());
        assertEquals("12345", createdUser.getAccount().getNumber());
        assertEquals("67890", createdUser.getCard().getNumber());
    }

    @Test
    @DisplayName("Should throw BusinessException when trying to create a user with null fields.")
    void createUserWithNullFields() {
        User newUser = null;

        BusinessException thrown = assertThrows(BusinessException.class, () -> {
            userServiceImpl.create(newUser);
        });

        assertEquals("User to create must not be null.", thrown.getMessage());
    }

    @Test
    @DisplayName("Should throw BusinessException when trying to create a user with an existing account number.")
    void createUserWithExistingAccountNumber() {
        User existingUser = PredefinedUser.createUser();
        existingUser.setName("Existing User");
        existingUser.getAccount().setNumber("12345");
        existingUser.getCard().setNumber("67890");

        userServiceImpl.create(existingUser); // Create an existing user first

        User newUser = PredefinedUser.createUser();
        newUser.setName("New User");
        newUser.getAccount().setNumber("12345"); // Same account number as the existing one
        newUser.getCard().setNumber("11111");

        BusinessException thrown = assertThrows(BusinessException.class, () -> {
            userServiceImpl.create(newUser);
        });

        assertEquals("This account number already exists.", thrown.getMessage());
    }

    @Test
    @DisplayName("Should successfully update an existing user.")
    void updateUserFailAtUpdateFirstUser() {
        User initialUser = PredefinedUser.createUser();
        initialUser.setName("Initial User");
        initialUser.getAccount().setNumber("12345");
        initialUser.getCard().setNumber("67890");

        User createdUser = userServiceImpl.create(initialUser);
        createdUser.setName("Updated User");
        createdUser.getAccount().setNumber("54321");
        createdUser.getCard().setNumber("98765");

        BusinessException thrown = assertThrows(BusinessException.class, () -> {
            User updatedUser = userServiceImpl.update(createdUser.getId(), createdUser);
        });

        assertEquals("User with ID 1 can not be updated.", thrown.getMessage());
    }

    @Test
    @DisplayName("Should successfully update an existing user.")
    void updateUserSuccessfully() {
        User admin = PredefinedUser.createUser(); // User with ID 1 cannot be Updated, because is restricted to protect system integrity.
        userServiceImpl.create(admin);

        User initialUser = PredefinedUser.createUser();
        initialUser.setName("Initial User");
        initialUser.getAccount().setNumber("12345");
        initialUser.getCard().setNumber("67890");

        User createdUser = userServiceImpl.create(initialUser);
        createdUser.setName("Updated User");
        createdUser.getAccount().setNumber("54321");
        createdUser.getCard().setNumber("98765");

        User updatedUser = userServiceImpl.update(createdUser.getId(), createdUser);

        assertNotNull(updatedUser);
        assertEquals("Updated User", updatedUser.getName());
        assertEquals("54321", updatedUser.getAccount().getNumber());
        assertEquals("98765", updatedUser.getCard().getNumber());
    }

    @Test
    @DisplayName("Should throw BusinessException when updating a user with a different ID.")
    void updateUserWithDifferentId() {
        User admin = PredefinedUser.createUser(); // User with ID 1 cannot be Updated, because is restricted to protect system integrity.
        userServiceImpl.create(admin);

        User initialUser = PredefinedUser.createUser();
        initialUser.setName("Initial User");
        initialUser.getAccount().setNumber("12345");
        initialUser.getCard().setNumber("67890");
        User createdUser = userServiceImpl.create(initialUser);


        User userToUpdate = PredefinedUser.createUser();
        userToUpdate.setId(3L); // ID different
        userToUpdate.setName("Updated User");
        userToUpdate.getAccount().setNumber("54321");
        userToUpdate.getCard().setNumber("98765");

        BusinessException thrown = assertThrows(BusinessException.class, () -> {
            userServiceImpl.update(createdUser.getId(), userToUpdate);
        });

        assertEquals("Update IDs must be the same.", thrown.getMessage());
    }


    @Test
    @DisplayName("Should successfully delete an existing user.")
    void deleteUserSuccessfully() {
        User admin = PredefinedUser.createUser(); // User with ID 1 cannot be Deleted, because is restricted to protect system integrity.
        userServiceImpl.create(admin);

        User userToDelete = PredefinedUser.createUser();
        userToDelete.setName("User to be deleted");
        userToDelete.getAccount().setNumber("12345");
        userToDelete.getCard().setNumber("67890");

        User createdUser = userServiceImpl.create(userToDelete);

        userServiceImpl.delete(createdUser.getId());

        assertThrows(NotFoundException.class, () -> {
            userServiceImpl.findById(createdUser.getId());
        });
    }

    @Test
    @DisplayName("Should throw NotFoundException when trying to delete a non-existent user.")
    void deleteUserNotFound() {
        Long nonExistentId = 999L;

        assertThrows(NotFoundException.class, () -> {
            userServiceImpl.delete(nonExistentId);
        });
    }

    @Test
    @DisplayName("Should throw BusinessException when trying to delete the user with unchangeable ID.")
    void deleteUserWithUnchangeableId() {
        User userWithUnchangeableId = PredefinedUser.createUser();
        userWithUnchangeableId.setId(1L);
        userWithUnchangeableId.setName("User with unchangeable ID");

        BusinessException thrown = assertThrows(BusinessException.class, () -> {
            userServiceImpl.delete(userWithUnchangeableId.getId());
        });

        assertEquals("User with ID 1 can not be deleted.", thrown.getMessage());
    }

}