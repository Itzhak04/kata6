public record FizzBuzz(int i) {
    public String sound() {
        if (i % 15 == 0) return "FizzBuzz";
        if (i % 3 == 0) return "Fizz";
        if (i % 5 == 0) return "Buzz";
        return Integer.toString(i);
    }
}
