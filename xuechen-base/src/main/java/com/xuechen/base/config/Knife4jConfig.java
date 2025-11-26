package com.xuechen.base.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@Configuration
@EnableSwagger2WebMvc // 开启 Swagger 2.0 功能（Knife4j 2.x 依赖此注解）
@EnableKnife4j // 开启 Knife4j 增强功能（如接口排序、导出等）
public class Knife4jConfig {

    /**
     * 配置 Swagger 文档的核心信息
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2) // 使用 Swagger 2.0 规范
                .apiInfo(apiInfo()) // 配置文档基本信息
                .select()
                // 指定需要扫描的 Controller 包路径（替换为你的实际包路径）
                .apis(RequestHandlerSelectors.basePackage("com.xuechen"))
                .paths(PathSelectors.any()) // 匹配所有接口路径
                .build();
    }

    /**
     * 定义文档的标题、描述、版本等信息
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("学成在线管理系统 API 文档") // 文档标题
                .description("基于 Knife4j 生成的接口文档，包含课程管理、内容审核等接口") // 文档描述
                .version("1.0.0") // 接口版本
                // 作者信息（姓名、网址、邮箱）
                .contact(new Contact("开发团队", "https://www.xuechen.com", "dev@xuechen.com"))
                .build();
    }
}

