package devonline;

import java.util.Arrays;


    public class VerifierForGitCommitMessages {
        public VerifierForGitCommitMessages() {
        }

        public static void main(String[] args) {
            String[] VERBS = new String[]{"Summarize", " Merge", "Fix", "Remove", "Implement", "Update", "Change", "Use", "Set", "Refactor", "Move", "Hide", "Allow", "Extract", "Test", "Disable", "Install", "Rename", "Upgrade", "Expose", "Tweak", "Run", "Rewrite", "Replace", "Display", "Validate", "Restrict", "Improve", "Ignore", "Hotfix", "Create", "Configure", "Translate", "Silence", "Show", "Reorder", "Override", "Wrap", "Try", "Sync", "Revert", "Resolve", "Report", "Relax", "Prevent", "Normalize", "Apply", "Assign", "Add"};
            String commitMessage = "Add new Scanner(System.in).nextLine();";
            validateGitCommitMessage(commitMessage, VERBS);
        }

        private static void validateGitCommitMessage(String commitMessage, String[] VERBS) {
            if (commitMessage.length() < 50) {
                validCommitNotEmpty(commitMessage);
                validSubjectFirstLowerCase(commitMessage);
                validFirstVerb(commitMessage, VERBS);
                validCommitSubjectLastSymbol(commitMessage);
            } else {
                validSubjectFirstLowerCase(commitMessage);
                validFirstVerb(commitMessage, VERBS);
                validCommitSubjectLineSeparator(commitMessage);
                String commitSubject = ExtractCommitSubject(commitMessage);
                validCommitSubjectLastSymbol(commitSubject);
                String commitBody = ExtractCommitBody(commitMessage);
                validBody(commitBody);
            }

            System.out.println("Message is valid!");
        }

        private static void validCommitNotEmpty(String commitMessage) {
            if (commitMessage.length() <= 1 || commitMessage.indexOf("\n") > -1) {
                System.out.println("Error... Commit can't be empty or subject can't have separate line");
                System.exit(2);
            }

        }

        private static void validSeparateLine(String commitMessage) {
            int firstSeparateLine = commitMessage.indexOf("\n");
            int secondSeparateLine = commitMessage.indexOf("\n", firstSeparateLine + 1);
            if (secondSeparateLine != firstSeparateLine + 1) {
                System.out.println("Error... Separate subject from body with a line");
                System.exit(8);
            }

        }

        private static void validBody(String commitMessage) {
            String body = ExtractCommitBody(commitMessage);

            while(true) {
                while(body.length() > 71) {
                    if (body.indexOf("\n") + 1 > 72) {
                        System.out.println("Error... Wrap the body at 72 characters");
                        System.exit(7);
                    } else if (body.length() > 72 && body.indexOf("\n") < 0) {
                        System.out.println("Error... Wrap the body at 72 characters");
                        System.exit(7);
                    } else {
                        body = body.substring(body.indexOf("\n") + 1, body.length());
                    }
                }

                return;
            }
        }

        private static void validFirstVerb(String commitMessage, String[] VERBS) {
            StringBuilder verb = new StringBuilder();

            for(int i = 0; i < commitMessage.length(); ++i) {
                char ch = commitMessage.charAt(i);
                if (!Character.isLetter(ch)) {
                    break;
                }

                verb.append(ch);
            }

            if (!Arrays.asList(VERBS).contains(verb.toString())) {
                System.out.println("Error... Use the imperative mood in the subject line");
                System.exit(6);
            }

        }

        private static void validCommitSubjectLastSymbol(String commitSubject) {
            char lastSymbol = commitSubject.charAt(commitSubject.length() - 1);
            if (lastSymbol == '.') {
                System.out.println("Error... Do not end the subject line with a period");
                System.exit(5);
            }

        }

        private static void validCommitSubjectLenght(String commitMessage) {
            if (commitMessage.length() > 50 && (commitMessage.indexOf("\n") > 50 || commitMessage.indexOf("\n") < 0)) {
                System.out.println("Error... Limit the subject line to 50 characters");
                System.exit(4);
            }

        }

        private static String ExtractCommitSubject(String commitMessage) {
            int firstLineLength = commitMessage.indexOf("\n");
            String result = commitMessage.substring(0, firstLineLength);
            return result;
        }

        private static String ExtractCommitBody(String commitMessage) {
            int firstLineLength = commitMessage.indexOf("\n");
            String result = commitMessage.substring(firstLineLength + 1, commitMessage.length());
            return result;
        }

        private static void validCommitSubjectLineSeparator(String commitMessage) {
            if (commitMessage.length() < 50) {
                validSubjectFirstLowerCase(commitMessage);
            }

        }

        private static void validSubjectFirstLowerCase(String commitMessage) {
            char ch = commitMessage.charAt(0);
            if (!Character.isLetter(ch)) {
                System.out.println("Error... Capitalize the subject line");
                System.exit(3);
            }

            if (ch != Character.toUpperCase(ch)) {
                System.out.println("Error... Capitalize the subject line");
                System.exit(3);
            }

        }
}
