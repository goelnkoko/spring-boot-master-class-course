package com.springmasterclass.infoapp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "info.app")
@Getter
@Setter
@ToString
public class InfoApp {
    private String name;
    private String description;
    private String version;
}
