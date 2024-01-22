package com.e_store.e_store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import xyz.erupt.core.annotation.EruptScan;

@SpringBootApplication
@EntityScan
@EruptScan
public class EStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(EStoreApplication.class, args);
    }

}
