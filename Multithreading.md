## Multithreading

### 1. Introduction

### 2. The ways to define a thread

1. By Extending Thread class
2. By Implementing Runnable Interface

### 3. Getting and Setting Name of Thread

### 4. Thread Priorities

### 5. The methods to prevent Thread Execution

1. yield()
2. join()
3. sleep()

### 6. Synchronization

### 7. Inter Thread Communication

### 8. Deadlock

### 9. Deamon Threads

### 10. Multithreading Enhancements

### 1. Introduction:

Executing several tasks simultaneously is a concept of Multitasking.

There are two types of Multitasking

1. Process based
2. Thread based

##### Process based multitasking - OS level

Executing several tasks simultaneously where each tasks a seperate independent program( process ) is called process based multitasking.

* Typing a Java program in Intellij IDE
* Listening audio songs from same system
* Downloading a file from Internet.

All above task will be executed simultaneously and independent of each other hence it is process based multitasking.

Process based multitasking is best suitable at OS Level.

*Note - Process-based multitasking is an operating system capability that allows multiple independent processes to run concurrently,each with its own memory space and resources, managed by the OS through scheduling and context switching.*

##### Thread based multitasking -

Executing several task simultaneously where each task is a seperate Independent path of the same program such type of multitasking is called Thread based multitasking.

And each independent path is called a Thread.

Thread based mul is best suitable at programtic level.

*Note - Thread-based multitasking is a programming and operating system capability that allows multiple threads (smaller units of a process) to run concurrently within the same process, sharing the same memory space and resources, allowing for more efficient and responsive applications.*

##### Objective of Multhreading -

Whether it is process based or thread based the main objective of multitasking is to reduce response time of the system and to improve performance.

The main important applications area of multhreading are

1. To develop multimmedia graphics
2. To develop animations
3. To develop video games
4. To develop web servers and applications servers
5. When compared with old languages Developing multithreaded applications in Java is very easy because Java provides inbult support for multithreading with rich API( Thread, Runnable, Thread Group...).








### 2. The ways to define a thread


dddd

dddd

```
class MyThread extends Thread {
    public void run(){
        for (int i=0; i<10;i++){
            System.out.println("Executed by Child Thread");
        }
    }
}

class ThreadTest {
    public static void main(String[] args){
        MyThread mt = new MyThread();
        mt.start();

        for (int i=0; i<10;i++){
            System.out.println("Executed by Main Thread");
        }
    }
}
```


ddddd


ddd


##### Thread Scheduler:

It is responsible to schedule thread. If multiple threads are waiting to get chance of execution..
