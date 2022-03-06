package com.zimo.taco.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Create by zimo at 2021/12/16
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Taco {

    private Integer id;
    private Date createdAt;
    private String name;
    private String ingredients;

}
