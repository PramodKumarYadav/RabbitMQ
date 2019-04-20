import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class PowerShellCommand {
    @Test
    public static void main(String[] args) throws IOException {

        //String command = "powershell.exe  your command";
        // In order to execute a powershell script
//        String command = "powershell.exe  \"C:\\Pathtofile\\script.ps\" ";

        //Getting the version
//        String command = "powershell.exe $PSVersionTable.PSVersion";
        String command = "powershell.exe -ExecutionPolicy ByPass -File \"D:\\first_script.ps1\" ";
        // Executing the command
        Process powerShellProcess = Runtime.getRuntime().exec(command);
        // Getting the results
        powerShellProcess.getOutputStream().close();

        String line;
        System.out.println("Standard Output:");
        BufferedReader stdout = new BufferedReader(new InputStreamReader(
                powerShellProcess.getInputStream()));
        while ((line = stdout.readLine()) != null) {
            System.out.println(line);
        }
        stdout.close();

        System.out.println("Standard Error:");
        BufferedReader stderr = new BufferedReader(new InputStreamReader(
                powerShellProcess.getErrorStream()));
        while ((line = stderr.readLine()) != null) {
            System.out.println(line);
        }
        stderr.close();

        System.out.println("Done");

    }

}