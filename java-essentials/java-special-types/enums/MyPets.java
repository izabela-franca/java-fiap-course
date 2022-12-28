package enums;

public enum MyPets implements Pet {
    CAT {
        @Override
        public String talk() {      //implementing a specific interface in an enum
            return "Meow";
        }
    },
    HAMSTER {
        @Override
        public String talk() {
            return "Squik";
        }
    };

    //@Override
    //public String talk() {
    //    return "sound";
    //}
}
