package com.newer.demo2.mapper;

import com.newer.demo2.domain.Emp;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface EmpMapper {


    //删除

    @Delete("delete from emp where empno=#{empno}")
    public int del(@Param("empno") int empno);



    //修改
    @Update("update emp set ename=#{ename},job=#{job},hiredate=#{hiredate},sal=#{sal} where empno=#{empno}")
    public int upd(Emp emp);


    @Select("select * from emp where empno=#{empno}")
    public Emp selById(@Param("empno") int empno);


    //查询

    @Select("select * from emp ")
    public List<Emp> selAll();


    //新增

    @Insert("insert into emp(empno,ename,job,hiredate,sal) values(#{empno},#{ename},#{job},#{hiredate},#{sal})")
    public int add(Emp emp);

}
