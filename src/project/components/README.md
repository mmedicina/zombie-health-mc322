# Documentação dos componentes
Neste README teremos a documentação de todos os componentes presentes neste diretório do projeto. Segue abaixo a documentação de cada um.

### Componente `Patient`
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
