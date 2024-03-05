
public class array {
    public static void main(String[] args) {
        String[][][] names = {{{"Nabeeha", "Shahriar"}, {"Mahin","nilima"}},{{"sad","nai"},{"ada","sdw"}}};
           // []             {                        0                    ,          0                  }
           //   []            {          0            ,          0        } {     0       ,     0       }
           //     []           {    0    ,     0     }  {   0   ,   0    }   {  0  ,   0 } {  0  , 0   }


        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                for (int k = 0; k < names[i][j].length; k++) {
                    System.out.println(names[i][j][k]);
                }
            }
        }
    }
}
