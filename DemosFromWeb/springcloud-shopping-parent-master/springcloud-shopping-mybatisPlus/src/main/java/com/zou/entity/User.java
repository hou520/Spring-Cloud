package com.zou.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author WH
 * @version 1.0
 * @date 2020/5/5 11:21
 * @Description TODO
 */
@Data
public class User {

    private Long id;

    private String name;

    private Integer age;

    private String email;

    private Long managerId;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", managerId=" + managerId +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
