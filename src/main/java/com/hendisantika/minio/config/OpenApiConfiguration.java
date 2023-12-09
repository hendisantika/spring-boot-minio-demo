package com.hendisantika.minio.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.Operation;
import io.swagger.v3.oas.models.media.StringSchema;
import io.swagger.v3.oas.models.parameters.Parameter;
import org.springdoc.core.customizers.OperationCustomizer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.HandlerMethod;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-minio-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/10/23
 * Time: 06:24
 * To change this template use File | Settings | File Templates.
 */
@Configuration
@OpenAPIDefinition(info = @Info(title = "Spring Boot Minio Example", version = "1.0"))
public class OpenApiConfiguration implements OperationCustomizer {

    @Override
    public Operation customize(Operation operation, HandlerMethod handlerMethod) {
        Parameter parameterHeader = new Parameter()
                .in(ParameterIn.QUERY.toString())
                .description("Enter media type: json or hal. (Default: json, hal = \"application/hal+json\" with link)")
                .required(false)
                .name("mediaType")
                .example("hal")
                .schema(new StringSchema()
                        .addEnumItem("hal")
                        .addEnumItem("json")
                        .addEnumItem("xml")
                        ._default("json"));

        operation.addParametersItem(parameterHeader);
        return operation;
    }
}
