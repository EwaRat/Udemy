package section5.zad24;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal)
    {
        if((bigCount+smallCount<goal) || (bigCount<0) || (smallCount<0) || (goal<0)) {
            return false;
        }
        else {

            int amount=0;
            bigCount=amount*5;
            smallCount=amount*1;
            return true;
        }

    }
}
