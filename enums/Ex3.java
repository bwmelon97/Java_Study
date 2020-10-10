package enums;

enum TableStatus {
    Y("1", 1, true),
    N("0", 0, false);

    private final String    table1Value;
    private final int       table2Value;
    private final boolean   table3Value;

    TableStatus(String table1Value, int table2Value, boolean table3Value){
        this.table1Value = table1Value;
        this.table2Value = table2Value;
        this.table3Value = table3Value;
    }

    public String   getTable1Value() { return table1Value; }
    public int      getTable2Value() { return table2Value; }
    public boolean  getTable3Value() { return table3Value; }
}

public class Ex3 {
    public static void main(String[] args) {
        // TableStatus t = TableStatus.Y;

        // String table1Value = t.getTable1Value();
        // int table2Value = t.getTable2Value();
        // boolean table3Value = t.getTable3Value();
    }
}
