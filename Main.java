class Main {
    public static void main(String[] args) {
        Human human1 = new Human("たかし", 19960323);
        if(human1.run()){
            System.out.println(human1.getName() + "は走った");
        } else {
            System.out.println(human1.getName() + "空腹のため、走れなかった");
        }
    }
}
