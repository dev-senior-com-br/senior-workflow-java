# Senior Plataform Apps SDK para Java

Esta biblioteca permite que desenvolvedores realizem integrações com algumas das APIs do senior X Plataform da Senior em projetos Java. Essa mesma biblioteca também está [disponível para Node.js](https://github.com/dev-senior-com-br/senior-platform-apps-node).

Atualmente, as APIs disponibilizadas pelo SDK são:
- **Workflow**: 

Alguns serviços como o HCM e SAM possuem suas próprias bibliotecas, que podem ser encontradas no perfil do [Dev Senior no GitHub](https://github.com/dev-senior-com-br). Adicionalmente, serviços essenciais como autenticação,  autorização, configuração e outros são disponibilizados pela [senior-core-java](https://github.com/dev-senior-com-br/senior-core-java).

A documentação Swagger para a versão web destas e outras APIs da Senior, assim como informações adicionais e tutoriais de uso, está disponível no [portal do desenvolvedor](https://dev.senior.com.br).

## Instalação

### Usando Maven
1. Adicione a biblioteca Senior Plataform Apps como dependência no `pom.xml` do seu projeto:
    ```xml
    ...
    <dependencies>
        <dependency>
            <groupId>br.com.senior</groupId>
            <artifactId>senior-platform-apps-java</artifactId>
            <version>0.1.0</version>
        </dependency>
    </dependencies>
    ...
    ```
2. Execute o comando `mvn clean install` no projeto, instalando a dependência no repositório local do Maven.

#### Observações:
- A última versão da SDK pode ser obtida no [Maven Repository](https://mvnrepository.com/artifact/br.com.senior/senior-platform-apps-java).
-  O histórico de alterações realizadas pode ser visto consultando o [CHANGELOG](./CHANGELOG.md). 

## Exemplo Rápido

Implementamos no [pacote examples](./examples/src/main/java/br/com/senior/plataform) um conjunto de classes de exemplos para cada serviço. Alguns serviços dependem de variáveis que precisam ser informadas pelo usuário, como nome de usuário e senha para realizar a autenticação.

Os exemplos são implementações funcionais, bastando copiar o código de exemplo que se deseja para sua aplicação e adaptar os valores de entrada utilizados em cada chamada.

Para todas as APIs disponibilizadas, é necessário informar um token de acesso no construtor do client. Este token pode ser adquirido realizando login no `AuthenticationClient`, como no exemplo:
```java
...
// adicione estas variáveis de ambiente com seu usuário e senha ou substitua seus valores aqui
final String username = System.getenv("SENIOR_USERNAME");
final String password = System.getenv("PASS");

AuthenticationClient client = new AuthenticationClient(Environment.HOMOLOG);
LoginInput loginInput = LoginInput.builder()
    .username(username)
    .password(password)
    .build();

LoginOutput output = client.login(loginInput);
String accessToken = output.getJsonToken().getAccessToken();
...
``` 

Utilizando como exemplo o serviço Workflow, caso a aplicação queira realizar a criação de uma solicitação, após adicionar a dependência no `pom.xml` e recuperar o token de acesso, basta chamar o método `startRequest()` do `WorkflowClient` informando os parâmetros necessários:

```java
// cria o client do Workflow
WorkflowClient workflowClient = new WorkflowClient(accessToken);

// identificador de um processo previamente modelado e publicado no Workflow
int processId = 5;

// conteúdo do formulário de abertura da solicitação
Map<String, Object> formData = new HashMap<>();
formData.put("destino", "Curitiba");
formData.put("partida", "2021-06-25");
formData.put("retorno", "2021-06-28");
formData.put("motivo", "Visita a cliente");

StartRequestInput payload = StartRequestInput.builder()
    .processId(processId)
    .businessData(formData)
    .build();

// abre a solicitação
StartRequestOutput output = workflowClient.startRequest(payload);
// recupera o idenficiador da solicitação (instância do processo) criada
Integer processInstanceId = output.getProcessInstanceID();
```

Atualmente, o ambiente padrão para o desenvolvimento é o de homologação.
Para alterar o ambiente, basta chamar o construtor da API desejada passando o endereço de outro ambiente, disponibilizado através do enum `Environment`:

```java
// utiliza o ambiente de Homologação
WorkflowClient workflowClient = new WorkflowClient(accessToken);

// utiliza o ambiente de Produção
WorkflowClient workflowClient = new WorkflowClient(accessToken, Environment.PROD);
```

### Exemplos implementados

- [Workflow](examples/src/main/java/br/com/senior/plataform/workflow/WorkflowClientExample.java)

## Contribuições

Contribuições ao projeto são bem vindas e podem ser realizadas seguindo nosso [Guia de contribuição](https://dev.senior.com.br/guia-de-contribuicao/).

## Suporte

Criar um issue https://github.com/dev-senior-com-br/senior-platform-apps-java/issues

## License

Copyright © 2020.
