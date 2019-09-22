package net.riking.mybatis.simple.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description
 * @Author kongLiuYi
 * @Date 2019/9/22 0022 15:13
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRole extends  BaseEntity{
    private long userId;
    private long roleId;
}
