package com.hendisantika.minio.util;

import com.hendisantika.minio.payload.FileResponse;
import org.springframework.hateoas.Link;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-minio-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/10/23
 * Time: 06:22
 * To change this template use File | Settings | File Templates.
 */
@Component
public class FileResponseLink implements LinkUtils<FileResponse> {
    public FileResponse addOperationWithLink(FileResponse response) {
        Link[] links = new Link[]{
                linkTo(methodOn(FileController.class).getFileDetail(response.getFilename()))
                        .withRel("file")
                        .withType("GET")
                        .withDeprecation("File Detail"),
                linkTo(methodOn(FileController.class).viewFile(response.getFilename()))
                        .withRel("file")
                        .withType("GET")
                        .withDeprecation("View File"),
                linkTo(methodOn(FileController.class).downloadFile(response.getFilename()))
                        .withRel("file")
                        .withType("GET")
                        .withDeprecation("Download File"),
                linkTo(methodOn(FileController.class).removeFile(response.getFilename()))
                        .withRel("file")
                        .withType("DELETE")
                        .withDeprecation("Delete File")
        };
        return response.add(links);
    }

    public FileResponse getOperationWithLink(FileResponse response) {
        Link[] links = new Link[]{
                linkTo(methodOn(FileController.class).fileUpload(null))
                        .withRel("file")
                        .withType("POST")
                        .withDeprecation("Add File"),
                linkTo(methodOn(FileController.class).viewFile(response.getFilename()))
                        .withRel("file")
                        .withType("GET")
                        .withDeprecation("View File"),
                linkTo(methodOn(FileController.class).downloadFile(response.getFilename()))
                        .withRel("file")
                        .withType("GET")
                        .withDeprecation("Download File"),
                linkTo(methodOn(FileController.class).removeFile(response.getFilename()))
                        .withRel("file")
                        .withType("DELETE")
                        .withDeprecation("Delete File")
        };
        return response.add(links);
    }
}
