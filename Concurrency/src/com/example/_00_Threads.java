package com.example;

public class _00_Threads {

    /**
     * A Thread is a single sequential flow of control within a program.
     * Sequence of programmed instructions that can be run independently.
     * This allows the program to be split into multiple parts that can run simultaneously.
     *
     * Modern day processors have multiple cores and each core is reffered to as "Worker".
     *
     * What is a Process?
     * A running instance of an application/program is called process. When you open/start
     * an application, a process is started. when you close the application/program, the
     * process ends.
     * A process needs resources to run (like heap, stack, registers) which are provided by the OS,
     * and these resources are protected from other processes.
     * Processes are independent and can be started and stopped without affecting other processes
     * and cannot talk to each other until specified.
     *
     * Thread vs Process:
     * The default execution mode for process is concurrent.
     * The thread is an unit of execution within a process.
     * Processes can be single-threaded or multi-threaded where the process could spawn threads
     * that could run in parallel.
     *
     * The Java Application:
     * When you start a java application, a new JVM process is created. This process will consist
     * of various threads such as application thread which is responsible for running the main
     * method and other threads for runtime concerns like security, garbage collection etc.
     *
     */
}
