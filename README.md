# Sistema de Gestão de Espaços

## Descrição
O **Space Management System** é um projeto de software para gerenciar espaços físicos. O sistema permite a administração de salas de aula, laboratórios, auditórios e outros espaços, fornecendo funcionalidades para o registro de reservas, controle de disponibilidade, e consulta de informações detalhadas sobre os espaços.

## Estrutura do Projeto
O projeto segue uma arquitetura organizada com as seguintes pastas:
- **controller**: Contém as classes que gerenciam as rotas e endpoints da aplicação.
- **model**: Inclui as entidades e classes de modelo de dados.
- **repository**: Abriga as interfaces de repositório para interação com o banco de dados.
- **security**: Contém classes relacionadas à segurança da aplicação.

## Tecnologias Utilizadas
- **Java**
- **Spring Boot**
- **Spring Data JPA**
- **H2 Database** (para desenvolvimento e testes)
- **Maven**

## Instalação e Configuração do Ambiente de Desenvolvimento Backend com Spring Boot

### Instalação do Java Development Kit (JDK)
1. **Baixe o JDK**: Recomendamos a versão 21 do JDK.
   - **Oracle**: Versão paga para suporte e recursos adicionais (versão gratuita disponível para uso pessoal e desenvolvimento).
   - **OpenJDK**: Gratuito e open-source, amplamente adotado pela comunidade.

2. **Instale o JDK**:
   - No **Windows**, execute o instalador e siga as etapas padrão.
   - Configure a variável de ambiente `JAVA_HOME`:
     - Acesse "Propriedades do Sistema" > "Variáveis de Ambiente" e crie uma nova variável chamada `JAVA_HOME` apontando para o diretório onde o JDK foi instalado.

### Escolha da IDE
- **IntelliJ IDEA Ultimate**: Nossa escolha devido aos recursos avançados.
  - A JetBrains oferece licenças educacionais gratuitas para estudantes e professores.
  - [Baixar IntelliJ IDEA](https://www.jetbrains.com/idea/download/)

### Maven - Gerenciador de Dependências

#### Por que usar o Maven?
- O Maven é utilizado para gerenciar as dependências do projeto Spring Boot, facilitando o processo de build e garantindo que todas as bibliotecas necessárias sejam baixadas automaticamente.
- Com o Maven, é possível definir dependências no arquivo `pom.xml`, e ele cuidará do download e da configuração.

#### Instalação do Maven
1. **Baixe o Maven**: [Link de download](https://maven.apache.org/download.cgi)
2. **Configure o Maven no PATH**: Adicione o Maven ao `PATH` do sistema para utilizá-lo na linha de comando.

## Configuração do Spring Boot com Spring Initializr e Banco de Dados H2

### Configuração do Projeto Spring Boot
- Utilize o **Spring Initializr** para configurar o projeto:
  - [Acesse o Spring Initializr](https://start.spring.io/)
  - **Sistema de gerenciamento de dependências**: Maven
  - **Versão do Spring Boot**: 3.3.5
  - **Linguagem**: Java (JDK 21)

### Dependências Necessárias
- **Spring Web**: Suporte ao Spring MVC para criação de APIs RESTful.
- **H2 Database**: Banco de dados relacional em memória, ideal para desenvolvimento e testes.
- **Lombok**: Automatiza a geração de código boilerplate (getters, setters, construtores).
- **Spring DevTools**: Facilita o desenvolvimento com reinício automático da aplicação.

### Passos para Executar
1. Clone o repositório:
   ```bash
   git clone https://github.com/anandakrishina/space-management-system.git
   ```
2. Navegue até a pasta do projeto:
   ```bash
   cd space-management-system
   ```
3. Compile e execute o projeto usando o Maven:
   ```bash
   ./mvnw spring-boot:run
   ```
4. O projeto estará disponível em: `http://localhost:8080`

## Endpoints Principais
- **GET /helloworld/hello**: Retorna uma mensagem de boas-vindas.

## Estrutura do Banco de Dados
O projeto usa o **H2 Database** para testes e desenvolvimento. A configuração do banco de dados pode ser encontrada em `src/main/resources/application.properties`.


## Projeto em desenvolvimento

## Desenvolvedoras
Ananda Krishina e Laís Baltar

