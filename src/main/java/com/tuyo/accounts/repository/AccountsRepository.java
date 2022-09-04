package com.tuyo.accounts.repository;

import com.tuyo.accounts.model.Accounts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/* 1. findByCustomer: ele buscará a coluna com o id correspondente ao Customer.
*  2. findByCustomerIdAndEmail: o JPA tratará como duas colunas. */

@Repository
public interface AccountsRepository extends CrudRepository<Accounts, Long> {

	Accounts findByCustomerId(int customerId);

}
