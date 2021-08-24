package com.company;

public class SequenceGeneratorTask implements Runnable{
    private NumberGenerator numberGenerator;
    private int result;

    public SequenceGeneratorTask(NumberGenerator numberGenerator, int result) {
        super();
        this.numberGenerator = numberGenerator;
        this.result = result;
    }
    @Override
    public void run() {
        numberGenerator.printNumber(result);
    }
 }
