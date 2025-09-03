### Week 4 / Section 01 — Unit Testing with JUnit 5 & Mockito

**Focus:** Writing reliable, small, and fast unit tests; practicing state-based vs behavior-based testing; introducing mocks/stubs for isolating dependencies.

**🎯 Key exercises:**
1. **Addition with assertions** → implemented `Calculator.add(int a, int b)` and verified results with `assertEquals(expected, actual)`.
2. **Even number check** → created `isEven(int n)` and tested both branches using `assertTrue` / `assertFalse` (condition: `n % 2 == 0`).
3. **String reversal** → built `reverse(String input)` and covered normal input, empty string, and `null` using `assertEquals` / `assertNull`.
4. **Empty string predicate** → wrote `isEmpty(String str)` (`str == null || str.isEmpty()`) and tested positive/negative cases with `assertTrue` / `assertFalse`.
5. **Recursive factorial** → implemented `factorial(int n)` with base case `0 → 1`; verified values (e.g., `5 → 120`) via `assertEquals`.
6. **Logging with a mock** → extended `Calculator` to log results via `LoggerService`; used `Mockito.mock()` and `verify(logger).log(...)` to confirm interaction.
7. **Service + repository (stubbing)** → implemented `UserService.getUserById(id)` backed by `UserRepository`; used `when(...).thenReturn(...)` to stub data and asserted returned user correctness.
8. **Exception flow from repository** → ensured `UserService.deleteUser(id)` reacts properly when `UserRepository` throws; verified with `doThrow(...).when(repo).delete(id)` and `assertThrows(...)` and **Invocation count** → verified exact number of method calls with `verify(mock, times(n))`.
9. **Returning lists from a mock** → stubbed `getAllUsers()` to return 3 users (e.g., `Arrays.asList(...)`) and asserted size `== 3`.
10. **Task status transition + debugging** → implemented `Task.complete()` to switch status from `ACTIVE` to `COMPLETED`; wrote a JUnit test asserting initial and final states, and debugged with a breakpoint inside `complete()`.

**🏋️ Skills demonstrated:**
- Writing clear unit tests with **JUnit 5** (`assertEquals`, `assertTrue`, `assertFalse`, `assertNull`, `assertThrows`).
- Isolating dependencies using **Mockito** (`mock`, `when/thenReturn`, `doThrow`, `verify`, `times`).
- Distinguishing **state verification** (asserting returned values/state) from **behavior verification** (asserting interactions).
- Designing for testability (interfaces like `LoggerService`, `UserRepository`; simple DI of collaborators).
- Covering edge cases (null/empty inputs, exception paths) and testing **recursive logic** safely.
- Using the **debugger** to step through logic and validate state transitions.

**💻 Terminal output:**

```
Ex01Calculator: 2 + 3 = 5
Ex02IsEven: Is 4 even? true
Ex03StringReverser: Reverse of 'Hello' = olleH
Ex04IsEmpty: Is empty (''): true
Ex05Factorial: Factorial of 5 = 120
Ex06Calculator: LOG: Added: 12
Ex06LoggerService: Final result = 12
Ex07UserService: Found user: Ex07User[id=2, name=Bob]
Ex07UserService: Missing user: null
Ex08UserService: User 1 deleted
Ex08UserService: Caught exception: User with id: 99 does not exist!
Ex09UserService: Alice
Ex09UserService: Bob
Ex09UserService: Charlie
Ex10Task: Task status before complete(): ACTIVE
Ex10Task: Task status after complete(): COMPLETED
```