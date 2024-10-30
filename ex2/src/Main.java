import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//A
       int[]  arr= {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        int[] arr2= {2,5,4,3,1};
        Arrays.sort(arr2,1,3);
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.binarySearch(arr2,8)>=0?"yes":"no");
        char[] arr3 =new char[10];
        Arrays.fill(arr3,2,8,'*');
        System.out.println(Arrays.toString(arr3));
       float[] f={3.5f,7.0f,9.2f};
       float[] f2=new float[3];
        System.out.println(Arrays.toString(f2));
      f2= Arrays.copyOf(f,f.length);
        System.out.println(Arrays.toString(f2));
    System.out.println(Arrays.compare(arr,arr2));//מחזיר איזה מערך נמצא קודם מבחינת סדר מילוני
        System.out.println(Math.max(4,6));//מקסימום
        System.out.println(Math.abs(-8));//ערך מוחלט
        System.out.println(Math.floor(5.2));//עיגול כלפי מטה
        System.out.println(Math.ceil(5.6));//עיגול כלפי מעלה
        System.out.println(Math.pow(5,2));//חזקה
        //B
        String s1,s2;
        s1=new String("aaaaa");
        s2=new String("bbbbbb");
        String str="ABCDEFEDCBA   ";
        String str2="ABCDEFEDCBA   ";
        String ezer="EDCBA";
        System.out.println(str.charAt(4));
        System.out.println(str.length());
        System.out.println(str.equals(ezer));
        System.out.println(str.compareTo(ezer));
        System.out.println(str.concat(ezer));
        System.out.println(str.endsWith("CBA"));
        System.out.println(s1.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(ezer.startsWith("A"));
        System.out.println(str.trim());
        System.out.println(str.indexOf('B'));
        System.out.println(str.indexOf('B',4));
        System.out.println(str.lastIndexOf('B'));
        System.out.println(str.contains("EFE"));
        System.out.println(str.replaceAll("A","X"));
        System.out.println(str.substring(3,8));
        System.out.println(Arrays.toString(str2.split(" ")));
        System.out.println(String.valueOf('l'));//המרה מטיפוס כלשהוא לסטרינג
        //C
int x=77,y=9;
        System.out.printf("%d+%d=%d",x,y,x+y);
      String s5=  String.format("x+y=z",x,y,x+y);
        System.out.println(s5);
        String ssr="1234";
        int xx=555;
//        xx=Integer.valueOf(ssr);
//        System.out.println(xx);
        xx=Integer.parseInt(ssr);
        System.out.println(xx);


       // ssr=String.valueOf(8794);
       // System.out.println(ssr.toString());
//ssr=Integer.toString(8794);
//        System.out.println(ssr.toString());
        ssr=""+8794;
        System.out.println(ssr.toString());
    }

}