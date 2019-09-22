package net.riking.mybatis.simple.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 * @Description
 * @Author kongLiuYi
 * @Date 2019/9/22 0022 15:09
 */
@Data
public class BaseEntity implements Serializable{
        public final static String DEFAULT_USERNAME = "system";
        private Long id = 0L;
        private String createdBy = DEFAULT_USERNAME;
        private String updatedBy = DEFAULT_USERNAME;
        private Date createdTime = Date.from(ZonedDateTime.now().toInstant());
        private Date updatedTime = Date.from(ZonedDateTime.now().toInstant());
}
