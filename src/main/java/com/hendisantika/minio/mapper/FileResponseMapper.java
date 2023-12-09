package com.hendisantika.minio.mapper;

import com.hendisantika.minio.payload.FileResponse;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-minio-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/10/23
 * Time: 06:20
 * To change this template use File | Settings | File Templates.
 */
@Mapper
@DecoratedWith(FileResponseDecorator.class)
public interface FileResponseMapper {

    @Mapping(target = "stream", ignore = true)
    @Mapping(target = "filename", ignore = true)
    @Mapping(target = "fileSize", ignore = true)
    @Mapping(target = "createdTime", ignore = true)
    @Mapping(target = "contentType", ignore = true)
    FileResponse fileAddResponse(ObjectStat objectStat);


    @Mapping(target = "stream", ignore = true)
    @Mapping(target = "filename", ignore = true)
    @Mapping(target = "fileSize", ignore = true)
    @Mapping(target = "createdTime", ignore = true)
    @Mapping(target = "contentType", ignore = true)
    FileResponse fileGetResponse(ObjectStat objectStat);
}
