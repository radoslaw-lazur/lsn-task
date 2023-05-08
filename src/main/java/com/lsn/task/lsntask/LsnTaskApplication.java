package com.lsn.task.lsntask;

import com.lsn.task.lsntask.tasks.first.FirstTask;
import com.lsn.task.lsntask.tasks.second.SecondTask;
import com.lsn.task.lsntask.tasks.third.Edge;
import com.lsn.task.lsntask.tasks.third.ThirdTask;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class LsnTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(LsnTaskApplication.class, args);

        System.out.println("Task 1:");

        // FIXME: Write some unit tests instead of raw usage
        FirstTask.executeFirstTask(List.of(1, 10, 20, 20, 2, 5));

        System.out.println("Task 2:");

        // FIXME: Write some unit tests instead of raw usage
        SecondTask.findPairs(List.of(1, 2, 10, 7, 5, 3, 6, 6, 13, 0), 13);

        System.out.println("Task 3:");

        var edges = List.of(
                new Edge(1, 2),
                new Edge(2, 3),
                new Edge(4, 5)
        );

        // FIXME: Write some unit tests instead of raw usage
        ThirdTask.extractGraph(1, edges);

    }

}
