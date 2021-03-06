package com.jerryring.service.impl;

import com.jerryring.dao.IUserDao;
import com.jerryring.model.Page;
import com.jerryring.model.User;
import com.jerryring.service.interc.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author chenjia
 * @date 2017/12/27.
 */
@Service("userService")
public class UserService implements IUserService {
    @Resource
    private IUserDao userDao;

    @Override
    public User getUserById(int userId) {
        return userDao.selectByPrimaryKey(userId);
    }

    @Override
    public List<User> selectUserByListPage(Page page) {
        return userDao.selectUserByListPage(page);
    }
}
