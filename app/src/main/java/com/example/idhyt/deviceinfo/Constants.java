package com.example.idhyt.deviceinfo;

import java.io.File;
import android.content.Context;

/**
 * Created by idhyt on 15/11/3.
 */
public final class Constants {
/*
    public static final File BATTERY_CAPACITY = null;
    public static final File BATTERY_CAPACITY2 = null;
    public static final File BATTERY_CHARGING_SOURCE = null;
    public static final File BATTERY_DRAIN = null;
    public static final File BATTERY_DRAIN2 = null;
    public static final File BATTERY_HEALTH = null;
    public static final File BATTERY_LEVEL = null;
    public static final File BATTERY_TECH = null;
    public static final File BATTERY_TEMP = null;
    public static final File BATTERY_TEMP2 = null;
    public static final File BATTERY_VOLTAGE = null;
    public static final File BATTERY_VOLTAGE2 = null;
    public static final File BUTTONS_LIGHT = null;
    public static final File BUTTONS_LIGHT_2 = null;
    public static final File CDEPTH = null;
    public static final int CONN_TIMEOUT = 120000;
    public static final File CPU0_CURR_FREQ = null;
    public static final File CPU0_CURR_GOV = null;
    public static final File CPU0_FREQS = null;
    public static final File CPU0_GOVS = null;
    public static final File CPU0_MAX_FREQ = null;
    public static final File CPU0_MIN_FREQ = null;
    public static final File CPU1_CURR_FREQ = null;
    public static final File CPU1_CURR_GOV = null;
    public static final File CPU1_GOVS = null;
    public static final File CPU1_MAX_FREQ = null;
    public static final File CPU1_MIN_FREQ = null;
    public static final File CPU2_CURR_FREQ = null;
    public static final File CPU2_CURR_GOV = null;
    public static final File CPU2_GOVS = null;
    public static final File CPU2_MAX_FREQ = null;
    public static final File CPU2_MIN_FREQ = null;
    public static final File CPU3_CURR_FREQ = null;
    public static final File CPU3_CURR_GOV = null;
    public static final File CPU3_GOVS = null;
    public static final File CPU3_MAX_FREQ = null;
    public static final File CPU3_MIN_FREQ = null;
    public static final File CPU_INFO = null;
    public static final File CPU_MAX = null;
    public static final File CPU_MIN = null;
    public static final int CPU_OFFLINE_CODE = -45;
    public static final File CPU_TEMP = null;
    public static final File CPU_TEMP_ENABLED = null;
    public static final File[] CPU_TEMP_PATHS = null;
    public static final File DT2W = null;
    public static final String ENCODING = "UTF-8";
    public static final File ENTROPY_POOL_SIZE = null;
    public static final File FCHARGE = null;
    public static final File GOVERNOR_SETTINGS = null;
    public static final File GPU_2D = null;
    public static final File GPU_2D_2 = null;
    public static final File GPU_2D_CURRENT = null;
    public static final File GPU_3D = null;
    public static final File GPU_3D_2 = null;
    public static final File GPU_3D_2_AVAILABLE_FREQUENCIES = null;
    public static final File GPU_3D_2_GOV = null;
    public static final File GPU_3D_AVAILABLE_FREQUENCIES = null;
    public static final File GPU_3D_CURRENT = null;
    public static final int GPU_NOT_AVAILABLE = -55;
    public static final int GPU_OFFLINE_CODE = -55;
    public static final File GPU_SGX540 = null;
    public static final File G_S_URL_PREFIX = null;
    public static final boolean IS_CORRECT_THREAD_CHECKING_ENABLED = false;
    public static final boolean IS_LOGGABLE = false;
    public static final boolean IS_PARAMETER_CHECKING_ENABLED = false;
    public static final File IVA = null;
    public static final File KERNEL = null;
    public static final String LOG_TAG = "Kernel Tuner";
    public static final File MPDECISION = null;
    public static final File MPDECISION_BINARY = null;
    public static final File MPDEC_DELAY = null;
    public static final File MPDEC_ENABLED = null;
    public static final File MPDEC_IDLE_FREQ = null;
    public static final File MPDEC_MAX_CPUS = null;
    public static final File MPDEC_MIN_CPUS = null;
    public static final File MPDEC_PAUSE = null;
    public static final File MPDEC_SCROFF_FREQ = null;
    public static final File MPDEC_SCROFF_SINGLE = null;
    public static final File MPDEC_THR_0 = null;
    public static final File MPDEC_THR_DOWN = null;
    public static final File MPDEC_THR_UP = null;
    public static final File MPDEC_TIME_DOWN = null;
    public static final File MPDEC_TIME_UP = null;
    public static final File NLT = null;
    public static final File NOTIF_LED = null;
    public static final File OOM = null;
    public static final File OTG = null;
    public static final File OTG_2 = null;
    public static final File READ_AHEAD_KB = null;
    public static final File S2W_BUTTONS = null;
    public static final File S2W_END = null;
    public static final File S2W_START = null;
    public static final File S2W_VERSION = null;
    public static final File SCHEDULER = null;
    public static final File SD_CACHE = null;
    public static final File SWAPS = null;
    public static final File TCP_AVAILABLE_CONGESTION = null;
    public static final File TCP_CONGESTION = null;
    public static final File THERMALD = null;
    public static final File THERMALD_BINARY = null;
    public static final File THERMAL_LOW_FREQ = null;
    public static final File THERMAL_LOW_HIGH = null;
    public static final File THERMAL_LOW_LOW = null;
    public static final File THERMAL_MAX_FREQ = null;
    public static final File THERMAL_MAX_HIGH = null;
    public static final File THERMAL_MAX_LOW = null;
    public static final File THERMAL_MID_FREQ = null;
    public static final File THERMAL_MID_HIGH = null;
    public static final File THERMAL_MID_LOW = null;
    public static final File TIMES_IN_STATE_CPU0 = null;
    public static final File TIMES_IN_STATE_CPU1 = null;
    public static final File TIMES_IN_STATE_CPU2 = null;
    public static final File TIMES_IN_STATE_CPU3 = null;
    public static final String URL_LINPACK = "http://linpack.pedjaapps.net/api.json/";
    public static final File VOLTAGE_PATH = null;
    public static final File VOLTAGE_PATH_2 = null;
    public static final File VOLTAGE_PATH_TEGRA_3 = null;
    public static final File VSYNC = null;
    public static final File cpu0online = null;
    public static final File cpu1online = null;
    public static final File cpu2online = null;
    public static final File cpu3online = null;
    public static final File cpuScreenOff = null;
*/

