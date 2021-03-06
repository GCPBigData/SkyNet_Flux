package br.skynet.repository;

import br.skynet.domain.Tecnico;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TecnicoRepository extends ReactiveCrudRepository<Tecnico, Integer> {
    Mono<Tecnico> findById(int id);
    Flux<Tecnico> findByNome(String nome);
}