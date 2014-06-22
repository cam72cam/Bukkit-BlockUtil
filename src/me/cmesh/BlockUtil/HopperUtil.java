package me.cmesh.BlockUtil;

import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.Hopper;

public class HopperUtil {
	private static final BlockFace[] hopperMap = {
		BlockFace.DOWN,		//0
		BlockFace.SELF, 	//none
		BlockFace.NORTH,	//2
		BlockFace.SOUTH,	//3
		BlockFace.WEST,		//4
		BlockFace.EAST,		//5
	};
	public static Block getOutputBlock(Hopper h) {
		int i = h.getData().toString().charAt(7) - '0';
		if (i <= 5) {
			return h.getBlock().getRelative(hopperMap[i]);
		} else {
			//Something strange happened, I keep getting the number 8  when I look inside a chest above a hopper?
			return h.getBlock();
		}
	}
}
