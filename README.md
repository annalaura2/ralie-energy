# ⚡ RALIE Energy - Desafio Técnico Bolt Energy

Este projeto é uma solução para o teste técnico da Bolt Energy. Ele realiza a ingestão de dados do arquivo CSV da ANEEL (RALIE), armazena em um banco PostgreSQL e expõe uma API REST para listar os 5 maiores geradores de energia elétrica no Brasil. Um frontend simples foi desenvolvido para consumir essa API e exibir os dados.

---

## 🧩 Tecnologias utilizadas

### Backend
- Kotlin
- Spring Boot
- JPA + Hibernate
- PostgreSQL

### Frontend
- React
- Vite
- Tailwind CSS
- Axios

---

## 🚀 Como executar o projeto

### 🗃️ Pré-requisitos
- Java 17+
- PostgreSQL
- Node.js 18+
- Git

---

### 🐘 Configurar o banco PostgreSQL

Crie um banco chamado `ralie` no seu PostgreSQL:

```sql
CREATE DATABASE ralie;
