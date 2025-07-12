package Maps;

public class Task {
    public String name;
    public boolean done;

    public Task(String name) {
        this.name = name;
        this.done = false;
    }

    public void markDone() {
        this.done = true;
    }

    public void unmarkDone() {
        this.done = false;
    }

    public String toString() {
        return name + (done ? ": done" : ": to do");
    }

}

