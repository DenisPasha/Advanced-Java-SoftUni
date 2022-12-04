package P03SetsAndMaps.lab;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;

public class P08AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>>map=new TreeMap<>();

        for (int i = 1; i <=n ; i++) {
            String name =scanner.nextLine();
            double[] grades= Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
            map.putIfAbsent(name,new ArrayList<>());

            for (double currentGrade : grades) {
                map.get(name).add(currentGrade);
            }

        }
        System.out.println();

        for (Map.Entry<String, List<Double>> entry : map.entrySet()) {

            BigDecimal sum=new BigDecimal(0);
            for (int i = 0; i < entry.getValue().size(); i++) {
                BigDecimal currentGrade=new BigDecimal(entry.getValue().get(i));
               sum= sum.add(currentGrade);
            }
            BigDecimal average=new BigDecimal(0);

            int d =entry.getValue().size();
            average=sum.divide(BigDecimal.valueOf(d));
          average= average.setScale(15,RoundingMode.DOWN);
            String text = average.toString();
            if (text.charAt(5) > '5'){
                MathContext m=new MathContext(15);
                BigDecimal finalAverage=average.round(m);
                DecimalFormat df=new DecimalFormat("0.################");

                System.out.printf("%s is graduated with %s%n",entry.getKey(),df.format(finalAverage));
            }else {
                DecimalFormat df=new DecimalFormat("0.################");
                System.out.printf("%s is graduated with %s%n",entry.getKey(),df.format(average));

            }



        }

    }
}
