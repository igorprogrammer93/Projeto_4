# 🧾 Projeto 4 - Sistema de Vendas com PostgreSQL e MongoDB

Este projeto Java simula um sistema de vendas com persistência em banco de dados relacional (PostgreSQL) e também armazena logs de vendas em banco documental (MongoDB).

## 🚀 Tecnologias Utilizadas

- ✅ Java 17
- ✅ Maven
- ✅ Hibernate (JPA)
- ✅ PostgreSQL (via JPA)
- ✅ MongoDB (para logs)
- ✅ Docker e Docker Compose
- ✅ PgAdmin4

---

## 📦 Funcionalidades

- Cadastro de **clientes**, **produtos** e **vendas** (relacional com PostgreSQL)
- Armazenamento de **logs de vendas** (documental com MongoDB)
- Execução de aplicação via Maven (`exec-maven-plugin`)
- Banco de dados rodando via Docker
- Interface visual com PgAdmin

---

## 🛠️ Como Rodar o Projeto

### 1️⃣ Subir o ambiente com Docker

```bash
docker-compose up -d


PostgreSQL: localhost:5432

MongoDB: localhost:27017

PgAdmin4: http://localhost:5050

    Login: admin@admin.com

    Senha: admin

2️⃣ Compilar o projeto com Maven

mvn clean install

3️⃣ Executar a aplicação

mvn exec:java

A saída esperada:

Log de venda enviado para o MongoDB com sucesso!

🗃️ Estrutura do Projeto

src/
├── main/
│   ├── java/
│   │   ├── app/                # Classe Main.java
│   │   ├── dao/                # DAOs PostgreSQL + LogVendaDAO (Mongo)
│   │   ├── model/              # Entidades JPA
│   │   └── database/           # Conexão com JPA + Mongo
│   └── resources/
│       └── META-INF/
│           └── persistence.xml # Configuração JPA
docker-compose.yml
pom.xml
README.md

🧪 Testando o MongoDB

Você pode usar:
➤ MongoDB Compass

Conectar em: mongodb://localhost:27017
➤ Linha de comando (se tiver mongosh)

mongosh
use vendasdb_mongo
db.log_vendas.find().pretty()

📄 Banco de Dados

PostgreSQL:

    Banco: vendasdb

    Usuário: postgres

    Senha: postgres

MongoDB:

    Banco: vendasdb_mongo

    Coleção: log_vendas

✍️ Autor

Feito com 💻 por Igor Programmer
