public class ConvertToTitleCase_5 {
    public static String toTitleCase(String input) {
//            if (input == null || input.trim().isEmpty()) {
//                return input;
//            }
            // Convert input to lowercase and split by whitespace
            String[] words = input.toLowerCase().split("\\s+");
            StringBuilder titleCase = new StringBuilder();

            for (String word : words) {
                if (!word.isEmpty()) {
                    // Capitalize the first letter and append the rest of the word
                    titleCase.append(Character.toUpperCase(word.charAt(0)))
                            .append(word.substring(1))
                            .append(" ");
                }
            }
            // Remove the trailing space added in the loop
            return titleCase.toString().trim();
        }
        public static void main(String[] args) {
            String input = "hello world";
            String result = toTitleCase(input);

            System.out.println("Input: " + input);
            System.out.println("Output: " + result);

        }
    }
