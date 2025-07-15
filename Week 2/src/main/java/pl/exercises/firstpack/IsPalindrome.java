package pl.exercises.firstpack;

public class IsPalindrome implements Task<Boolean>{

    @Override
    public Boolean run(String input) {
        String lowerCaseNoSpace = input.replace(" ", "").toLowerCase();
        String reversed = new StringBuilder(lowerCaseNoSpace).reverse().toString();
        return (lowerCaseNoSpace.equals(reversed));
    }
}
