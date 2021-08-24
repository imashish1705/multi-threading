package com.company;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    private static final int TOTAL_NUMBER_IN_SEQUENCE = 20;
    private static final int TOTAL_NUMBER_OF_THREADS = 3;
    public static void main(String[] args) {
	// write your code here
        NumberGenerator numberGenerator = new NumberGenerator(TOTAL_NUMBER_OF_THREADS,TOTAL_NUMBER_IN_SEQUENCE);
        ExecutorService executorService = null;
        try{
            executorService = Executors.newFixedThreadPool(TOTAL_NUMBER_OF_THREADS);
            executorService.submit(new SequenceGeneratorTask(numberGenerator,1));
            executorService.submit(new SequenceGeneratorTask(numberGenerator,2));
            executorService.submit(new SequenceGeneratorTask(numberGenerator,0));
        } catch( Exception e) {
            e.printStackTrace();
        } finally {
            if(executorService != null) {
                executorService.shutdown();
            }
        }
    }
}
