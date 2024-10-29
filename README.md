# Support Server

Servidores que tem o objetivo que oferecer suporte as aplicações, desde monitoramento de dados, desempenho de recursos computacionais, até persistência de dados.

## Estrutura do projeto

``` text

├── .github
│   └── workflows
│       └── script
│           └── manifest.sh
│       └── postgres.yml
│       └── grafana.yml
│       └── deploy.yml
├── app
│   └── grafana
│       └── local
│           └── compose.yaml
│       └── deployment.yaml
│   └── zipkin
│   └── postgres
│   └── grafana
├── docs
│   └── CONTRIBUTING.md
│   └── CODE_OF_CONDUCT.md
│   └── PULL_REQUEST_TEMPLATE.md
└── README.md
```

## Fluxo de Trabalho - Deploy Ambientes

O fluxo de trabalho são processos definidos para dar direção a etapa de desenvolvimento , homologação e lançamento.

As alterações são aplicadas em determinado ambiente através das **branchs**, ao publicar uma alteração numa das branchs ***principais*** o pipeline executa a atualização, a tabela abaixo descreve a relação entre branch e o respectivo ambiente:

### Tabela Branch x Ambiente

| Branch | Ambiente |
| --- | --- |
| develop | Aplica no ambiente __DSV__ |
| release/** | Aplica no ambiente __HMG__ |
| pre-release/** | Aplica no ambiente __STG__ |
| main | Aplica no ambiente __PRD__ |

## Deploy com docker compose

Para atender a necessidade de executar a os servidore em ambiente local, foi criado um manifesto compose que inicia as configurações iniciais dos servidores, proporcionando os recursos da arquitetura em ambiente **localhost.**

Para executar essa instrução basta abrir o terminal shell, e executar com exemplo abaixo:

```sh
bash app/launch_app.sh grafana-prometheus keycloak postgres
```

Informando ao argumento do arquivo shell, os nomes dos servidores que deseja executar.

> [!NOTE]
> Para executar o comando acima citado, é necessário incluir no diretório **app/**, o arquivo .env, que fornecerá ao docker compose as variáveis de ambiente.
> Procure o arquiteto do projeto e solicite o arquivo **.env**.

## Licença

> [!IMPORTANT]
> *O código fonte neste projeto não possui licença de uso.*

É terminantemente proibido reproduzir, distribuir, alterar, utilizar engenharia reversa ou valer-se de qualquer tentativa de reverter ao seu código-fonte qualquer dos componentes que compõem o SOFTWARE, bem como utilizar subterfúgios para burlar a quantidade de usuários licenciados.
