package L46_Multiple;

public class Multiple {
    private Integer first;
    private Integer second;

    public Multiple(Integer first, Integer second) {
        this.first = first;
        this.second = second;
    }

    public Integer getFirst() {
        return first;
    }

    public void setFirst(Integer first) {
        this.first = first;
    }

    public Integer getSecond() {
        return second;
    }

    public void setSecond(Integer second) {
        this.second = second;
    }

    public Integer multiplyElements() {
        return first * second;
    }

    @Override
    public String toString() {
        return "Multiple{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
