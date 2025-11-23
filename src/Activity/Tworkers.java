package Activity;

 class TworkersE extends Thread {
    private String taskName;

    public TworkersE(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println("ThreadWorker is performing task: " + taskName);
    }
}

// Worker implemented as a Runnable
class RunnableWorker implements Runnable {
    private String taskName;

    public RunnableWorker(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println("RunnableWorker is performing task: " + taskName);
    }
}

public class Tworkers {
    public static void main(String[] args) {

        TworkersE worker1 = new TworkersE("Task A");
        worker1.start();

        RunnableWorker runnableTask = new RunnableWorker("Task B");
        Thread worker2 = new Thread(runnableTask);
        worker2.start();
    }
}

