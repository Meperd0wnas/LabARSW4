package edu.eci.arsw.blueprints.test.persistence.impl;

import edu.eci.arsw.blueprints.model.Blueprint;
import edu.eci.arsw.blueprints.model.Point;
import edu.eci.arsw.blueprints.persistence.impl.RedundancyFilter;
import edu.eci.arsw.blueprints.persistence.impl.SubsamplingFilter;

import org.junit.Test;

import static org.junit.Assert.*;

public class BlueprintFilterTest {

    @Test
    public void testRedundancyFilter() {
        Point[] pts = new Point[]{
                new Point(0, 0),
                new Point(0, 0), // repetido
                new Point(10, 10),
                new Point(10, 10), // repetido
                new Point(20, 20)
        };
        Blueprint bp = new Blueprint("ana", "redundant", pts);

        RedundancyFilter filter = new RedundancyFilter();
        Blueprint filtered = filter.applyFilter(bp);

        // Deben quedar solo 3 puntos (0,0), (10,10), (20,20)
        assertEquals(3, filtered.getPoints().size());
    }

    @Test
    public void testSubsamplingFilter() {
        Point[] pts = new Point[]{
                new Point(0, 0),
                new Point(1, 1),
                new Point(2, 2),
                new Point(3, 3),
                new Point(4, 4)
        };
        Blueprint bp = new Blueprint("ana", "subsample", pts);

        SubsamplingFilter filter = new SubsamplingFilter();
        Blueprint filtered = filter.applyFilter(bp);

        // Deben quedar solo los puntos en posiciones pares: (0,0), (2,2), (4,4)
        assertEquals(3, filtered.getPoints().size());
        assertTrue(filtered.getPoints().contains(new Point(0,0)));
        assertTrue(filtered.getPoints().contains(new Point(2,2)));
        assertTrue(filtered.getPoints().contains(new Point(4,4)));
    }
}
