API RESTful - Gerenciamento de Clientes
Este projeto é uma API RESTful desenvolvida para gerenciar informações de clientes, seguindo as melhores práticas de arquitetura REST.

A aplicação foi escrita em Java utilizando o Spring Boot e Spring Data JPA, garantindo escalabilidade, facilidade de manutenção e desempenho.


🚀 Funcionalidades
CRUD de clientes (Criar, Ler, Atualizar e Excluir).
Conexão com banco de dados usando Spring Data JPA.
Estrutura modular seguindo os padrões do Spring.

🛠️ Tecnologias Utilizadas
Java
Spring Boot
Spring Data JPA

📌 Endpoints REST
Base URL: /api/v1
1. /clientes
GET /clientes - Lista todos os clientes.
POST /clientes - Adiciona um novo cliente.
GET /clientes/{id} - Retorna os detalhes de um cliente específico.
PUT /clientes/{id} - Atualiza os dados de um cliente.
DELETE /clientes/{id} - Remove um cliente.

🛡️ Boas Práticas Implementadas
Estrutura modular e bem organizada.
Validações no lado do servidor para dados de entrada.
Tratamento de erros com respostas padronizadas.
