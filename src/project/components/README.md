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

