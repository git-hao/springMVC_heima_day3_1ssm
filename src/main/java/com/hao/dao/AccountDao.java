package com.hao.dao;

import com.hao.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Describe com.hao.dao
 * @Auther wenhao chen
 * @CreateDate 2019/8/26
 * @Version 1.0
 */
@Repository
public interface AccountDao {

    @Select("select * from account")
    public List<Account> findAllAccount();

    @Insert("insert into account(name,money) values (#{name},#{money})")
    public void saveAcconut(Account account);
}
