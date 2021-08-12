//Q2
class Arrays{
    public static void main(String args[]){
        int a[]=new int[10];//declaration and instantiation
        a[0]=10;//initialization
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;
        a[5]=60;
        a[6]=70;
        a[7]=80;
        a[8]=90;
        a[9]=100;
//traversing array
        for(int i=0;i<a.length;i++)//length is the property of array
            System.out.println(a[i]);
    }
}