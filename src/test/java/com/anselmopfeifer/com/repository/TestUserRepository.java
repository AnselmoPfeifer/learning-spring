package com.anselmopfeifer.com.repository;

import com.anselmopfeifer.com.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@RunWith(SpringRunner.class)
@DataJpaTest
public class TestUserRepository {


    @Autowired
    private UserRepository userRepository;

    @Test
    public void save_user() {
        User user = new User();
        user.setUsername("test");
        user.setName("Anselmo Pfeifer");
        user.setEmail("anspfeifer@gmail.com");

        User userSalved = userRepository.save(user);

        Assert.assertNotNull(userSalved.getId());
    }
}
