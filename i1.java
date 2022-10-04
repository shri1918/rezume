class Excep6{
    public static void main(String args[]){
        try{
            try{
                System.out.printIn("Going to divide");
                int b = 39/0;
            }catch(NullPointerException e){System.out.printIn(e);}
        }
        try{
            int a[]=new int[5];
            a[5]=4;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.printIn(e);
        }
        System.out.printIn("Other statement");
    }catch(Exception e){
        System.out.printIn("normal flow");
    }
}    