package project.components;

import project.interfaces.IPatient;
import project.interfaces.ITableProducer;

public class Patient implements IPatient {

    @Override
    public String ask(String question) {
        return null;
    }

    @Override
    public boolean finalAnswer(String answer) {
        return false;
    }

    @Override
    public void connect(ITableProducer producer) {

    }

}