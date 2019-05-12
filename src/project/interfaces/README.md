# Documentação das Interfaces
Neste README teremos as documentações das Interfaces do projeto. Todas estão contidas nesse diretório. Segue abaixo documentação.

### Interface `ITreeProducer`
Interface responsável por construir a Árvore de Decisão que se encarregará da primeira opinião do Doutor.

Método | Objetivo
------ | --------
`buildTree` | Constrói Árvore de Decisão, selecionando a ordem das melhores perguntas a serem feitas e guarda a referência da árvore internamente.

### Interface `IDoctor`
Extende outras 4 interfaces: `IEnquirer`, `IAnswerReceptacle`, `ITableProducerReceptacle`, `ITreeProducerReceptacle`. Sendo responsável por aglomerar todas as atividades do Doutor, entre elas: conexão com o paciente para fazer perguntas, com árvore de decisão para fazer perguntas na ordem obtida e conexão com a tabela de entrada para lidar com os sintomas.

Método | Objetivo
------ | --------
`<no method>` | `<no method>`

### Interface `IGraphic`
Interface responsável por construir a Árvore de Decisão que se encarregará da primeira opinião do Doutor.

Método | Objetivo
------ | --------
`buildTree` | Constrói Árvore de Decisão, selecionando a ordem das melhores perguntas a serem feitas e guarda a referência da árvore internamente.

