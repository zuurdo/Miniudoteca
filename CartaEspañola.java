package Miniludoteca;

/**
 * Created by Raul on 1/2/17.
 */

    public class CartaEspañola extends Carta {

        public enum Palo{OROS, COPAS, BASTOS, ESPADAS}
        private final Palo palo;

        public CartaEspañola(Palo palo, int valor){
            super(valor);
            this.palo=palo;


        }

        public String getPaloString() {
            switch (palo) {
                case OROS:    return "Oros";
                case COPAS:   return "Copas";
                case BASTOS:  return "Bastos";
                case ESPADAS:
                default:      return "Espadas";
            }
        }

        /**
         * Devuelve el valor de la carta como un String
         *
         * @return  un String "As", "2",
         * "3", ..., "Sota", "Caballo", o "Rey".
         */
        public String getValorString() {
            switch ( valor ) {
                case 1:   return "As";
                case 2:   return "2";
                case 3:   return "3";
                case 4:   return "4";
                case 5:   return "5";
                case 6:   return "6";
                case 7:   return "7";
                case 8:   return "Sota";
                case 9:   return "Caballo";
                case 10:
                default:  return "Rey";
            }
        }

        /**
         *
         * @return
         */
        @Override
        public String toString() {
            return getValorString() + " de " + getPaloString();
        }





    }

