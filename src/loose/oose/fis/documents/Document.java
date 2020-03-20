package loose.oose.fis.documents;

public abstract class Document {
    protected String[] continut;

    public Document(String[] b) {
        this.continut = b;
    }

    public abstract String[] analizeaza();

    @Override
    public String toString() {
        String res = "";
        for (String cuvant : continut) {
            res += cuvant + " ";
        }
        return res;
    }
}
