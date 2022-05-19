package Heroes;

    public class Guerrier extends Heroe {
// Attributes
        private String Arme;
// Constructors
        public Guerrier(String pName, String pArme){
            super("Milkshake", 7,7, 10,10);
            this.Arme = pArme;
        }
        public Guerrier(){
            super();
        }
// Methods
        @Override
        public String toString() {

            return "Jeune Guerrier " + "\n" +"Nom : " + this.getName() + "\n" + "Point de Vie :"+ this.getHp() + "\n" + "Attaque Physique :" + this.getLvlAttack();
        }

        // Accessors
        public String getSort(){
            return this.Arme;
        }

        @Override
        public String criDeGuerre() {
            return "BAAAHJAAAAT !!!!";
        }
    }

