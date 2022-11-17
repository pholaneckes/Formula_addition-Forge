package xiaoleqwq.formula_addition;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AppliUtils.MOD_ID);

    public static final RegistryObject<Item> Chain = ITEMS.register("chain", Chain::new);
}


