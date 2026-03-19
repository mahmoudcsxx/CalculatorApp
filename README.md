# 🧮 Java Calculator (OOP Project)

## 📌 Overview

This is a simple **Java Calculator** built using **Object-Oriented Programming (OOP)** principles.
It supports basic arithmetic operations:

* Addition (+)
* Subtraction (-)
* Multiplication (*)
* Division (/)

---

## 🏗️ Project Structure

```
CalculatorApp/
│
├── src/
│   ├── calculator/
│   │   ├── operations/
│   │   │   ├── Operation.java
│   │   │   ├── Addition.java
│   │   │   ├── Subtraction.java
│   │   │   ├── Multiplication.java
│   │   │   └── Division.java
│   │   │
│   │   ├── service/
│   │   │   └── CalculatorService.java
│   │   │
│   │   └── exception/
│   │       └── InvalidOperationException.java
│
│   └── Main.java
│
└── README.md
```

---

## 🧠 Concepts Used

* ✅ **Encapsulation**
* ✅ **Polymorphism**
* ✅ **Interfaces**
* ✅ **Exception Handling**
* ✅ **Clean Architecture (Layered Design)**

---

## ⚙️ How It Works

1. User enters:

   * First number
   * Operator (+, -, *, /)
   * Second number

2. `CalculatorService` selects the correct operation.

3. The selected class (e.g., `Addition`, `Division`) executes the calculation.

4. Result is returned and printed.

---

## ▶️ How to Run

### 1. Compile

```
javac Main.java
```

### 2. Run

```
java Main
```

---

## 🧪 Example

```
Enter first number: 10
Enter operator (+, -, *, /): *
Enter second number: 5
Result: 50.0
```

---

## ⚠️ Error Handling

* Division by zero → throws error
* Invalid operation → throws error

---

## 🚀 Future Improvements

* GUI (Swing / JavaFX)
* Scientific calculator
* History tracking
* Input validation improvements

---

## 👨‍💻 Author

Mahmoud Moustafa
