package org.example;

import java.util.Collections;
import java.util.List;

public class StreamServis {
    public static void StreamSort(List<Stream> streamList) {
        Collections.sort(streamList, new StreamComporator());
    }

}
