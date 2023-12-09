package com.hendisantika.minio.error;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-minio-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/10/23
 * Time: 06:16
 * To change this template use File | Settings | File Templates.
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NonNull
@Builder
public class ApiError {
    private String message;
    private Date timestamp;
    private Integer status;
    private String error;
    private String path;
}
