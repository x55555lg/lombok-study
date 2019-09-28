package com.lg.study;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

/**
 * lombok的学习
 *
 * @author Xulg
 * Created in 2019-09-27 16:06
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"pwd"})
@ToString(of = {"name"})
@Builder
@Slf4j
public class Demo {

    private String name;

    private String pwd;

    public static void main(String[] args) {
        log.info("dafsfasdfasdfasdfas");
    }

    /*
     * @Getter
     *      生成getter方法
     *
     * @Setter
     *      生成getter方法
     *
     * @AllArgsConstructor
     *      生成全参构造方法
     *
     * @NoArgsConstructor
     *      生成无参构造方法
     *
     * @RequiredArgsConstructor
     *      生成指定参数构造方法
     *          使用@NonNull注解指定哪些field用于构造器
     *          staticName参数指定了之后，那么构造方法将变private，同时生成一个staticName指定名称的静态方法
     *          staticName不指定参数，则构造方法是public的
     *
     * @ToString
     *      生成toString()方法
     *          exclude: 排除哪些字段
     *          of: 指定哪些字段
     *
     * @EqualsAndHashCode
     *      生成equals()和hashCode()方法
     *          exclude: 排除哪些字段
     *          of: 指定哪些字段
     *
     * @Data
     *      多个注解的混合体
     *          @Getter
     *          @Setter
     *          @ToString
     *          @EqualsAndHashCode
     *          @RequiredArgsConstructor
     *
     * @Builder
     *      采用Builder模式去构造一个对象
     *
     * @@Slf4j
     *      生成slf4j的log对象
     */
}