package franxx.code.sequencedcollection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.SequencedCollection;

import static org.junit.jupiter.api.Assertions.*;

public class CollectionTest {

    @Test
    void collection() {

        SequencedCollection<String> collection = new ArrayList<>();
        collection.addLast("Muharrom");
        collection.addFirst("Akbar");
        collection.addFirst("Hilmi");

        assertEquals(List.of("Hilmi", "Akbar", "Muharrom"), collection);

        assertEquals("Hilmi", collection.getFirst());
        assertEquals("Muharrom", collection.getLast());

        assertEquals(List.of("Muharrom", "Akbar", "Hilmi"), collection.reversed());

        assertEquals("Hilmi", collection.removeFirst());
        assertEquals("Akbar", collection.getFirst());

        assertEquals("Muharrom", collection.removeLast());
        assertEquals("Akbar", collection.getLast());
    }
}
