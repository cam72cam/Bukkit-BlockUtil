package me.cmesh.BlockUtil;

import org.bukkit.Material;
import org.bukkit.block.Block;

public class LavaUtil {
	private LavaUtil() {}
	
	public static boolean isLava(Block b) {
		return b.getType() == Material.LAVA || b.getType() == Material.STATIONARY_LAVA;
	}
	
	@SuppressWarnings("deprecation")
	public static boolean isLavaSource(Block b) {
		return isLava(b) && b.getData() == 0;
	}
	
	@SuppressWarnings("deprecation")
	public static void setSource(Block b) {
		b.setType(Material.LAVA);
		b.setData((byte) 0);
	}
	
	@SuppressWarnings("deprecation")
	public static void setFlowing(Block b, byte level) {
		b.setType(Material.LAVA);
		b.setData(level);
	}
}
