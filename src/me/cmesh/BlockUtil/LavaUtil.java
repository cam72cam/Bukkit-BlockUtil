package me.cmesh.BlockUtil;

import org.bukkit.Material;
import org.bukkit.block.Block;

public class LavaUtil extends LiquidUtil{
	public void setType(Block block) {
		block.setType(Material.STATIONARY_LAVA);
	}

	public boolean isType(Material m) {
		return isLava(m);
	}
	
	public static boolean isLava(Material m) {
		return m == Material.LAVA || m == Material.STATIONARY_LAVA;
	}

	public static Material bucket = Material.LAVA_BUCKET;
	
	public Material getBucket() {
		return bucket;
	}
}
