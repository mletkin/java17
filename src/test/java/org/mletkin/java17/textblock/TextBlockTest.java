package org.mletkin.java17.textblock;

import org.junit.jupiter.api.Test;

class TextBlockTest {

    @Test
    void oldStyle() {
        String text = "{\n" + //
                "  \"name\": \"Alfred Döblin\",\n" + //
                "  \"alter\": 79,\n" + //
                "  \"ort\": \"Berlin Alexanderplatz\"\n" + //
                "}";
        System.out.println(text);
    }

    @Test
    void newStyleNoIndentation() {
        String text = """
                                {
                                  name: Alfred Döblin,
                                  alter: 79,
                                  ort: Berlin Alexanderplatz
                                }
                                """;
        System.out.println(text);
    }

    @Test
    void newStyleNoIndentationTwo() {
        String text = """
                {
                  name: Alfred Döblin,
                  alter: 79,
                  ort: Berlin Alexanderplatz
                }""";

        System.out.println(text);
    }

    @Test
    void newStyleIndentTwoBlancs() {
        String text = """
                  {
                    name: Alfred Döblin,
                    alter: 79,
                    ort: Berlin Alexanderplatz
                  }
                """;
        System.out.println(text.trim());
    }
}
