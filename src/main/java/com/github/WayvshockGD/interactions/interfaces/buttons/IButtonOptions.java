package com.github.WayvshockGD.interactions.interfaces.buttons;

import com.github.WayvshockGD.interactions.interfaces.buttons.IButtonComponent;
import net.dv8tion.jda.api.interactions.Interaction;

public class IButtonOptions {
    public Interaction interaction;
    public String replyContent;
    public String content;
    public IButtonComponent components;
}