package italo.palma.projectreactor.service;

import italo.palma.projectreactor.reactorExamples.FluxMonoGeneratorService;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class Execute {

    public void execute() {

        FluxMonoGeneratorService fluxMonoGeneratorService = new FluxMonoGeneratorService();

        fluxMonoGeneratorService.fluxExamples()
                .subscribe(ex -> log.info("Flux Item: {}", ex));

        fluxMonoGeneratorService.monoExamples()
                .subscribe(ex -> log.info("Mono Item: {}", ex));

    }

}
