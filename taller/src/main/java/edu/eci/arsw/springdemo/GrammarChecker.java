package edu.eci.arsw.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class GrammarChecker {

    @Autowired
    @Qualifier("englishChecker")  
    private SpellChecker sc;

    public String check(String text){
        StringBuilder sb = new StringBuilder();
        sb.append("Spell checking output: ").append(sc.checkSpell(text));
        sb.append("\nPlagiarism checking output: Not available yet");
        return sb.toString();
    }
}
