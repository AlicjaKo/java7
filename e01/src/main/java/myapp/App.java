package myapp;

final class App {
    public static void main(final String[] args) {
        if (args.length == 0) {
            System.out.println("Error: no arguments");
            System.exit(1);
        } 
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<args.length; i++) {
            sb.append(args[i]);
            if (i<args.length-1) {
                sb.append(" ");
            }
        }

        System.out.println(sb);
        System.out.println(StringUtilities.reverseString(sb.toString()));
        System.out.println(StringUtilities.countVowels(sb.toString()));
        System.out.println(StringUtilities.countWords(sb.toString()));
        System.out.println(StringUtilities.characterFrequencyMap(sb.toString()));


    }

}
