**A class should have one and only one reason to change, meaning that a class should have only one responsibility.**  
Every module or class should have responsibility over a single part of the functionality provided by the software, and that responsibility should be entirely encapsulated by the class.  

In Single Responsibility Principle
* **Each class and module should focus on a single task at a time.**    
* **Everything in the class should be related to that single purpose. It does not mean that your classes should only contain one method or property.**  
* **There can be many members in the class as long as they related to the single responsibility.**  
* **With SRP, classes become smaller and cleaner**  
* **Code is less fragile.**   

### Example:  
Suppose you are asked to implement a UserSetting service where in the user can change the settings but before that the user has to be authenticated.  
**[Here is this Example Code](https://github.com/Durjoy001/Design-Pattern/blob/main/SOLID%20Design%20Principles/Single%20Responsibility%20Principle/SRP%20Example%20Code1.java)**  
