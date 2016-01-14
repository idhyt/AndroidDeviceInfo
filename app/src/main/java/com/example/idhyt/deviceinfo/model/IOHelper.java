package com.example.idhyt.deviceinfo.model;

/**
 * Created by idhyt on 15/11/3.
 */
import com.example.idhyt.deviceinfo.Constants;
import com.example.idhyt.deviceinfo.root.RCommand;



public class IOHelper {

    // cpu 可用频率
    public static String[] getCpu0AvailableFreq(){
        String[] cpuFreq = {"null"};
        try{
            cpuFreq = RCommand.readFileContent(Constants.CPU0_FREQS).
                    replace("\n", "").split(" ");

        }catch (Exception ep){
            ep.printStackTrace();
        }
        return cpuFreq;
    }

    // cpu 当前频率
    public static String getCpu0CruFreq(){
        String cpu0CurFreq = "";
        try{
            cpu0CurFreq = RCommand.readFileContent(Constants.CPU0_CURR_FREQ);

        }catch (Exception ep){
            ep.printStackTrace();
        }
        return cpu0CurFreq;
    }

    // cpu 最大频率
    public static String getCpu0MaxFreq(){
        String cpu0MaxFreq = "";
        try {
            cpu0MaxFreq = RCommand.readFileContent(Constants.CPU0_MAX_FREQ);

        }catch (Exception ep){
            ep.printStackTrace();
        }
        return cpu0MaxFreq;
    }

    public static void setCpu0MaxFreq(String data){
        try {
            RCommand.setEnablePrivilege(Constants.CPU0_MAX_FREQ, true);
            RCommand.writeFileContent(Constants.CPU0_MAX_FREQ, data);
            RCommand.setEnablePrivilege(Constants.CPU0_MAX_FREQ, false);

        }catch (Exception ep){
            ep.printStackTrace();
        }
    }

    // cpu 最小频率
    public static String getCpu0MinFreq(){
        String cpu0MinFreq = "";
        try {
            cpu0MinFreq = RCommand.readFileContent(Constants.CPU0_MIN_FREQ);

        }catch (Exception ep){
            ep.printStackTrace();
        }
        return cpu0MinFreq;
    }
    public static void setCpu0MinFreq(String data){
        try {
            RCommand.setEnablePrivilege(Constants.CPU0_MIN_FREQ, true);
            RCommand.writeFileContent(Constants.CPU0_MIN_FREQ, data);
            RCommand.setEnablePrivilege(Constants.CPU0_MIN_FREQ, false);

        }catch (Exception ep){
            ep.printStackTrace();
        }
    }

    // cpu 工作模式
    public static String[] getCpuAvailableGov(){
        String[] cpuAvailableGov = {"null"};
        try{
            cpuAvailableGov = RCommand.readFileContent(Constants.CPU0_GOVS).
                    replace("\n", "").split(" ");

        }catch (Exception ep){
            ep.printStackTrace();
        }
        return cpuAvailableGov;
    }

    public static String getCpu0CurGov(){
        String cpu0CurGov = "";
        try{
            cpu0CurGov = RCommand.readFileContent(Constants.CPU0_CURR_GOV);
        }catch (Exception ep){
            ep.printStackTrace();
        }
        return cpu0CurGov;
    }

    public static void setCpu0CurGov(String data) {
        try {
            RCommand.setEnablePrivilege(Constants.CPU0_CURR_GOV, true);
            RCommand.writeFileContent(Constants.CPU0_CURR_GOV, data);
            RCommand.setEnablePrivilege(Constants.CPU0_CURR_GOV, false);

        } catch (Exception ep) {
            ep.printStackTrace();
        }
    }

    // cpu 当前频率和工作模式
    public static String getCpu0StatusContent(){
        String cpu0CurStatusContent = "get cpu status error";
        try {
            String cpu0CurFreq = getCpu0CruFreq();
            String cpu0CurGov = getCpu0CurGov();
            cpu0CurStatusContent = "CPU Frequency: " + cpu0CurFreq + "\n" +
                    "CPU Governor: " + cpu0CurGov;

        } catch (Exception ep) {
            ep.printStackTrace();
        }
        return cpu0CurStatusContent;
    }


