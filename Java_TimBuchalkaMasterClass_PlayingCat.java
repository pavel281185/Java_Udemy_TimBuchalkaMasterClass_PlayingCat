public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature){
        if(summer == false && temperature > 24 && temperature < 36){
            return true;
        }else if(summer == true && temperature > 24 && temperature < 46){
            return true;
        }
        return false;
    }
}
