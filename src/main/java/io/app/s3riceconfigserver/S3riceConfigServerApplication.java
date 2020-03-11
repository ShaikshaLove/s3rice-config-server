package io.app.s3riceconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class S3riceConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(S3riceConfigServerApplication.class, args);
    }

}
