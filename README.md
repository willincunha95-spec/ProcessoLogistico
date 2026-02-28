🚚 Sistema de Gerenciamento de Processos Logísticos
Este projeto é um sistema de back-end desenvolvido para gerenciar fluxos logísticos, controle de encomendas e administração de usuários. Ele foi projetado para oferecer uma solução robusta em logística e manutenção, permitindo o acompanhamento detalhado de entregas e operações.

🚀 Tecnologias Utilizadas
Java 17: Linguagem principal do ecossistema.

Spring Boot: Framework para agilizar o desenvolvimento da API.

Spring Data JPA: Para persistência de dados e abstração de consultas.

PostgreSQL: Banco de dados relacional para armazenamento seguro.

Docker: Conteinerização para facilitar o deploy e o ambiente de desenvolvimento.

Maven: Gerenciador de dependências e automação de build.

📋 Funcionalidades Principal
Gestão de Usuários: Cadastro e controle de acesso através da tabela tb_usuarios.

Fluxo de Encomendas: Registro e rastreamento de processos logísticos.

Persistência de Dados: Integração completa com banco de dados PostgreSQL via Docker.

📦 Como Executar o Projeto
Pré-requisitos
Docker e Docker Compose instalados.

JDK 17 ou superior.

Maven.

Passo a Passo
Clonar o repositório:

Bash

git clone https://github.com/willincunha95-spec/ProcessoLogistico.git
cd ProcessoLogistico
Subir o banco de dados (Docker):

Bash

docker-compose up -d
Executar a aplicação:

Bash

mvn spring-boot:run
🛠️ Acesso ao Banco de Dados no Docker
Para verificar as tabelas (como a tb_usuarios) diretamente no container, utilize:

Bash

docker exec -it pg-encomendas psql -U postgres -d db_processo_logistico
(Nota: Certifique-se de que o nome do banco de dados no comando \c corresponde ao configurado no seu application.properties).

✒️ Autor
Willian Cunha - GitHub
