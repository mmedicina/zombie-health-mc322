# Documentação dos componentes
Neste README teremos a documentação de todos os componentes presentes neste diretório do projeto. Segue abaixo a documentação de cada um.

## Componente `Patient`
Campo | Valor
----- | -----
Classe | `project.components.Patient`
Autores | `Dino Scientists`
Objetivo | `Implementar métodos para responder perguntas do Doutor`
Interface | `IPatient`

```
public interface ITableProducerReceptacle {
    public void connect(ITableProducer producer);
}

public interface IAnswer {
    public String ask(String question);
    public boolean finalAnswer(String answer);
}

public interface IPatient extends IAnswer, ITableProducerReceptacle {
}
```

## Componente `DataSet`
Campo | Valor
----- | -----
Classe | `project.components.DataSetComponent`
Autores | `Dino Scientists`
Objetivo | `Organizar as tabelas de entrada em Strings para ser facilmente manipuladas`
Interface | `IDataSet`

```
public interface ITableProducer {
    String[] requestAttributes();
    String[][] requestInstances();
}

public interface IDataSource {
    public String getDataSource();
    public void setDataSource(String dataSource);
}

public interface IDataSet extends IDataSource, ITableProducer {
}
```

## Componente `SecondOpinion`
Campo | Valor
----- | -----
Classe | `project.components.SecondOpinionComponent`
Autores | `Dino Scientists`
Objetivo | `Dar ao paciente uma segunda opinião sobre seus sintomas, verificando a primeira resposta do doutor e comentando caso haja uma segunda doença menos provável mas ainda possível. Abrange os outliers utilizando comparações entre modelos gerados por RandomForest.
Interface | `ISecondOpinion`

```
public interface IDataSet extends IDataSource, ITableProducer {
}

public interface ISplitDataSet extends IDataSet{
    public String[] getDiseases();
    public String[] getSymptoms();
}


public interface ISecondOpinion extends IDataSet, ISplitDataSet {
    public String getHighestProbDisease();
    public String getSecHighestProbDisease();
    
}
```
