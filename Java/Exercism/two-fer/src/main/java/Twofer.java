class Twofer {
    String twofer(String name) {
        if(name == null || name == "") {
            return "One for you, one for me.";
        } else {
            return "One for " + name + ", one for me."; 
        }
    }
}
