package com.fastcampus.projectboardadmin.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import org.springframework.security.web.SecurityFilterChain;




@Configuration
public class SecurityConfig {

//    antMatchers == mvcMatchers
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .authorizeHttpRequests(auth -> auth.anyRequest().permitAll())
                .formLogin(Customizer.withDefaults())
                .logout(logout -> logout.logoutSuccessUrl("/"))
                .build();
    }





//    @Bean
//    public UserDetailsService userDetailsService(UserAccountRepository userAccountRepository) {
//        return username -> userAccountRepository
//                .findById(username)
//                .map(UserAccountDto::from)
//                .map(BoardPrincipal::from)
//                .orElseThrow(() -> new UsernameNotFoundException("유저를 찾을 수 없습니다 - username: " + username));
//    }

}
