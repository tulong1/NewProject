package com.newer.demo2.service;

import com.newer.demo2.domain.Emp;
import com.newer.demo2.mapper.EmpMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {

    @Autowired
    private EmpMapper empMapper;


    //删除
    public int del( int empno){
        return empMapper.del(empno);
    }



    //修改
    public int upd(Emp emp){
        return empMapper.upd(emp);
    }


    //查询
    public List<Emp> selAll(){
        return empMapper.selAll();
    }


    //根据id查询
    public Emp selById(int empno){
        return empMapper.selById(empno);
    }


    //新增

    public int add(Emp emp){
        return empMapper.add(emp);
    }

}
