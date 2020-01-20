public class MegaBytesToKiloBytes {
    public static double printMegaBytesAndKiloBytes(double kiloBytes){
        if (kiloBytes < 0){
            return -1;
        }
        return kiloBytes / 1024d;
    }
}
