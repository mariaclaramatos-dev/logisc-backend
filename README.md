# Logisc Backend

Backend do projeto **Logisc**, desenvolvido com Java e Spring Boot.

## Objetivo

O backend é responsável por:

- Gerenciar dados da aplicação
- Expor APIs REST para o frontend
- Realizar persistência de dados
- Validar informações recebidas
- Organizar regras de negócio do sistema

O projeto futuramente será integrado com:

- Frontend Web
- Banco de dados MySQL
- Autenticação de usuários
- Funcionalidades de logística
- Recursos de Realidade Aumentada (AR)

---

## Tecnologias utilizadas

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

---

## Estrutura atual do projeto

```txt
controller/
dto/
entity/
exception/
repository/
service/
```

---

## Funcionaliddade implementadas

### Produtos

- Criar produto
- Listar produtos
- Buscar produto por ID
- Atualizar produto
- Deletar produto

### Categorias
- Criar categorias
- Listar categorias
- Relacionamento Category → Products
### Usuários
- Estrutura inicial de usuários
- Validação de dados
- DTOs para segurança da API
---
### Conceitos aplicados
- API REST
- Arquitetura em camadas
- DTO Pattern
- Validation
- Exception Handling
- Relacionamentos JPA
- CRUD completo
---
## Banco de dados

Atualmente o projeto utiliza:

- H2 Database (em memória)

Futuramente:

- MySQL
---
### Como executar
- Clonar o projeto
- Abrir na IDE (IntelliJ recomendado)
- Executar a classe principal:

_BackendApplication_

---
## Endpoints principais
### Products

```
GET    /products
GET    /products/{id}
POST   /products
PUT    /products/{id}
DELETE /products/{id}
```

### Categories

```
GET    /categories
POST   /categories
Users
GET    /users
POST   /users
```

---

## Próximos passos
- Spring Security
- JWT Authentication
- Integração com MySQL
- Upload de arquivos/modelos 3D
- Integração frontend/backend
- Regras de logística
- Deploy da aplicação