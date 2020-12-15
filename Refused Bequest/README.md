**This smell occurs when a subclass rejects some of the methods or properties offered by its superclass.**  
**Refused Bequest is kind of a code smell. It is based on the LISKOV Substitution Principle because it violates this principle. The contract of the base class is not honored by the derived class, and that forms this code smell.**  
"Sub-classes get to inherit the methods and data of their parents. But, what if they don't want or need what they are given? They are given all these great gifts and pick just a few to play with".  
**There is a child class and it inherits from a base class, but the child class doesn't need all behavior provided by the base class. Other behaviors which are not required to child class are refused. That refused behavior is class refused bequest.**  
