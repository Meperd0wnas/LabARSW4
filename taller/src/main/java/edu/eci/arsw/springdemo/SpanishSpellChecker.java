package edu.eci.arsw.springdemo;


import org.springframework.stereotype.Service;

@Service("spanishChecker")  // Registramos este bean con el nombre "spanishChecker"
public class SpanishSpellChecker implements SpellChecker {

    @Override
    public String checkSpell(String text) {
        return "Revisado con reglas en español: " + text;
    }
}
