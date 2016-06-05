package com.ocdsoft.bacta.swg.server.game.player.creation;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.ocdsoft.bacta.swg.shared.datatable.DataTable;
import com.ocdsoft.bacta.swg.shared.datatable.DataTableManager;
import com.ocdsoft.bacta.tre.TreeFile;
import gnu.trove.map.TObjectIntMap;
import gnu.trove.map.hash.TObjectIntHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by crush on 3/30/14.
 */
@Singleton
public final class AllowBaldService {
    private static final Logger LOGGER = LoggerFactory.getLogger(AllowBaldService.class);
    private static final String DATATABLE_NAME = "datatables/customization/allow_bald.iff";

    private final TObjectIntMap<String> allowBald = new TObjectIntHashMap<>();

    @Inject
    public AllowBaldService(final DataTableManager dataTableManager) {
        LOGGER.trace("Loading allow bald player template settings.");

        final DataTable dataTable = dataTableManager.getTable(DATATABLE_NAME, true);

        if (dataTable == null) {
            LOGGER.error("Could not open data table {}", DATATABLE_NAME);
        } else {
            for (int row = 0; row < dataTable.getNumRows(); ++row) {
                allowBald.put(
                        dataTable.getStringValue("SPECIES_GENDER", row), //Key
                        dataTable.getIntValue("ALLOW_BALD", row));   //Value
            }

            LOGGER.debug(String.format("Loaded %d allow bald player template settings.", allowBald.size()));
        }

        dataTableManager.close(DATATABLE_NAME);
    }

    /**
     * Can a specified player template be bald or not. Takes a speciesGender string. i.e. moncal_female.
     *
     * @param speciesGender The species gender string. i.e. moncal_female.
     * @return Returns true if they are allowed to be bald, otherwise false.
     */
    public boolean isAllowedBald(final String speciesGender) {
        return allowBald.containsKey(speciesGender) &&
                allowBald.get(speciesGender) == 1;
    }
}
