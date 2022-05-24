package Cases;

public class EmptyCase extends Case {
    private String emptyCase;

    public EmptyCase(String pEmptyCase) {
        this.emptyCase = pEmptyCase;


    }

    public EmptyCase() {
        this.emptyCase = "case vide";
    }

    @Override
    public String toString() {
        return "Case vide";
    }
}


