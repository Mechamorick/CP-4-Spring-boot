# CP-4-Spring-boot


# Projeto Spring Boot - Gestão de Pedidos e Clientes

Este é um projeto desenvolvido com **Spring Boot** que implementa um sistema de gestão de produtos, pedidos e clientes. O sistema oferece funcionalidades CRUD (Create, Read, Update e Delete) para essas entidades.

## Estrutura do Projeto

O projeto segue uma arquitetura simples e limpa, com as seguintes camadas:

- **Entidades**: Representam as tabelas do banco de dados (Produto, Pedido, ItemPedido, Cliente).
- **DTOs (Data Transfer Objects)**: Objetos utilizados para transferir dados entre o cliente e o servidor de forma mais controlada.
- **Serviços (Services)**: Contêm a lógica de negócios e operações sobre os dados.
- **Controladores (Controllers)**: Exponhem as APIs REST para operações CRUD.
- **Repositórios (Repositories)**: Interfaces responsáveis por interagir com o banco de dados.

## Tecnologias Utilizadas

- **Java 11+**
- **Spring Boot**
- **Spring Data JPA**
- **H2 Database** (ou pode ser configurado outro banco de dados relacional)
- **Maven**

## Como Executar

1. **Pré-requisitos**: 
   - JDK 11 ou superior
   - Maven 3.x ou superior

2. **Clonar o Repositório**:

   ```bash
   git clone <URL-do-repositório>
   cd demo_spring_boot_project
   ```

3. **Compilar e Executar**:

   Utilize o Maven para compilar e rodar o projeto:

   ```bash
   mvn spring-boot:run
   ```

4. **Acessar a API**:

   A API estará disponível no seguinte endpoint:

   ```
   http://localhost:8080
   ```

5. **Endpoints Disponíveis**:

   - **Produtos**:
     - `GET /produtos`: Retorna a lista de todos os produtos
     - `POST /produtos`: Cria um novo produto
     - `GET /produtos/{id}`: Retorna os detalhes de um produto específico
     - `DELETE /produtos/{id}`: Deleta um produto

   - **Clientes**:
     - `GET /clientes`: Retorna a lista de todos os clientes
     - `POST /clientes`: Cria um novo cliente
     - `GET /clientes/{id}`: Retorna os detalhes de um cliente específico
     - `DELETE /clientes/{id}`: Deleta um cliente

## Configuração de Banco de Dados

Por padrão, o projeto utiliza o banco de dados em memória **H2**, que é útil para testes. Para acessar o console do H2, use:

```
http://localhost:8080/h2-console
```

- **JDBC URL**: `jdbc:h2:mem:testdb`
- **Usuário**: `sa`
- **Senha**: `password`

Caso você queira configurar outro banco de dados, como **MySQL** ou **PostgreSQL**, ajuste as configurações em `src/main/resources/application.properties`.
