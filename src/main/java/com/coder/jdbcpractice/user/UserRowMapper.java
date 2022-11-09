package com.coder.jdbcpractice.user;

import org.springframework.jdbc.core.RowMapper;

import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public class UserRowMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        return new User(

                //this is all the get for the variables in the table & map to hibernate mapping to java object
                resultSet.getInt("ID"),
                resultSet.getString("USERNAME"),
                resultSet.getString("PASSWORD"),
                resultSet.getString("EMAIL")
        );
    }


}
