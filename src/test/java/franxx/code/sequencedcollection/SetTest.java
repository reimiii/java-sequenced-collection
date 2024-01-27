package franxx.code.sequencedcollection;

import org.junit.jupiter.api.Test;

import java.util.SequencedCollection;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {

    @Test
    void create() {

        SequencedCollection<String> set = new TreeSet<>();
        set.add("Zero");
        set.add("Azz");
        set.add("Bzz");

        assertEquals("Azz", set.getFirst());
        assertEquals("Zero", set.getLast());

        SequencedCollection<String> reversed = set.reversed();

        assertEquals("Zero", reversed.getFirst());
        assertEquals("Azz", reversed.getLast());

        assertEquals("Zero", set.removeLast());
    }
}
