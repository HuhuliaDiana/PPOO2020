package jdk12;

/*
Switch Expressions:

The new Syntax removes the need for break statement to prevent fall through.
Switch Expressions don’t fall through anymore.
Furthermore, we can define multiple constants in the same label.
default case is now compulsory in Switch Expressions.
break is used in Switch Expressions to return values from a case itself.

With the new Switch expression, we don’t need to set break everywhere thus prevent logic errors!
 */

public class SwitchExpressions {

    public static void main(String[] args)
    {
        System.out.println("New Switch Expression result:");
        executeNewSwitchExpression("M");
        executeNewSwitchExpression("TH");
        executeNewSwitchExpression("");
        executeNewSwitchExpression("SUN");

        String result = "", day="M";
        switch (day) {
            case "M":
            case "W":
            case "F": {
                result = "MWF";
                break;
            }
            case "T":
            case "TH":
            case "S": {
                result = "TTS";
                break;
            }
        };

        System.out.println("Old Switch Result:");
        System.out.println(result);
    }

    public static void executeNewSwitchExpression(String day){

        String result = switch (day) {
            case "M", "W", "F" -> "MWF";
            case "T", "TH", "S" -> "TTS";
            default -> {
                if(day.isEmpty())
                    break "Please insert a valid day.";
                else
                    break "Looks like a Sunday.";
            }

        };

        System.out.println(result);
    }
}
