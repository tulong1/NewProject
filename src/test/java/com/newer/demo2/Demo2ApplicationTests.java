package com.newer.demo2;

import com.newer.demo2.domain.Emp;
import com.newer.demo2.service.EmpService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo2ApplicationTests {

    @Autowired
    public EmpService empService;

    @Test
    public void contextLoads() {

    }

    @Test
    public void test(){

        System.out.println(empService.del(7937));
       /* empService.selAll().forEach(obj->{
            System.out.println(obj);
        });*/
        //System.out.println(empService.selById(7788));

        //System.out.println(empService.add(new Emp(7777,"占全","啥子",new Date(),1223)));

            //System.out.println(empService.upd(new Emp(7936,"武宣","啥子",new Date(),1223)));
    }
}
