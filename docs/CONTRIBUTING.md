# Guia de contribuição

Escreva algo agradável e instrutivo como introdução. Fale sobre que tipo de contribuições você está interessado.

> Bem vindo! Adoramos receber contribuições da nossa comunidade, por isso, obrigado pela visita! Há muitas maneiras de contribuir, incluindo enviar relatórios de bugs, melhorar a documentação, enviar solicitações de recursos, revisar novos envios ou contribuir com código que pode ser incorporado ao projeto.

Este documento descreve nosso processo de desenvolvimento. Seguir essas diretrizes mostra que você respeita o tempo e o esforço dos desenvolvedores que gerenciam este projeto. Em troca, você será respeitado ao abordar seu problema, revisar suas alterações e incorporar suas contribuições.

Se você não está procurando algum tipo de contribuição, observe isso antecipadamente:

> Por favor, não use o rastreador de problemas para perguntas de suporte. Em vez disso, use: a, b ou Stack Overflow.

**Índice:**

1. [Código de Conduta](#código-de-conduta)
2. [Recursos importantes](#recursos importantes)
2. [Perguntas](#perguntas)
3. [Solicitações de recursos](#feature-requests)
4. [Melhorando a documentação](#improving-documentation)
5. [Relatando Bugs](#reporting-bugs)
6. [Código de contribuição](#código de contribuição)
	1. [Primeiros passos](#primeiros passos)
	1. [Encontrando um problema!](#encontrando um problema)
	1. [Processo de Desenvolvimento](#processo de desenvolvimento)
	1. [Construindo o Projeto](#construindo o Projeto)
	1. [Teste](#teste)
	1. [Diretrizes de estilo](#diretrizes de estilo)
	1. [Regras de formatação de código](#code-formatting)
	1. [Limpeza de espaço em branco](#limpeza de espaço em branco)
1. [Diretrizes de solicitação pull](#pull-request-process)
	1. [Processo de revisão](#processo de revisão)
	1. [Feedback de endereçamento](#feedback de endereçamento)
1. [Comunidade](#comunidade)

## Código de Conduta

Se você tiver um documento de código de conduta:

> Ao participar deste projeto, você concorda em cumprir nosso [Código de Conduta][0]. Esperamos que todos os colaboradores sigam o [Código de Conduta][0] e tratem os outros seres humanos com respeito.

Caso contrário, estabeleça algumas regras básicas desde o início.

## Recursos importantes

Inclua links curtos para recursos importantes:

* documentos: manual / roteiro
* bugs: rastreador de problemas / ferramenta de relatório de bugs
* comunicações: link do fórum, lista de desenvolvedores, IRC/e-mail
* wiki

## Questões

Como você prefere que as pessoas façam perguntas? Por meio de um problema? Existe um canal de IRC, grupo do Google ou outra forma de obter ajuda? As questões que são perguntas deveriam receber um rótulo específico? Eles podem enviar um e-mail diretamente para você?

## Solicitações de recursos

Forneça informações sobre o processo de solicitação de novos recursos. Você tem um rótulo específico que deve ser aplicado? A aprovação é necessária?

Se você tiver um roteiro, metas, trabalhos em andamento ou uma filosofia de desenvolvimento, compartilhe as informações. Tente garantir que os usuários tenham informações suficientes para avaliar antecipadamente se uma solicitação de recurso é apropriada para o seu projeto. Exemplos:

> Crie um novo problema no GitHub para quaisquer alterações e melhorias importantes que você deseja fazer. Forneça o recurso que você gostaria de ver, por que precisa dele e como funcionará. Discuta suas ideias de forma transparente e obtenha feedback da comunidade antes de prosseguir.

> As principais alterações com as quais você deseja contribuir para o projeto devem ser discutidas primeiro em uma edição do GitHub que descreva claramente as alterações e os benefícios do recurso.

> Pequenas alterações podem ser criadas diretamente e enviadas ao repositório GitHub como uma solicitação pull. Consulte a seção sobre Diretrizes para envio de solicitações pull e, para obter informações detalhadas, a documentação principal de desenvolvimento.

## Relatando Bugs

**Se você encontrar uma vulnerabilidade de segurança, NÃO abra um problema. Em vez disso, envie um e-mail para EMAIL@DOMAIN.COM.**

Peça aos colaboradores para verificarem antes de registrar um novo problema. Além disso, forneça referências a perguntas frequentes ou guias de depuração que você possa ter.

> Antes de enviar seu problema, [pesquise o arquivo de problemas][6] - talvez sua dúvida ou problema já tenha sido identificado ou resolvido.

Diga aos colaboradores como registrar um relatório de bug útil. De que informações você precisa? (por exemplo, versão, arquitetura, arquivos de log, comportamento esperado, comportamento observado).

> Se você encontrar um bug no código-fonte, você pode nos ajudar [enviando um problema para nosso rastreador de problemas do GitHub][6]. Melhor ainda, você pode enviar uma solicitação pull com uma correção.

Seu projeto usa um modelo de problema? Forneça instruções e expectativas para preenchê-lo.

Você viu um relatório de problema incrível? Link para ele para que outros vejam!

## Melhorando a documentação

Inclua notas sobre como os usuários podem melhorar a documentação.

> Se você tiver uma sugestão para a documentação, poderá abrir um problema e descrever o problema ou melhoria que possui - no entanto, criar você mesmo a correção do documento é muito melhor!

> Se você quiser ajudar a melhorar a documentação, é uma boa ideia informar outras pessoas no que você está trabalhando para minimizar a duplicação de esforços. Crie um novo problema (ou comente um problema existente) para que outras pessoas saibam no que você está trabalhando. Se você estiver fazendo uma pequena alteração (erro de digitação, frase), não se preocupe em registrar um problema primeiro.

> Para grandes correções, crie e teste a documentação antes de enviar o PR para ter certeza de que não introduziu acidentalmente nenhum problema de layout ou formatação.

```
Fornece instruções sobre como criar e visualizar a documentação
```

## Código de contribuição

Esta seção é usada para colocar novos contribuidores em funcionamento com dependências, desenvolvimento, testes, regras de estilo, regras de formatação e outras coisas que eles devem saber.

Se você tiver um rótulo para questões para iniciantes, fale sobre isso aqui para que eles saibam onde procurar:

> Não sabe por onde começar a contribuir para o Atom? Você pode começar analisando estes problemas para iniciantes e para quem precisa de ajuda: Problemas para iniciantes - problemas que devem exigir apenas algumas linhas de código e um ou dois testes. Questões procuradas por ajuda - questões que deveriam ser um pouco mais complicadas do que questões para iniciantes.

Está trabalhando em seu primeiro projeto de código aberto ou pull request? Aqui estão alguns tutoriais úteis:

* [Como contribuir para um projeto de código aberto no GitHub][2]
* [Faça uma solicitação pull][3]
* [Somente para iniciantes] [4]
### Começando

Instale estas dependências:

```
com alguns exemplos
```

Forneça algumas instruções para o seu fluxo de trabalho (por exemplo, bifurcar o repositório)

> Você precisará bifurcar o repositório principal para trabalhar em suas alterações. Basta navegar até nossa página GitHub e clicar no botão "Fork" na parte superior. Depois de bifurcar o repositório, você pode clonar seu novo repositório e começar a fazer edições.

> No git é melhor isolar cada tópico ou recurso em uma “ramificação de tópico”. Embora os commits individuais permitam que você controle sobre quão pequenas alterações individuais são feitas no código, as ramificações são uma ótima maneira de agrupar um conjunto de commits, todos relacionados a um recurso, ou de isolar diferentes esforços quando você estiver trabalhando em vários tópicos no mesmo momento. mesmo tempo.

> Embora seja necessária alguma experiência para ter a noção correta sobre como dividir commits, uma ramificação de tópico deve ter escopo limitado a um único problema

```
# Faça check-out do branch master - você deseja que seu novo branch venha do master
mestre de checkout git

# Crie um novo branch chamado newfeature (dê ao seu branch um nome simples e informativo)
novidade do branch git

# Mude para sua nova filial
git checkout novidade
```

Para obter mais informações sobre os processos de fork e pull-request do GitHub, [consulte este guia útil][5].

### Encontrando um problema

A lista de solicitações de recursos e bugs pendentes pode ser encontrada em nosso [rastreador de problemas do GitHub] [6]. Escolha um problema não atribuído que você acha que pode realizar e adicione um comentário informando que está tentando fazê-lo.

Forneça notas sobre diferentes tipos de questões ou rótulos

> Problemas rotulados como 'iniciais' são considerados bons frutos ao alcance dos recém-chegados ao projeto
> Problemas rotulados como 'procura-se ajuda' podem ser mais difíceis do que 'iniciais' e podem incluir o desenvolvimento de novos recursos
> Problemas rotulados como `doc` só devem tocar no conteúdo da pasta `docs`.

### Processo de Desenvolvimento

Qual é o seu processo de desenvolvimento?

> Este projeto segue o modelo ramificado de desenvolvimento de produto [git flow](http://nvie.com/posts/a-successful-git-branching-model/).

Fale sobre ramos nos quais as pessoas deveriam trabalhar. Especificamente, onde está o ponto de partida? `mestre`, `desenvolvimento`, etc.

> Você deve usar o branch master para a versão mais estável; revise as [notas de versão](https://github.com/openopps/openopps-platform/releases) regularmente. Fazemos lançamentos a cada uma ou duas semanas e enviamos notas. Se você quiser se manter atualizado com as últimas mudanças, trabalhamos no branch `dev`.  Se você estiver usando dev, fique atento aos commits e/ou participe do nosso stand-up diário.

### Construindo o Projeto

Em quais filiais o trabalho deve ser iniciado?

Inclua instruções sobre como construir o projeto.

```
com alguns exemplos
```

Forneça instruções sobre como adicionar um novo arquivo/módulo à compilação

```
com alguns exemplos
```

Mantenha seus testes o mais simples possível.

### Teste

Se você adicionar código, precisará adicionar testes! Aprendemos da maneira mais difícil que código sem testes não é confiável. Se sua solicitação pull reduzir nossa cobertura de teste porque faltam testes, ela será rejeitada.

Forneça instruções para adicionar novos testes. Forneça instruções para executar testes.

```
com exemplos
```

### Diretrizes de estilo

Se o seu código tiver diretrizes de estilo, adicione-as aqui ou forneça links para documentos relevantes. Se você tiver um verificador automatizado, forneça instruções sobre como executá-lo.

### Formatação de código

Se o seu código tiver diretrizes de formatação que não sejam abordadas nas diretrizes de estilo acima, adicione-as aqui.

Se você estiver usando uma ferramenta de formatação automática como clang-format

```
Forneça instruções para executar a ferramenta de formatação
```

### Limpeza de espaço em branco

Não misture alterações de código com limpeza de espaços em branco! Se você estiver corrigindo espaços em branco, inclua essas alterações separadamente das alterações no código. Se sua solicitação estiver ilegível devido a alterações de espaços em branco, ela será rejeitada.

> Envie limpezas de espaços em branco em uma solicitação pull separada.

### Diretrizes de commit do Git

Você tem alguma diretriz para suas mensagens de commit? Inclua-os aqui.

> A primeira linha do log de commit deve ser tratada como um email
linha de assunto.  Não deve ter mais de 50 caracteres.
O sujeito deve ser independente e não apenas fazer
referências como números de bugs relevantes.

> A segunda linha deve ficar em branco.

> A terceira linha inicia o corpo da mensagem de commit (um ou mais
parágrafos) descrevendo os detalhes do commit.  Os parágrafos são cada
separados por uma linha em branco.  Os parágrafos devem ser quebrados por palavras para não haver
mais de 76 caracteres.

> A última parte do log de commit deve conter todos os "externos
referências", como quais problemas foram corrigidos.

> Para mais notas sobre mensagens de commit do git, [leia esta postagem do blog][7].

## Processo de solicitação pull

Você tem alguma convenção de rotulagem?

Adicione notas para enviar seu branch:

> Quando estiver pronto para gerar uma solicitação pull, seja para revisão preliminar ou para consideração de fusão no projeto, você deve primeiro enviar seu branch de tópico local de volta ao GitHub:

```
git push origem novidade
```

Inclua uma observação sobre o envio do PR:

> Depois de confirmar e enviar todas as alterações para o GitHub, vá para a página do seu fork no GitHub, selecione seu branch de desenvolvimento e clique no botão pull request. Se você precisar fazer algum ajuste em sua solicitação pull, basta enviar as atualizações para sua filial. Sua solicitação pull rastreará automaticamente as alterações em seu branch de desenvolvimento e atualização.

```
git push origem novidade
```

Inclua uma observação sobre o envio do PR:

> Depois de confirmar e enviar todas as alterações para o GitHub, vá para a página do seu fork no GitHub, selecione seu branch de desenvolvimento e clique no botão pull request. Se você precisar fazer algum ajuste em sua solicitação pull, basta enviar as atualizações para sua filial. Sua solicitação pull rastreará automaticamente as alterações em seu branch de desenvolvimento e atualização.

1. Certifique-se de que todas as dependências de instalação ou construção sejam removidas antes do final da camada ao fazer uma
   construir.
2. Atualize o README.md com detalhes das alterações na interface, incluindo novo ambiente
   variáveis, portas expostas, locais de arquivos úteis e parâmetros de contêiner.
3. Aumente os números de versão em quaisquer arquivos de exemplo e no README.md para a nova versão que este
   Pull Request representaria. O esquema de versionamento que usamos é [SemVer](http://semver.org/).
4. Você pode mesclar a solicitação pull assim que tiver a aprovação de dois outros desenvolvedores ou se desejar
   não tem permissão para fazer isso, você pode solicitar que o segundo revisor mescle-o para você.

### Processo de revisão

Quem analisa isso? Quem precisa assinar antes de ser aceito? Quando um colaborador deve esperar receber notícias suas? Como os contribuidores podem obter acesso de commit, se é que conseguem?

> A equipe principal analisa as solicitações pull regularmente em uma reunião de triagem semanal que realizamos em um Hangout público do Google. O hangout é anunciado nas atualizações de status semanais enviadas para a lista puppet-dev. As notas são postadas no repositório de triagem da comunidade da Puppet Community e incluem um link para uma gravação do hangout no YouTube. Após o feedback ser dado, esperamos respostas dentro de duas semanas. Após duas semanas, poderemos encerrar a solicitação pull se ela não mostrar nenhuma atividade.

> Exceto para correções críticas, urgentes ou muito pequenas, tentamos deixar solicitações pull abertas durante a maior parte do dia ou durante a noite se algo chegar no final do dia, para que várias pessoas tenham a chance de revisar/comentar.  Qualquer pessoa que analisar uma solicitação pull deve deixar uma nota para que outras pessoas saibam que alguém a analisou.  Para commits maiores, gostamos de receber o +1 de outra pessoa da equipe principal e/ou de outro(s) colaborador(es).  Observe que se você revisou o código ou testou localmente - um +1 por si só normalmente será interpretado como se você achasse que é uma boa ideia, mas não revisou em detalhes.

Talvez também forneça as etapas que sua equipe usará para verificar um PR. Ou discuta as etapas executadas em seu servidor de CI, se você tiver um. Isso ajudará os desenvolvedores a entender como investigar falhas ou testar o processo por conta própria.

### Abordando Feedback

Depois que um PR for enviado, suas alterações serão analisadas e comentários construtivos poderão ser fornecidos. O feedback não pretende ser um ataque, mas sim ajudar a garantir que o código da mais alta qualidade chegue ao nosso projeto. As alterações serão aprovadas assim que o feedback necessário for abordado.

Se um mantenedor pede para você “rebasear” seu PR, ele está dizendo que muito código mudou e que você precisa atualizar seu fork para que seja mais fácil mesclar.

Para atualizar seu repositório bifurcado, siga estas etapas:

```
# Busque o upstream master e mescle com o branch master do seu repositório
git buscar upstream
mestre de checkout git
git mesclar upstream/mestre

# Se houver novos commits, rebase seu branch de desenvolvimento
git checkout novidade
mestre de rebase git
```

Se muito código foi alterado para que o git aplique automaticamente as alterações de suas ramificações ao novo mestre, você mesmo precisará resolver manualmente os conflitos de mesclagem.

Assim que seu novo branch não tiver conflitos e funcionar corretamente, você poderá substituir seu branch antigo usando este comando:

```
git push -f
```

Observe que isso substituirá o branch antigo no servidor, portanto, primeiro certifique-se de estar satisfeito com suas alterações!

## Comunidade

Você tem uma lista de discussão, grupo do Google, canal Slack, canal IRC? Link para eles aqui.

> Qualquer pessoa que contribua ativamente ou use o OpenOpps deve participar da nossa [lista de e-mails](https://groups.google.com/forum/#!forum/openopps-platform).
Também temos uma equipe de bate-papo pública no Slack. Se você estiver interessado em acompanhar o processo de desenvolvimento ou tiver dúvidas, sinta-se à vontade para [juntar-se a nós](https://openopps.slack.com).

Incluir outras notas sobre como as pessoas podem contribuir

* Você pode nos ajudar a responder perguntas de nossos usuários aqui:
* Você pode ajudar a construir e projetar nosso site aqui:
* Você pode ajudar a escrever postagens no blog sobre o projeto:
* Você pode ajudar com boletins informativos e comunicações internas:

* Crie um exemplo do projeto no mundo real construindo algo ou
mostrando o que outros construíram.
* Escreva sobre projetos de outras pessoas com base neste projeto. Mostrar como
é usado na vida diária. Faça capturas de tela e faça vídeos!

[0]: CODE_OF_CONDUCT.md
[1]: style_guidelines.md
[2]: https://egghead.io/series/how-to-contribute-to-an-open-source-project-on-github
[3]: http://makeapullrequest.com/
[4]: http://www.firsttimesonly.com
[5]: https://gist.github.com/Chaser324/ce0505fbed06b947d962
[6]: link/para/seu/projeto/problema/rastreador
[7]: http://tbaggery.com/2008/04/19/a-note-about-git-commit-messages.html