package br.com.dio.desafio.service;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Dev;

public class BootcampService {
    public void removerDev(Bootcamp bootcamp, Dev dev) {
        bootcamp.getDevsInscritos().remove(dev);
        dev.getConteudosInscritos().clear();
        dev.getConteudosConcluidos().clear();
    }
}
