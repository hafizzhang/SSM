package com.hafiz.www.socket;

import java.io.Serializable;
import java.util.Date;

/**
 * Desc:学生信息类
 * Created by hafiz.zhang on 2016/11/30.
 */
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
    private Date birthday;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
