# Server to shutdown or restart computer

## How to works
 
Copy shutdown-0.0.1-SNAPSHOT.jar and start-shutdown-app.bat in the same folder. And execute bat file.

```
 java -jar shutdown-0.0.1-SNAPSHOT.jar --server.port=8080 > log.txt
```

To shutdown:

http://localhost:8080/shutdown (default time 30 seconds)

http://localhost:8080/shutdown?time=120 (change time in seconds)

To restart:

http://localhost:8080/restart

http://localhost:8080/restart?time=180
