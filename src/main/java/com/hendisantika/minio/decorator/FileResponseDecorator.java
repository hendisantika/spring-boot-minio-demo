package com.hendisantika.minio.decorator;

import com.hendisantika.minio.mapper.FileResponseMapper;
import com.hendisantika.minio.util.FileResponseLink;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-minio-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/10/23
 * Time: 06:25
 * To change this template use File | Settings | File Templates.
 */
public abstract class FileResponseDecorator implements FileResponseMapper {
    @Setter(onMethod = @__({@Autowired}))
    FileResponseLink linkUtils;

}
