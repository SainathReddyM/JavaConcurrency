package com.example;

import com.example.snippets.MyRunnable;

public class _01_ThreadClass {
    /**
     * In java, single application thread is the default mode of execution.
     * We can create our own threads from the single thread using "Thread" class.
     *
     * What is Runnable?
     * Runnable is an interface provided in JAVA SDK and it signifies that it is something that can be run.
     * The Runnable interface should be implemented by any class whose instances are intended to be executed
     * by a thread.
     */

     // Implementing a Runnable
    Runnable r = new MyRunnable();
    //creating new thread to run the runnable
    Thread myThread = new Thread(r);

    public void myMethod(){
        //starting the thread
        myThread.start();
        /**
         * There are other alternate ways to start a thread which are listed below.
         */
        //By Using Inline class
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running");
            }
        };
        //By using lambdas.
        Runnable r3 = () -> System.out.println("Running");
        //By passing lambda directly to Thread class
        new Thread(()-> System.out.println("Running")).start();
    }
}
