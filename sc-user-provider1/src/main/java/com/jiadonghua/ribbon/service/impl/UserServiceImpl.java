package com.jiadonghua.ribbon.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jiadonghua.ribbon.mapper.UserMapper;
import com.jiadonghua.ribbon.service.IUserService;
import com.jiadonghua.user.entity.User;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author chenteng
 * @since 2020-07-16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
