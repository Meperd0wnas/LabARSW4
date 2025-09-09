package edu.eci.arsw.springdemo;

import org.springframework.stereotype.Service;


@Service("englishChecker")  // Registramos este bean con el nombre "englishChecker"
public class EnglishSpellChecker implements SpellChecker {

    @Override
    public String checkSpell(String text) {
        return "Checked with English rules: " + text;
    }
}