    // gpu当前频率
    // cpu 当前频率和工作模式
    public static String getGpuStatusContent(){
        String gpuCurStatusContent = "get gpu status error";
        try {
            String gpuCurFreq = getGpu3DCruFreq();
            gpuCurStatusContent = "GPU Frequency: " + gpuCurFreq;

        } catch (Exception ep) {
            ep.printStackTrace();
        }
        return gpuCurStatusContent;
    }

    // gpu 可用频率
    public static String[] getGpu3DAvailableFreq(){
        String[] gpu3DFreq = {"null"};
        try{
            gpu3DFreq = RCommand.readFileContent(Constants.GPU_3D_2_AVAILABLE_FREQUENCIES).
                    replace("\n", "").split(" ");

        }catch (Exception ep){
            ep.printStackTrace();
        }
        return gpu3DFreq;
    }

    // gpu 当前最大频率
    public static String getGpu3DCruMaxFreq(){
        String gpuCurFreq = "";
        try{
            gpuCurFreq = RCommand.readFileContent(Constants.GPU_3D_MAX_2);

        }catch (Exception ep){
            ep.printStackTrace();
        }
        return gpuCurFreq;
    }

    // gpu 当前频率
    public static String getGpu3DCruFreq(){
        String gpuCurFreq = "";
        try{
            gpuCurFreq = RCommand.readFileContent(Constants.GPU_3D_2_CURRENT);

        }catch (Exception ep){
            ep.printStackTrace();
        }
        return gpuCurFreq;
    }

    public static void setGpu3DMaxFreq(String data){
        try {
            RCommand.setEnablePrivilege(Constants.GPU_3D_MAX_2, true);
            RCommand.writeFileContent(Constants.GPU_3D_MAX_2, data);
            RCommand.setEnablePrivilege(Constants.GPU_3D_MAX_2, false);

        }catch (Exception ep){
            ep.printStackTrace();
        }
    }

    // I/O Scheduler
    // /sys/block/mmcblk0/queue/scheduler
    public static String[] getAvailableScheduler(){
        String[] availableScheduler = {"null"};
        try{
            availableScheduler = RCommand.readFileContent(Constants.SCHEDULER).
                    replace("\n", "").split(" ");

        }catch (Exception ep){
            ep.printStackTrace();
        }
        return availableScheduler;
    }

    public static String getCurScheduler(){
        String curScheduler = "";
        try{
            String strAvailableScheduler = RCommand.readFileContent(Constants.SCHEDULER);
            curScheduler = strAvailableScheduler.substring(strAvailableScheduler.indexOf("[") + 1,
                    strAvailableScheduler.indexOf("]")).trim();

        }catch (Exception ep){
            ep.printStackTrace();
        }
        return curScheduler;
    }

    public static void setCurScheduler(String data){
        try {
            RCommand.setEnablePrivilege(Constants.SCHEDULER, true);
            RCommand.writeFileContent(Constants.SCHEDULER, data);
            RCommand.setEnablePrivilege(Constants.SCHEDULER, false);

        }catch (Exception ep){
            ep.printStackTrace();
        }
    }

    // READ_AHEAD_KB
    public static String getCurReadAhead(){
        String curReadAhead = "";
        try{
            curReadAhead = RCommand.readFileContent(Constants.READ_AHEAD_KB).
                    replace("\n", "") + " kb";

        }catch (Exception ep){
            ep.printStackTrace();
        }
        return curReadAhead;
    }

    public static void setCurReadAhead(String data){
        try{
            RCommand.setEnablePrivilege(Constants.READ_AHEAD_KB, true);
            RCommand.writeFileContent(Constants.READ_AHEAD_KB, data);
            RCommand.setEnablePrivilege(Constants.READ_AHEAD_KB, false);
        }catch (Exception ep){
            ep.printStackTrace();
        }
    }

    // i/o scheduler status
    public static String getIOSchedulerStatusContent(){
        String ioSchedulerStatus = "get i/o scheduler status error";
        try {
            String curIOScheduler = getCurScheduler();
            String curReadAhead = getCurReadAhead();
            ioSchedulerStatus = "I/O Scheduler: " + curIOScheduler + "\n" +
                    "Read Ahead: " + curReadAhead;

        } catch (Exception ep) {
            ep.printStackTrace();
        }
        return ioSchedulerStatus;
    }
}
