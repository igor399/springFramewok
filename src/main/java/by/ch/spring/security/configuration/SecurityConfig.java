package by.ch.spring.security.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

import javax.sql.DataSource;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    DataSource dataSource;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        UserBuilder userBuilder = User.withDefaultPasswordEncoder();
//        auth.inMemoryAuthentication()
//                .withUser(userBuilder.username("igor").password("igor").roles("EMPLOYEE"))
//                .withUser(userBuilder.username("cyber").password("cyber").roles("HR"))
//                .withUser(userBuilder.username("dogecoin").password("dogecoin").roles("IT"));

        auth.jdbcAuthentication().dataSource(dataSource);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/").hasAnyRole("EMPLOYEE", "HR", "IT")
                .antMatchers("/hr_info").hasRole("HR")
                .antMatchers("/manager_info").hasRole("IT")
                .and().formLogin().permitAll();
    }
}
