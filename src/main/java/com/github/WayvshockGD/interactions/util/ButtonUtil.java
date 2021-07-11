package com.github.WayvshockGD.interactions.util;

import com.github.WayvshockGD.interactions.interfaces.buttons.IButtonComponent;
import net.dv8tion.jda.api.entities.Emoji;
import net.dv8tion.jda.api.interactions.Interaction;
import net.dv8tion.jda.api.interactions.components.Button;

public class ButtonUtil {
    public static void create(
            Interaction interaction,
            String replyContent,
            String content,
            IButtonComponent[] components
    ) throws Exception {

        Button buttonComponent;

        var inter = interaction.reply(replyContent);

        for (IButtonComponent component: components) {
            if (component.color == null) throw new Exception("Color for component is null");
            if (component.content == null) throw new Exception("Content for component is null");
            if (component.emote == null) component.emote = "";

            switch (component.color) {
                case "primary"
                        -> buttonComponent = Button.primary(content, Emoji.fromMarkdown(component.content));
                case "danger"
                        -> buttonComponent = Button.danger(content, Emoji.fromMarkdown(component.content));
                case "secondary"
                        -> buttonComponent = Button.secondary(content, Emoji.fromMarkdown(component.content));
                case "success"
                        -> buttonComponent = Button.success(content, Emoji.fromMarkdown(component.content));
                default
                        -> throw new IllegalStateException("Unexpected value: " + component.color);
            }
            inter.addActionRow(buttonComponent).queue();
        }
    }
}
