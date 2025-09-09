package edu.eci.arsw.springdemo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class GrammarChecker {

    @Autowired
    @Qualifier("spanishChecker")  
    private SpellChecker sc;

    public String check(String text) {
        return "Grammar check result: " + sc.checkSpell(text);
    }
}
