package week6;

public class CustomException extends Exception {

    private static int account_no[] = {0000, 0001, 0002};

    private static String name[] =
            {"Vivek", "Rajan", "Rahul"};

    private static double balance[] =
            {128070.00, 1800.00, 17000.95};


    CustomException() {    }


    CustomException(String string) { super(string); }


    public static void main(String[] args) throws CustomException
    {
        try  {

            System.out.println("ACCOUNT-NO" + "\t" + "CUSTOMER" +
                    "\t" + "BALANCE");


            for (int j = 0; j < 3 ; j++)
            {
                System.out.println(account_no[j] + "\t" + name[j] +
                        "\t" + balance[j]);


                if (balance[j] < 2000)
                {
                    CustomException message =
                            new CustomException("Balance is less than 2000 which is not allowed.");
                    throw message;
                }
            }
        }

        catch (CustomException e) {
            e.printStackTrace();
        }
    }


}
