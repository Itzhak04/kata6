public record FizzBuzz(int i) {
    public String sound() {
        if (i % 3 == 0) return "Fizz";
        if (i % 5 == 0) return "Buzz";
        return Integer.toString(i);
    }
}
