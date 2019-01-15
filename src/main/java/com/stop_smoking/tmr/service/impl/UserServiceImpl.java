package com.stop_smoking.tmr.service.impl;

import com.stop_smoking.tmr.entity.User;
import com.stop_smoking.tmr.mapper.UserMapper;
import com.stop_smoking.tmr.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Promise
 * @since 2019-01-15
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
