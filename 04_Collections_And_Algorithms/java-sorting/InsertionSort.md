# Insertion Sort

Insertion sort is a simple, step-by-step sorting method that works the way people usually sort playing cards in their hands.

### Core idea (in very simple words)

- You take one element at a time
- Compare it with the elements before it
- Insert it into its correct position in the already sorted part

#### At any point:

- Left side → sorted
- Right side → unsorted

#### Everyday analogy

- Imagine you are holding cards:
  1. You start with one card → already sorted
  2. Pick the next card
  3. Move it left until it fits in the correct place
  4. Repeat for all cards

That is exactly how insertion sort works.


#### Step-by-step example

Array:
``` csharp
[5, 3, 4, 1]
```

1. First element is taken as sorted:
```csharp
[5 | 3, 4, 1]
```
2. Take 3 and insert it in the correct place:
```csharp
[3, 5 | 4, 1]
```
3. Take 4 and insert:
```csharp
[3, 4, 5 | 1]
```
4. Take 1 and insert:
```csharp
[1, 3, 4, 5]
```
