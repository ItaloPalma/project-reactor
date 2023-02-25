package italo.palma.projectreactor.reactorExamples;


import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public class FluxMonoGeneratorService {
    public Flux<String> fluxExamples() {

        return Flux.fromIterable(List.of("1","2", "3"));

    }

    public Mono<String> monoExamples(){

        return Mono.just("1");

    }

}
