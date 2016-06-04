package com.ocdsoft.bacta.swg.server.game.message.object;

import com.ocdsoft.bacta.engine.utils.BufferUtil;
import com.ocdsoft.bacta.swg.server.game.controller.object.GameControllerMessage;
import com.ocdsoft.bacta.swg.shared.math.Transform;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.nio.ByteBuffer;

/**
 * Created by crush on 5/29/2016.
 */
@Getter
@AllArgsConstructor
@GameControllerMessage(GameControllerMessageType.NET_UPDATE_TRANSFORM_WITH_PARENT)
public final class MessageQueueDataTransformWithParent implements MessageQueueData {
    private final int syncStamp;
    private final int sequenceNumber;
    private final long parentNetworkId;
    private final Transform transform;
    private float speed;
    private float lookAtYaw;
    private boolean useLookAtYaw;

    public MessageQueueDataTransformWithParent(final ByteBuffer buffer) {
        this.syncStamp = buffer.getInt();
        this.sequenceNumber = buffer.getInt();
        this.parentNetworkId = buffer.getLong();
        this.transform = new Transform(buffer);
        this.speed = buffer.getFloat();
        this.lookAtYaw = buffer.getFloat();
        this.useLookAtYaw = BufferUtil.getBoolean(buffer);
    }

    @Override
    public void writeToBuffer(final ByteBuffer buffer) {
        BufferUtil.put(buffer, syncStamp);
        BufferUtil.put(buffer, sequenceNumber);
        BufferUtil.put(buffer, parentNetworkId);
        BufferUtil.put(buffer, transform);
        BufferUtil.put(buffer, speed);
        BufferUtil.put(buffer, lookAtYaw);
        BufferUtil.put(buffer, useLookAtYaw);
    }
}
