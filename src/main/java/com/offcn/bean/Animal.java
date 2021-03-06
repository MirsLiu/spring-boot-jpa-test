package com.offcn.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 分支添加实体类
 */
/*
修改后的实体类
Time:2020年1月8日16:33:30
author:小王
*/
/*
测试,时间：2020年1月8日19:12:42
* */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_animal")
public class Animal {

    @Id
    @GeneratedValue
    private  Long id;

    private  String name;

    private  Integer age;
}
