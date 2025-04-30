# 📦 Projeto 4 - Sistema de Vendas

Este projeto é uma aplicação Java que simula um sistema simples de vendas, usando:
- Java 17
- JPA (Hibernate)
- PostgreSQL
- Maven
- Docker + Docker Compose
- PgAdmin4

## 🚀 Funcionalidades

- Cadastro de clientes
- Cadastro de produtos
- Cadastro de vendas (relacionando cliente e produto)
- Listagem de clientes, produtos e vendas
- Integração com banco de dados PostgreSQL
- Geração automática das tabelas via JPA Hibernate (`hibernate.hbm2ddl.auto=update`)

---

## 🛠️ Tecnologias Utilizadas

- **Java 17**
- **Maven** (gerenciador de dependências)
- **Hibernate JPA** (ORM)
- **PostgreSQL** (banco de dados relacional)
- **Docker** (infraestrutura local do banco)
- **PgAdmin4** (gerenciador visual do banco)

---

## 🛠️ Como rodar o projeto localmente

### 1️⃣ Subir o Banco de Dados e PgAdmin

```bash
docker-compose up -d

2️⃣ Compilar o projeto

mvn clean install

3️⃣ Executar o projeto

mvn exec:java

(O projeto foi configurado para rodar automaticamente com a classe Main.)

📚 Estrutura do projeto

src/
├── main/
│   ├── java/
│   │   ├── main/java/app/        # Classe Main
│   │   ├── main/java/dao/         # DAOs de Cliente, Produto e Venda
│   │   ├── main/java/model/       # Entidades JPA
│   │   └── main/java/database/    # Classe JPAUtil para conexão
│   └── resources/
│       └── META-INF/persistence.xml  # Configuração JPA
docker-compose.yml
pom.xml
README.md


📄 Banco de Dados

    Banco: vendasdb

    Usuário: postgres

    Senha: postgres

As tabelas são criadas automaticamente pelo Hibernate:

    cliente

    produto

    venda

✍️ Autor

Feito com 💻 por Igor Programmer


📝 Licença

Este projeto é de livre uso para fins de estudo e aprendizado. 🚀



