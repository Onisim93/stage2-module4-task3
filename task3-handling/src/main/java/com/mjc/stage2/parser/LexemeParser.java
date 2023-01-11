package com.mjc.stage2.parser;

import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;
import com.mjc.stage2.entity.TextComponent;
import com.mjc.stage2.entity.TextComponentType;

public class LexemeParser extends AbstractTextParser{
    private static final String LEXEME_REGEX = "\\s+";
    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        String[] lexemes = string.split(LEXEME_REGEX);

        for (String s : lexemes) {
            TextComponent textComponent = new TextComponent(TextComponentType.SENTENCE);
            nextParser.parse(textComponent, s);
            abstractTextComponent.add(textComponent);
        }
    }

}
