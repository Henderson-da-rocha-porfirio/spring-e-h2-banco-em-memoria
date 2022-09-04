package com.tuyo.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
/* 1. @ComponentScan: scaneia todos os beans dentro dos outros pacotes.
* Como podemos ver, ele scaneia o package controller onde fica definido o Rest Controller.
* Enquanto a aplicação está subindo, ela está indo e checando todos os packages e identificando todas as anotações e
* configurações que estão dentro desses, e baseados neles tentará criar os serviços REST.
*  2. @EnableJpaRepositories: ao obter êxito na ação acima, ele precisa também interagir com o database. Por isso
* essa anotação é utilizada para que ela escaneie todas as classes/interfaces dentro do package repository.
*  3. @EntityScan: sendo o JPA uma framework ORM, e esse sendo usado, é necessário ter o package model ou entity,
* onde ficarão as entidades(são as classes responsáveis pelas tabelas correspondentes).
* E esta anotação permitirá o escaneamento .
*  */

@SpringBootApplication
@ComponentScans({ @ComponentScan("com.tuyo.accounts.controller") })
@EnableJpaRepositories("com.tuyo.accounts.repository")
@EntityScan("com.tuyo.accounts.model")
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}
}
