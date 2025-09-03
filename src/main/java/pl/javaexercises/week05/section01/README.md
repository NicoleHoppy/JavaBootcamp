### Week 5 / Section 01 — Threads & File I/O with Java

**Focus:** Practicing concurrent task generation with threads and persisting data using Java NIO.

**🎯 Key exercises:**
1. **Running a test thread generating a task list**
    - Implemented `TaskGenerator` class implementing `Runnable`.
    - In `run()` created 10 `Task` objects with different dates.
    - Launched a thread using:
   ```java
   Thread generatorThread = new Thread(new TaskGenerator());
   generatorThread.start();
   generatorThread.join();
   ```
   
2. **Saving and reading tasks from a file (NIO)**
   - Created `List<String>` with task descriptions.
   - Wrote the list to a text file using `Files.write()`.
   - Checked file existence with `Files.exists()` before reading.
   - Read tasks from file with `Files.readAllLines()` and displayed them.

**🏋️ Skills demonstrated:**

- Implementing concurrent logic with threads and the Runnable interface.
- Modeling simple domain objects with custom classes (Task). 
- Performing file I/O using the modern Java NIO API (Files.write, Files.readAllLines, Files.exists). 
- Designing separated responsibilities (TaskGenerator for logic, FileTaskManager for persistence, Main as entry point). 
- Ensuring safe and robust data handling (existence check before reading).

**💻 Terminal output:**

```
=== TaskGenerator (Thread) ===
Task 1 - 2025-09-04
Task 2 - 2025-09-05
Task 3 - 2025-09-06
Task 4 - 2025-09-07
Task 5 - 2025-09-08
Task 6 - 2025-09-09
Task 7 - 2025-09-10
Task 8 - 2025-09-11
Task 9 - 2025-09-12
Task 10 - 2025-09-13
Generated Tasks: 10

=== FileTaskManager (NIO) ===
Tasks written to file
Read tasks from file: 
Task 1 - Write report
Task 2 - Meeting with team
Task 3 - Review code
```