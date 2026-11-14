O que é uma API REST? Pra que ela serve?

é uma forma de permitir que diferentes sistemas se comuniquem pela internet usando http.

Qual a diferença entre GET, POST, PUT e DELETE? Dê um exemplo de cada.

GET: consulta informações; POST: cadastra informaçoes; PUT: atualiza informações e DELETE: exclui informações

O que significam os status 200, 201, 400, 404 e 409?

200 é ok; 201 é criou algo; 400 é você enviou algo errado; 404 é não encontrado e 409 é existe um conflito com os dados enviados

O que é JSON?

é um formato utilizao para representar e transmitir dados entre sistemas.

Qual a função de cada camada: Controller, Service e Repository?

o controller recebe requisições http(get, put post, delete), o service executa as regras de negocio(validação, verificação e processamento) e o repository conversa com o banco de dados(salva, busca, atualiza e exclui)

O que a anotação @Entity faz?

ela informa ao JPA que a classe representa uma entidade que será mapeada para uma tabela de banco de dados

Por que o repository é uma interface, e quem escreve o código dele?

pq é utilizado o Spring Data JPA, que consegue implementar automaticamente várias operações de acesso ao banco

O que é validar? O que o @Valid faz?

verificar se os dados recebidos atendem as regras estabelecidas pela aplicação e o valid solicita que o spring execute as validações declaradas no objeto recebido

Como um JSON vira uma linha no banco de dados? Descreva o caminho, do Postman até a tabela.

postman - envia a requisição HTTP com o json no body > controller - recebe a requisição > validação - o @valid verifica se os dados atendem as regras definidas > service - executa as regras de negocio > repository - o metodo save() solicita que o objeto seja persistido > JPA/hibernate - converte a operação em um comando sql adequado > banco de dados - executa o insert e armazena o registro na tabela 

E o caminho contrário: num GET /equipamentos/1, como uma linha do banco vira o JSON que aparece no Postman?

caminho inverso, o jackson faz o caminho de conversão entre objeto java e json

Quando o Postman manda um POST /equipamentos/cadastrar, como o Spring sabe qual método de qual controller chamar?

o spring compara o método http e o caminho da requisição com os mapeamentos registrados, quando encontra, encaminha a requisição para aquele método

O @Valid barrou o pedido. O Service ficou sabendo? E o banco?

quando o spring encontra o @valid, executa as validações antes de entrar no metodo controller, sendo assim, impedindo que os dados inválidos avancem pela aplicação

Qual a diferença entre o @NotBlank na entidade e o nullable = false no @Column? Se os dois barram o mesmo nome vazio, por que ter os dois?

o notblank é uma validação feita na aplicação java, já o nullable é uma configuração do mapeamento JPA que determina que a coluna do banco não deve aceitar valores null

Ontem os dados sumiam quando o servidor reiniciava, e hoje não somem mais. O que mudou, e onde?

podem ter mudado a configuração do banco de dados ou passaram a utilizar um armazenamento persistente, em memoria

Quem cria as tabelas no banco? Em algum momento a gente escreveu CREATE TABLE? Como isso acontece?

não precisa escrever um create table pq o hibernate pode gerar esse comando a partir das entidades

O nome existsByPatrimonio é só um nome, e ninguém escreveu o código dele. Como o Spring sabe o que esse método tem que fazer?

ele consegue interpretar o nome dos métodos declarados na interface do repository e gerar automaticamente a consulta correspondente