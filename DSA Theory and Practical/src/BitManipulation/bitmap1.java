package BitManipulation;

public class bitmap1 {
    public static void main(String args[]){
        /**
         * Basic of Bit Manipulation
         * left Shift 2>>1 010-->100
         * right Shift 2<<1 010-->001
         */

        //First operation: Get Bit
        System.out.println("Get Bit result: "+GetBit(5, 3));
        System.out.println("Set Bit result: "+SetBit(5, 1));
        System.out.println("Clear Bit result: "+ClearBit(5, 2));

    }

    static int GetBit(int num,int pos){
        return ((1<<pos)&num);
    }
    static int SetBit(int num,int pos){
        return ((1<<pos)|num);
    }
    static int ClearBit(int num,int pos){
        return (~(1<<pos)&num);
    }
    static int UpdateBitZero(int num,int pos){
        return (~(1<<pos)&num);
    }
    static int UpdateBitOne(int num,int pos){
        return ((1<<pos)|num);
    }

    /**
     * There are four major operations in Bit Manipulation
     * 1. GET BIT
     * 2. SET BIT
     * 3. UPDATE BIT
     * 4. CLEAR BIT
     */
}
