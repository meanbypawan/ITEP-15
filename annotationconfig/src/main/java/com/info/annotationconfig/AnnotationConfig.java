package com.info.annotationconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.info.annotationconfig.entity"})
public class AnnotationConfig {

}
