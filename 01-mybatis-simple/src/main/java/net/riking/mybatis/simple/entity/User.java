package net.riking.mybatis.simple.entity;


import lombok.*;


/**
 * @Description
 * @Author kongLiuYi
 * @Date 2019/9/22 0022 15:13
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseEntity {
    private String name;
    private String mobile;
    private String username;
    private String password;
    private String description;
    private Boolean enabled;
    private Boolean accountNonExpired;
    private Boolean credentialsNonExpired;
    private Boolean accountNonLocked;

    private String deleted = "N";
}

