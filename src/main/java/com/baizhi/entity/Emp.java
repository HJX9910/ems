package com.baizhi.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true) //开起chain=true后可以使用链式的set
public class Emp  /*implements Serializable */{
    private String id;
    private String name;
    private String path;
    private Double salary;
    private Integer age;

}
