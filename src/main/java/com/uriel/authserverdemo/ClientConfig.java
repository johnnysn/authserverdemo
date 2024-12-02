package com.uriel.authserverdemo;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("app.auth.client")
public record ClientConfig(
    String id,
    String secret,
    String redirectUri,
    String logoutRedirectUri
) {}
