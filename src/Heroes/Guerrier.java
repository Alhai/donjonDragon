package Heroes;

    public class Guerrier extends Heroe {
// Attributes
        private String Classe;
        private String Arme;
        private String Bouclier;
// Constructors
        public Guerrier(String pName,String pClass, String pArme, String pBouclier){
            super(pName) ;
            this.Classe = pClass;
            this.Arme = pArme;
            this.Bouclier = pBouclier;
        }
        public Guerrier(){
            super();

        }

// Methods


        @Override
        public String toString() {
            return this.getName();
        }

        // Accessors
        public String getClasse(){return this.Classe;}
        public String getSort(){
            return this.Arme;
        }
        public String getPhiltre() {
            return this.Bouclier;
        }
    }

