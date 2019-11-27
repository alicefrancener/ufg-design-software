# Projeto: design de uma Restful API

A API deverá oferecer serviços para a gestão dos dados coletados pelo cliente no escopo do [Projeto Oral Cancer Detect - OCD](https://github.com/leandropedrosa/projeto-ocd)

## Atividades

 1. Entender quais são as funcionalidades do [Projeto Oral Cancer Detect - OCD](https://github.com/leandropedrosa/projeto-ocd)
 2. Propor uma interface para atender as requisições dos módulos.
 3. Identificar "boas" práticas a serem seguidas para o design de uma Restful API. 
 4. Estabelecer um padrão de boas práticas
 5. Compreender o modelo de dados
 6. Estabelecer quais serão as requisições

## Requisitos

- R1 O módulo deverá oferecer uma Restful API seguindo "boas" práticas de _design_ de APIs, a serem detalhadas oportunamente.
- R2 O módulo deverá oferecer acesso para a gestão dos dados do Projeto OCD. Isso significa permitir a criação e atualização dos dados geridos pelo OCD.
- R3 O módulo será utilizado, a princípio, em um contexto restrito. Desse modo, não irei inserir questões de segurança no design da API.
- R4 Criar *local de atendimento*
- R5 Listar todos os *locais de atendimento*
- R6 Listar *locais de atendimento* por região
- R7 Atualizar *local de atendimento*
- R8 Criar *fator de risco*
- R9 Listar *fatores de risco*
- R10 Atualizar *fator de risco*
- R11 Criar *lesão*
- R12 Listar *lesões*
- R13 Atualizar *lesão*
- R14 Criar *paciente*
- R15 Listar *paciente* por Id
- R16 Atualizar *paciente*
- R17 Criar *rastreamento*
- R19 Listar *rastreamentos*
- R18 Listar *rastreamentos* por Id
- R19 Atualizar *rastreamento*
- R20 A priori, não serão criados métodos para deletar os registros por se tratar de dados do domínio da saúde

## Produto

Algumas guidelines para o design encontram-se [aqui](rest-api-project/api-design-guidelines.md).

Uma primeira versão da API foi projetada utilizando o modelo do [API Blueprint](rest-api-project/ocd-api.apib). Posteriormente, modifiquei o projeto para o modelo adotado pelo Swagger seguindo as especificações da OpenAPI, como descrito [aqui](rest-api-project/api-design-guidelines.md).

O design da API encontra-se nesse arquivo: [design-api](rest-api-project/ocd-api-swagger.yaml). Também, foi utilizado o [swagger-codegen](https://github.com/swagger-api/swagger-codegen) para gerar um projeto base de acordo com o design. Esse projeto encontra-se [aqui](rest-api-project/nodejs-server) com diretivas de como utilizá-lo no [README](rest-api-project/nodejs-server/README.md).