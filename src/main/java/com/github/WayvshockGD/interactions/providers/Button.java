package com.github.WayvshockGD.interactions.providers;

import com.github.WayvshockGD.interactions.interfaces.buttons.IButtonOptions;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.interactions.Interaction;

public class Button {

    public final IButtonOptions interaction;

    public final Message message;

    public Button(IButtonOptions interaction, Message message) {
        this.interaction = interaction;
        this.message = message;
    }

    public void build() {}
}
