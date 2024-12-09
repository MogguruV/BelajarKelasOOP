public class Kucing extends Hewan implements Kehidupan, Ras {
    
    @Override
    public void makan(){
        System.out.println("Kucing makan ikan");
    }

    @Override
    public void habitat(){
        System.out.println("Kucing tinggal di rumah joy");
    }

    @Override
    public void bentuk(){
        System.out.println("Kucing bentuknya LUCU!!!");
    }

    @Override
    public void suara() {
        System.out.println("Meowwwww");
    }

    @Override
    public void hidup() {
        System.out.println("Kucing hidup");
    }

    @Override
    public void mati() {
        System.out.println("Kucing mati");
    }

    @Override
    public void jenisRas() {
        System.out.println("Ras Anggora");
    }

    @Override
    public void warna() {
        System.out.println("Oyen~");
    }
}
