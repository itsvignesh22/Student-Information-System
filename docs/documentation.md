# Student Management System – Documentation

## 1. Introduction
The Student Management System is a console-based Java application.
It is designed to manage student records such as adding, viewing,
searching, and updating student information.

---

## 2. Objective
The main objective of this project is to demonstrate:
- Object-Oriented Programming concepts
- Use of classes and objects
- Input validation
- Menu-driven program design in Java

---

## 3. System Overview
The system works through a menu displayed on the console.
The user selects an option, and the system performs the required task.

Main operations:
- Add student
- View all students
- Search student by ID
- Update student details
- Exit the program

---

## 4. Project Structure
- Student.java  
  Represents a student entity.  
  Stores student details like ID, name, age, and grade.

- StudentManager.java  
  Handles student-related operations such as add, search, update, and display.

- StudentInformationSystem.java  
  Contains the main() method.  
  Controls program flow and menu handling.

- ValidationUtils.java  
  Performs input validation for age and grade.

---

## 5. Input Validation
The system validates:
- Age should be within a valid range
- Grade should not be empty or invalid

This ensures data correctness.

---

## 6. Technologies Used
- Java (JDK 8 or above)
- Scanner class for user input
- Object-Oriented Programming principles

---

## 7. How the Program Runs
1. The program starts from StudentInformationSystem
2. A menu is displayed to the user
3. User selects an option
4. Required operation is performed
5. Program continues until user chooses Exit

---

## 8. Conclusion
This project helps in understanding how a real-world management system
can be implemented using Java and OOP concepts in a simple manner.