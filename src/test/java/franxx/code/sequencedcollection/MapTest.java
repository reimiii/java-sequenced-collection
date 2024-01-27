package franxx.code.sequencedcollection;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.SequencedMap;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

public class MapTest {

    @Test
    void map() {
        SequencedMap<String, String> map = new TreeMap<>();

        map.put("c", "FranXX");
        map.put("b", "Zero");
        map.put("a", "Two");

        assertEquals("Two", map.firstEntry().getValue());
        assertEquals("FranXX", map.lastEntry().getValue());

        SequencedMap<String, String> reversed = map.reversed();
        assertEquals("FranXX", reversed.firstEntry().getValue());
        assertEquals("Two", reversed.lastEntry().getValue());
    }

    @Test
    void linkedHashMap() {

        SequencedMap<String, String> map = new LinkedHashMap<>();

        map.putLast("a", "one");
        map.putLast("b", "two");
        map.putLast("c", "tree");

        assertEquals("one", map.firstEntry().getValue());
        assertEquals("tree", map.lastEntry().getValue());
    }
}
