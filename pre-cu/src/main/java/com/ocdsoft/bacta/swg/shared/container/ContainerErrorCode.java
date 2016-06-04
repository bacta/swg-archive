package com.ocdsoft.bacta.swg.shared.container;

/**
 * Created by crush on 8/26/2014.
 */
public enum ContainerErrorCode {
    SUCCESS(0),
    UNKNOWN(1),
    ADD_SELF(2),
    FULL(3),
    SLOT_OCCUPIED(3),
    NO_SLOT(4),
    INVALID_ARRANGEMENT(5),
    WRONG_TYPE(6),
    NO_PERMISSION(8),
    OUT_OF_RANGE(9),
    NOT_FOUND(10),
    ALREADY_IN(11),
    TOO_LARGE(12),
    HOUSE_ITEM_LIMIT(13),
    TOO_DEEP(14),
    TRY_AGAIN(15),
    UNMOVABLE_TYPE(16),
    UNMOVABLE(17),
    CANT_SEE(18),
    INVENTORY_FULL(19),
    TRADE_EQUIPPED(20),
    HOPPER_NOT_EMPTY(21),
    VIRTUAL_CONTAINER_UNREACHABLE(22),
    VIRTUAL_CONTAINER_USER_UNREACHABLE(23),
    VIRTUAL_CONTAINER_USER_INVALID(24),
    BLOCKED_BY_SCRIPT(25),
    BLOCKED_BY_ITEM_BEING_TRANSFERRED(26),
    BLOCKED_BY_SOURCE_CONTAINER(27),
    BLOCKED_BY_DESTINATION_CONTAINER(28),
    NO_CONTAINER(29),
    SILENT_ERROR(30),
    BIO_LINKED_TO_OTHER_PLAYER(31);

    public final int value;

    ContainerErrorCode(final int value) {
        this.value = value;
    }
}