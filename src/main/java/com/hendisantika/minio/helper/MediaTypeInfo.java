package com.hendisantika.minio.helper;

import jakarta.servlet.http.HttpServletRequest;
import lombok.experimental.UtilityClass;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-minio-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/10/23
 * Time: 06:19
 * To change this template use File | Settings | File Templates.
 */
@UtilityClass
public class MediaTypeInfo {
    public String getCurrentMediaType() {
        var requestAttributes = RequestContextHolder.getRequestAttributes();
        if (requestAttributes == null) throw new IllegalArgumentException();
        HttpServletRequest request = ((ServletRequestAttributes) requestAttributes).getRequest();
        return request.getParameter("mediaType");
    }
}
