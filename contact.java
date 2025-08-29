import java.util.*;

public class PhoneMnemonics {
    static ArrayList<String> dictionary = new ArrayList<String>();

    /* List all the phone mnemonics for the given digit sequence.
     * @param input a digit sequence, like "23432" */
    public static ArrayList<String> listMnemonics(String input)
    {
        ArrayList<String> list = new ArrayList<String>();
        String[] dic = { "A", "B", "C", "D", "E", "F", "G", 
                        "H", "I", "J", "K", "L", "M", "N",
                        "O", "P", "Q", "R", "S", "T", "U", 
                         "V", "W", "X", "Y", "Z", "MAD",
                         "OCD", "PAN", "PCM", "PCO", "RAM", "SAM", "BE" };
        for (String i : dic)
            dictionary.add(i);
        listMnemonics("", input, list);
        return list;
    }