package com.example.design_patterns.command;

/**
 * Created by esuarezv on 21/04/2017.
 */
public class Client {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        textEditor.setText("asdf");
        textEditor.action(new ClearTextCommand(textEditor));
        System.out.println("Text: " + textEditor.getText());
        textEditor.undo();
        System.out.println("Text: " + textEditor.getText());

        textEditor.action(new AddTextCommand(textEditor, " text 1"));
        textEditor.undo();
        textEditor.action(new AddTextCommand(textEditor, " text 2"));
        //textEditor.undo();
        System.out.println("Text: " + textEditor.getText());
    }
}
