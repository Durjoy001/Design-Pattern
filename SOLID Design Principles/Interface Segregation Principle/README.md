**The interface-segregation principle (ISP) states that "no client should be forced to depend on methods it does not use".**  
This means, instead of one fat interface many small interfaces are preferred based on groups of methods with each one serving one sub-module. 

**Example:**  
Below is an example of an interface representing two different roles. One is the role of handling connections like opening and closing, and the other is sending and receiving data.After we applied ISP, we ended up with two different interfaces, with each one representing one exact role.  
**:boom: [Example code](https://github.com/Durjoy001/Design-Pattern/blob/main/SOLID%20Design%20Principles/Interface%20Segregation%20Principle/ISP%20Example%20Code.java)**  
