# H2 banco em memória
### Acessando ao H2
#### 1. Verificar no console o endpoint criado:
````
h2-console
````
#### 2. No navegador colocar o endpoint criado com a porta local cofigurado nas properties. Se não tiver sido configurada, ficará na 8080:
````
http://localhost:8080/h2-console/
````
#### 3. Quando abrir no console, colocar em JDBC URL, se der algum erro, o que saiu no console, por exemplo:
````
 H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:testdb'
````
#### 4. Testando no Postman:
````
http://localhost:8080/myAccount
````
##### - se der um erro 415: Content type 'text/plain;charset=UTF-8' not supported], colocar no Headers:
````
1. KEY: Content-Type
2. VALUE: application/json
````
#### 5. A beleza dos Microservices: Não há nada acoplado da regra de negócio com os microserviços cartões ou empréstimos.

#### 6. Não esquecer de habilitar em application.properties ou application.yml:
````
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
````

### - Entrando pelo navegador:
````
http://localhost:8080/h2-console/
````
> 1. Tirar a padrão que está conforme a imagem:

![Banco de Dados _ Datasources _  h2](https://user-images.githubusercontent.com/46926951/216785573-8dc04eb4-68b8-4a06-984e-e7ae780e0f55.png)

> 2. Colocar a URL passada em application.properties ou application.yml por exemplo: jdbc:h2:mem:springbatch conforme imagem abaixo:

![Banco de Dados _ Datasources _  h2 _ 2](https://user-images.githubusercontent.com/46926951/216785820-e3e7735e-a5cf-4f87-85bc-3e6f1d4cbae9.png)
