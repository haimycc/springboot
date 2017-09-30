package com.syx.service.impl;

import com.syx.domain.UserInfo;
import com.syx.mapper.UserInfoMapper;
import com.syx.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by shao_yx on 2017/9/26.
 */
@Service
public class UserInfoServiceImpl implements IUserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public void update(UserInfo userInfo) {

    }

    @Override
    public void save(UserInfo ui) {

    }

    @Override
    public UserInfo get(Long id) {
        return userInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public UserInfo getCurrent() {
        return null;
    }
}
