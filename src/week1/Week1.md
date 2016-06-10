
## Parallel Programming - Week 1
### Basics of parallel computingg and parallel program analysis


#### Concurrent vs Parallel
 - Concurrent for : Webservices, Databases, tc. Approach: Convenience
 - Parallel : Matrix multiplication, Graph rendering, etc. Approach: SpeedUp


#### Notes

 - types of parallelism : bit level, instruction level, task level
 - Each process is isolated - can process can contain multiple independent -> threads (they share same memory address space)
 - each thread has a program counter and a program stack
 - each jvm start *main thread*
 - can be overlaped, arbitrarily
 - pay attention on atomicity 
 - synchronized is never executed by two threads at the same time (e.g : uid, singleton, etc )
 
 - two threads writing to separate locations in memory , dont need synchronization
 - a thread X that calls join on another thread Y is *guaranteed* to observe all the writes by thead Y after join returns.
 
 - recusivity for solvement parallel tasks
 

#### To read

- Vector instructions in Intel and ARM processors
