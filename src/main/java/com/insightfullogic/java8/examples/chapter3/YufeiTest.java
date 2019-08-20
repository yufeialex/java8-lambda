package com.insightfullogic.java8.examples.chapter3;

import com.insightfullogic.java8.examples.chapter1.Track;

import java.io.Serializable;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import static java.util.Arrays.asList;

public class YufeiTest {
    public static void main(String[] args) {
        // BEGIN streamsMaxLength
        List<Track> tracks = asList(new Track("Bakai", 524),
                new Track("Violets for Your Furs", 378),
                new Track("Time Was", 451));

        Track shortestTrack = tracks.stream()
                /*.min(new Comparator<Track>(){

                    @Override
                    public int compare(Track o1, Track o2) {
                        if(o1.getLength()>o2.getLength())
                            return 1;
                        else
                            return 0;
                    }
                })*/
//                .min((Comparator<Track>) (o1, o2) -> {
//                    if(o1.getLength()>o2.getLength())
//                        return 1;
//                    else
//                        return 0;
//                })
                .min(Comparator.comparing(track -> track.getLength()))
                .get();
        Integer integer = 10;
        HashMap<Object, Object> aa = new HashMap<>();
        aa.put("aa", integer);
        Integer bb = (Integer & Serializable) aa.get("aa");
        System.out.println(bb);
    }
}
