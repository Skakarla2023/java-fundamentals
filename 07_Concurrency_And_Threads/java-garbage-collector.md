# Garbage Collector (GC) in Java

- Garbage Collection is the automatic process by which Java finds and removes unused objects from memory so that memory can be reused.
- GC frees memory by deleting objects that are no longer needed.


### Why do we need Garbage Collection?

- When a Java program runs:
  - Objects are created using new
  - These objects occupy memory in the Heap
- Over time:
  - Some objects are no longer used
  - If memory is not freed:
    - Program becomes slow
    - Memory overflow occurs

GC solves this problem automatically, so the programmer does not need to manually free memory.



> An object becomes garbage when it is not reachable by any active reference

> GC deletes only unreachable objects, not unused variables.


### How does Garbage Collector work? (Step-by-step)

**1️⃣ Object creation**

  - Objects are created in Heap memory

**2️⃣ Reachability check**

  - GC starts from GC Roots (like local variables, static variables, active threads)
  - If an object can be reached → alive
  - If not reachable → garbage

**3️⃣ Memory cleanup**

  - Unreachable objects are removed
  - Memory is reclaimed and reused


### Important Points

- GC is automatic.
- It removes only unreachable objects.
- It is a daemon thread that runs in the background and supports user threads.
