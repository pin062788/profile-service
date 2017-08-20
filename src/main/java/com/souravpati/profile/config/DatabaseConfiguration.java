package com.souravpati.profile.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "com.souravpati.profile.repository")
public class DatabaseConfiguration {
}
