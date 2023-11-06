package org.sid.bankaccountservice.repositories;


import org.sid.bankaccountservice.entities.Customer;

import org.springframework.data.jpa.repository.JpaRepository;







public interface CustomerRepository extends JpaRepository<Customer, Long> {


}
