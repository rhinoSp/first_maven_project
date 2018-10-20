package com.rhino.service;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rhino.dao.UserDao;
import com.rhino.entry.User;
 
@Service  
public class UserServiceImpl implements UserService {
 
    @Autowired  
    private UserDao userDao;  
 
    public User selectUserById(Integer userId) {  
        return userDao.selectUserById(userId);  
 
    }  
}
