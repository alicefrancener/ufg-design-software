# Boas práticas para design de API

Utilizarei como padrão para design da minha API o [Guia de Design de API do Google](https://cloud.google.com/apis/design/). Esse design é orientado a recursos.

## Introdução

O estilo arquitetural REST tem como princípio definir recursos que podem ser manipulados usando um pequeno conjunto de métodos. Os recursos são conhecidos como _substantivos (nouns)_ e os métodos como _verbos (verbs)_ das APIs.
Utilizando o protocolo HTTP, os nomes de recursos são mapeados para URLs e os métodos são associados aos métodos HTTP `POST`, `GET`, `PUT`, `PATCH` e `DELETE`.

### Etapas para projetar APIs orientadas a recursos

O Guia de Design sugere as seguintes etapas ao projetar APIs orientadas a recursos:

- Determine quais tipos de recursos uma API fornece.
- Determine as relações entre os recursos.
- Decida os esquemas de nomes de recursos com base em tipos e relacionamentos.
- Decida os esquemas de recursos.
- Anexe um conjunto mínimo de métodos aos recursos.