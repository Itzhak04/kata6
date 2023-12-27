public record FizzBuzz(int i) {
    public String sound() {
        if (i % 3 == 0) return "Fizz";
        return Integer.toString(i);
    }
}
