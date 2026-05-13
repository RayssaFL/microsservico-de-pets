# 🐶 Microsserviço de Pets

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)
![MySQL](https://img.shields.io/badge/MySQL-Database-blue)
![Maven](https://img.shields.io/badge/Maven-Build-red)
![Status](https://img.shields.io/badge/status-em%20desenvolvimento-yellow)

Microsserviço responsável pelo gerenciamento de pets em um sistema veterinário distribuído, desenvolvido com **Spring Boot** seguindo os princípios da **arquitetura de microsserviços**.

---

## 📋 Sobre o Projeto

Este projeto implementa um **microsserviço independente** focado exclusivamente no gerenciamento de animais (pets).

A aplicação foi projetada com foco em:

- Separação de responsabilidades  
- Modularização  
- Facilidade de manutenção  
- Comunicação via API REST  

Além disso, conta com uma **interface web simples (HTML/CSS)** integrada ao backend.

---

## 🎯 Responsabilidades

Este serviço é responsável por:

- Gerenciar dados dos pets  
- Realizar operações CRUD  
- Manter vínculo com tutores (`id_tutor`)  
- Disponibilizar dados para outros microsserviços  

---

## ⚙️ Funcionalidades

- ➕ Cadastro de pets  
- 📋 Listagem de pets  
- 🔍 Consulta detalhada  
- ✏️ Atualização de informações  
- 🗑️ Remoção de pets  

---

## 📦 Modelo de Dados

| Campo              | Tipo | Descrição |
|-------------------|------|----------|
| id_animal         | PK   | Identificador único |
| nome              | —    | Nome do pet |
| especie           | —    | Espécie |
| raca              | —    | Raça |
| idade             | —    | Idade |
| sexo              | —    | Sexo |
| peso              | —    | Peso |
| historico_medico  | —    | Histórico médico |
| id_tutor          | FK   | ID do tutor |

---

## 🌐 Interface Web

Interface desenvolvida com **HTML5 e CSS3**, permitindo interação direta com a API.

| Operação | Descrição |
|--------|----------|
| ➕ Create | Cadastrar novo pet |
| 📋 Read | Listar pets |
| ✏️ Update | Editar pet |
| 🗑️ Delete | Remover pet |

---

## 🔗 Comunicação

O microsserviço expõe endpoints REST que podem ser consumidos por outros serviços, como o de agendamentos.

Exemplo de uso:
- Validação de existência de pet  
- Consulta de dados  

---

## 🛠️ Tecnologias

### Backend
- Java 
- Spring Boot  
- MySQL  
- Maven  

### Frontend
- HTML5  
- CSS3  

### Outros
- Git & GitHub  

---

---

## 👩‍💻 Autora

**Rayssa Fialho**  
Desenvolvimento do microsserviço de Pets 🐾

---

## 📚 Observações

- Projeto acadêmico  
- Baseado em arquitetura de microsserviços  
- Pode ser integrado com outros serviços (Tutores e Agendamentos)  
