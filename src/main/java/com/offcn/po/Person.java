package com.offcn.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cd_person")
public class Person {

    @Id
    @GeneratedValue
    private  Long id;

    @Column(name = "name",length = 100,nullable = false)
    private  String name;

    @Column(name = "age",length = 4,nullable = false)
    private Integer age;
}
