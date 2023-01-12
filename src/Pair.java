public class Pair implements Comparable<Pair>{  //ESTO ES BASICAMENTE CON QUIEN LO VA A COMPARAR LO QUE VA EN <>


    public String key;
    public Integer value;
    public Pair(String key, Integer value) {
        this.key = key;
        this.value = value;
    }
    @Override
    public int compareTo(Pair pair){
        return this.value.compareTo(pair.value);  //return pair.value - this.value;
    }
}
