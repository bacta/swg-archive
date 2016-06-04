package com.ocdsoft.bacta.swg.shared.container;

import com.ocdsoft.bacta.swg.shared.object.GameObject;
import com.ocdsoft.bacta.swg.shared.property.Property;
import lombok.Setter;

/**
 * Created by crush on 4/22/2016.
 */
public class VolumeContainmentProperty extends Property {
    public static int getClassPropertyId() {
        return 0x8701647C;
    }

    @Setter
    private int volume;

    public VolumeContainmentProperty(final GameObject owner, final int volume) {
        super(getClassPropertyId(), owner);

        this.volume = volume;
    }

    public int getVolume() {
        int returnValue = volume;

        final VolumeContainer container = getOwner().getVolumeContainerProperty();

        if (container != null)
            returnValue += container.getCurrentVolume();

        return returnValue;
    }

}
