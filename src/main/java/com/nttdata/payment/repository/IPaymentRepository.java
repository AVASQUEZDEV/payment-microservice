package com.nttdata.payment.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.payment.model.Payment;

@Repository
public interface IPaymentRepository extends ReactiveMongoRepository<Payment,String>{

}
