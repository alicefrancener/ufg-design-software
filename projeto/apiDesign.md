# Design de API

Utilizarei como padrão para design da minha API o [API Guide](https://apiguide.readthedocs.io). Abaixo uma compilação dos padrões que utilizarei.

O estilo arquitetural REST tem como princípio definir recursos que podem ser manipulados usando um pequeno conjunto de métodos. Os recursos são conhecidos como substantivos (nouns) e os métodos como verbos (verbs) das APIs. Utilizando o protocolo HTTP, os nomes de recursos são mapeados para URLs e os métodos são associados aos métodos HTTP POST, GET, PUT, PATCH e DELETE.

## Use RESTful service URLs

- URL identifica um recurso
- URLs devem incluir substantivos (no plural) e não verbos
- Métodos HTTP são usados para operar nos recursos
- Os códigos de status de resposta HTTP devem ser usados para representar o resultado das operações nos recursos

## Versionamento

Apesar de não ser indicado no guia, o versionamento adotado será através de inclusão da versão na URI (por exemplo: `http://api.example.com/v1`).

## URL Depth