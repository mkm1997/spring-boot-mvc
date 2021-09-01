package com.mkm.springmvc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig  extends WebSecurityConfigurerAdapter {

    @Bean //for getting object
    @Override
    protected UserDetailsService userDetailsService(){
        List<UserDetails> users = new ArrayList<>();
        users.add( User.withDefaultPasswordEncoder().username("mkm").password("mkm").roles("USER").build());
        return  new InMemoryUserDetailsManager(users);
    }
}
