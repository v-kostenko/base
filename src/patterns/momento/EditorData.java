package patterns.momento;

public class EditorData {
    private String text;
    private Color color;
    private Type type;
    private Alightment alightment;

    public EditorData() {
    }

    public EditorData(String text, Color color, Type type, Alightment alightment) {
        this.text = text;
        this.color = color;
        this.type = type;
        this.alightment = alightment;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void addText(String text) {
        this.text += text;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setAlightment(Alightment alightment) {
        this.alightment = alightment;
    }

    public Object createMomento() {
        Momento momento = new Momento(text, color, type, alightment);
        return momento;
    }

    public void setMomento(Object object) {
        if (object instanceof Momento) {
            Momento momento = (Momento) object;
            this.text = momento.text;
            this.color = momento.color;
            this.type = momento.type;
            this.alightment = momento.alightment;
        }
    }

    public void printData() {
        System.out.println("Text: " + text + "\nColor: " + color + "\nType: " + type + "\nAlightment: " + alightment);
    }



    private class Momento {
        private String text;
        private Color color;
        private Type type;
        private Alightment alightment;

        public Momento(String text, Color color, Type type, Alightment alightment) {
            this.text = text;
            this.color = color;
            this.type = type;
            this.alightment = alightment;
        }

        public String getText() {
            return text;
        }

        public Color getColor() {
            return color;
        }

        public Type getType() {
            return type;
        }

        public Alightment getAlightment() {
            return alightment;
        }
    }


}
