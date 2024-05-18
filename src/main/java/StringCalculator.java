import org.example.SpliterFormatException;

public class StringCalculator {
    public static int add(String sourse) throws SpliterFormatException {
        if (sourse == null || sourse.isEmpty()) {
            return 0;
        }
        String separator = "[,;\\n]";
        String newSourse = sourse;
        if (sourse.indexOf("//")==0) {     //ЕСли строка начинается с двойных слэшей//
            separator = String.valueOf(sourse.charAt(2));
            newSourse = sourse.replace("//"+separator,"").replace("\\n","");
                    }
        if("0123456789".indexOf(separator)>-1) throw new SpliterFormatException("Неверный разделитель" + separator);

        String[] sourseArr = newSourse.split(separator);
        try {
            if (newSourse.length() == 1 && !newSourse.trim().isEmpty()) {
                return Integer.parseInt(sourseArr[0]);
            }
            if (newSourse.length() == 1 && newSourse.trim().isEmpty()) {
                return 0;
            }
            int n = 1000;
            int sum = 0;

            for (String str : sourseArr) {
                if (!str.trim().isEmpty() && Integer.parseInt(str.trim()) <= n)
                    sum += Integer.parseInt(str.trim());
            }
            return sum;
        }
        catch (Exception e) {
            throw new SpliterFormatException(e.getMessage());
        }
    }
}