package com.github.WayvshockGD.interactions.providers;

import com.github.WayvshockGD.interactions.interfaces.buttons.IButtonComponent;
import com.github.WayvshockGD.interactions.util.ButtonUtil;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.interactions.Interaction;

import java.util.ArrayList;
import java.util.List;

public class Button {

    public final IButtonComponent interaction;

    public final Message message;

    public final Interaction interactions;

    public Button(
            IButtonComponent interaction,
            Interaction interactions,
            Message message
    ) {
        this.interaction = interaction;
        this.message = message;
        this.interactions = interactions;
    }

    public void build() throws Exception {
        List<IButtonComponent> messageInteractions = new ArrayList<>();
        messageInteractions.add(this.interaction);
        IButtonComponent[] buttonArray = messageInteractions.toArray(new IButtonComponent[0]);

        var rContent = this.interaction.replyContent;
        var content = this.interaction.content;

        ButtonUtil.create(
                this.interactions,
                rContent,
                content,
                buttonArray
        );
    }
}
