package com.ocdsoft.bacta.swg.server.game.controller.object.command;

import com.google.inject.Inject;
import com.ocdsoft.bacta.engine.utils.StringUtil;
import com.ocdsoft.bacta.soe.connection.SoeUdpConnection;
import com.ocdsoft.bacta.swg.server.game.chat.GameChatService;
import com.ocdsoft.bacta.swg.server.game.controller.object.CommandQueueController;
import com.ocdsoft.bacta.swg.server.game.controller.object.QueuesCommand;
import com.ocdsoft.bacta.swg.server.game.object.ServerObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Handles the /addfriend [name] command.
 */
@QueuesCommand("addFriend")
public final class AddFriendCommandController implements CommandQueueController {
    private static Logger LOGGER = LoggerFactory.getLogger(AddFriendCommandController.class);

    private final GameChatService chatService;

    @Inject
    public AddFriendCommandController(final GameChatService chatService) {
        this.chatService = chatService;
    }

    @Override
    public void handleCommand(final SoeUdpConnection connection, final ServerObject actor, final ServerObject target, final String params) {
        final String firstName = StringUtil.getFirstWord(params);
        chatService.addFriend(chatService.constructChatAvatarId(actor).getFullName(), firstName);
    }
}