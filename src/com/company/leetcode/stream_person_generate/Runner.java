package com.company.leetcode.stream_person_generate;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 08.07.2023.
 */
public class Runner {
    public static void main(String[] args) {
        // TODO: 01.02.2022 Test for stream api with Person class.
        List<Person> personList = IntStream.range(0, 20)
                .mapToObj(i -> new Person(UUID.randomUUID(), "Name" + i, "Surname" + i, i))
                .collect(Collectors.toList());

        personList.forEach(System.out::println);

        // TODO: 01.02.2022 Generate Persons from stream
        Stream<Person> generate = Stream.generate(() -> new Person(UUID.randomUUID(), null, null, 0));
        generate.forEach(System.out::println);
    }
}
