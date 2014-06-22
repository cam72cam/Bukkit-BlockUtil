package me.cmesh.BlockUtil;

import org.bukkit.Material;
import org.bukkit.block.Block;

public class WaterUtil extends LiquidUtil{
	public void setType(Block block) {
		block.setType(Material.STATIONARY_WATER);
	}

	public boolean isType(Material m) {
		return isWater(m);
	}
	public static boolean isWater(Material m) {
		return m == Material.WATER || m == Material.STATIONARY_WATER;
	}
	
	public static Material bucket = Material.WATER_BUCKET;
	
	public Material getBucket() {
		return bucket;
	}
}
