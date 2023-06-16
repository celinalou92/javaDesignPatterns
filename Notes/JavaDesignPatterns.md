# What are design patterns

## Solving similar problems in similar ways, introducing standard terminology and best practices

- Gang of Four / ==**reading**==
- Group of four software dev architecture design pattern

### Three types of design patterns

- Creational
- Structural
    - How you structure components and how they interact with each other
- Behavioral
    - How objects behave in code, exchange communication

### Creational Patters

1.  **Singleton Pattern**
    - A single instance that can communicate with resource
        - Single point of access for a resource
        - Uses: Network manager, Database access, Logging, Utility Class(es)
    - Implementation
        - **Eager initialization** – creates singleton component as soon as possible
            -**Static block initialization** – same as above but with static block
            - **Static block** –
                - set of instructions that is run only once a class is loaded into memory (at run time)
                - Runs during all instances of a class / “global set of instructions"
                    ![Screen Shot 2023-06-01 at 9.55.35 AM.png](../_resources/Screen%20Shot%202023-06-01%20at%209.55.35%20AM.png)
        - **Lazy initialization** – same as above but initialization of component when it is require
        - ==Threat safe initialization== – solve memory problems of legacy Java
            \- multi-threading = threads using instance at the same time, some threads will read that the instance is null and create another instance
            \- need to sync threads when create instance
            \- thread safe instance
            `public static SingletonTheadSafe getInstance(String [] args ){ synchronized(SingletonTheadSafe.class){ if(threadSafeInstance == null){ threadSafeInstance = new SingletonTheadSafe(); } } return threadSafeInstance; }`
        - ==Bill Pugh initialization== \- solve memory problems of legacy Java
            - inner class??
2.  **Factory Method**
    1.  Design logic is hidden from the client(or the class) that uses that implementation
		1.  Separation between use and creation
        2.  Creates many subclass types, only one instance required
        3.  Useful for frequent code changes (abstraction
        4.  Client asks the factory to retrieve data
    3.  Implementation
		1.  create interface or abstract class that defines the common functionality 
		2.  create the interface implementations 
		3.  Factory class that instantiates the right implementation 
3.  **Abstract Factory**
	1.  Another layer of abstraction on top of factory method, allows for testability 
	2.  **Data Source Factory** 
		1.  Does not care where the data source is coming from 
		2. Separate Client from Data source knowledge 
![Screen Shot 2023-06-05 at 11.19.03 AM.png](../_resources/Screen%20Shot%202023-06-05%20at%2011.19.03%20AM.png)
4. **Builder**
	1. used when there is multiple parameters 
		1. impractical to use constructors 
	2.  optional parameters
	3.  should be east to read  
	1.  create a class with constructor to initalize paramters, create builder class with getters and setter for all parameters indvidually and create a build method that returns the class being build
5.  **Prototype**

