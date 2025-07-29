# 📝 board-api-springboot

Uma API REST simples para gerenciamento de cartões de tarefas, construída com **Spring Boot**, **JPA** e **H2**.

---

## 🚀 Como rodar o projeto

1. **Clone o repositório**
   ```sh
   git clone https://github.com/Jussivan/board-api-springboot.git
   cd board-api-springboot/board
   ```

2. **Execute o projeto**
   ```sh
   ./gradlew bootRun
   ```
   Ou no Windows:
   ```sh
   gradlew bootRun
   ```

---

## 📚 Endpoints

| Método | Rota             | Descrição                |
|--------|------------------|--------------------------|
| POST   | `/cards`         | Criar novo card          |
| GET    | `/cards`         | Listar todos os cards    |
| GET    | `/cards/{id}`    | Buscar card por ID       |
| PUT    | `/cards/{id}`    | Atualizar card           |
| DELETE | `/cards/{id}`    | Remover card             |

### Exemplo de JSON para criar/atualizar card

```json
{
  "title": "Minha tarefa",
  "description": "Descrição da tarefa",
  "status": "TODO"
}
```

---

## 🛠 Tecnologias

- Java 17+
- Spring Boot
- Spring Data JPA
- H2 Database (memória)
- Liquibase (opcional)
- Lombok

---

## 🧪 Testando com Postman

- **Criar card:** POST `/cards`
- **Listar cards:** GET `/cards`
- **Buscar card:** GET `/cards/{id}`
- **Atualizar card:** PUT `/cards/{id}`
- **Deletar card:** DELETE `/cards/{id}`

---

## 📄 Licença

Este projeto está sob a licença MIT.

---

Feito com 💙 por Jussivan
