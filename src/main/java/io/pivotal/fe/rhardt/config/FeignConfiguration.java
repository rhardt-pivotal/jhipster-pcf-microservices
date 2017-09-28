package io.pivotal.fe.rhardt.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "io.pivotal.fe.rhardt")
public class FeignConfiguration {

}
