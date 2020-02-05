package project.intel.a1;
import java.io.*;

public class ExternalDevice implements Device {


    public int getNewDevice() {
        return 0;
    }

    public String getNewDevice2() {
        return null;
    }


    public int lostVersion(int defectPhone, int defectApplication) {
        return 0;
    }
    public static void main (String[] args){
        Device mouse=new ExternalDevice();
        System.out.println(ExternalDevice.g);


    }
}
