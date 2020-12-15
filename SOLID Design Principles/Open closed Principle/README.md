**Open closed principle states that "software entities such as classes, modules, functions, etc. should be open for extension, but closed for modification."**    
Any new functionality should be implemented by adding new classes, attributes and methods, instead of changing the current ones or existing ones.  

**Implementation guidelines**
* The simplest way to apply OCP is to implement the new functionality on new derived (sub) classes that inherit the original class implementation.  
* Another way is to allow client to access the original class with an abstract interface.  
* So, at any given point of time when there is a requirement change instead of touching the existing functionality it’s always suggested to create new classes and leave the original implementation untouched.  

If we do not follow Open closed principle during a requirement enhancement in the development process. In that case, we end up with the following disadvantages:  
* If a class or a function always allows the addition of new logic, as a developer we end up testing the entire functionality along with the requirement.  
* Also, as a developer we need to ensure to communicate the scope of the changes to the Quality Assurance team in advance so that they can gear up for enhanced regression testing along with the feature testing.   
* Step 2 above is a costly process to adapt for any organization.  
* Not following the Open Closed Principle breaks the SRP since the class or function might end up doing multiple tasks.  
* Also, if the changes are implemented on the same class, Maintenance of the class becomes difficult since the code of the class increases by thousands of unorganised lines.   

**Example:**  
**[We need to calculate areas of various shapes.](https://github.com/Durjoy001/Design-Pattern/blob/main/SOLID%20Design%20Principles/Open%20closed%20Principle/OCP%20Example%20Code1.java)**  
**[We need to calculate value of Vehicle.](https://github.com/Durjoy001/Design-Pattern/blob/main/SOLID%20Design%20Principles/Open%20closed%20Principle/OCP%20Example%20Code2.java)**  
