package com.example.localgateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class LocalGatewayApplication

fun main(args: Array<String>) {
    runApplication<LocalGatewayApplication>(*args)
}
