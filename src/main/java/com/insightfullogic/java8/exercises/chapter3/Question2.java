package com.insightfullogic.java8.exercises.chapter3;

import com.insightfullogic.java8.examples.chapter1.Artist;

import java.util.List;

public class Question2 {
    // Q3
    public static int countBandMembersInternal(List<Artist> artists) {
        return (int) artists.stream().flatMap(Artist::getMembers).count();
//        return (int)artists.stream().flatMap(artist -> artist.getMembers()).count();
//        return (int)artists.stream()
//                .mapToLong(value -> value.getMembers().count())
//                .sum();
//        return artists.stream()
//                .map(artist -> artist.getMembers().count())
//                .reduce(0L, Long::sum)
//                .intValue();
    }
}
