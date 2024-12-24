import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Pattern;

public class Set5_10 {
    public static Set<Character> SetT(String filePath) throws IOException {
        Set<Character> uniqueChars = new LinkedHashSet<>();
        Map<Character, Set<String>> charToWords = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            Pattern pattern = Pattern.compile("\\b\\p{L}+\\b"); // Регулярка для слов, включая русские буквы
            while ((line = reader.readLine()) != null) {
                String[] words = pattern.matcher(line).results()
                        .map(matchResult -> matchResult.group().toLowerCase())
                        .toArray(String[]::new);


                for (String i : words) {
                    for (char c : i.toCharArray()) {
                        charToWords.computeIfAbsent(c, k -> new HashSet<>()).add(i);
                    }
                }
            }
        }
        for(Map.Entry<Character, Set<String>> entry: charToWords.entrySet()){
            if(entry.getValue().size() == 1){
                uniqueChars.add(entry.getKey());
            }
        }
        return uniqueChars;
    }
}
