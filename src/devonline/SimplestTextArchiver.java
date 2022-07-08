package devonline;

public class SimplestTextArchiver {
    public static void main(String[] args) {
        String var10000 = "A".repeat(1);
        String source = var10000 + "B".repeat(1) + "C".repeat(60);
        System.out.println("Source text:   " + source);
        String symbolsList = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
        String zipped = zip(source, symbolsList);
        System.out.println("Zipped text:   " + zipped);
        String unzipped = unzip(zipped, symbolsList);
        System.out.println("Unzipped text: " + unzipped);
    }

    private static String zip(String source, String symbolsList) {
        StringBuilder stringResult = new StringBuilder();
        int count = 1;

        for(int i = 0; i < source.length() - 1; ++i) {
            if (source.charAt(i) == source.charAt(i + 1)) {
                ++count;
            } else {
                while(count - symbolsList.length() > 0) {
                    stringResult.append(source.charAt(i));
                    stringResult.append(symbolsList.charAt(symbolsList.length() - 1));
                    count -= symbolsList.length();
                }

                stringResult.append(source.charAt(i));
                stringResult.append(symbolsList.charAt(count - 1));
                count = 1;
            }
        }

        stringResult.append(source.charAt(source.length() - 1));
        stringResult.append(symbolsList.charAt(count - 1));
        return stringResult.toString();
    }

    private static String unzip(String zipped, String symbolsList) {
        String temp = "";
        StringBuilder stringResult = new StringBuilder();

        for(int i = 0; i < zipped.length(); i += 2) {
            temp = String.valueOf(zipped.charAt(i)).repeat(symbolsList.indexOf(zipped.charAt(i + 1)) + 1);
            stringResult.append(temp);
            temp = "";
        }

        return stringResult.toString();
    }
}
