package br.skynet.repository;

import br.skynet.domain.Tecnico;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface TecnicoRepository extends ReactiveCrudRepository<Tecnico, Long> {
    Mono<Tecnico> findById(long id);
}