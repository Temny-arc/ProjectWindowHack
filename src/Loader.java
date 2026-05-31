import Gamemodes.Load.questions;
import Gamemodes.Load.texts;
import com.google.gson.Gson;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Loader {

    public ArrayList<texts> texts;
    public ArrayList<questions> questions;



    public static Loader load(String resourcePath) {
        //TODO nacist data ze souboru do hashmapy data

        //Z urcitych technickych duvodu nacitane pres JSON nefunguje tim ze nevim jak to k****** opravit(neco jsem i zkousel) tak to udelame postaru coz mi pripada spatne az smutne ale je to nutne zlo
        Gson gson = new Gson();

        //Načtení souboru gamedata.json, musí být ve složce res/resources, ta musí být označena jako resource složka projektu
        try (InputStream is = Loader.class.getResourceAsStream(resourcePath)) {

            //Zde ověřujeme, zdali soubor existuje
            if (is == null) {
                throw new IllegalStateException("Nenalezen resource: " + resourcePath +
                        " (zkontrolujte, že soubor je v src/main/resources).");
            }

            //Přečte celý JSON a vytvoří instanci GameData, naplní vlastnosti podle názvů klíčů v JSONU, vrátí se hotová třída GameData
            return gson.fromJson(
                    new InputStreamReader(is, StandardCharsets.UTF_8),
                    Loader.class
            );

        } catch (Exception e) {
            throw new RuntimeException("Chyba při načítání JSON: " + e.getMessage());
        }


    }

    public ArrayList<Gamemodes.Load.texts> getTexts() {
        return texts;
    }

    public void setTexts(ArrayList<Gamemodes.Load.texts> texts) {
        this.texts = texts;
    }

    public ArrayList<Gamemodes.Load.questions> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Gamemodes.Load.questions> questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "Loader{" +
                "texts=" + texts +
                ", questions=" + questions +
                '}';
    }
}
