package me.cmesh.BlockUtil;

import org.bukkit.Material;
import org.bukkit.block.Block;

public class WaterUtil {
	private WaterUtil() {}

	public static boolean isWater(Block b) {
		return b.getType() == Material.WATER || b.getType() == Material.STATIONARY_WATER;
	}
	
	@SuppressWarnings("deprecation")
	public static boolean isWaterSource(Block b) {
		return isWater(b) && b.getData() == 0;
	}
	
	@SuppressWarnings("deprecation")
	public static void setSource(Block b) {
		b.setType(Material.WATER);
		b.setData((byte) 0);
	}
	
	@SuppressWarnings("deprecation")
	public static void setFlowing(Block b, byte level) {
		b.setType(Material.WATER);
		b.setData(level);
	}
}
