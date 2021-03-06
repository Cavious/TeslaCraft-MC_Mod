package TeslaCraftMC;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlockGeneralTeslaCraftMC extends Block
{
	public BlockGeneralTeslaCraftMC(int id, Material par2Material) 
		{
			super(id, par2Material);
			this.setCreativeTab(CreativeTabs.tabBlock);
		}
		
		@SideOnly(Side.CLIENT)
		public void registerIcons(IconRegister par1IconRegister)
		{
			this.blockIcon = par1IconRegister.registerIcon(TeslaCraftMC.modid + ":" + this.getUnlocalizedName().substring(5));
		}
}
