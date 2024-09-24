package ex_24092024;

class lab035Switch {

    public static void main(String[] args) {
        String month = "jan";  // Example value

        switch (month) {
            case "jan":
                System.out.println("January");

            case "feb":
                System.out.println("February");

            case "mar":
                System.out.println("March");
                break;
            case "apr":
                System.out.println("April");
                break;
            case "may":
                System.out.println("May");
                break;
            case "jun":
                System.out.println("June");
                break;
            case "jul":
                System.out.println("July");
                break;
            case "aug":
                System.out.println("August");
                break;
            default:
                System.out.println("Unknown month");
                break;
        }
    }
}
