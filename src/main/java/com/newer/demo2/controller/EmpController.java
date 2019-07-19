package com.newer.demo2.controller;

import com.newer.demo2.domain.Emp;
import com.newer.demo2.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;


@RestController
public class EmpController {

    @Autowired
    private EmpService empService;


    //删除
    @RequestMapping("del")
    public int del(@RequestParam("empno") int empno){
        return empService.del(empno);
    }





    //修改
    @RequestMapping("upd")
    public int upd(Emp emp){
        System.out.println(emp);
        return empService.upd(emp);
    }


   /* //查询
    @RequestMapping("selAll")
    public List<Emp> selAll(){
        return empService.selAll();
    }*/
    //查询
    @RequestMapping("selAll")
    public ResponseEntity<?> saveMenu(){
        return new ResponseEntity<>(empService.selAll(),HttpStatus.OK);
    }


    //根据id查询
    @RequestMapping("selById")
    public Emp selById(int empno) throws ParseException {

        return empService.selById(empno);
    }




    //新增
    @RequestMapping("add")
    public int add(Emp emp){
        return empService.add(emp);
    }

}
