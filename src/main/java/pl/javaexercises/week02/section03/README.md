### Week 2 / Section 03 — Object-Oriented Programming & Interfaces

**Focus:** Practicing object-oriented principles — inheritance, polymorphism, abstraction, and interfaces.  
This section demonstrates how to design class hierarchies, implement contracts with interfaces, and build reusable abstractions.

**🎯 Key exercises:**
1. **Class inheritance** → created an `Animal` superclass with a `makeSound()` method, then extended it with `Dog` and `Cat` classes overriding the method.
2. **Interfaces** → defined a `Playable` interface with `play()` and implemented it in `Guitar`, printing `"Guitar is playing"`.
3. **Inheritance with state** → built a `Vehicle` class with `speed` and a `move()` method, then created a `Car` subclass overriding `move()` to display current speed.
4. **Polymorphic shapes** → introduced a `Shape` interface with `area()`, then implemented `Circle` and `Rectangle` to compute surface areas.
5. **Abstraction with payments** → designed an abstract `Payment` class with `processPayment()`, extended by `CreditCardPayment` and `PaypalPayment`.
6. **Polymorphism in collections** → stored different `Animal` objects in a `List<Animal>` and invoked `makeSound()` dynamically in a loop.
7. **Project & Task modeling** →
    - Created a `Project` class aggregating multiple `Task` objects.
    - Added fields like `title`, `dueDate`, and `status` to `Task`.
    - Introduced a base class `Item` with `title`, inherited by `Task`.
    - Designed a `Completable` interface with `complete()` implemented by `Task`.
    - Added methods to manage tasks inside `Project` (`addTask`).

**🏋️ Skills demonstrated:**
- Applying **inheritance** to share behavior across classes.
- Leveraging **interfaces** to define reusable contracts (`Playable`, `Shape`, `Completable`).
- Using **abstract classes** for common structure with specialized implementations (`Payment`).
- Demonstrating **polymorphism** with method overriding and collection-based iteration.
- Building small-scale **domain models** (`Project` and `Task`) to simulate real-world scenarios.

**💻 Terminal output:**

```
Ex01Dog: Burek says Woof!
Ex01Cat: Mruczek says Meow!
Ex02Guitar: Guitar is playing!
Ex03Car: This car is moving with 60 km/h
Ex04Circle: Area = 12.566370614359172
Ex04Rectangle: Area = 12.0
Ex05CreditCardPayment: The payment was confirmed and processed using credit card.
Ex05PaypalPayment: The payment was confirmed and processed using Paypal payment.
Ex06Animal list: Meow! Meow! Woof! Woof! Woof! Meow! Meow! 
Ex07Project: Project: Java OOP Project
 - Design class diagrams (2025-08-01) - In progress
 - Implement features (2025-08-10) - Not started
Design class diagrams completed.
Project: Java OOP Project
 - Design class diagrams (2025-08-01) - Completed
 - Implement features (2025-08-10) - Not started
```