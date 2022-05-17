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

//        public abstract presentation(){
//        }
        @Override
        public String toString() {

            return "Jeune Guerrier " + "\n" +"Nom : " + this.getName() + "\n" + "Point de Vie :"+ this.getHp() + "\n" + "Attaque Physique :" + this.getLvlAttack();
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

