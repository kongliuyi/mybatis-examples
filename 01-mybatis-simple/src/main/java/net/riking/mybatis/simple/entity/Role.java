package net.riking.mybatis.simple.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description
 * @Author kongLiuYi
 * @Date 2019/9/22 0022 15:11
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Role extends  BaseEntity{
    private String code;
    private String name;
    private String description;
}
