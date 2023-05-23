# Advanced Multithreading

## Semaphore
In resource class , I created a 2 permit count semaphore.I used 
semaphore.acquire() to acquire a permit in try section and semaphore.release() to release a permit in finally section.