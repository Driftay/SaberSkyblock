package me.saber.skyblock.nms;


import org.bukkit.Material;

import java.util.Arrays;
import java.util.List;

public class ReflectionManager {

    public List<Material> tileEntities = Arrays.asList(Material.CHEST, Material.DROPPER, Material.HOPPER, Material.HOPPER_MINECART, Material.ENDER_CHEST, Material.TRAPPED_CHEST, Material.FURNACE, Material.BURNING_FURNACE);

    public NMSHandler_v1_8_R3 nmsHandler_v1_8_r3;
    public NMSHandler_v1_8_R2 nmsHandler_v1_8_r2;
    public NMSHandler_v1_9_R1 nmsHandler_v1_9_r1;
    public NMSHandler_v1_9_R2 nmsHandler_v1_9_r2;
    public NMSHandler_v1_10_R1 nmsHandler_v1_10_r1;
    public NMSHandler_v1_11_R1 nmsHandler_v1_11_r1;
    public NMSHandler_v1_12_R1 nmsHandler_v1_12_r1;
    public NMSHandler_v1_13_R1 nmsHandler_v1_13_r1;
    public NMSHandler_v1_13_R2 nmsHandler_v1_13_r2;
    public NMSHandler_v1_14_R1 nmsHandler_v1_14_r1;

    public void setup() {
        try {
            nmsHandler_v1_8_r3 = new NMSHandler_v1_8_R3();
            nmsHandler_v1_8_r2 = new NMSHandler_v1_8_R2();
            nmsHandler_v1_9_r1 = new NMSHandler_v1_9_R1();
            nmsHandler_v1_9_r2 = new NMSHandler_v1_9_R2();
            nmsHandler_v1_10_r1 = new NMSHandler_v1_10_R1();
            nmsHandler_v1_11_r1 = new NMSHandler_v1_11_R1();
            nmsHandler_v1_12_r1 = new NMSHandler_v1_12_R1();
            nmsHandler_v1_13_r1 = new NMSHandler_v1_13_R1();
            nmsHandler_v1_13_r2 = new NMSHandler_v1_13_R2();
            nmsHandler_v1_14_r1 = new NMSHandler_v1_14_R1();
        } catch (NoClassDefFoundError e) {
        }
    }

/*
    public Class getNMSClass(String version){
        for (Class clazz : NMSClasses){
            if (clazz != null) {
                Bukkit.broadcastMessage("class: " + clazz.getName());
                for (Method method : clazz.getMethods()) {
                    Bukkit.broadcastMessage("method: " + method.getName());
                }
                try {
                    Method getVersion = clazz.getDeclaredMethod("getVersion", clazz);
                    String verion2 = (String) getVersion.invoke(clazz);
                    if (version.equalsIgnoreCase(verion2)) {
                        return clazz;
                    }
                } catch (NoClassDefFoundError | NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
 */

}