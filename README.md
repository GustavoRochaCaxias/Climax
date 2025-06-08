# 🌎 ClimaX – Sistema de Relatos de Catástrofes Climáticas

Sistema web desenvolvido com **Spring Boot**, **Thymeleaf** e **OracleDB** para monitoramento e registro de ocorrências climáticas.

## 🔥 Funcionalidades

- Cadastro e gerenciamento de **ocorrências climáticas** (CRUD completo).
- Interface web com **Thymeleaf** e **Spring MVC**.
- Página de formulário reaproveitada para **inserção e edição**.
- Comunicação assíncrona com **RabbitMQ** (produtor e consumidor).
- Integração com **MongoDB + Streamlit** para relatos livres e imagens.
- Internacionalização (i18n).
- Segurança com autenticação (Spring Security com login fixo).
- Relatórios SQL com filtros e JOINs complexos.
- Testes **unitários** e **de integração**

## 🧪 Tecnologias Utilizadas

- Java 20
- Spring Boot
- Spring MVC
- Spring Security
- Spring Data JPA
- Spring AMQP (RabbitMQ)
- Thymeleaf
- Oracle Database
- MongoDB Atlas

## 🗃️ Estrutura das Tabelas Oracle

- `USUARIO_CLIMAX`
- `LOCALIZACAO_CLIMAX`
- `TIPO_OCORRENCIA_CLIMAX`
- `ENDERECO_CLIMAX`
- `AREA_DE_RISCO_CLIMAX`
- `OCORRENCIA_CLIMAX`
- `COMENTARIO_CLIMAX`

## 🐰 RabbitMQ

- **Produtor**: Envia mensagem para fila no momento do registro de ocorrência.
- **Consumidor**: Lê mensagens da fila e exibe no console.

## 🔐 Segurança – Spring Security

Autenticação simples com Spring Security:

- **Usuário:** `user`  
- **Senha:** `123`

O login é necessário para acessar as funcionalidades do sistema.

## 🌍 Acesso Local

Após rodar o projeto, o sistema pode ser acessado em:  
🔗 [http://localhost:9090](http://localhost:9090)

## 🌍 Links do videos
Picht https://www.youtube.com/watch?v=ErSV59dXg8I
Explicação do codigo https://www.youtube.com/watch?v=E1APcijigdU&t=6s


## 🧪 Testes

- Testes unitários para lógica de negócios (serviços).
- Testes de integração com repositórios e controllers.

## 🌐 Internacionalização

O sistema detecta automaticamente o idioma do navegador e adapta os rótulos/textos.

## 🚀 Como Rodar Localmente

1. Clone o repositório:
   ```bash
   git clone https://github.com/seuusuario/climax.git
   cd climax
## ✨ Autor

Desenvolvido por Gustavo Rocha Caxias RM: 553310, 
Macauly Vivaldo da Silva RM: 553350,
Daniel Bezerra da Silva Melo RM: 553792🚀  
Aluno do curso de Análise e Desenvolvimento de Sistemas  
RM: 553310
