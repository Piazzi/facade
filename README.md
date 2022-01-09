<div align="center">
  <h1> FACADE  </h1>
</div>

# Code

Simple project representing the decorator design pattern. For this one i made a Compiler classe that can have multiples front end to compile various languages, then we have a Compiler Facade class to access some funcionalities.

# Resume

A facade is an object that serves as a front-facing interface masking more complex underlying or structural code.

# Definition

A facade is a class that provides a simple interface to a complex subsystem which contains lots of moving parts. A facade might provide limited functionality in comparison to working with the subsystem directly. However, it includes only those features that clients really care about.

Having a facade is handy when you need to integrate your app with a sophisticated library that has dozens of features, but you just need a tiny bit of its functionality.

For instance, an app that uploads short funny videos with cats to social media could potentially use a professional video conversion library. However, all that it really needs is a class with the single method encode(filename, format). After creating such a class and connecting it with the video conversion library, you’ll have your first facade.
![image](https://user-images.githubusercontent.com/40416044/148688666-66d20fe8-c395-42b6-b82a-97694b685444.png)


# What can a Facade do?


- improve the readability and usability of a software library by masking interaction with more complex components behind a single (and often simplified) API
- provide a context-specific interface to more generic functionality (complete with context-specific input validation)
- serve as a launching point for a broader refactor of monolithic or tightly-coupled systems in favor of more loosely-coupled code

Developers often use the facade design pattern when a system is very complex or difficult to understand because the system has many interdependent classes or because its source code is unavailable. This pattern hides the complexities of the larger system and provides a simpler interface to the client. It typically involves a single wrapper class that contains a set of members required by the client. These members access the system on behalf of the facade client and hide the implementation details.

![image](https://user-images.githubusercontent.com/40416044/148688681-816aa850-b4c5-4a1d-9c19-1324dffb0d45.png)


Source: <a href="https://pt.wikipedia.org/wiki/Fa%C3%A7ade"> Wikipedia </a> | <a href="https://refactoring.guru/pt-br/design-patterns/facade"> Refactoring Guru </a>
