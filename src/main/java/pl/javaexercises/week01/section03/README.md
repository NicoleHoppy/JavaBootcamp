### Week 1 / Section 03 — Lists & Maps

**🎯 Focus:** Introduction to Java Collections Framework with `List` and `Map`.  
This section demonstrates how to store, retrieve, and process data in dynamic collections, and how to apply simple filtering and aggregation operations.

**Key exercises:**
1. **Working with lists** → created a `List<String>` of names, added elements, and printed them using a loop.
2. **Searching in collections** → checked if a list contains a specific name (`"Anna"`) using `.contains()`.
3. **Creating maps** → built a `Map<String, Integer>` representing `name → age` and printed all entries with a `for-each` loop.
4. **Filtering data** → iterated through the map and displayed only people older than 18.
5. **Counting frequency** → used a `Map<String, Integer>` to count how many times a given name occurs in a list.
6. **Filtering tasks by status** → introduced a `Task` class and filtered tasks based on their status (`DONE`).
7. **Grouping tasks by status** → created a `Map<String, List<Task>>` to organize tasks by status and printed all tasks marked as `TODO`.

**🏋️ Skills demonstrated:**
- Using `List` and `Map` for dynamic data structures.
- Performing common collection operations: `add`, `contains`, `put`, `getOrDefault`.
- Applying filtering and aggregation techniques with loops and conditions.
- Introducing **object-oriented thinking** (task objects with a status field).
- Practicing basic data modeling (mapping relationships like `status → tasks`).

**💻 Terminal output:**
```
Ex01ListOfNames: Those are names from the list: Kate, Peter, Anna, Tom
Ex02IsContaining: Does the list contain name Anna? true

Ex03MapOfNamesAges: The results of the map: 
Name: Anne, Age: 20
Name: Kate, Age: 25

Ex04AboveEighteen: The people above 18 years old are as follows: 
Name: Kate, Age: 30
Name: Ann, Age: 20

Ex05NameOccurrenceCounter: The names in the following list: [Tom, Ann, Emma, Joe, Emma, Kate, Josh, Joe] appears this many times: {Ann=1, Joe=2, Tom=1, Kate=1, Josh=1, Emma=2}

Ex06TaskAndDone: Task with status done: 
Name: Cooking, Status: Done
Name: Cleaning, Status: done

Ex07TodoTaskPrinter: The tasks with the TODO status: 
Name: Shopping, Status: todo
```