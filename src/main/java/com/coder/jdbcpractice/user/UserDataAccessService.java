package com.coder.jdbcpractice.user;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDataAccessService implements UserDTO {

    private final JdbcTemplate jdbcTemplate;

    public UserDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }




    public User saveUserDetails(User user){

        //sql stuff
        String sql = "INSERT INTO UserTable(USERNAME, PASSWORD, EMAIL) VALUES (?, ?, ?)";
      int ID = jdbcTemplate.update(
                sql,
              user.getUSERNAME(), user.getPASSWORD(), user.getEMAIL()
        );

        String stuff =
                "SELECT ID, USERNAME, PASSWORD, EMAIL FROM UserTable WHERE ID = ?";
        return (User) jdbcTemplate.query(stuff, new UserRowMapper());


    }







}
