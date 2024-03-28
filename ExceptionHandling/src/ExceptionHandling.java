import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExceptionHandling {
    public static void main(String[] args) {
        basicException();
        multipleException();
        multipleOneRowException();
        hierarchyException();
        finallyExample();
        tryFinallyExample();
    }

    public static void tryFinallyExample() {
        Integer sum = 0;
        try {
            System.out.println("===============");
            List<Integer> score = new ArrayList<>(Arrays.asList(12,34,56,24));
            for (int i =0; i < 4; i++) {
                System.out.println(score.get(i));
                sum = sum + score.get(i);
            }
            Integer value = 5 / 0;
            System.out.println(value);
        }finally {
            System.out.println(sum);
        }
        System.out.println("Raja");
    }


    public static void finallyExample() {
        Integer sum = 0;
        try {
            System.out.println("===============");
            List<Integer> score = new ArrayList<>(Arrays.asList(12,34,56,24));
            for (int i =0; i < 4; i++) {
                System.out.println(score.get(i));
                sum = sum + score.get(i);
            }
            Integer value = 5 / 2;
            System.out.println(value);
        }catch (ArithmeticException e) {
            System.out.println("You can not divide by zero - Error Message="+e.getMessage());
            sum = -1;
        }
        catch (Exception e) {
            System.out.println("Common Exception - Error Message="+e.getMessage());
            sum = -1;
        } finally {
            System.out.println(sum);
        }

    }

    public static void hierarchyException() {
        try {
            List<Integer> score = new ArrayList<>(Arrays.asList(12,34,56,24));
            for (int i =0; i < 5; i++) {
                System.out.println(score.get(i));
            }
            Integer value = 5 / 0;
            System.out.println(value);
        }catch (ArithmeticException e) {
            System.out.println("You can not divide by zero - Error Message="+e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException - Error Message="+e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Common Exception - Error Message="+e.getMessage());
        }
        System.out.println("welcome");
        System.out.println("hi");
    }

    public static void multipleOneRowException() {
        try {
            List<Integer> score = new ArrayList<>(Arrays.asList(12,34,56,24));
            for (int i =0; i < 10; i++) {
                System.out.println(score.get(i));
            }
            Integer value = 5 / 0;
            System.out.println(value);
        } catch (IndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Error Message="+e.getMessage());
        }
        System.out.println("welcome");
        System.out.println("hi");
    }

    public static void multipleException() {
        try {
            List<Integer> score = new ArrayList<>(Arrays.asList(12,34,56,24));
            for (int i =0; i < 4; i++) {
                System.out.println(score.get(i));
            }
            Integer value = 5 / 0;
            System.out.println(value);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("List range error - Error Message="+e.getMessage());
//            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("You can not divide by zero - Error Message="+e.getMessage());
        }
        System.out.println("welcome");
        System.out.println("hi");
    }

    public static void basicException() {
        try {
            Integer value = 5 / 0;
            System.out.println(value);
        } catch (ArithmeticException e) {
            System.out.println("You can not divide by zero - Error Message="+e.getMessage());
        }
        System.out.println("welcome");
        System.out.println("hi");
    }
}
