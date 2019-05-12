package project.interfaces;

public interface IDecisionTree extends  ITreeProducer, ITableProducerReceptacle{
  String[] getBestQuestions();
}
