package com.syx.service;


import com.syx.domain.UserInfo;

/**
 * 用户信息服务
 */
public interface IUserInfoService {

    /**
     * 处理乐观锁更新的问题
     * 只要更新UserInfo信息就要调用这个方法
     */
    void update(UserInfo userInfo);

    /**
     * 保存
     * @param ui
     */
    void save(UserInfo ui);

    UserInfo get(Long id);

    UserInfo getCurrent();


}
