package com.rhino.dao;
 
import com.rhino.entry.User;
 
public interface UserDao {
 
    /**
     * @param userId
     * @return User
     */
    public User selectUserById(Integer userId);  
 
}
