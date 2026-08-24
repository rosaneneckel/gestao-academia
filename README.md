# 🏋️‍♂️ Gestão Academia API

[![Java 21](https://img.shields.io/badge/Java-21-orange.svg?style=for-the-badge&logo=java)](https://oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-brightgreen.svg?style=for-the-badge&logo=springboot)](https://spring.io/projects/spring-boot)
[![Maven](https://img.shields.io/badge/Maven-blue.svg?style=for-the-badge&logo=apachemaven)](https://maven.apache.org/)

API REST de alta performance desenvolvida em **Java 21** e **Spring Boot** para gerenciamento, consulta e listagem de exercícios de academia.

---

## ✨ Recursos da Aplicação

- 💬 @GetMapping("/boas-vindas"): texto - retorna uma mensagem de boas vindas.
- 🏋️ @GetMapping("/exemplo"): objeto. - retorna um exercício de exemplo (utilizando *Java Records*).
- 📋 @GetMapping("/lista-exercicios"): lista - retorna uma lista com 4 exercícios cadastrados

---

## 🛠️ Tecnologias Utilizadas

- **Java 21**
- **Spring Boot 4.1.1** - Framework para criação de microsserviços e APIs REST.
- **Spring Web** - Cria APIs REST e aplicações web usando o MVC.
- **Spring DevTools** - Recarrega a aplicação automaticamente ao alterar o código.
- **Lombok** - Reduz código repetitivo como getters, setters e construtores.
- **Apache Maven** - Gerenciador de dependências e build.

---

## 🚀 Como Executar

### 📋 Pré-requisitos

Certifique-se de ter instalado em sua máquina:
- [JDK 21](https://www.oracle.com/java/technologies/downloads/#java21)
- [Maven](https://maven.apache.org/)

### ⚙️ Passo a Passo

1. **Clone o repositório:**
   ```bash
   git clone git@github.com:rosaneneckel/gestao-academia.git
   cd gestao-academia
