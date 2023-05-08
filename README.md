# Lsn tasks

### First Task
There is a simple static method (executeFirstTask()) used for solving the problem. There is a need to pass int arguments as list cohesion. 
Reference: com.lsn.task.lsntask.tasks.first.FirstTask
There is a simple way for printing to console used. There is a FIXME to update it to use some logs.

### Second Task
There is a simple static method (finPairs()) used for solving the problem. There is a need to pass int arguments as list cohesion, and the int to match equality.
Reference: com.lsn.task.lsntask.tasks.second.SecondTask.findPairs
There is a simple way for printing to console used. There is a FIXME to update it to use some logs.
The tasks use another class Pair.class to help store pairs as composition in SecondTask.class. 
There was a way of doing it in the first place to overrite equals and hascode contract to not allow to add mirrored pairs. 
I did not want to use this because it is not preferred to override custom implementation of equals and hashcode rather than generation.

### Third Task
There is a simple static method (extractGraph()) used for solving the problem. There is a need to pass int arguments as list cohesion, and the number of nodes.
Reference: com.lsn.task.lsntask.tasks.third.ThirdTask.extractGraph
There is a way to use Guava library from google. Unfortunatelly, I am  not very familiar with the problem as I studied Electrical Engineering :) 

## The tasks run can be access from main class. Nex iteration would be to check implementation with unit tests