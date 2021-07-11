package com.github.WayvshockGD.interactions.interfaces.buttons;

import com.github.WayvshockGD.interactions.interfaces.buttons.IButtonComponent;
import net.dv8tion.jda.api.interactions.Interaction;

public interface IButtonOptions {
    Interaction interaction = null;
    String replyContent = null;
    String content = null;
    IButtonComponent components = null;
}