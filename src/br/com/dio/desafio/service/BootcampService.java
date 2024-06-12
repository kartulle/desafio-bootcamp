package br.com.dio.desafio.service;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Dev;

public class BootcampService {
    public void removerDev(Bootcamp bootcamp, Dev dev) {
        System.out.println("Teste: " + bootcamp.getDevsInscritos());
        System.out.println("dev: " + dev);
        bootcamp.getDevsInscritos().remove(dev);
        dev.getConteudosInscritos().clear();
        dev.getConteudosConcluidos().clear();
    }
}
