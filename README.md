![Java](https://img.shields.io/badge/Java-17-blue.svg)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.7.x-brightgreen.svg)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-4169E1?logo=postgresql&logoColor=white)
![JWT](https://img.shields.io/badge/JWT-000000?logo=json-web-tokens&logoColor=white)

# DSCatalog - DevSuperior

**DSCatalog** é um projeto desenvolvido no curso **Java Spring Professional** da **DevSuperior**, focado no backend com **Spring Boot** e conceitos avançados como **OAuth2**, **JWT**, **JPA/Hibernate** e **APIs REST**.

## 📚 Sobre a Aplicação

A aplicação consiste em um **catálogo de produtos** completo, permitindo o gerenciamento de produtos, categorias e usuários. O sistema conta com um back-end robusto baseado em **Spring Boot**, implementando autenticação e autorização com perfis de acesso, validações, paginação e tratamento de exceções.

- **Público:** Navegação e visualização de produtos e categorias.
- **Administradores (ADMIN):** Cadastro, atualização e remoção de produtos, categorias e usuários.
- **Operadores (OPERATOR):** Acesso apenas a funcionalidades de consulta.

* * *

## 🛠️ Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **Spring Security / OAuth2 / JWT**
- **Spring Data JPA / Hibernate**
- **PostgreSQL / H2 Database**
- **Maven**
- **Swagger (SpringDoc OpenAPI)**
- **Postman** (coleção de testes)

* * *

## 📂 Estrutura do Projeto

O projeto segue a arquitetura de camadas, com:

- 📁 **Entities** (Entidades JPA)
- 📁 **Repositories** (DAO para banco de dados)
- 📁 **Services** (Regras de negócio e lógica da aplicação)
- 📁 **Controllers** (Endpoints da API REST)
- 📁 **DTOs** (Data Transfer Objects)
- 📁 **Config** (Configurações de segurança, OAuth2, etc.)

* * *

## 🧪 Testes com Postman

Para facilitar os testes da API, disponibilizo uma coleção completa com todos os endpoints e um environment pré-configurado.

### 📁 Arquivos

| Arquivo | Descrição |
|---------|-----------|
| [DS-Catalog-Collection.json](./postman/DS-Catalog-Collection.json) | Coleção com todas as requisições (produtos, categorias, usuários, autenticação) |
| [DS-Catalog-Environment.json](./postman/DS-Catalog-Environment.json) | Environment com variáveis (`base_url`, `token`, `client_id`, etc.) |

### 🚀 Como importar

1. Faça o download dos dois arquivos acima
2. Abra o **Postman**
3. Clique em **Import** (botão no canto superior esquerdo)
4. Arraste os arquivos para a janela ou selecione-os manualmente
5. No canto superior direito, selecione o environment **"DS-Catalog"**
6. A variável `{{base_url}}` já está configurada como `http://localhost:8080`. Altere se necessário.

### 🔐 Fluxo de autenticação

1. Execute a requisição **"Obter token"** na pasta `auth`
2. Use as credenciais padrão:
   - **Admin:** `admin@admin.com` / `123456`
   - **Operator:** `operator@operator.com` / `123456`
3. Após obter o token, as demais requisições protegidas já utilizam `{{token}}` automaticamente

### ⚙️ Variáveis do Environment

| Variável | Valor padrão | Descrição |
|----------|--------------|-----------|
| `base_url` | `http://localhost:8080` | URL base da API |
| `client_id` | `myclientid` | Client ID do OAuth2 |
| `client_secret` | `myclientsecret` | Client Secret do OAuth2 |
| `token` | *(preenchido automaticamente)* | Token JWT obtido no login |

* * *

## 📦 Como Rodar o Projeto

### 🔧 Configuração Inicial

1. Clone o repositório:
   ```bash
   git clone https://github.com/Jacques-Trevia/dscatalog-devsuperior.git
   cd dscatalog-devsuperior/backend
Importe o projeto no Eclipse ou IntelliJ como um projeto Maven.

Verifique se o JDK 17 está instalado e configurado.

### 💾 Banco de Dados

O projeto usa **PostgreSQL** por padrão. 

1. Crie um banco de dados chamado `dscatalog`
2. Configure no arquivo `application.properties` ou via variáveis de ambiente:

spring.datasource.url=jdbc:postgresql://localhost:5432/dscatalog

spring.datasource.username=postgres

spring.datasource.password=sua_senha

Para desenvolvimento, você também pode utilizar o H2 Database alterando as configurações no application-dev.properties.

▶️ Executando a Aplicação
No terminal ou IDE, execute:

bash
mvn spring-boot:run
Acesse a API via http://localhost:8080

Acesse a documentação Swagger: http://localhost:8080/swagger-ui.html

## 📌 Funcionalidades

- ✅ CRUD completo de produtos (com validações e paginação)
- ✅ CRUD completo de categorias
- ✅ CRUD completo de usuários (com perfis de acesso)
- ✅ Autenticação e autorização com OAuth2 e JWT
- ✅ Controle de acesso baseado em papéis (ADMIN / OPERATOR)
- ✅ Tratamento global de exceções com respostas padronizadas
- ✅ Busca paginada e ordenada
- ✅ Documentação interativa com Swagger
- ✅ Coleção pronta para testes no Postman

* * *

## 🎯 Aprendizados e Desafios

Este projeto foi fundamental para consolidar:

- Arquitetura de APIs REST com boas práticas
- Segurança com OAuth2 e JWT (um dos tópicos mais desafiadores)
- Mapeamento de relacionamentos JPA (OneToMany, ManyToMany)
- Camadas de serviço e injeção de dependências
- Validações e tratamento de exceções
- Deploy e configuração de ambiente

* * *

## 📜 Licença

Este projeto é parte do curso da **DevSuperior** e tem propósito educacional.

* * *

## 👨‍💻 Autor

**Jacques Araujo Trevia Filho**

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/jacques-trevia)
[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/Jacques-Trevia)
