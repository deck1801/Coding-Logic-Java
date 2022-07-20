public class BitWiseoperatios {
    public static void main(String args[]){
        /*
         * Some important points to know about BitWise Operation
         * >>(Right Shift operation): if any number got right shifted by 1 in 
         * mathematical term it means dividing the number by two.
         * 
         * ^(XOR operation) when the two bites are different form each other it is 1. And
         * if it is same than 0.
         * 
         * <<(Left Shift operation): if any number got left shift by 1 in mathematical terms
         * it mean multiplying the number by two.
         * 
         * Concept of Bit-Masking: 
         */
        
        OddEvenCheck(12);
        SwapOperation(5, 3);
        findTheIthBit(12, 4);
        SetTheIthBit(12, 2);
        ClearTheIthBit(12, 3);
        findTheNumberReqConv(22, 27);
        int[] arr=new int[]{5,4,1,4,3,5,1};
        FindingUniqueElement(arr, 7);
        int[] arr2=new int[]{5,4,1,4,3,5,1,2};
        FindingTwoUniqueElements(arr2, 8);
    }
    
    public static void OddEvenCheck(int n){
        if((n&1)==0){  // using masking &(AND) operation with 1 is called masking checking the
            // the last bit if 1 odd if 0 even
            System.out.println("The number is EVEN");
        }else{
            System.out.println("The number is ODD");
        }
    }

    public static void SwapOperation(int a,int b){
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("A: "+a);
        System.out.println("B: "+b);
    }

    public static void findTheIthBit(int n,int pos){
        int mask=(1<<pos);
        int bit= (n&mask);
        if(bit!=0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }

    public static void SetTheIthBit(int n,int pos){
        int mask=(1<<pos);
        int sbit=(n|mask);
        System.out.println(sbit);
    }
    
    public static void ClearTheIthBit(int n,int pos){
        int mask= ~(1<<pos);
        int cbit= (n&mask);
        System.out.println(cbit);       
    }
    
    public static void findTheNumberReqConv(int a,int b){
        // First step to attempt this question 
        int Intrim=a^b;
        int count=0;
        while(Intrim!=0){
            Intrim=Intrim>>1; //right shift operation is needed
            if(Intrim!=0){
                count++;
            }
        }
        System.out.println("The number of bits to be converted: "+count);
    }

    //Bit Mainpulation Advance Questions
    public static void FindingUniqueElement(int[] arr, int n){
        int res=0;
        for(int i=0;i<n;i++){
            res=res^arr[i];
        }
        System.out.println(res);
    }
    //the right most bit tells us the nature of integer 1=ODD & 0==even
    
    public static void FindingTwoUniqueElements(int[] arr,int n){
        int res1=0,res2=0;
        for(int i=0;i<n;i++)
        {
            if((arr[i]&1)!=0){
                res1=res1^arr[i];
            }else{
                res2=res2^arr[i];
            }
        }
        System.out.println(res1+" "+res2);
    }



}
