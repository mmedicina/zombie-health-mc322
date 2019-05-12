# Documentação das Interfaces
Neste README teremos as documentações das Interfaces do projeto. Todas estão contidas nesse diretório. Segue abaixo documentação.

### Interface `IDoctor`
Extende outras 4 interfaces: `IEnquirer`, `IAnswerReceptacle`, `ITableProducerReceptacle`, `ITreeProducerReceptacle`. Sendo responsável por aglomerar todas as atividades do Doutor, entre elas: conexão com o paciente para fazer perguntas, com árvore de decisão para fazer perguntas na ordem obtida e conexão com a tabela de entrada para lidar com os sintomas.

Método | Objetivo
------ | --------
`<no method>` | `<no method>`

### Interface `IEnquirerReceptable`
Conecta as outras interfaces com o IEnquirer 

Método | Objetivo
------ | --------
`connect` | `Responsável pela conexão das interfaces que extenderem o IEnquireReceptable com o IEnquirer`

### Interface `IGraphic`
Extende outras três interfaces : `IEnquirerReceptacle`, `ITableProducerReceptacle` e `IAnswerReceptacle`. Responsável por unir
todas as partes necessárias para a formação do gráfico 

Método | Objetivo
------ | --------
`<no method>` | `<no method>`


### Interface `ITableProducer`
Responsável por pegar as classes e instâncias do DataSet.

Método | Objetivo
------ | --------
`requestAttributes` | `Responsável por captar as classes do DataSet`
`requestInstances` | `Responsável por captar as instâncias de cada classe`


### Interface `ITreeProducer`
Interface responsável por construir a Árvore de Decisão que se encarregará da primeira opinião do Doutor.

Método | Objetivo
------ | --------
`buildTree` | Constrói Árvore de Decisão, selecionando a ordem das melhores perguntas a serem feitas e guarda a referência da árvore internamente.
