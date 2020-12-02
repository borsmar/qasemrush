import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * функция, которая на вход принимает строку, а на выходе выдаёт массив всех повторяющихся символов
 */
public class RepeatedChars {
    public char[] getRepeatedChars(String string) throws WrongInputException {

        StringBuilder output = new StringBuilder();
        List<Character> list = new ArrayList<>();

        for (int i = 0; i < string.length(); i++) {
            list.add(string.charAt(i));
        }


        if (list.size() <= 1) {
            throw new WrongInputException("size of string is 1 or less");
        }

        Collections.sort(list);

        for (int i = 0; i < list.size() - 1; i++) {
            if (i > 0) {
                if (list.get(i) == list.get(i + 1) && list.get(i) != list.get(i - 1)) {
                    output.append(list.get(i));
                }
            } else {
                if (list.get(i) == list.get(i + 1)) {
                    output.append(list.get(i));
                }
            }
        }

        if(output.length() == 0){
            throw new WrongInputException("there are no repeating chars in given string");
        }

        return output.toString().toCharArray();
    }
}
