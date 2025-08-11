public class substring {
    public static  String substring(String str,int si,int ei){
        String newStr="";
         
         for(int i=si;i<ei;i++){
          newStr+=str.charAt(i);
        }
        return newStr;
        
    }
    public static void main(String args[]){
        String str="helloworld";
        substring(str,0,5);
        //System.out.print(substring(str,0,5));
        System.out.print(str.substring(0,5));
    }
}
