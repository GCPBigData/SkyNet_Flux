package br.skynet.controller;

import br.skynet.domain.Tecnico;
import br.skynet.service.TecnicoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/v1/tecnicos/")
@Slf4j
@RequiredArgsConstructor
@SecurityScheme(
        name = "Basic Authentication",
        type = SecuritySchemeType.HTTP,
        scheme = "basic"
)
public class TecnicoController {

    private TecnicoService tecnicoService;

    public TecnicoController(TecnicoService tecnicoService) {
        this.tecnicoService = tecnicoService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @PreAuthorize("hasRole('ADMIN')")
    @Operation(summary = "List all tecnicos",
            security = @SecurityRequirement(name = "Basic Authentication"),
            tags = {"tecnico"})
    public Flux<Tecnico> listAll() {
        return tecnicoService.findAll();
    }

    @GetMapping(path = "{id}")
    @ResponseStatus(HttpStatus.OK)
    @Operation(
            security = @SecurityRequirement(name = "Basic Authentication"),
            tags = {"tecnico"})
    public Mono<Tecnico> findById(@PathVariable long id) {
        return tecnicoService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(
            security = @SecurityRequirement(name = "Basic Authentication"),
            tags = {"tecnico"})
    public Mono<Tecnico> save(@Valid @RequestBody Tecnico tecnico) {
        return tecnicoService.save(tecnico);
    }

    @PostMapping("batch")
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(
            security = @SecurityRequirement(name = "Basic Authentication"),
            tags = {"tecnico"})
    public Flux<Tecnico> saveBatch(@RequestBody List<Tecnico> tecnicos) {
        return tecnicoService.saveAll(tecnicos);
    }

    @PutMapping(path = "{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Operation(
            security = @SecurityRequirement(name = "Basic Authentication"),
            tags = {"tecnico"})
    public Mono<Void> update(@PathVariable long id, @Valid @RequestBody Tecnico tecnico) {
        return tecnicoService.update(tecnico.withId(id));
    }

    @DeleteMapping(path = "{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Operation(
            security = @SecurityRequirement(name = "Basic Authentication"),
            tags = {"tecnico"})
    public Mono<Void> delete(@PathVariable int id) {
        return tecnicoService.delete(id);
    }

}
