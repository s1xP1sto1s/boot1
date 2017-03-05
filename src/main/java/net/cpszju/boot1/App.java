package net.cpszju.boot1;

import java.util.List;

import net.cpszju.dao.UserMapper;
import net.cpszju.domain.User;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Hello world!
 *
 */
@Controller
@EnableAutoConfiguration
@MapperScan("net.cpszju.dao")
public class App {
	
	@Autowired
	UserMapper userMapper;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        userMapper.insertUser("lllll", 50);
        userMapper.updateUser("pipi", 199);
    	List<User> user = userMapper.selectUser(50);
    	System.out.println(user.size());
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }
}
