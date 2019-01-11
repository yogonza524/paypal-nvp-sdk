package com.paypal.npvsdk;

import com.paypal.credentials.Credentials;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NpvSdkApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void credentialsTest() {
        String username = "test";
        String password = "dummy";
        String signature = "dummy-foo-bar";
        
        Credentials credentials = Credentials.builder()
                .username(username)
                .password(password)
                .withSignature(signature)
                .build();
        
        assertEquals(username, credentials.getUsername());
        assertEquals(password, credentials.getPassword());
        assertEquals(signature,credentials.getSignature());
    }
}

