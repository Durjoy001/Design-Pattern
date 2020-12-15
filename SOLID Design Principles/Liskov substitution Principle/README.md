**It states that, in a computer program, if S is a Subtype of T, then objects of type T may be replaced with objects of type S. Which means inheritance hierarchies such that derived classes must be completely substitutable for their base classes.**  

**Implementation guidelines:** In the process of development we should ensure that   
* No new exceptions can be thrown by the subtype unless they are part of the existing exception hierarchy.  
* We should also ensure that Clients should not know which specific subtype they are calling, nor should they need to know that. The client should behave the same regardless of the subtype instance that it is given.   
* And last but not the least, New derived classes just extend without replacing the functionality of old classes.  
