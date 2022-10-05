package me.sarim.example.mixin;

import net.minecraft.enchantment.EfficiencyEnchantment;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EfficiencyEnchantment.class)
public class ExampleMixin {
	@Inject(at = @At("HEAD"), method = "getMaxLevel()I", cancellable = true)
	public void getActualMaxLevel(CallbackInfoReturnable<Integer> cir){
		cir.setReturnValue(8);
	}
}
