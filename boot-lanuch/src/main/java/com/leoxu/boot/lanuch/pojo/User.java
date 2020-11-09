package com.leoxu.boot.lanuch.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: Leo.xu
 * @Created: 2020/11/9 16:01
 * @Description:
 */
@Data
@Slf4j
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String name;
    private Integer age;
}
