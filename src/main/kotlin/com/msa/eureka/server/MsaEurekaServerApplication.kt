package com.msa.eureka.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class MsaEurekaServerApplication

fun main(args: Array<String>) {
	runApplication<MsaEurekaServerApplication>(*args)
}
