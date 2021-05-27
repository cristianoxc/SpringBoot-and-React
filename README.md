# DSVendas

# Sobre o projeto

https://crisxavier.netlify.app/

DSVendas é uma aplicação full stack web construída durante a 3ª edição da **Semana DevSuperior** (#sds3), evento organizado pela [DevSuperior](https://devsuperior.com "Site da DevSuperior").

A aplicação consiste em um dashboard de vendas. O backend em Spring Boot implantado no Heroku e o frontend em ReactJS hospedado no Netlify.

## Modelo conceitual
![Modelo Conceitual](https://github.com/devsuperior/bds-assets/raw/main/sds/sds3-mc.png)

## Padrão camadas adotado
![Modelo Conceitual](https://github.com/devsuperior/bds-assets/raw/main/sds/camadas.png)

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven

### dependências:
- Web
- JPA
- H2
- Postgres
- Security

## Front end
- HTML / CSS / JS / TypeScript
- ReactJS
- Apex Charts
- Bootstrap

## Implantação em produção
- Back end: Heroku
- Front end web: Netlify
- Banco de dados: Postgresql

# Como executar o projeto

## Back end
Pré-requisitos: Java 11

```bash
# clonar repositório
git clone https://github.com/cristianoxc/spring-boot-e-react.git

# entrar na pasta do projeto back end
cd backend

# executar o projeto
./mvnw spring-boot:run
```

## Front end web
Pré-requisitos: npm / yarn

```bash
# entrar na pasta do projeto front end web
cd front-web

# instalar dependências
yarn install

# executar o projeto
yarn start
```

# Autor

Cristiano Xavier Costa

