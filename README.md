<h1>RESTFUL API Java!</h1>
Criando uma API com Gradle, SpringBoot 3 e Documentado com Swagger.

# My Spring Boot Application

## Descrição
Esta é uma aplicação RESTful construída com Spring Boot. Ela expõe uma API simples que permite realizar operações de CRUD (Create, Read, Update, Delete) sobre um recurso fictício (ex: Usuários, Produtos, etc).

## Funcionalidades
- **GET /api/items**: Retorna a lista de itens.
- **GET /api/items/{id}**: Retorna um item específico.
- **POST /api/items**: Cria um novo item.
- **PUT /api/items/{id}**: Atualiza um item existente.
- **DELETE /api/items/{id}**: Deleta um item.

## Tecnologias Usadas
- **Java 21** (ou versão superior)
- **Spring Boot 3.3.2**
- **Spring Web**
- **Spring POSTGRESQL**
- **H2 Database** (para ambiente de desenvolvimento)
- **Gradle**

## Pré-requisitos

Antes de começar, você precisa ter as seguintes ferramentas instaladas em seu sistema:

- [Java 21](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html)
- [Gradle](https://gradle.org/install/)
- [Git](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)

## Como Instalar e Rodar

1. **Clonar o repositório**
   
   Abra o terminal e execute o comando:

   ```bash
   git clone https://github.com/username/my-spring-boot-app.git

2. **Para entrar no repositório**
   no cmd digite:
     - cd Api.Rest.Railway
   
4. **Construir projeto com Gradle**
   no cmd digite:
     - ./gradlew build
       
5. **Rodar a aplicação**
   no cmd digite:
     - ./gradlew bootRun
  
##Contribuições
Sinta-se à vontade para contribuir com melhorias, correções de bugs, ou novos recursos. Para isso, siga o fluxo abaixo:

- Fork este repositório.
- Crie uma branch para a sua feature (git checkout -b minha-feature).
- Faça commit das suas alterações (git commit -m 'Adicionando nova feature').
- Envie a sua branch para o repositório remoto (git push origin minha-feature).
- Abra um Pull Request.

## Diagrama das classes

![mermaid-diagram-2024-07-26-165202](https://github.com/user-attachments/assets/5b729ace-7cec-4bfc-8d5a-2d6e5ab46f58)

