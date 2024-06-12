# Bootcamp Java
O código implementa uma plataforma de cursos e bootcamps, organizando alunos (Devs) e conteúdos (cursos e mentorias). Ele utiliza classes Java para modelar as entidades principais e suas interações. Este programa teve como principal intuito realizar um desafio proposto pela plataforma DIO.

## Classes principais
- **Bootcamp**: Representa um bootcamp com nome, descrição, datas de início e fim, conjunto de devs inscritos e conteúdos.
- **Conteudo**: Classe abstrata que serve como base para Curso e Mentoria, contendo título, descrição e cálculo de XP.
- **Curso**: Estende Conteudo, adicionando carga horária e categoria.
- **Mentoria**: Estende Conteudo, adicionando uma data e um cálculo de XP específico.
- **Dev**: Representa um aluno inscrito em conteúdos de um bootcamp, gerencia conteúdos inscritos e concluídos, e calcula o XP total.

## Novas Funcionalidades

- **Categoria nos Cursos**: Cada curso pode ter uma categoria específica.
- **Data de Conclusão**: A data em que um dev conclui um conteúdo é armazenada.
- **Progresso do Bootcamp**: Devs podem verificar seu progresso, mostrando conteúdos concluídos e suas respectivas datas.
- **Listagem de Conteúdos Disponíveis**: Bootcamps podem listar todos os conteúdos disponíveis.
- **Remover Devs Inscritos**: Adicionada funcionalidade para desinscrever devs de um bootcamp.

## Estrutura dos Pacotes

- **dominio**: Contém as classes principais (Bootcamp, Conteudo, Curso, Dev, Mentoria).
- **service**: Contém classes de serviço (BootcampService para remover devs).
- **util**: Contém classes utilitárias (DateUtil para manipulação de datas).

## Código Utilitário (DateUtil.java)

Fornece métodos estáticos para manipulação de datas, como formatação, cálculo de diferença, verificação de datas no futuro ou passado, e adição/subtração de dias.

## Main.java

Exemplifica a criação de cursos, mentorias, devs e bootcamps. Demonstra a inscrição de devs, progressão nos conteúdos e verificação de progresso. Inclui o uso do BootcampService para remover um dev.
