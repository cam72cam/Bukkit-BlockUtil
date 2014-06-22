package me.cmesh.BlockUtil;

import org.bukkit.Material;
import org.bukkit.block.Block;

public abstract class LiquidUtil {
	public static byte MaxLevel = 0;
	public static byte MinLevel = 7;
	
	public abstract void setType(Block block);
	
	public abstract boolean isType(Material m);
	
	public abstract Material getBucket();
	
	public boolean isType(Block block) {
		return isType(block.getType());
	}
	
	public boolean isSource(Block block) {
		return isType(block) && getLevel(block) == 0;
	}
	
	public void setSource(Block block) {
		setLevel(block, (byte) 0);
	}
	
	public boolean isBucket(Material m) {
		return getBucket() == m;
	}
	
	@SuppressWarnings("deprecation")
	public void setLevel(Block block, byte level) {
		setType(block);
		block.setData(level);
	}
	
	@SuppressWarnings("deprecation")
	public byte getLevel(Block block) {
		return block.getData();
	}

	public static LiquidUtil fromMaterial(Material m) {
		if (WaterUtil.isWater(m)) {
			return new WaterUtil();
		} else if (LavaUtil.isLava(m)) {
			return new LavaUtil();
		} else {
			return null;
		}
	}

	public static LiquidUtil fromBucket(Material m) {
		if (WaterUtil.bucket == m) {
			return new WaterUtil();
		} else if (LavaUtil.bucket == m) {
			return new LavaUtil();
		} else {
			return null;
		}
	}
}
