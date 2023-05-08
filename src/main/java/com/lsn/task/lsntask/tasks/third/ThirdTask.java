package com.lsn.task.lsntask.tasks.third;

import com.google.common.graph.GraphBuilder;
import com.google.common.graph.ImmutableGraph;
import lombok.val;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

public class ThirdTask {

    public static void extractGraph(int node, List<Edge> edgeList) {

        val edges = Optional.ofNullable(edgeList)
                .orElse(List.of());

        val graphBuilder =
                GraphBuilder.directed()
                        .<Integer>immutable()
                        .addNode(node);

        edges.forEach(
                putEdge(graphBuilder));

        val graph = graphBuilder.build();

        Set<Integer> successors = graph.successors(1);


        //    FIXME: use Slf4j instead for printing
        successors.forEach(System.out::println);
    }

    private static Consumer<Edge> putEdge(final ImmutableGraph.Builder<Integer> graph) {
        return edge -> {
            graph.putEdge(edge.x(), edge.y());
        };
    }
}
