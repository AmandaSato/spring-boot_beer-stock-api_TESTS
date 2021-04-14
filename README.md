<h1>Projeto guiado da Digital Innovation One</h1>
<h2>Desenvolvimento de testes unitários para validar uma API REST de gerenciamento de estoques de cerveja.</h2>

O projeto consiste na criação de testes unitários para validar uma API REST de gerenciamento de estoques de cerveja, utilizando os frameworks: JUnit, Mockito e Hamcrest. Como complemento do projeto, são desenvolvidas funcionalidades extras para a API através dos fundamentos do TDD (Test Driven Development).

Para executar o projeto no terminal, digite o seguinte comando no diretório do projeto:

```shell script
mvn spring-boot:run 
```

Ainda no terminal, para executar a suíte de testes execute o seguinte comando:

```shell script
mvn clean test
```

Executado o projeto, a API pode ser acessada através do seguinte endereço:

```
http://localhost:8080/api/v1/beers
```
## Funcionalidades da API

Utilizando uma plataforma de execução de testes em APIs e requisiçoes http, como o [Postman](https://www.postman.com/), acesse as funcionalidades do projeto:

### GET
Buscar todas as cervejas cadastradas ou buscar cerveja pelo nome:
```
http://localhost:8080/api/v1/beers
http://localhost:8080/api/v1/beers/{name}
```

### DELETE
Deletar cerveja pelo ID:
```
http://localhost:8080/api/v1/beers/{id}
```

### POST
Cadastrar uma cerveja no estoque:
```
http://localhost:8080/api/v1/beers
```
```JSON
{
    "name": "Nome da cerveja",
    "brand":"Marca",
    "max": 200,       // Quantidade máxima do estoque
    "quantity": 150,  // Quantidade atual em estoque
    "type": "LAGER | MALZBIER | WITBIER | WEISS | ALE | IPA | STOUT | " // Tipos aceitos
}
```

### PATCH
Incrementar ou diminuir a quantidade de cervejas cadastradas no estoque:
```
http://localhost:8080/api/v1/beers/{id}/increment
http://localhost:8080/api/v1/beers/{id}/decrement
```
```JSON
{
    "quantity": 13 // Quantidade para incrementar ou retirar do estoque
}
```






