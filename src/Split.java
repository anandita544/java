public class Split {




        public static void main(String[] arg) {
            String str = "how:to::split:::a:string:in:java";
            String[] arrOfStr = str.split(":+");
            for (String a : arrOfStr) {
                System.out.println(a);
            }
        }
    }




