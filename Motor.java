public class Motor extends Kendaraan{

    @Override
    public void ban(){
        System.out.println("Motor memiliki ban");
    }

    @Override
    public void ban(String jenisMotor){
        System.out.println(jenisMotor + " memiliki 2 ban");
    }

    @Override
    public void ban(String jenisMotor, String warna){
        System.out.println(jenisMotor + " Dengan warna ban " + warna);
    }

    public void ban(String jenisMotor, int banyakBan){
        System.out.println(jenisMotor + " memiliki " + banyakBan + " ban");
    }
}