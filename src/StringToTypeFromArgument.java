public class StringToTypeFromArgument {
    public static void main(String[] args) {


        String inputText;

        for (int i = 0; i < args.length; i++) {

            inputText = args[i].toString().toLowerCase();
            if (args[i].toString().equals("int")) {
                StringToType.printIntValues();
            } else if (args[i].toString().equals("char")) {
                StringToType.printCharValues();
            } else if (args[i].toString().equals("long")) {
                StringToType.printLongValues();
            } else if (args[i].toString().equals("float")) {
                StringToType.printFloatValues();
            } else if (args[i].toString().equals("byte")) {
                StringToType.printByteValues();
            } else if (args[i].toString().equals("short")) {
                StringToType.printShortValues();
            } else if (args[i].toString().equals("double")) {
                StringToType.printDoubleValues();
            }

        }


        if (args.length == 0){
            System.out.println("All types of data:\n");
            StringToType.printIntValues();
            StringToType.printCharValues();
            StringToType.printLongValues();
            StringToType.printFloatValues();
            StringToType.printByteValues();
            StringToType.printShortValues();
            StringToType.printDoubleValues();
        }

    }
}
