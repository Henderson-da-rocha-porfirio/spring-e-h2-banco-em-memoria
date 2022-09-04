package com.tuyo.accounts.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

/* 1. A framework JPA tratará a classe como um POJO.
*  2. POJO Plain Old Java Object ou POJO, são objetos Java que seguem um desenho extremamente simplificado.
Um POJO é um JavaBean que segue definições rígidas de estrutura, sendo elas:
*  a. Possui um construtor default (padrão - sem argumentos) ou não declarar construtor (
assim o compilador Java criara um construtor default automaticamente);
*  b. Possui todos os seus atributos, sejam eles tipos primitivos ou objetos, com a visibilidade privada;
*  c. Não possui métodos específicos, exceto aqueles que seguem o padrão de getter e setter para
seus respectivos atributos.
*  d. O padrão getter é a forma de pegar o valor do atributo.
*  e. O padrão setter é a forma de alterar o valor do atributo.
*  3. É mais atrativo do que o termo bean do Java devido à confusão gerada pela semelhança
dos termos JavaBeans e dos EJB (Enterprise JavaBeans).
*/

@Entity
@Getter @Setter @ToString
public class Accounts {

	@Column(name = "customer_id")
	private int customerId;
	@Column(name="account_number")
	@Id
	private long accountNumber;
	@Column(name="account_type")
	private String accountType;
	@Column(name = "branch_address")
	private String branchAddress;
	@Column(name = "create_dt")
	private LocalDate createDt;
	
}
