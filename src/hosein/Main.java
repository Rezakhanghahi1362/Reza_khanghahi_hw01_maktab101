package hosein;

public class Main {
    public static void main(String[] args) {
       // Crystal goldan=new Crystal();
        Crystal.setAndaze(20);
        goldan .setMark("check");
        goldan.setGiymat(10000);
        System.out.println(goldan.getAndaze());
        System.out.println(goldan.getGiymat());
        System.out.println(goldan.getMark());



        Moshtari rahim=new Moshtari();
        rahim.setAdres("tabriz");
        rahim.setNam("rahim");
        rahim.setKhanevadegi("rahimi");
        rahim.setShomare(9999);
        System.out.println(rahim.getAdres());
        System.out.println(rahim.getNam());
        System.out.println(rahim.getKhanevadegi());
        System.out.println(rahim.getShomare());

    }
}
