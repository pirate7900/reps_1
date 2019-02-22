package cn.itcast.dao;

import cn.itcast.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 账户dao接口
 */
@Repository
public interface AccountDao  {

    // 1. 查询所有
    @Select("select * from account")
    List<Account> findAll();

    //2. 保存账户信息
    @Insert("Insert into account (name,money) values (#{name},#{money})")
    void saveAccount(Account account);

    // 3 . 查询所有用户 及对应的账户信息



}
