package com.tpg.orderservice.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderBean {
    private Long id;
    private String name;
    private Integer age;
    private String designation;
}
