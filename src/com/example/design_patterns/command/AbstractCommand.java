package com.example.design_patterns.command;

/**
 * Created by esuarezv on 21/04/2017.
 */
public abstract class AbstractCommand implements Command {
    private TextEditor textEditor;

    public AbstractCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    public TextEditor getTextEditor() {
        return textEditor;
    }
}
