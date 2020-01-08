package com.offcn.dao;

import com.offcn.po.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
@RepositoryRestResource(path = "/per")
public interface PersonDao extends JpaRepository<Person,Long> {

    /**
     * 利用Jpa自定义自己需要的方法,如：自定义一个模糊查询的方法（遵守jpa的方法命名规则）
     */

    public List<Person> findByNameLikeAndAgeEquals(String name,Integer age);

    /**
     * 自定义方法及查询语句,exported:隐藏接口、对外不暴露即无法访问
     */
    @RestResource(path = "/like"/*,exported = false*/)
    @Query("select p from Person p where p.name like %:name% and p.age=:age")
    public List<Person> getAllPerson(@Param("name") String name,@Param("age") Integer age);

    /**
     * 自定义查询语句,并且使用源生的sql语句
     * @CrossOrigin：该注解实现了跨域传输
     */
    @CrossOrigin
    @RestResource(path = "/all")
    @Query(value = "select * from cd_person",nativeQuery = true)
    public List<Person> getAllPerson();

    /**
     *
     * @Param注解：指定参数
     */
    @RestResource(path = "/haspers")
    @Query("select p from Person p where p.name=:name and p.age=:age")
    public List<Person> gethasPersons(@Param("name") String name,@Param("age") Integer age);



}
