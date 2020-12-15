**This smell occurs when a subclass rejects some of the methods or properties offered by its superclass.**  
**Refused Bequest is kind of a code smell. It is based on the LISKOV Substitution Principle because it violates this principle. The contract of the base class is not honored by the derived class, and that forms this code smell.**  
"Sub-classes get to inherit the methods and data of their parents. But, what if they don't want or need what they are given? They are given all these great gifts and pick just a few to play with".  
**There is a child class and it inherits from a base class, but the child class doesn't need all behavior provided by the base class. Other behaviors which are not required to child class are refused. That refused behavior is class refused bequest.**    

**Refused bequest code smell can be solved by using two methods.**  
* Push down method and push down field.    
* Replace Inheritance with Delegation.     

**Push Down Method and Push Down Field.**   
It is a common way to solve the issue of Refused Bequest.Remove the method or property from Base class and move it to that subclass where it fits.
Find all places where the method is used and verify that it’s called from the necessary subclass.    

**[Here in example code](https://github.com/Durjoy001/Design-Pattern/blob/main/Refused%20Bequest/Code%20with%20Refused%20Bequest.java) car and palne class extends vehicle class but subclass plane does have nothing in common with the superclass vehicle, superclass and subclass are completely different. And plane class does not need the drive method of the vehicle class.It rejects drive methods offered by its superclass.**

**UML diagram of this problem:**  

![Here is UML diagram of this problem:](https://github.com/Durjoy001/Design-Pattern/blob/main/Refused%20Bequest/Refused%20Bequest.png)

**[Here we solve the problem](https://github.com/Durjoy001/Design-Pattern/blob/main/Refused%20Bequest/Code%20solving%20the%20problem%20of%20Refused%20Bequest.java)
by using push down method.Remove the method or property from Base class and move it to that subclass where it fits.**  