    public static final File G_S_URL_PREFIX = new File("https://www.google.com/search?q=");
    public static final File cpu0online = new File("/sys/devices/system/cpu/cpu0/online");
    public static final File cpu1online = new File("/sys/devices/system/cpu/cpu1/online");
    public static final File cpu2online = new File("/sys/devices/system/cpu/cpu2/online");
    public static final File cpu3online = new File("/sys/devices/system/cpu/cpu3/online");
    public static final File cpuScreenOff = new File("/sys/devices/system/cpu/cpu0/cpufreq/screen_off_max_freq");
    public static final File CPU0_FREQS = new File("/sys/devices/system/cpu/cpu0/cpufreq/scaling_available_frequencies");
    public static final File SWAPS = new File("/proc/swaps");
    public static final File CPU0_CURR_FREQ = new File("/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq");
    public static final File CPU1_CURR_FREQ = new File("/sys/devices/system/cpu/cpu1/cpufreq/scaling_cur_freq");
    public static final File CPU2_CURR_FREQ = new File("/sys/devices/system/cpu/cpu2/cpufreq/scaling_cur_freq");
    public static final File CPU3_CURR_FREQ = new File("/sys/devices/system/cpu/cpu3/cpufreq/scaling_cur_freq");
    public static final File CPU0_MAX_FREQ = new File("/sys/devices/system/cpu/cpu0/cpufreq/scaling_max_freq");
    public static final File CPU1_MAX_FREQ = new File("/sys/devices/system/cpu/cpu1/cpufreq/scaling_max_freq");
    public static final File CPU2_MAX_FREQ = new File("/sys/devices/system/cpu/cpu2/cpufreq/scaling_max_freq");
    public static final File CPU3_MAX_FREQ = new File("/sys/devices/system/cpu/cpu3/cpufreq/scaling_max_freq");
    public static final File CPU0_MIN_FREQ = new File("/sys/devices/system/cpu/cpu0/cpufreq/scaling_min_freq");
    public static final File CPU1_MIN_FREQ = new File("/sys/devices/system/cpu/cpu1/cpufreq/scaling_min_freq");
    public static final File CPU2_MIN_FREQ = new File("/sys/devices/system/cpu/cpu2/cpufreq/scaling_min_freq");
    public static final File CPU3_MIN_FREQ = new File("/sys/devices/system/cpu/cpu3/cpufreq/scaling_min_freq");
    public static final File CPU0_CURR_GOV = new File("/sys/devices/system/cpu/cpu0/cpufreq/scaling_governor");
    public static final File CPU1_CURR_GOV = new File("/sys/devices/system/cpu/cpu1/cpufreq/scaling_governor");
    public static final File CPU2_CURR_GOV = new File("/sys/devices/system/cpu/cpu2/cpufreq/scaling_governor");
    public static final File CPU3_CURR_GOV = new File("/sys/devices/system/cpu/cpu3/cpufreq/scaling_governor");
    public static final File CPU0_GOVS = new File("/sys/devices/system/cpu/cpu0/cpufreq/scaling_available_governors");
    public static final File CPU1_GOVS = new File("/sys/devices/system/cpu/cpu1/cpufreq/scaling_available_governors");
    public static final File CPU2_GOVS = new File("/sys/devices/system/cpu/cpu2/cpufreq/scaling_available_governors");
    public static final File CPU3_GOVS = new File("/sys/devices/system/cpu/cpu3/cpufreq/scaling_available_governors");
    public static final File TIMES_IN_STATE_CPU0 = new File("/sys/devices/system/cpu/cpu0/cpufreq/stats/time_in_state");
    public static final File TIMES_IN_STATE_CPU1 = new File("/sys/devices/system/cpu/cpu1/cpufreq/stats/time_in_state");
    public static final File TIMES_IN_STATE_CPU2 = new File("/sys/devices/system/cpu/cpu2/cpufreq/stats/time_in_state");
    public static final File TIMES_IN_STATE_CPU3 = new File("/sys/devices/system/cpu/cpu3/cpufreq/stats/time_in_state");
    public static final File TCP_CONGESTION = new File("/proc/sys/net/ipv4/tcp_congestion_control");
    public static final File TCP_AVAILABLE_CONGESTION = new File("/proc/sys/net/ipv4/tcp_available_congestion_control");
    public static final File GOVERNOR_SETTINGS = new File("/sys/devices/system/cpu/cpufreq/");
    public static final File VOLTAGE_PATH = new File("/sys/devices/system/cpu/cpufreq/vdd_table/vdd_levels");
    public static final File VOLTAGE_PATH_2 = new File("/sys/devices/system/cpu/cpu0/cpufreq/vdd_levels");
    public static final File VOLTAGE_PATH_TEGRA_3 = new File("/sys/devices/system/cpu/cpu0/cpufreq/UV_mV_table");
    public static final File GPU_3D = new File("/sys/devices/platform/kgsl-3d0.0/kgsl/kgsl-3d0/max_gpuclk");
    public static final File GPU_3D_CURRENT = new File("/sys/devices/platform/kgsl-3d0.0/kgsl/kgsl-3d0/gpuclk");
    public static final File GPU_3D_MAX_2 = new File("/sys/class/kgsl/kgsl-3d0/max_gpuclk");
    public static final File GPU_3D_2_GOV = new File("/sys/class/kgsl/kgsl-3d0/pwrscale/trustzone/governor");
    public static final File GPU_2D_2 = new File("/sys/class/kgsl/kgsl-2d0/max_gpuclk");
    public static final File GPU_3D_2_AVAILABLE_FREQUENCIES = new File("/sys/class/kgsl/kgsl-3d0/gpu_available_frequencies");
    public static final File GPU_3D_2_CURRENT = new File("/sys/class/kgsl/kgsl-3d0/gpuclk");
    public static final File GPU_3D_AVAILABLE_FREQUENCIES = new File("/sys/class/kgsl/kgsl-3d0/gpu_available_frequencies");
    public static final File GPU_2D = new File("/sys/devices/platform/kgsl-2d0.0/kgsl/kgsl-2d0/max_gpuclk");
    public static final File GPU_2D_CURRENT = new File("/sys/devices/platform/kgsl-2d0.0/kgsl/kgsl-2d0/gpuclk");
    public static final File CDEPTH = new File("/sys/kernel/debug/msm_fb/0/bpp");
    public static final File S2W = new File("/sys/android_touch/sweep2wake");
    public static final File S2W_VERSION = new File("/sys/android_touch/sweep2wake_version");
    public static final File DT2W = new File("/sys/android_touch/doubletap2wake");
    public static final File S2W_ALT = new File("/sys/android_touch/sweep2wake/s2w_switch");
    public static final File MPDECISION = new File("/sys/kernel/msm_mpdecision/conf/enabled");
    public static final File MPDECISION_BINARY = new File("/system/bin/mpdecision");
    public static final File BUTTONS_LIGHT = new File("/sys/devices/platform/leds-pm8058/leds/button-backlight/currents");
    public static final File BUTTONS_LIGHT_2 = new File("/sys/devices/platform/msm_ssbi.0/pm8921-core/pm8xxx-led/leds/button-backlight/currents");
    public static final File SD_CACHE = new File("/sys/devices/virtual/bdi/179:0/read_ahead_kb");
    public static final File VSYNC = new File("/sys/kernel/debug/msm_fb/0/vsync_enable");
    public static final File FCHARGE = new File("/sys/kernel/fast_charge/force_fast_charge");
    public static final File OOM = new File("/sys/module/lowmemorykiller/parameters/minfree");
    public static final File THERMALD = new File("/sys/kernel/msm_thermal/conf/allowed_low_freq");
    public static final File THERMALD_BINARY = new File("/system/bin/thermald");
    public static final File SCHEDULER = new File("/sys/block/mmcblk0/queue/scheduler");
    public static final File OTG = new File("/sys/kernel/debug/msm_otg/mode");
    public static final File OTG_2 = new File("/sys/kernel/debug/otg/mode");
    public static final File CPU_MIN = new File("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq");
    public static final File CPU_MAX = new File("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq");
    public static final File CPU_INFO = new File("/proc/cpuinfo");
    public static final File CPU_TEMP = new File("/sys/class/thermal/thermal_zone1/temp");
    public static final File MPDEC_THR_UP = new File("/sys/kernel/msm_mpdecision/conf/nwns_threshold_up");
    public static final File MPDEC_THR_DOWN = new File("/sys/kernel/msm_mpdecision/conf/nwns_threshold_down");
    public static final File KERNEL = new File("/proc/version");
    public static final File BATTERY_LEVEL = new File("/sys/class/power_supply/battery/capacity");
    public static final File BATTERY_TEMP = new File("/sys/class/power_supply/battery/batt_temp");
    public static final File BATTERY_TEMP2 = new File("/sys/class/power_supply/battery/temp");
    public static final File BATTERY_DRAIN = new File("/sys/class/power_supply/battery/batt_current");
    public static final File BATTERY_DRAIN2 = new File("/sys/class/power_supply/battery/current_now");
    public static final File BATTERY_VOLTAGE = new File("/sys/class/power_supply/battery/batt_vol");
    public static final File BATTERY_VOLTAGE2 = new File("/sys/class/power_supply/battery/voltage_now");
    public static final File BATTERY_TECH = new File("/sys/class/power_supply/battery/technology");
    public static final File BATTERY_HEALTH = new File("/sys/class/power_supply/battery/health");
    public static final File BATTERY_CAPACITY = new File("/sys/class/power_supply/battery/full_bat");
    public static final File BATTERY_CAPACITY2 = new File("/sys/class/power_supply/battery/charge_full_design");
    public static final File BATTERY_CHARGING_SOURCE = new File("/sys/class/power_supply/battery/charging_source");
    public static final File CPU_TEMP_ENABLED = new File("/sys/devices/virtual/thermal/thermal_zone1/mode");
    public static final File MPDEC_THR_0 = new File("/sys/kernel/msm_mpdecision/conf/nwns_threshold_0");
    public static final File NOTIF_LED = new File("/sys/kernel/notification_leds/off_timer_multiplier");
    public static final File THERMAL_LOW_FREQ = new File("/sys/kernel/msm_thermal/conf/allowed_low_freq");
    public static final File READ_AHEAD_KB = new File("/sys/devices/virtual/bdi/179:0/read_ahead_kb");
    public static final File NLT = new File("/sys/kernel/notification_leds/off_timer_multiplier");
    public static final File S2W_END = new File("/sys/android_touch/sweep2wake_endbutton");
    public static final File S2W_START = new File("/sys/android_touch/sweep2wake_startbutton");
    public static final File S2W_BUTTONS = new File("/sys/android_touch/sweep2wake_buttons");
    public static final File MPDEC_DELAY = new File("/sys/kernel/msm_mpdecision/conf/delay");
    public static final File MPDEC_ENABLED = new File("/sys/kernel/msm_mpdecision/conf/enabled");
    public static final File MPDEC_PAUSE = new File("/sys/kernel/msm_mpdecision/conf/pause");
    public static final File MPDEC_TIME_UP = new File("/sys/kernel/msm_mpdecision/conf/twts_threshold_up");
    public static final File MPDEC_TIME_DOWN = new File("/sys/kernel/msm_mpdecision/conf/twts_threshold_down");
    public static final File MPDEC_IDLE_FREQ = new File("/sys/kernel/msm_mpdecision/conf/idle_freq");
    public static final File MPDEC_SCROFF_FREQ = new File("/sys/kernel/msm_mpdecision/conf/scroff_freq");
    public static final File MPDEC_SCROFF_SINGLE = new File("/sys/kernel/msm_mpdecision/conf/scroff_single_core");
    public static final File MPDEC_MAX_CPUS = new File("/sys/kernel/msm_mpdecision/conf/max_cpus");
    public static final File MPDEC_MIN_CPUS = new File("/sys/kernel/msm_mpdecision/conf/min_cpus");
    public static final File THERMAL_MID_FREQ = new File("/sys/kernel/msm_thermal/conf/allowed_mid_freq");
    public static final File THERMAL_MAX_FREQ = new File("/sys/kernel/msm_thermal/conf/allowed_max_freq");
    public static final File THERMAL_LOW_LOW = new File("/sys/kernel/msm_thermal/conf/allowed_low_low");
    public static final File THERMAL_LOW_HIGH = new File("/sys/kernel/msm_thermal/conf/allowed_low_high");
    public static final File THERMAL_MID_LOW = new File("/sys/kernel/msm_thermal/conf/allowed_mid_low");
    public static final File THERMAL_MID_HIGH = new File("/sys/kernel/msm_thermal/conf/allowed_mid_high");
    public static final File THERMAL_MAX_LOW = new File("/sys/kernel/msm_thermal/conf/allowed_max_low");
    public static final File THERMAL_MAX_HIGH = new File("/sys/kernel/msm_thermal/conf/allowed_max_high");
    public static final File[] CPU_TEMP_PATHS = new File[]{
            new File("/sys/devices/system/cpu/cpu0/cpufreq/cpu_temp"),
            new File("/sys/devices/system/cpu/cpu0/cpufreq/FakeShmoo_cpu_temp"),
            new File("/sys/class/thermal/thermal_zone1/temp"),
            new File("/sys/class/i2c-adapter/i2c-4/4-004c/temperature"),
            new File("/sys/devices/platform/tegra-i2c.3/i2c-4/4-004c/temperature"),
            new File("/sys/devices/platform/omap/omap_temp_sensor.0/temperature"),
            new File("/sys/devices/platform/tegra_tmon/temp1_input"),
            new File("/sys/kernel/debug/tegra_thermal/temp_tj"),
            new File("/sys/devices/platform/s5p-tmu/temperature"),
            new File("/sys/class/thermal/thermal_zone0/temp")
    };
    public static final File GPU_SGX540 = new File("/sys/devices/system/cpu/cpu0/cpufreq/gpu_max_freq");
    public static final File IVA = new File("/sys/devices/system/cpu/cpu0/cpufreq/iva_freq_oc");
    public static final File ENTROPY_AVAILABLE = new File("/proc/sys/kernel/random/entropy_avail");
    public static final File ENTROPY_POOL_SIZE = new File("/proc/sys/kernel/random/poolsize");
    public static final File ENTROPY_READ_THRESHOLD = new File("/proc/sys/kernel/random/read_wakeup_threshold");
    public static final File ENTROPY_WRITE_THRESHOLD = new File("/proc/sys/kernel/random/write_wakeup_threshold");

    private Constants() {
        super();
        throw new UnsupportedOperationException("This class is non-instantiable");
    }

    public static int getVersionCode(Context context) {
        int versionCode;
        try {
            versionCode = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Exception ep) {
            throw new RuntimeException(((Throwable) ep));
        }


        return versionCode;
    }
}