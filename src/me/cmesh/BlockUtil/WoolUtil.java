package me.cmesh.BlockUtil;

import org.bukkit.DyeColor;
import org.bukkit.block.Block;

public class WoolUtil {
	@SuppressWarnings("deprecation")
	public static DyeColor Color(Block target) {
		return DyeColor.getByWoolData(target.getData());
	}
}
