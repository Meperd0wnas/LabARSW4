package edu.eci.arsw.blueprints.config;

import edu.eci.arsw.blueprints.model.Blueprint;

public interface BlueprintFilter {
    Blueprint applyFilter(Blueprint bp);
}
