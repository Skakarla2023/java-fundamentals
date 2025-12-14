# Daemon Threads

- A daemon thread is a background helper thread that runs to support other threads (mainly user threads). It does not perform core application work; instead, it provides services in the background.

### What exactly is a daemon thread?

- A daemon thread runs in the background
- It exists only to support user threads
- The JVM does not wait for daemon threads to finish
- When all user (non-daemon) threads finish, the JVM terminates, even if daemon threads are still running

### Important Points

- Daemon threads run in the background.
- They should not be used for main tasks as they are stopped automatically.
- To use Daemon threads in our code, we should use setDaemon(true) before start.
- These should be used for support tasks only.

> Daemon threads are background service threads that die automatically when all user threads finish.


