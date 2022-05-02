package com.nttdata.payment.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ISharedService<E,R> {
	Mono<E> addEntity(R request);
	Mono<E> getEntityById(String requestId);
	Mono<E> setUpdateEntity(String id,R request);
	Mono<Void> deleteEntity(String id);
	Flux<E> getAllEntity();
}
