package Homework_Java_2;
import java.util.HashMap;
import java.util.Map;
public class Task01 {
 
    public static void main(String[] args) {
        Map<String, String> parametrs1 = new HashMap<String,String>();
        parametrs1.put("name","Ivanov");
        parametrs1.put("country","Russia");
        parametrs1.put("city","Moscow");
        parametrs1.put("age",null);
        System.out.println(getQuery(parametrs1));
    }
    public static String getQuery(Map<String, String> params)
    {
        StringBuilder s = new StringBuilder();
        for (Map.Entry<String,String> pair : params.entrySet())
        {
            if (pair.getValue() != null)
            {
                s.append(pair.getKey() +" = '" + pair.getValue()+"' and ");
            }
        }
        s.delete(s.toString().length()-5,s.toString().length());
        return s.toString();
    }

}