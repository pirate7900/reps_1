package cn.itcast.service;

import cn.itcast.domain.Account;

import java.util.List;

/**
 * 账户 service接口
 */
public interface AccountService {

    // 1. 查询所有
    List<Account> findAll();

    //2. 保存账户信息
    void saveAccount(Account account);

}
