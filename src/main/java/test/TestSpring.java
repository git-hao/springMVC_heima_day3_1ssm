package test;

import com.hao.dao.AccountDao;
import com.hao.domain.Account;
import com.hao.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Describe test
 * @Auther wenhao chen
 * @CreateDate 2019/8/26
 * @Version 1.0
 */
public class TestSpring {


    @Test //测试spring
    public void test1(){
        //加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //获取bean对象
        AccountService as = (AccountService) ac.getBean("accountService");
        //调用方法
        as.findAllAccount();
    }

    @Test //测试mybatis
    public void test2() throws Exception {
        Account account = new Account();
        account.setName("delisa");
        account.setMoney(13d);

        //加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        //创建sqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //创建sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取代理对象
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        //执行方法
        accountDao.saveAcconut(account);
        List<Account> accounts = accountDao.findAllAccount();
        for (Account acc:accounts) {
            System.out.println(acc);
        }
        //提交事务
        sqlSession.commit();
        //关闭资源
        sqlSession.close();
        inputStream.close();
    }
}
