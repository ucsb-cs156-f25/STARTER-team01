// File: ./src/main/java/edu/ucsb/cs156/example/services/jobs/JobContextConsumer.java
package edu.ucsb.cs156.example.services.jobs;

@FunctionalInterface
public interface JobContextConsumer {
  void accept(JobContext c) throws Exception;
}
