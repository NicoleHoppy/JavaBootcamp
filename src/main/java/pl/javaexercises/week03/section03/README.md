### Week 3 / Section 03 — Exception Handling & Custom Exceptions

**Focus:** Learning how to handle errors gracefully and create custom exception types for robust applications.  
This section demonstrates how to enforce rules in object creation and validate input using exceptions.

**🎯 Key exercises:**
1. **Invalid Task creation** → created a custom `InvalidTaskException`.
    - Threw the exception in the `Task` constructor if the `title` was empty or `dueDate` was in the past.
    - Handled the exception in `main()` and displayed a user-friendly error message.

2. **Age validation** → wrote a `registerPerson(int age)` method that throws a custom `TooYoungException` if the age is below 18.
    - If the age was valid, printed a success message: `"Registration completed successfully"`.

**🏋️ Skills demonstrated:**
- Creating **custom exception classes** to represent domain-specific errors.
- Using `throw` and `try-catch` to handle exceptional situations gracefully.
- Enforcing **business rules** in constructors and methods.
- Writing user-friendly messages for invalid operations.
- Strengthening **robustness and reliability** of Java applications.  

**💻 Terminal output:**

```
Task: title = 'Cooking', dueDate = 2025-08-27
The task couldn't be created: Date cannot be in the past
The task couldn't be created: Title cannot be empty

Ex02RegisteredPerson: name: Peter, age: 25
This person couldn't be registered: This person is too young
```